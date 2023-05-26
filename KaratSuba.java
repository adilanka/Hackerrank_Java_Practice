
public class KaratSuba {

	public static void main(String[] args) 
	{
		int num1 = 1234;
		int num2 = 5678;
	}
	
	static int karatSuba(int x,int y)
	{
		int result=0;
		int a,b,c,d =0;
		int len1 = findlength(x);
		int len2 = findlength(y);
		if(x>10&&y>10)
		{
			a = (int) (x/(Math.pow(10,len1/2)));
			b = (int) (x%(Math.pow(10,len1/2)));
			c = (int) (y/(Math.pow(10,len2/2)));
			d = (int) (y%(Math.pow(10,len2/2)));	
		}
		else
			return 5;
		return (a,b,c,d);
		
	}
	
	static int findlength(int a)
	{
		int n=0;
		while(a>0)
		{
			a = a/10;
			n++;
		}
		return n;
	}

}
