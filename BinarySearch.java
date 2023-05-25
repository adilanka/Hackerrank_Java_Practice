
public class BinarySearch {

	public static void main(String[] args) 
	{
		int list[] = {1,2,4,6,8,9,16,20,21};
		BinarySearch b1 = new BinarySearch();
		int len = list.length;
		int result = b1.binarySearch(list, 0,len-1 ,21);
		System.out.println("The index value is: "+result);
	}
	
	private int binarySearch(int arr[],int l, int h, int x)
	{
		
		if(h>=l)
		{
			int mid = (h+l)/2;
			if(arr[mid]==x)
				return mid;
			else if(arr[mid]>x)
				return binarySearch(arr,l,mid-1,x);
			else if(arr[mid]<x)
				return binarySearch(arr,mid+1,h,x);
			else
				return -1;
		}
		else
			return -1;
	}

}
