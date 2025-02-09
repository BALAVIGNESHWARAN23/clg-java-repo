
// 1.You have a number in hand, and your challenge is to write a program that 
// determines whether this number can be evenly divided by 100. Can you uncover if it‟s a 
// multiple of 100 or not?

import java.util.Scanner;

public class The_given_number_is_divided_by_100 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number to check the given number is multiple of 100 or not :");
        int num1=sc.nextInt();
        if(num1%100==0){
            System.out.println("the given number is  multiple of 100 :"+num1);
        }
        else{
            System.out.println("the given number is not  multiple of 100 :"+num1);
        }
    }
}