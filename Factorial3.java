import java.util.*;
public class Factorial3{
    static void fact(int n){
        int fact=1;
               for(int i=n;i>1;i--){
            fact=fact*i;
        }
        System.out.println(fact);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        int n=sc.nextInt();
        fact(n);
    }
}