
public class BuilderDesignPattern {

	public static void main(String[] args) 
	{
		HouseBuilder H = new HouseBuilder();
		House brickHouse = H.buildStructure().structureDetail("Cuboidal House")
							.buildWall().wallDetails("4 x Brick Walls")
							.buildDoor().doorDetails("Teak door")
							.buildRoof().roofDetails("Pyramid Shaped roof")
							.buildWindow().windowDetails("2 x Windows")
							.build();
		System.out.println(brickHouse);
	}

}

class House
{
	protected String structure;
	protected String walls;
	protected String doors;
	protected String rooftop;
	protected String windows;
	
	@Override
	public String toString()
	{
		return "House: "+"\nStructure: "+structure+"\nWalls: "+walls+"\nDoors: "+doors+"\nRooftop: "+rooftop+"\nWindows: "+windows;
	}
}
class HouseBuilder
{
	House a = new House();
	
	public StructureBuilder buildStructure()
	{
		return new StructureBuilder(a);
	}
	public WallBuilder buildWall()
	{
		return new WallBuilder(a);
	}
	public DoorBuilder buildDoor()
	{
		return new DoorBuilder(a);
	}
	public RooftopBuilder buildRoof()
	{
		return new RooftopBuilder(a);
	}
	public WindowBuilder buildWindow()
	{
		return new WindowBuilder(a);
	}
	public House build()
	{
		return a;
	}
}
class StructureBuilder extends HouseBuilder
{
	public StructureBuilder(House house)
	{
	this.a = house;
	}
	public StructureBuilder structureDetail(String struc)
	{
		a.structure = struc;
		return this;
	}
}
class WallBuilder extends HouseBuilder
{
	public WallBuilder(House house)
	{
	this.a = house;
	}
	public WallBuilder wallDetails(String wall)
	{
		a.walls = wall;
		return this;
	}
}
class DoorBuilder extends HouseBuilder
{
	public DoorBuilder(House house)
	{
	this.a = house;
	}
	public DoorBuilder doorDetails(String door)
	{
		a.doors = door;
		return this;
	}
}
class RooftopBuilder extends HouseBuilder
{
	public RooftopBuilder(House house)
	{
	this.a = house;
	}
	public RooftopBuilder roofDetails(String roof)
	{
		a.rooftop = roof;
		return this;
	}
}
class WindowBuilder extends HouseBuilder
{
	public WindowBuilder(House house)
	{
	this.a = house;
	}
	public WindowBuilder windowDetails(String window)
	{
		a.windows = window;
		return this;
	}
}