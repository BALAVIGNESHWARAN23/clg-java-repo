
import java.util.Scanner;

// 1.You have four secret numbers and your challenge is to write a program that figures 
// out which one is the largest and which one is the smallest. Use your trusty if-else 
// statements to solve this number mystery. Can you determine the highest and lowest 
// numbers among them?

public class Find_lagest_and_smallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1,num2,num3,num4;
        System.out.print("enter the first num to find lagest and smallest num :");
        num1=sc.nextInt();
        System.out.print("enter the second num to find lagest and smallest num :");
        num2=sc.nextInt();
        System.out.print("enter the third num to find lagest and smallest num :");
        num3=sc.nextInt();
        System.out.print("enter the fourth num to find lagest and smallest num :");
        num4=sc.nextInt();
        if(num1>num2 && num1>num3 && num1>num4){
            System.out.println("the num1 :"+num1+" is largest ");
        } 
        else if (num2 > num1 && num2 > num3 && num2 > num4){
        System.out.println("the num2 :"+num2+" is largest ");
    }
       else if (num3>num1 && num3>num2 && num3>num4){
        System.out.println("the num3 :"+num3+" is largest ");
       }
       else{
        System.out.println("the num4 :"+num4+" is largest ");
       }


       if(num1<num2 && num1<num3 && num1<num4){
        System.out.println("the num1 :"+num1+" is smallest ");
    } 
    else if (num2 < num1 && num2<num3 && num2<num4){
    System.out.println("the num2 :"+num2+" is smallest ");
}
   else if (num3<num1 && num3<num2 && num3<num4){
    System.out.println("the num3 :"+num3+" is smallest ");
   }
   else{
    System.out.println("the num4 :"+num4+" is smallest ");
   }
    }
}
