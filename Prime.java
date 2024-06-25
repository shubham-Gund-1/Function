import java.util.*;
public class Prime {
    static void prime() {
        int i, j, n, count = 0;
        int flag;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number :");
        n = input.nextInt();
        System.out.println("First " + n + " prime numbers are:");
        for (i = 2; count < n; i++) {
            flag = 0;
            for (j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.print(i + " ");
                count++;
            }
        }
    }
    public static void main(String args[]) {
        prime();
    }
}
