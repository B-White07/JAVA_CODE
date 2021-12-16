package game;

import java.util.Random;

public class Bee extends FlyingObject implements Award{
	private int ySpeed=2;
	private int xSpeed=4;
	private int awardType;//Ω±¿¯¿‡–Õ
	public Bee(){
		image=ShootGame.bee;
		width=image.getWidth();
		height=image.getHeight();
		height=image.getHeight();
		Random rad=new Random();
		x=rad.nextInt(ShootGame.WIDTH-width);
		y=-height;
		awardType=rad.nextInt(4);
		
	}

	@Override
	public void step() {
		x+=xSpeed;
		y+=ySpeed;
		if(x<0){
			xSpeed=4;
		}
		if(x>ShootGame.WIDTH-width){
			xSpeed=-4;
		}
		
	}

	@Override
	public int getType() {
		// TODO Auto-generated method stub
		return awardType;
	}

	@Override
	public boolean outOfBounds() {
		// TODO Auto-generated method stub
		return y>ShootGame.HEIGHT;
	}
}
