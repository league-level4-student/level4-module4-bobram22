package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class RedPolymorph extends Polymorph {

	RedPolymorph(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.RED);
		g.fillRect(x, y, 50, 50);
	}

}
