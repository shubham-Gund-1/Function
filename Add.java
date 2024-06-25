import java.util.*;
public class Add{
    static void add(){
        Scanner input=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter first number :");
        a=input.nextInt();
        System.out.println("Enter second number :");
        b=input.nextInt();
        c=a+b;
        System.out.println(c);
    }
    public static void main (String args[]){
        add();
        add();
    }
}