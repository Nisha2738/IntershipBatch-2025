package Day16.java;
import java.util.*;

public class SumDigitsDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0;

        do {
            int digit = num % 10;
            sum += digit;
            num = num / 10;
        } while (num != 0);

        System.out.println("Sum of digits is: " + sum);
    }
}
