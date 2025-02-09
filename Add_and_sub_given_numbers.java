
// 2.You have two numbers, and your challenge is to write a program that performs both 
// addition and subtraction with them. However, if any subtraction results in a negative 
// number, display it as a positive value. How will you tackle this and show the final 
// results?

import java.util.Scanner;

public class Add_and_sub_given_numbers {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num1, num2 ,add ,sub;
        System.out.print("enter the first num to addition and subtraction :");
        num1 = sc.nextInt();
        System.out.print("enter the second num to addition and subtraction :");
        num2 = sc.nextInt();
        add=num1+num2;
        System.out.println("the addition of given num is :"+add);
        sub=Math.abs(num1-num2);
        System.out.println("the subtraction of given num is :"+sub);

    }
}
