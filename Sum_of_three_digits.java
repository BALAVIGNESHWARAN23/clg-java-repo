// 2.You have three numbers, and your challenge is to write a program that reads these 
// numbers and computes their total sum. How will you ensure your program adds them all 
// together to give the final result?


import java.util.Scanner;

public class Sum_of_three_digits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1,num2,num3,result;
        System.out.print("enter the first digit to sum : ");
        num1=sc.nextInt();
        System.out.print("enter the second digit to sum : ");
        num2=sc.nextInt();
        System.out.print("enter the third digit to sum : ");
        num3=sc.nextInt();
        result=num1+num2+num3;
        System.out.print("the sum of three digites is "+result);
    }
    
}

