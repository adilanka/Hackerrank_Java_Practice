
public class NibbleSwap {

	public static void main(String[] args) 
	{
		int x = 50;
		System.out.println(swapNibble(x));
	}
	
	static int swapNibble(int x)
	{
		return ((x&0X0F) << 4 | (x&0XF0) >>4);
	}

}
