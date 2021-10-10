

import java.awt.Color;
import java.awt.Graphics;


public class Rectangle extends Shape implements Comparable <Shape>{


	protected int width;
	protected int height;
	protected Color shapeColor;
	
	/**
	 * Class's constructor
	 * @param upperX
	 * @param upperY
	 * @param width
	 * @param height
	 * @param shapeColor
	 */

	
	public Rectangle (int upperX, int upperY,int width, int height, Color shapeColor) {
		super(shapeColor);
		this.width = width;
		this.height = height;
		this.shapeColor = shapeColor;
	}
	
	
	public double getArea() {
		
		return height*width;
	}



	/**
	 * Method to draw a rectangle
	 * @param form
	 */

	
	public void paint(Graphics g)
	{
		g.setColor(shapeColor);
		g.fillRect(upperX, upperY, width, height);
	}
	
    
    //getters
    public Color getColor() {
		return shapeColor;
	}
    
    public int getWidth() {
    	return width;
    }
    
    public int getHeight() {
    	return height;
    }
    
	public int getUpperX() {
		return upperX;
	}
	
	public int getUpperY() {
		return upperY;
	}
	
	//setters
	 public void setColor(Color aShapeColor) {
		 this.shapeColor = aShapeColor;
	 }
	 
	 public void setWidth( int width) {
		 this.width = width;
	 }
	    
	 public void setHeight(int height) {
		 this.height = height;
	 }
	 
	 public void setUpperX(int upperX) {
		 this.upperX = upperX;
	 }
		
	 public void setUpperY(int upperY) {
		 this.upperY = upperY;
	 }


}
