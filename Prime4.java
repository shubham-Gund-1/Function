import java.util.*;
public class Prime4 {
    static void prime(int n) {
        System.out.print("Prime numbers up to " + n + " are:");
        int flag=0;
        for (int i = 2; i <= n; i++) {
            flag = 1;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }
            if (flag==1) {
                System.out.print(" " + i);
            }
        }
        System.out.println();
    }
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = input.nextInt();
        prime(n);
    }
}
