
public class JosephusProblem {

	public static void main(String[] args) 
	{
		int n = 14;
        int k = 2;
        System.out.println("The person in place "
                           + josephusProblem(n, k)+" survives.");
	}
	public static int josephusProblem(int n, int k)
	{
		if(n==1)
			return 1;
		else
			return (josephusProblem(n-1, k)+k-1)%n+1;
	}
}
