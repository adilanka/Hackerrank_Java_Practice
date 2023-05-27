
public class Exp1 {

	public static void drawBox(int l, int b)
	{
		int length = l;
		int breadth = b;
		for(int i=0;i<length;i++)
		{
			for(int j=0;j<breadth;j++)
			{
				if(i==0 || i==length-1)
				{
					System.out.print("*");
				}
				else
				{
					if(j==0 || j==breadth-1)
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
				}
			}
			System.out.println("");
		}
	}
	
	public static void drawOval(int radius)
	{
		    double distance;
		    for (int i = 0; i <= 2 * radius; i++) 
		    {
		    	for (int j = 0; j <= 2 * radius; j++) {
		        distance = Math.sqrt((i - radius) * (i - radius) +
		                         (j - radius) * (j - radius));
		        if (distance > radius - 0.5 && distance < radius + 0.5)
		        {
		        	System.out.print("*");
		        }
		        else
		        {
		        	System.out.print(" ");
		        }
		    }
		 
		    System.out.print("\n");
		    }
		
	}
	
	public static void drawArrow()
	{
		int length=14;
		int count = 8;
		for(int i=0;i<length;i++)
		{
			for(int j=0;j<length;j++)
			{
				
				if(j==count||i==6||i+j==20)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			count++;
			System.out.println("");
			
		}
	}
	
	public static void drawDiamond()
	{
		int n = 5;
		int count=0;
		for (int i = 1; i <= n; i++)
		{
			for (int j = 1; j <= n-i; j++)
			{
				System.out.print(" ");
			}	
			while (count != (2 * i - 1))
				{
					if ((count == 0) || (count == 2 * i-2))
						{
						System.out.print("*");
						}
					else
						{
						System.out.print(" ");
						}
					count++;
				}
			count = 0;
			System.out.println("");
		}
		n--;
		for (int i = n; i >= 1; i--)	
		{
			for (int j = 0; j <= n-i; j++)
				{
					System.out.print(" ");
				}
			count = 0;	
			while (count != (2 * i-1))
				{
					if ((count == 0) || (count == 2 * i-2))
							{
						System.out.print("*");
							}
					else
							{
						System.out.print(" ");
							}
					count++;
				}
			System.out.println("");
	}
	}
	
	public static void main(String[] args) 
	{
		Exp1.drawBox(5,7);
		System.out.println("");
		Exp1.drawOval(9);
		System.out.println("");
		Exp1.drawArrow();
		System.out.println("");
		Exp1.drawDiamond();
	}

}

