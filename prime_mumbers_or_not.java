// 1.Check Prime Number: Write a Java program that checks whether a given number is a prime number or not. (A prime number is only divisible by 1 and itself.)

import java.util.Scanner;

public class prime_mumbers_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count=0 ;
        System.out.println("enter a number to check whether a given number is a prime number or not ");
        int num =sc.nextInt();
        for(int i = 1; i < num; i++){
            if(num%i==0){
                count=count+1;
            }

             
        }
        if(count==1){
            System.out.println("prime");

        }
        else
        {
            System.out.println("not a prime");
        }


    }
}
