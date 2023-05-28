
public class Exp3B {

	public static void main(String[] args) 
	{
		WeighedItem w = new WeighedItem("Apples",50,2.102);
		System.out.println("Name: "+w.getName());
		System.out.println("Price: "+w.getPrice());
		System.out.println("Weight: "+w.getWeight());
		System.out.println(w.toString());
		
		CountedItem c = new CountedItem("Pens",10,5);
		System.out.println('\n'+"Name: "+c.getName());
		System.out.println("Price: "+c.getPrice());
		System.out.println("Quantity: "+c.getQuantity());
		System.out.println(c.toString());
	}

}

class PurchaseItem
{
	private String name;
	private double unitPrice;
	
	PurchaseItem(String a, double b)
	{
		name = a;
		unitPrice = b;
	}
	PurchaseItem()
	{
		name="No Item";
		unitPrice= 0;
	}
	public double getPrice()
	{
		return unitPrice;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String s)
	{
		name = s;
	}
	public void setUnitPrice(double d)
	{
		unitPrice = d;
	}
	public String toString()
	{
		return name+" @ "+unitPrice;
	}	
}

class WeighedItem extends PurchaseItem
{
	private double weight;
	
	WeighedItem(String a, double b, double w)
	{
		super(a,b);
		weight= w;
	}
	WeighedItem()
	{
		super();
		weight = 0;
	}
	public double getWeight()
	{
		return weight;
	}
	@Override 
	public double getPrice()
	{
		double x = super.getPrice();
		return weight*x;
	}
	@Override
	public String toString()
	{
		return super.toString()+" "+weight+"Kg "+this.getPrice()+"Rs";
	}
}

class CountedItem extends PurchaseItem
{
	private int quantity;
	
	CountedItem(String a, double b, int q)
	{
		super(a,b);
		quantity = q;
	}
	CountedItem()
	{
		super();
		quantity = 0;
	}
	public int getQuantity()
	{
		return quantity;
	}
	@Override
	public double getPrice()
	{
		double x = super.getPrice();
		return quantity*x;
	}
	@Override
	public String toString()
	{
		return super.toString()+" "+quantity+" units "+this.getPrice()+"Rs";
	}

}