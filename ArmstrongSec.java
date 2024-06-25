import java.util.*;
public class ArmstrongSec{
    static String armstrong(){
        int i,n1,n,temp=1,sum=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number :");
        n=input.nextInt();
        temp=n;
        while(n>0){
            n1=n%10;
            n=n/10;
            sum=sum+(n1*n1*n1);
        }
        if(temp==sum){
            return("Armstrong number.");
        }
        else{
            return("Not armstrong number.");
        }
    }
    public static void main(String args[]){
        String a=armstrong();
        System.out.println(a);
    }
}