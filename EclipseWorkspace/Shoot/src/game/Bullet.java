package game;

public class Bullet extends FlyingObject {
	private int speed =3;//�ӵ��ƶ��ٶ�
	public Bullet(int x,int y){
		image=ShootGame.bullet;
		width=image.getWidth();
		height=image.getHeight();
		this.x=x;
		this.y=y;
	}
	
	public Bullet() {}

	@Override
	public void step() {
		y-=speed;
		
	}

	@Override
	public boolean outOfBounds() {
		return y<-height;
	}
}
