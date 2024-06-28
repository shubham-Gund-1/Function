import java.util.*;
public class Factorial4{
    static int fact(int n){
        int fact=1;
            for(int i=n;i>1;i--){
            fact=fact*i;
        }
        return(fact);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        int n=sc.nextInt();
        System.out.println(fact(n));
    }
}