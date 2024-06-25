import java.util.*;
public class Perfect{
    static String perfect(){
        Scanner input=new Scanner(System.in);
        int n,sum=0,i;
        System.out.println("Enter a number :");
        n=input.nextInt();
        for(i=1;i<=(n/2);i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
        if(sum==n){
            return ("Perfect number.");
        }
        else {
            return "Not perfect Number.";
        }
    }
    public static void main(String args[]){
        String num=perfect();
        System.out.println(num);
    }
}