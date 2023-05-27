
public class Exp1B {

	public static void printGraph(int[] ar)
	{
		int max=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]>max)
			{
				max = ar[i];
			}
		}
		int count = max;
		for(int j=0;j<count;j++)
		{
			for(int x=0;x<ar.length;x++)
			{
				if(max>ar[x])
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			max--;
			System.out.println("");
		}
	}
	public static void main(String[] args) 
	{
		int ar[] = {3,6,5,2,7};
		Exp1B.printGraph(ar);
	}

}
