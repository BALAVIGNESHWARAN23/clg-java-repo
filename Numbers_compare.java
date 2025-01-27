
// 2.You have two secret numbers, and you need to figure out how they relate to each other 
// using a set of special tools. Your challenge is to write a program that uses these tools—>, 
// >=, <, <=, ==, and !=—to uncover all the secrets about how these numbers compare. How 
// will you use each tool to solve the puzzle?
// For example, consider two numbers 15 and 20. 
// 15 < 20 is true.
// 15 <= 20 is true.
// 15 > 20 is false. 
// 15 >= 20 is false. 
// 15 == 20 is false. 
// 15 != 20 is true.

import java.util.Scanner;


public class Numbers_compare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1,num2;
        System.out.print("Enter a First number to compare :");
        num1=sc.nextInt();
        System.out.print("Enter a second number to compare :");
        num2=sc.nextInt();

        if(num1<num2){
            System.out.println(num1+" < "+num2+" is True");
        } else{
            System.out.println(num1+" < "+num2+" is False");
        }
        if(num1<=num2){
            System.out.println(num1+" <= "+num2+" is True");
        } else{
            System.out.println(num1+" <= "+num2+" is False");
        }
        if(num1>num2){
            System.out.println(num1+" > "+num2+" is True");
        } else{
            System.out.println(num1+" > "+num2+" is False");
        }
        if(num1>=num2){
            System.out.println(num1+" >= "+num2+" is True");
        } else{
            System.out.println(num1+" >= "+num2+" is False");
        }
        if(num1==num2){
            System.out.println(num1+" == "+num2+" is True");
        } else{
            System.out.println(num1+" == "+num2+" is False");
        }
        if(num1!=num2){
            System.out.println(num1+" != "+num2+" is True");
        }else{
            System.out.println(num1+" != "+num2+" is False");
        }
    }
    
}
