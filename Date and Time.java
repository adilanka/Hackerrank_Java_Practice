import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.Calendar;

class Result {
    public static String findDay(int month, int day, int year) {
        Calendar c = Calendar.getInstance();
        c.set(year,month-1,day);
        int d = c.get(Calendar.DAY_OF_WEEK);
        String dw;
        switch(d)
        {
            case 1: dw = "SUNDAY";
            break;
            case 2: dw = "MONDAY";
            break;
            case 3: dw = "TUESDAY";
            break;
            case 4: dw = "WEDNESDAY";
            break;
            case 5: dw = "THURSDAY";
            break;
            case 6: dw = "FRIDAY";
            break;
            case 7: dw = "SATURDAY";
            break;
            default: dw = "Date exceeds the limits of the program"; 
        }
        return dw;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
