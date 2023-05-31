
public class ExcepDemo {

	public static void main(String[] args) 
	{
		int[] nums = new int[4];
		try {
			System.out.println("Before exception generation...");
			nums[8] = 10;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Index-Out-Of-Bounds");
		}
		System.out.println("After try and catch...");
	}

}
