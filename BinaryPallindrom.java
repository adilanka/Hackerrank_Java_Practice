
public class BinaryPallindrom {

	public static void main(String[] args) 
	{
		long num = 5, n1;
		long reverse = 0;
		n1 = num;
		while(n1>0)
		{
			reverse <<= 1;
			if((n1&1)==1)
				reverse ^=1;
			n1 >>= 1;
			System.out.println(n1+" "+reverse);
		}
		if(num==reverse)
			System.out.println("Pallindrom "+num);
		else
			System.out.println("Not pallindrom");
	}

}
