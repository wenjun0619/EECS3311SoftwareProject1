import java.util.ArrayList;
public class BubbleSort {

	public ArrayList<Shape> shapeList=new ArrayList<>();
	
	public BubbleSort() {
		for(int i=0;i<6;i++)
		{
			Shape shape=ShapeFactory.createRandomShape();
			shapeList.add(shape);
		}
	}
	public ArrayList<Shape> getShapes()
	{
		return shapeList;
	}
	
	//Sorting algorithm
	public void sorting() {
		for(int i=0;i<shapeList.size()-1;i++)
		{
			for(int j=0;j<shapeList.size()-1-i;j++)
			{
				if(shapeList.get(j).compareTo(shapeList.get(j+1))>0)
				{
					//create a temp shape and swap
					Shape temp=shapeList.get(j);
					shapeList.set(j, shapeList.get(j+1));
					shapeList.set(j+1, temp);
				}
			}
	}
	
}
}
