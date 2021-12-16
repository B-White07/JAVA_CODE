package game;

import java.awt.image.BufferedImage;

public abstract class FlyingObject {
	protected int x;//x坐标
	protected int y;//y坐标
	protected int width;//宽度
	protected int height;//高度
	protected BufferedImage image;//图片
	
	public abstract void step();//走步 
	
	//判断敌方飞机与蜜蜂是否被子弹击中
	public boolean shootBy(Bullet b){
		int x=b.x;
		int y=b.y;
		return x>this.x&&x<this.x+width&&y>this.y&&y<this.y+height;
	}
	public abstract boolean outOfBounds();
}
