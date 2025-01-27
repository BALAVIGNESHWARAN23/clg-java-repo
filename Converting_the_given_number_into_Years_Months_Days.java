
// 1. Write a  program that takes a total number of days as input and converts it into years, months, and days. 
// The program should consider a year to have 365 days and a month to have 30 days.
//  After calculating the years, months, and days, the program should display the result in the following format:

import java.util.Scanner;


public class Converting_the_given_number_into_Years_Months_Days {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a total number of days :");
        int total_number = sc.nextInt();
        int year,remaining_days,month,days;
        year=total_number/365;
        remaining_days=total_number%365;
        month=remaining_days/30;
        days=remaining_days%30;
        System.out.println(year+month+days);

        System.out.println(total_number +" days = "+year+ " years , "+month+" months ,  and "+days+" days");

    }
}

