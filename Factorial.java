import java.util.*;
public class Factorial{
    static int fact(){
        int fact=1,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        n=sc.nextInt();
        for(int i=n;i>1;i--){
            fact=fact*i;
        }
        return(fact);
    }
    public static void main(String args[]){
        int a=fact();
        System.out.println(a);
    }
}