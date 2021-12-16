package game;

import java.awt.image.BufferedImage;

public abstract class FlyingObject {
	protected int x;//x����
	protected int y;//y����
	protected int width;//���
	protected int height;//�߶�
	protected BufferedImage image;//ͼƬ
	
	public abstract void step();//�߲� 
	
	//�жϵз��ɻ����۷��Ƿ��ӵ�����
	public boolean shootBy(Bullet b){
		int x=b.x;
		int y=b.y;
		return x>this.x&&x<this.x+width&&y>this.y&&y<this.y+height;
	}
	public abstract boolean outOfBounds();
}
