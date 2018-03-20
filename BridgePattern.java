package org.Practice.DesignPattern;

public class BridgePattern {
	
	public interface Shape
	{
		public void draw();
		public void resize();
	}
	
	public class CircleShape implements Shape
	{
		private double x_cor,y_cor,radius;
		private DrawAPI drawObj;
		
		public CircleShape(double x,double y,double radius,DrawAPI drawObj )
		{
			this.x_cor=x;
			this.y_cor = y;
			this.radius = radius;
			this.drawObj = drawObj;
		}
		public void draw(){
			drawObj.drawCircle(this.x_cor,this.y_cor,this.radius);
		}
		public void resize()
		{
			
		}
	}
	
	public interface DrawAPI
	{
		public void drawCircle(double x, double y, double radius);
	}
	
	public class DrawAPI1 implements DrawAPI
	{
		public void drawCircle(double x, double y, double radius)
		{
			System.out.println("drawCircle of DrawAPI1");
		}
	}
	
	public class DrawAPI2 implements DrawAPI
	{
		public void drawCircle(double x, double y, double radius)
		{
			System.out.println("drawCircle of DrawAPI2");
		}
	}
	
	public static void main(String[] args)
	{
		BridgePattern bp = new BridgePattern();
		Shape circle1= bp.new CircleShape(2.0,3.0,4.0,bp.new DrawAPI1());
		Shape circle2= bp.new CircleShape(2.0,3.0,4.0,bp.new DrawAPI2());
		circle1.draw();
		circle2.draw();
	}

}
