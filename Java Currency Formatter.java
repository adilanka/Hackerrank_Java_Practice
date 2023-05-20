import java.util.*;
import java.text.*;
import java.text.NumberFormat;
public class Solution {
    public static void main(String[] args) {
        Locale ind = new Locale("en", "in");
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        String india = NumberFormat.getCurrencyInstance(ind).format(payment);
        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
