
// 1.Your task is to create a program that displays the message "Hello world" on the 
// screen. How will you set up your program to print this greeting clearly and correctly?

import java.util.Scanner;

public class displays_the_message {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter a message to display on terminal :");
        String message=sc.nextLine();
        System.out.println(message);
    }
    
}
