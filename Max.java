import java.util.*;
public class Max{
    static void arraymax(){
        Scanner input=new Scanner(System.in);
        int i,n,min,max;
        System.out.println("Enter the size of array :");
        n=input.nextInt();
        int a[]=new int[n];
        System.out.println("Enter "+n+" Elements :");
        for(i=0;i<n;i++){
            a[i]=input.nextInt();
        }
        max=min=a[0];
        for(i=1;i<n;i++){
            if(a[i]>max){
                max=a[i];
            }
            if(a[i]<min){
                min=a[i];
            }
        }
        System.out.println("Max numbers is :"+max);
        System.out.println("Min numbers is :"+min);
    }
    public static void main(String args[]){
        arraymax();
    }
}