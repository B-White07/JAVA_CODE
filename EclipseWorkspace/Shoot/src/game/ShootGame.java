package game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
//import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ShootGame extends JPanel {
	public static final int WIDTH = 400;// ���
	public static final int HEIGHT = 700;// �߶�
	public static BufferedImage background;
	public static BufferedImage start;
	public static BufferedImage gameover;
	public static BufferedImage pause;
	public static BufferedImage bee;
	public static BufferedImage airplane;
	public static BufferedImage bullet;
	public static BufferedImage hero0;
	public static BufferedImage hero1;
	// public static music;
	public Hero hero = new Hero();// Ӣ�ۻ�����
	public Bullet[] bullets = {};// �ӵ�����
	public FlyingObject[] flyings = {};// �з��ɻ����۷�
	private int score = 0;// ��Ϸ����

	private int state;// ״̬
	public static final int START = 0;
	public static final int RUNING = 1;
	public static final int PAUSE = 2;
	public static final int GAME_OVER = 3;

	// ������Դ
	static {
		try {
			background = ImageIO.read(ShootGame.class.getResource("background.png"));
			start = ImageIO.read(ShootGame.class.getResource("start.png"));
			gameover = ImageIO.read(ShootGame.class.getResource("gameover.png"));
			pause = ImageIO.read(ShootGame.class.getResource("pause.png"));
			bee = ImageIO.read(ShootGame.class.getResource("bee.png"));
			airplane = ImageIO.read(ShootGame.class.getResource("1.jpg"));
			bullet = ImageIO.read(ShootGame.class.getResource("bullet.png"));
			hero0 = ImageIO.read(ShootGame.class.getResource("2.jpg"));
			hero1 = ImageIO.read(ShootGame.class.getResource("2.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// ���Ʒ���
	@Override
	public void paint(Graphics g) {
		g.drawImage(background, 0, 0, null);
		paintHero(g);
		paintBluttets(g);
		paintFlyingObject(g);
		paintScore(g);
		paintState(g);

	}

	// ��״̬
	public void paintState(Graphics g) {
		switch (state) {
		case START:
			g.drawImage(start, 0, 0, null);
			break;
		case PAUSE:
			g.drawImage(pause, 0, 0, null);
			break;
		case GAME_OVER:
			g.drawImage(gameover, 0, 0, null);
			break;
		}

	}

	// ������
	public void paintScore(Graphics g) {
		g.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 25));
		g.setColor(new Color(0x0000ff));
		g.drawString("SCORE=" + score, 10, 25);
		g.drawString("LIFE=" + hero.life, 10, 45);
	}

	// ��Ӣ�ۻ�
	public void paintHero(Graphics g) {
		g.drawImage(hero.image, hero.x, hero.y, null);
	}

	// ���ӵ�
	public void paintBluttets(Graphics g) {
		for (int i = 0; i < bullets.length; i++) {
			g.drawImage(bullets[i].image, bullets[i].x, bullets[i].y, null);
		}
	}

	// ���з�������
	public void paintFlyingObject(Graphics g) {
		for (int i = 0; i < flyings.length; i++) {
			g.drawImage(flyings[i].image, flyings[i].x, flyings[i].y, null);
		}
	}

	// ִ�ж��������ķ���
	private Timer timer;
	private int interval = 10;
	int hx;
	int hy;

	public void action() {
		MouseAdapter l = new MouseAdapter() {
			public void mouseMoved(MouseEvent e) {
				hx = e.getX();
				hy = e.getY();
			}

			// ��굥��������
			public void mouseClicked(MouseEvent e) {
				switch (state) {
				case START:
					state = RUNING;
					break;
				case GAME_OVER:
					hero = new Hero();
					flyings = new FlyingObject[0];
					bullets = new Bullet[0];
					score = 0;
					state = START;
					break;
				}
			}

			// ����Ƴ���������
			public void mouseExited(MouseEvent e) {
				if (state != GAME_OVER) {
					state = PAUSE;
				}
			}

			// ���������������
			public void mouseEntered(MouseEvent e) {
				if (state == PAUSE) {
					state = RUNING;
				}
			}
		};

//		KeyAdapter k = new KeyAdapter() {
//		public void keyPressed(KeyEvent e) {
//			//hx = e.getX();
//			//hy = e.getY();
//			int key = e.getKeyCode();
//	        switch (key) {
//	            case KeyEvent.VK_LEFT:
//	                hero.setVx(-speed);;
//	                break;
//	            case KeyEvent.VK_RIGHT:
//	                hero.setVx(+speed);
//	                break;
//	            case KeyEvent.VK_UP:
//	                hero.setVy(+speed);;
//	                break;
//	            case KeyEvent.VK_DOWN:
//	                hero.setVy(-speed);
//	                break;
//		}
//		}
//	};

		this.addMouseListener(l);
		this.addMouseMotionListener(l);
//		this.addKeyListener(k);

		timer = new Timer();
		// ������ʱ��
		timer.schedule(new TimerTask() {

			@Override
			public void run() {
				if (state == RUNING) {
					hero.moveTo(hx, hy);
					enterAction();
					shootAction();
					stepAction();
					bangAction();// �ж�ÿ����Ļ�е��ӵ���ÿ����Ļ�еķɻ��Ƿ�����ײ
					outOfBounds();// �����ж�
					checkGameOverAction();// �ж���Ϸ�Ƿ����
				}
				repaint();// �ػ�

			}
		}, interval, interval);

	}

	// ɾ������ķ�����
	public void outOfBounds() {
		int index = 0;
		FlyingObject[] flyingLives = {};
		for (int i = 0; i < flyings.length; i++) {
			if (!flyings[i].outOfBounds()) {
				flyingLives = Arrays.copyOf(flyingLives, flyingLives.length + 1);
				flyingLives[index++] = flyings[i];
			} else {
				hero.subStractLife();
			}
		}
		flyings = Arrays.copyOf(flyingLives, flyingLives.length);

		index = 0;
		Bullet[] bulletLives = new Bullet[bullets.length];
		for (int i = 0; i < bullets.length; i++) {
			if (!bullets[i].outOfBounds()) {
				bulletLives[index++] = bullets[i];
			}
		}
		bullets = Arrays.copyOf(bulletLives, index);

	}

	int shootIndex = 0;
	public void shootAction() {
		shootIndex++;
		Bee b = new Bee();
		if (flag) {
			if (shootIndex % 10 == 0) {
				Bullet[] bs = hero.shoot();
				bullets = Arrays.copyOf(bullets, bullets.length + bs.length);
				System.arraycopy(bs, 0, bullets, bullets.length - bs.length, bs.length);
			}
		} else {
			if (shootIndex % 30 == 0) {
				Bullet[] bs = hero.shoot();
				bullets = Arrays.copyOf(bullets, bullets.length + bs.length);
				System.arraycopy(bs, 0, bullets, bullets.length - bs.length, bs.length);
			}
		}
	}

	public void bangAction() {
		for (int i = 0; i < bullets.length; i++) {
			Bullet b = bullets[i];
			bang(b);
		}
	}

	boolean flag = false;
	public void bang(Bullet b) {
		int index = -1;
		for (int i = 0; i < flyings.length; i++) {
			if (flyings[i].shootBy(b)) {
				index = i;
				break;
			}
		}
		if (index != -1) {
			FlyingObject one = flyings[index];
			// Bullet bulletss = bullets[index];
			flyings[index] = flyings[flyings.length - 1];
			flyings = Arrays.copyOf(flyings, flyings.length - 1);
			// bullets[index] = bullets[bullets.length - 1];
			// bullets = Arrays.copyOf(bullets, bullets.length - 1);

			if (one instanceof Enemy) {
				score += ((Enemy) one).getScore();

			} else if (one instanceof Award) {
				int type = ((Award) one).getType();
				switch (type) {
				case Award.DOUBLE_FIRE:
				// ����˫������
				hero.addDoubleFire();
					break;

					case Award.QUADRA_FIRE:
						hero.addQuadraFire();
						// �����ı�����
						break;

					case Award.LIFE:
						hero.addLife();
						// ���������Ĵ���
						break;

					case Award.ACCELERATE:
//					hero.addAccelerateFire();
						flag = true;
					// ������������
					break;

				}
			}
		}
	}

	private int flyEnterIndex = 0;// ����
	// ����һ���з��ɻ��볡�ķ�ʽ

	public void enterAction() {
		flyEnterIndex++;
		if (score < 200) {
			if (flyEnterIndex % 40 == 0) {
				FlyingObject obj = nextOne();
				flyings = Arrays.copyOf(flyings, flyings.length + 1);
				flyings[flyings.length - 1] = obj;

			}
		} else if (score > 200 && score < 500) {
			if (flyEnterIndex % 20 == 0) {
				FlyingObject obj = nextOne();
				flyings = Arrays.copyOf(flyings, flyings.length + 1);
				flyings[flyings.length - 1] = obj;
			}
		} else {
			if (flyEnterIndex % 10 == 0) {
				FlyingObject obj = nextOne();
				flyings = Arrays.copyOf(flyings, flyings.length + 1);
				flyings[flyings.length - 1] = obj;
			}
		}
	}

	public static FlyingObject nextOne() {
		Random rad = new Random();
		int n = rad.nextInt(10);
		if (n == 0) {
			return new Bee();
		} else {
			return new Airplane();
		}
	}

	// �������߲�
	public void stepAction() {
		hero.step();
		for (int i = 0; i < flyings.length; i++) {
			flyings[i].step();
		}

		for (int i = 0; i < bullets.length; i++) {
			bullets[i].step();
		}

	}

	public void checkGameOverAction() {
		if (isGameOver()) {
			state = GAME_OVER;
		}
	}

	// �ж���Ϸ�Ƿ����
	public boolean isGameOver() {
		for (int i = 0; i < flyings.length; i++) {
			int index = -1;
			FlyingObject obj = flyings[i];
			if (hero.hit(obj)) {
				hero.subStractLife();
				hero.doubleFire = 0;
				hero.quadraFire = 0;
				index = i;
			}
			if (index != -1) {
				FlyingObject t = flyings[index];
				flyings[index] = flyings[flyings.length - 1];
				flyings[flyings.length - 1] = t;
				flyings = Arrays.copyOf(flyings, flyings.length - 1);
			}

		}
		return hero.life <= 0;
	}

	public static void main(String[] args) throws Exception {
		JFrame frame = new JFrame("Game");// ����
		ShootGame game = new ShootGame();// ����
		frame.add(game);// ��������뵽������
		frame.setSize(WIDTH, HEIGHT);// ���û����С
		frame.setAlwaysOnTop(true);// ��������
		frame.setLocationRelativeTo(null);// ���ó�ʼλ��
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Ĭ�Ϲر�
		frame.setVisible(true);// �������paint����
		game.action();
		new PlayMusic();
	}
}
