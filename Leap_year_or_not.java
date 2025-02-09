// 1.You have a year in mind, and your task is to write a program that determines if this year 
// is a leap year. Can you figure out if it has an extra day in February?


import java.util.Scanner;

public class Leap_year_or_not {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter a year to check it's an leap year or not :");
        int year =sc.nextInt();
        if (year%4==0 && year%100!=0 || year%400==0){
            System.out.println("it's an leap year :"+year);
        }
        else{
            System.out.println("it's  not a leap year :"+year);
        }
    }
}
