package com.countgandi.com.game.entities.objects;

import java.awt.Graphics;

import com.countgandi.com.Assets;
import com.countgandi.com.game.Handler;

public class PalmTree extends Tree {

	public PalmTree(float x, float y, Handler handler) {
		super(x, y, 32, handler);
	}
	
	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.palmTree[4 + (int)timer], (int)x, (int)y, width * Handler.ZOOM, height * Handler.ZOOM, null);
	}

}
