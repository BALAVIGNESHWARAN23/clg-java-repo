
// 2.You have three hidden numbers, and your mission is to find out which one is the 
// greatest. Write a program that can reveal the highest of these three numbers.
// 8A. Perform the above operation using ternary operator.

// syntax:
//      condition ? expression1 : expression2;

import java.util.Scanner;

public class Greatest_amoung_threenum {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num1,num2,num3;
        System.out.print("Enter a First number:");
        num1=sc.nextInt();
        System.out.print("Enter a second number:");
        num2=sc.nextInt();
        System.out.print("Enter a third number:");
        num3=sc.nextInt();
        
        int greatest=(num1>num2 && num1>num3)?num1:(num2>num1 && num2>num3)?num2:num3;

        System.out.println(greatest+" is greatest");

        // if(num1>num2 && num1>num3){
        //     System.out.println(num1+" is greatest");
        // }else if(num2>num1 && num2>num3){
        //     System.out.println(num2+" is greatest");
        // }else{
        //     System.out.println(num3+" is greatest");
        // }
    }
}
