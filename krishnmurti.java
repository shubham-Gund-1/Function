import java.util.*;
public class krishnmurti{
    static String krishnmurti(){
        int i,n,n1,f1=1,sum=0,temp;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number");
        n=input.nextInt();
        temp=n;
        while(n>0)
        {
            n1=n%10;
            n=n/10;
            f1=1;
            for(i=n1;i>1;i--)
            {
                f1=f1*i;
                
            }
            sum=sum+f1;
        }
        if(temp==sum){
            return("Krishnmurti number");
        }
        else{
            return("Not krishnmurti number");
        }
    }
    public static void main(String args[]){
        String k=krishnmurti();
        System.out.println(k);
    }
}