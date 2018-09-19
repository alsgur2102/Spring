package com.bdi.sp.game;

public class Computer {
	
	private Game game;
	
	public Computer(Game game) {
		this.game = game;
	}
	
	public void load() {
		game.start();
		game.play();
		game.end();
	}
}

