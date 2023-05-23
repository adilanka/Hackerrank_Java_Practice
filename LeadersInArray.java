
public class LeadersInArray {

	public static void main(String[] args) 
	{
		int arr[] = {14,17,12,16,17,4,3,5,2};
		int n = arr.length;
		leadersInArray(arr,n);
	}
	
	static void leadersInArray(int arr[],int n)
	{
		for(int i=n-1;i>0;i--)
		{
			for(int j = i+1;j<n-1;j++)
			{
				if(arr[i]>arr[n-i])
				{
				if(arr[j]>arr[i])
					break;
				else
					{
					System.out.println(arr[i]);
					}
				}	
			}
		}
		/*for(int a: leader)
		{
			System.out.print(" "+leader[a]);
		}*/
	}

}