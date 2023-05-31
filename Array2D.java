
public class Array2D {

	public static void main(String[] args) 
	{
		int twoD[][];
		twoD = new int[3][];
		twoD[0] = new int[3];
		twoD[0][0] = 10;
		twoD[0][1] = 20;
		twoD[0][2] = 30;

		twoD[1] = new int[3];
		twoD[1][0] = 50;
		twoD[1][1] = 100;
		twoD[1][2] = 100;
		
		twoD[2] = new int[3];
		twoD[2][0] = 87;
		twoD[2][1] = 25;
		twoD[2][2] = 90;
	
		for(int i=0; i<twoD.length;i++)
		{
		for(int j=0; j<twoD[i].length; j++)
		System.out.print(twoD[i][j]+" ");
		System.out.println();
		}
	}

}
