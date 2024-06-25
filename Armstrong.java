import java.util.*;
public class Armstrong{
    static void armstrong() {
        int i, n, count = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number :");
        n = input.nextInt();
        System.out.println("First " + n + " Armstrong numbers are:");
        for (i = 1; count < n; i++) {
            int number = i;
            int originalNumber = number;
            int remainder, result = 0, digits = 0;
            while (originalNumber != 0) {
                originalNumber /= 10;
                ++digits;
            }
            originalNumber = number;
            while (originalNumber != 0) {
                remainder = originalNumber % 10;
                result += Math.pow(remainder, digits);
                originalNumber /= 10;
            }
            if (result == number) {
                System.out.print(number + " ");
                count++;
            }
        }
    }
    public static void main(String args[]){
        armstrong();
    }
}