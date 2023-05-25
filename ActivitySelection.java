
class ActivitySelection
{
	public static void printMaxActivities(int s[], int f[], int n)
	{
	int i, j;
	
	System.out.print("Following activities are selected : n");
	
	i = 0;
	System.out.print(i+" ");
	
	for (j = 1; j < n; j++)
	{
		if (s[j] >= f[i])
		{
			System.out.print(j+" ");
			i = j;
		}
	}
	}
	
	public static void main(String[] args)
	{
	int s[] = {0, 2, 1, 4, 4, 3, 6};
	int f[] = {2, 4, 5, 7, 8, 9, 12};
	int n = s.length;
		
	printMaxActivities(s, f, n);
	}
	
}
