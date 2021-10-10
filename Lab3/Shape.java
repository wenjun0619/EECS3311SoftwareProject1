import java.awt.Color;
import java.awt.Graphics;

public abstract class Shape implements Comparable<Shape>{ 
	protected int upperX; 
	protected int upperY;
	protected int height;
	protected int width;

	protected Color shapeColor;
	

	public Shape (Color color) {
		this.shapeColor=color;
		this.upperX = 0;
		this.upperY = 0;
		
	}
	
 public abstract double getArea();
 public abstract void paint(Graphics g);
 

 
 public int compareTo(Shape other) {
 double difference = getArea() - other.getArea(); 
 if (difference < 0) { return -1;
 } 
 else if (difference == 0) { return 0;
 } 
 else { return 1;
 }
 }
 
 public Color getColor() {
		return shapeColor;
	}

	public int getUpperX() {
		return upperX;
	}

	public int getUpperY() {
		return upperY;
	}

public int getWidth() {
	return width;
}
//Getter to height.
public int getHeight() {
	return height;
}

//Setter to height.
public void setHeight(int height) {
	this.height=height;
}
public void setlocation(int upperX, int upperY)
{
	this.upperX=upperX;
	this.upperY=upperY;
}
}