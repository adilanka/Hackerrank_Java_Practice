import java.util.*;
import java.util.stream.Collectors;

public class Exp5 {

	public static void main(String[] args) 
	{
		Purchase p1 = new Purchase("E1026","Electronics",11299,1,"Debit");
		Purchase p2 = new Purchase("M2015","Medicine",460,2,"Debit");
		Purchase p3 = new Purchase("E3001","Electronics",25000,1,"Credit");
		Purchase p4 = new Purchase("C2001","Cosmetics",259,4,"Debit");
		Purchase p5 = new Purchase("E1008","Electronics",2999,2,"Credit");
		Purchase p6 = new Purchase("M4001","Medicine",299,5,"Debit");
		Purchase p7 = new Purchase("C3082","Cosmetics",1500,1,"Credit");
		
		List<Purchase> pur = new ArrayList<>();
		pur.add(p1);
		pur.add(p2);
		pur.add(p3);
		pur.add(p4);
		pur.add(p5);
		pur.add(p6);
		pur.add(p7);
		
		List<Purchase> a = pur.stream()
		.filter(p -> p.getPrice()>=500)
		.filter(p -> p.getPurchaseType().equals("Debit"))
		.collect(Collectors.toList());
		a.forEach(System.out::println);
		
		System.out.println("\n+++++++++++++++++++++++++++++++++++++++++");
		
		Map<Boolean,List<Purchase>> isCredit = pur.stream()
				.collect(Collectors.partitioningBy(p -> p.getPurchaseType().equals("Credit")));
		List<Purchase> credit = isCredit.get(true);
		credit.forEach(System.out::println);
		
		System.out.println("\n+++++++++++++++++++++++++++++++++++++++++");
		
		List<Purchase> c = pur.stream()
				.sorted(Comparator.comparing(Purchase::getPrice))
				.sorted(Comparator.comparing(Purchase::getQuantity))
				.collect(Collectors.toList());
		Map<Purchase.ItemType, List<Purchase>> c1 = c.stream()
				.collect(Collectors.groupingBy(Purchase::getType));
		
		List<Purchase> electronics = c1.get(Purchase.ItemType.Electronics);
		List<Purchase> medicine = c1.get(Purchase.ItemType.Medicine);
		List<Purchase> cosmetics = c1.get(Purchase.ItemType.Cosmetics);
		System.out.println("\nElectronics");
		electronics.forEach(System.out::println);
		System.out.println("\nMedicine");
		medicine.forEach(System.out::println);
		System.out.println("\nCosmetics");
		cosmetics.forEach(System.out::println);
	}

}

class Purchase
{
	String itemCode;
	String itemType;
	double price;
	int quantity;
	String purchaseType;
	ItemType type;
	
	Purchase(String c, String it, double p, int q, String t)
	{
		itemCode = c;
		itemType = it;
		price = p;
		quantity = q;
		purchaseType = t;
	}
	public String getItemCode()
	{
		return this.itemCode;
	}
	public String getItemType()
	{
		return this.itemType;
	}
	public double getPrice()
	{
		return this.price;
	}
	public int getQuantity()
	{
		return this.quantity;
	}
	public String getPurchaseType()
	{
		return this.purchaseType;
	}
	void setItemCode(String c)
	{
		this.itemCode = c;
	}
	void setItemType(String type)
	{
		this.itemType = type;
	}
	void setPrice(double p)
	{
		this.price = p;
	}
	void setQuantity(int q)
	{
		this.quantity = q;
	}
	void setPurchaseType(String ptype)
	{
		this.purchaseType = ptype;
	}
	public String toString()
	{
		return ("\nItem Code: "+itemCode+"\nItem Type: "+itemType+"\nPrice: "+price+"\nQuantity: "+quantity+"\nPurchae Type: "+purchaseType);
	}
	public enum ItemType
	{
		Electronics,
		Medicine,
		Cosmetics;
	}
	public ItemType getType()
	{
		if(itemType.equals("Electronics"))
		{
			type = Purchase.ItemType.Electronics;
		}
		if(itemType.equals("Medicine"))
		{
			type = Purchase.ItemType.Medicine;
		}
		if(itemType.equals("Cosmetics"))
		{
			type = Purchase.ItemType.Cosmetics;
		}
		return type;
	}
}
