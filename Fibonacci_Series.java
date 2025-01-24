
import java.util.Scanner;

class Fibonacci_Series{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the range for the Fibonacci Series:");
        int lim=sc.nextInt();
        int a=0,b=1,c;
        System.out.println("Fibonacci Series for range to is " + lim);
        for(int i=0;i<=lim;i++){
            
            System.out.println(a);
            c=a+b;
            a=b;
            b=c;
        }
    }
}