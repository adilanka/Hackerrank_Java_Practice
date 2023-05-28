import java.util.*;

public class Exp4A {

	public static <T> int count(Collection <Integer> a)
	{
		int count= 0;
		boolean q=true;
		List <Integer> x = new ArrayList<>();
		x.addAll(a);
		for(Iterator<Integer> iter = x.iterator();iter.hasNext();)
		{
			int n = iter.next();
			if(n>2)
			{
				for(int i=2;i<Math.sqrt(n);i++)
				{
					if(n%i == 0)
						{
							q = false;
							break;
						}
				}
			}
			else
				{
				q=false;
				}
			if(q) 
			{
				count++;
			}
			q=true;
		}
		System.out.println("The collection is: "+x);
		return count;
	}
	public static void main(String[] args) 
	{
		List<Integer> num = new ArrayList<>();
		num.add(12);
		num.add(2);
		num.add(19);
		num.add(11);
		num.add(8);
		num.add(29);
		num.add(71);
		num.add(53);
		System.out.println("\nThe count of numbers which are prime and odd are: "+Exp4A.count(num));
	}

}
