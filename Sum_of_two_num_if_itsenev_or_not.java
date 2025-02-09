
// 2.You have two numbers, and your task is to write a program that adds them together 
// and checks if their total can be evenly divided by 2. Can you figure out if the sum is even 
// or not?

import java.util.Scanner;

public class Sum_of_two_num_if_itsenev_or_not {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1,num2,result;
        System.out.print("enter a first num to find the sum and its even or not :");
        num1=sc.nextInt();
        System.out.print("enter a second num to find the sum and its even or not :");
        num2=sc.nextInt();
        result=num1+num2;
        if(result%2==0){
            System.out.println("the sum of two numbers are even "+result);
        }
        else{
            System.out.println("the sum of two numbers are odd "+result);
        }
    }
    
}
