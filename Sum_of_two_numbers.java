
// 2.Imagine you have two randomly chosen numbers, and your goal is to write a program 
// that adds them together. How will you set up your program to generate these numbers 
// and calculate their sum?

import java.util.Scanner;

public class Sum_of_two_numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1,num2,sum;
        System.out.print("Enter a first number to sum :");
        num1=sc.nextInt();
        System.out.print("Enter a second number to sum :");
        num2=sc.nextInt();
        sum=num1+num2;
        System.out.println("the sum of two given numbers is : "+num1+ " + "+num2+" = "+sum);
    }
}
