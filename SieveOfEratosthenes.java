
public class SieveOfEratosthenes {

	public static void main(String[] args) 
	{
		SieveOfEratosthenes a = new SieveOfEratosthenes();
		a.sieveofEratosthenes(30);
	}
	
	void sieveofEratosthenes(int n)
	{
		boolean prime[] = new boolean[n+1];
		for(int i=0;i<=n;i++)
			prime[i]=true;
		
		prime[0] = false;
		prime[1] = false;
		
		for(int p = 2;p*p<=n;p++)
		{
			if(prime[p]==true)
			{
				for(int i = p*p;i<=n;i+=p)
				{
					prime[i] = false;
				}
			}
		}
		
		for(int x = 0;x<=n;x++)
		{
			if(prime[x]==true)
				System.out.print(x+" ");
		}
	}
}
