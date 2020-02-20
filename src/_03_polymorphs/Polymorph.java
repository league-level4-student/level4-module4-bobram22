package _03_polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
	int x;
	int y;

	Polymorph(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void update() {

	}

	public abstract void draw(Graphics g);

	public int getX() {
		return this.x;
	}
	public void setX( int x) {
		this.x=x;
	}
	
	public int getY() {
		return this.y;
	}
	public void setY( int y) {
		this.x=y;
	}

}
