
// 1.Imagine you have two mysterious numbers. Your task is to write a program that 
// reveals which one of them is the bigger one. How will you solve this puzzle?

import java.util.Scanner;

public class find_biggest_num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1,num2;
        System.out.print("enter the First number to compare:");
        num1= sc .nextInt();
        System.out.print("enter the second number to compare:");
        num2= sc .nextInt();
        if(num1>num2){
            System.out.println("the "+num2+" is lesser than "+num1+" therefore the "+num1+" is greatter");
        }
        else{
            System.out.println("the "+num1+" is lesser than "+num2+" therefore the "+num2+" is greatter");
        }

    }
}
