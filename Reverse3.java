import java.util.*;
public class Reverse3 {
    static void reverse(int n) {
        int rev= 0;
        while (n != 0) {
            int digit = n % 10;
            rev= rev* 10 + digit;
            n = n / 10;
        }
        System.out.println("Reverse of the number: " + rev);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        reverse(n);
    }
}
