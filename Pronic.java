import java.util.*;
public class Pronic{
    static String pronic(){
        Scanner input=new Scanner(System.in);
        int i,n,flag=0;
        System.out.println("Enter a number :");
        n=input.nextInt();
        for(i=1;i<=(n/2);i++){
            if(n==(i*(i+1))){
                flag=1;
                break;
            }
        }
        if(flag==1){
            return("Pronic number");
        }
        else {
            return("Not pronic number");
        }
    }
    public static void main(String args[]){
        String p=pronic();
        System.out.println(p);
    }
}