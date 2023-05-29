
public class ArrayCity {

	public static void main(String[] args) 
	{
		String s[] = new String[5];
		s[0] = "Hyderabad";
		s[1] = "Surat";
		s[2] = "Bhopal";
		s[3] = "Gandhidham";
		s[4] = "Nashik";
		
		for (int i=0;i<5;i++)
		{
			System.out.println("City "+i+1+" :"+s[i]);
		}
	}

}
