
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class MyCircle extends Shape implements Comparable<Shape>{

		
	
	private int radius;
	

	



public MyCircle(int upperX,int upperY,int radius,Color shapeColor){ // constructor
	super(shapeColor);

	this.radius = radius;
}

public double getArea()
{
	return Math.PI*radius*radius;
}



public double getRadius() {
	return this.radius;
}
public boolean equals(MyCircle c) {
return radius == c.getRadius();
}
//getters
public Color getColor() {
	return shapeColor;
}



public int getUpperX() {
	return upperX;
}

public int getUpperY() {
	return upperY;
}




public int compareTo(MyCircle c) {
	if (getArea() > c.getArea())
	      return 1;
	    else if (getArea() < c.getArea())
	      return -1;
	    else
	      return 0;
	  }
//setters

public void paint(Graphics g)
{
	
	g.setColor(shapeColor);
	
	g.fillOval(upperX, upperY, radius*2, radius*2);
}



public void setColor(Color aShapeColor) {
	 this.shapeColor = aShapeColor;
}


public void setUpperX(int upperX) {
	 this.upperX = upperX;
}
	
public void setUpperY(int upperY) {
	 this.upperY = upperY;
}

}


