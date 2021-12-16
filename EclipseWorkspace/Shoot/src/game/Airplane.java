package game;

import java.util.Random;

public class Airplane extends FlyingObject implements Enemy{
	private int speed=2;//敌方飞机的步数
	public Airplane(){
		image=ShootGame.airplane;
		width=image.getWidth();
		height=image.getHeight();
		Random rad=new Random();
		x=rad.nextInt(ShootGame.WIDTH-width);
		y=-height;
	}

	@Override
	public void step() {
		y+=speed;		
	}

	@Override
	public int getScore() {
		return 5;
	}

	@Override
	public boolean outOfBounds() {
		return y>ShootGame.HEIGHT;
	}
}
