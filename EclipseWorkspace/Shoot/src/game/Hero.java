package game;

import java.awt.image.BufferedImage;
import java.util.Arrays;

public class Hero extends FlyingObject {
	private BufferedImage[] images = {};
	private int index;
	// private int speed = 5;
	public int life;// ����ֵ
	public int doubleFire;// ˫������
	public int quadraFire;// �ı�����
//	public int accelerateFire;// �������
	// ���췽��

	public Hero() {
		image = ShootGame.hero0;
		width = image.getWidth();
		height = image.getHeight();
		x = 150;
		y = 400;
		life = 3;// 3����
		doubleFire = 0;// ��������
		images = new BufferedImage[] { ShootGame.hero0, ShootGame.hero1 };
	}

	public void moveTo(int x, int y) {
		this.x = x - width / 2;
		this.y = y - height / 2;
	}

//	public void setVx(int vx) {
//		this.x = vx;
//	}
//
//	public void setVy(int vy) {
//		this.y = vy;
//	}

	// Ӣ�ۻ�����
	public void addLife() {
		life++;
		if (life > 4) {
			life = 4;
		}
	}

	// Ӣ�ۻ�˫������
	public void addDoubleFire() {
		doubleFire += 40;
	}

	// �ı�����
	public void addQuadraFire() { quadraFire += 40; }

//	public void addAccelerateFire() {
//		accelerateFire += 40;
//	}

	public Bullet[] shoot() {

		int xStep = this.width / 4;
		if (quadraFire > 0) {
			// �ı�����
			Bullet[] bullets = new Bullet[4];
			bullets[0] = new Bullet(this.x - 1 * xStep, this.y);
			bullets[1] = new Bullet(this.x + 1 * xStep, this.y);
			bullets[2] = new Bullet(this.x + 3 * xStep, this.y);
			bullets[3] = new Bullet(this.x + 5 * xStep, this.y);
			quadraFire -= 4;
			return bullets;
		} else if (doubleFire > 0) {
			// ˫��
			Bullet[] bullets = new Bullet[2];
			bullets[0] = new Bullet(this.x + 1 * xStep, this.y);
			bullets[1] = new Bullet(this.x + 3 * xStep, this.y);
			doubleFire -= 2;
			return bullets;
		} else {
			// ����
			Bullet[] bullets = new Bullet[1];
			bullets[0] = new Bullet(this.x + 2 * xStep, this.y);
			return bullets;
		}
	}

	public boolean hit(FlyingObject other) {
		int x1 = other.x - this.width / 2;
		int x2 = other.x + other.width + this.width / 2;
		int y1 = other.y - this.height / 2;
		int y2 = other.y + other.height + this.height / 2;
		int heroX = this.x + this.width / 2;
		int heroY = this.y + this.height / 2;

		return heroX > x1 && heroX < x2 && heroY > y1 && heroY < y2;
	}

	public void subStractLife() {
		life--;
	}

	@Override
	public void step() {
		int num = index++ / 10 % images.length;
		image = images[num];

	}

	@Override
	public boolean outOfBounds() {
		// TODO Auto-generated method stub
		return false;
	}
}
