import java.util.*;
public class Max3 {
    static void max(int a, int b) {
        int max = (a > b) ? a : b;
        System.out.println("Maximum number is : " + max);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number:");
        int num2 = sc.nextInt();
        max(num1, num2);
    }
}
