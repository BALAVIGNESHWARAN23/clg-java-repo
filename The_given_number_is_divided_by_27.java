// 2.You have a number to examine, and your mission is to write a program that checks 
// whether this number can be divided evenly by 27. Can you find out if it‟s a multiple of 
// 27?

import java.util.Scanner;

public class The_given_number_is_divided_by_27 {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.print("enter the number to check the given number is multiple of 27 or not :");
        int num1=sc.nextInt();
        if(num1%27==0){
            System.out.println("the given number is  multiple of 27 :"+num1);
        }
        else{
            System.out.println("the given number is not  multiple of 27 :"+num1);
        }
    }
}
