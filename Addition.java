public class Addition {

	public static void main(String[] args) 
	{
		int a = 10;
		int b = 20;
		int c = add(a,b);
		System.out.println("Sum is: "+ c);
		System.out.println("Sum is: "+add());
		System.out.println("Sum is: "+add("Welcome"," MOFO"));
	}
	static int add(int a, int b)
	{
		int z = a+b;
		return z;
	}
	static int add()
	{		
		int a = 45;
		int b = 874;
		int z = a+b;
		return z;
	}
	static String add(String s1, String s2)
	{
		return s1+s2;
	}
}
