import java.awt.Color;
import java.util.Random;


public class ShapeFactory {

	public static Shape createRandomShape()
	{
		Random rng=new Random();
		int side=30;
		
		Color shapeColor=new Color(rng.nextInt(256), rng.nextInt(256), rng.nextInt(256));
		
		float randomNumber=rng.nextFloat();
		

		
		if(randomNumber<=0.3333){
			return (new MyCircle(0,0,rng.nextInt(side),shapeColor));
		}
		
		else if(randomNumber>0.3333 && randomNumber<=0.66666666666) {
			return new MySquare(0,0,side+rng.nextInt(side), side+rng.nextInt(side),shapeColor);
		}
		
		else {
			return new Rectangle(0,0,side+rng.nextInt(side), side+rng.nextInt(side),shapeColor);
		}
	}
}

