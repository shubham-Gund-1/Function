import java.util.*;
public class Armstrong4 {
    static String armstrong(int n) {
        int n1, temp, sum = 0;
        temp = n;
        while (n > 0) {
            n1 = n % 10;
            n = n / 10;
            sum = sum + (n1 * n1 * n1);
        }
        if (temp == sum) {
            return("Armstrong number.");
        } else {
            return("Not armstrong number.");
        }
    }
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = input.nextInt();
        System.out.println(" "+armstrong(n));
    }
}
