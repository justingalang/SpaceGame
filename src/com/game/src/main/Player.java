package com.game.src.main;

import java.awt.Graphics;


public class Player {
	
	private double x;
	private double y;
	
	private double velX = 0;
	private double velY = 0;
	
	
	private Textures tex;
	
	public Player(double x, double y, Textures tex)
	{
		this.x = x;
		this.y = y;
		this.tex = tex; 
	}
	
	//SN: mover
	public void tick() 
	{
		x += velX;
		y += velY; 
		
		if(x <= 0)
			x = 0;
		if(x >= 640 - 35)
			x =  640 - 35;
		if(y <= 0)
			y = 0;
		if(y >= 480 - 47)
			y = 480 - 47;
	}
	
	public void render(Graphics g)
	{
		g.drawImage(tex.player, (int)x, (int)y, null);
	}
	
	public double getX()
	{
		return x;
	}
	
	public double getY()
	{
		return y;
	}
	public void setX(double x)
	{
		this.x = x;
	}
	public void setY(double y)
	{
		this.y = y;
	}
	
	public void setVelX(double velX)
	{
		this.velX = velX;
	}
	
	public void setVelY(double velY)
	{
		this.velY = velY;
	}


}
