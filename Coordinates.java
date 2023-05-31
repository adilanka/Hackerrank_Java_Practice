
public class Coordinates {

	public static void main(String[] args) 
	{	
		Coordinate a = new Coordinate();
		a.x = 3;
		a.y = 5;
		a.displayCoordinates();
	}
}

class Coordinate
{
	int x;
	int y;
	
	void displayCoordinates()
	{
		System.out.println("Coordinates are: "+"("+x+","+y+")");
	}
}
