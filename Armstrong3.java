import java.util.*;
public class Armstrong3 {
    static void armstrong(int n) {
        int n1, temp, sum = 0;
        temp = n;
        while (n > 0) {
            n1 = n % 10;
            n = n / 10;
            sum = sum + (n1 * n1 * n1);
        }
        if (temp == sum) {
            System.out.println("Armstrong number.");
        } else {
            System.out.println("Not armstrong number.");
        }
    }
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = input.nextInt();
        armstrong(n);
    }
}
