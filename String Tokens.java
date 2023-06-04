import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s = s.trim();
        if(s.length()==0)
        {
            System.out.println(0);
            System.exit(0);
        }
        
        String A[] = s.split("[!,?._'@ ]+");
        System.out.println(A.length);
        for(int i=0;i<A.length;i++)
        {
            System.out.println(A[i]);
        }
        scan.close();
    }
}
