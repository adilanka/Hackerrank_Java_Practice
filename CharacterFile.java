import java.io.*;
import java.util.Scanner;

 

public class CharacterFile {

 

    public static void main(String[] args) {
        try(FileWriter fout = new FileWriter("D:\\test\\aditya.txt"))
        {
            String msg;
            Scanner in = new Scanner(System.in);
            msg = in.nextLine();  
            while(!msg.equals("end"))
            {
                fout.write(msg+"\n");
                msg = in.nextLine();
            }
        }
        catch(FileNotFoundException e)
        {
            System.out.println(e);
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
        
        try(FileReader fread = new FileReader("D:\\test\\aditya.txt"))
        {
            int i = fread.read();
            while(i!=-1)
            {
                System.out.print((char)i);
                i = fread.read();
            }
        }
        catch(IOException e)
        {
            
        }
        
    }

 

}