import java.util.Scanner;
public class AllTypes {
    static void pattern() {
        //no parameter no return
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static String magic() {
        // no parameter with return
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int oN = num;
        int sum = 0;
        while (num > 0 || sum > 9) {
            if (num == 0) {
                num = sum;
                sum = 0;
            }
            sum += num % 10;
            num /= 10;
        }
        if (sum == 1) {
            return (oN + " is a Magic Number.");
        } else {
            return (oN + " is not a magic number ");
        }
    }
    static void pronic(int n){
        // parameter with no return
        int i,flag=0;
        for(i=1;i<=(n/2);i++){
            if(n==(i*(i+1))){
                flag=1;
                break;
            }
        }
        if(flag==1){
            System.out.println("Pronic number");
        }
        else {
            System.out.println("Not pronic number");
        }
    }
    static int binary(int num){
        // parameter with return
        int n1,p=1,sum=0;
        while(num>0){
            n1=num%2;
            num=num/2;
            sum=sum+(n1*p);
            p=p*10;
        }
        return(sum);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int ch;
        do {
            System.out.println("Enter Your choice :");
            System.out.println("1. Pattern");
            System.out.println("2. Magic");
            System.out.println("3. Pronic");
            System.out.println("4. Binary");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    pattern();
                    break;
                case 2:
                    System.out.println(magic());
                    break;
                case 3:
                    // Scanner sc=new Scanner(System.in);
                    System.out.println("Enter a number :");
                    int n=sc.nextInt();
                    pronic(n);
                    break;
                case 4:
                    System.out.println("Enter a number :");
                    int num=sc.nextInt();
                    int decimal=binary(num);
                    System.out.println(decimal);
                    break;
                default:
                    System.out.println("Invalid input. Please enter a valid choice.");
            }
        } while (ch <= 4);
    }
}
