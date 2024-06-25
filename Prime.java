import java.util.*;
public class Prime {
    static void prime() {
        int i, j, n, flag;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        n = input.nextInt();
        System.out.print("Prime numbers up to " + n + " are:");
        for (i = 2; i <= n; i++) {
            flag = 1;
            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1) {
                System.out.print(" " + i);
            }
        }
        System.out.println();
    }
    public static void main(String args[]) {
        prime();
    }
}
