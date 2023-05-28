import java.io.*;
import java.util.Scanner;

public class Exp6 {

	public static void main(String[] args) 
	{
		Scanner sc = null;
		PrintStream ps = null;
		try
		{
			File input = new File("D:\\test\\aditya.txt");
			File output = new File("D:\\test\\crypt.txt");
			sc = new Scanner(input);
			ps = new PrintStream(output);
			Exp6.ChangeChar(sc, ps);
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e);
		}
		finally
		{
			sc.close();
			ps.close();
		}
	}
	
	public static void ChangeChar(Scanner a, PrintStream b)
	{
		String msg;
		String converted ="";
		String convertedLine;
		while(a.hasNextLine())
			{convertedLine="";
			msg = a.nextLine(); 
			String[] word = msg.split("\\s");
			for(int i =0; i<word.length;i++)
			{   converted = "(";
				for(int j = 0; j<word[i].length();j++)
				{
					switch(word[i].charAt(j))
					{
					case 'o': converted += "0";
					break;
					case 'l' :converted+="1"; 
					break;
                    case 'e' :converted+="6"; 
                    break;
                    case 'a' :converted+="4"; 
                    break;
                    case 't' :converted+="7"; 
                    break;
                    case 's': if (j==word[i].length()-1) converted+="5";
                              else converted+=word[i].charAt(j);
                    break;
                    default: converted+=word[i].charAt(j);
					}
				}
				converted += ") ";
				convertedLine += converted;
			}
			System.out.println(convertedLine);
			b.print(convertedLine+"\n");
			}
		
	}

}
