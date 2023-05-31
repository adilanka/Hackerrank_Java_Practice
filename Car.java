
class Car implements Comparable<Car>
{
	String make;
	int engine;
	int price;
	
	Car(String m, int e, int p)
	{
		make = m;
		engine = e;
		price = p;
	}
	public String toString()
	{
		return "Make: "+make+" Engine Capacity: "+engine+" Price: "+price;
	}
	public int compareTo(Car c)
	{
		return price - c.price;
	}
	int getPrice()
	{
		return price;
	}
	String getMake()
	{
		return make;
	}
	int getEngine()
	{
		return engine;
	}
}
