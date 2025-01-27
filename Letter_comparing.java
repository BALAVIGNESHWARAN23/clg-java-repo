
// 1.Imagine you have two secret letters, „A‟ and „B‟. Your task is to write a program that 
// uses different comparison tools to uncover how these letters relate to each other. Can you 
// figure out which one is greater or less than the other? Use your program to solve this 
// letter comparison mystery!
// For example, consider two characters „A‟ and „B‟. 
// „A‟ < „B‟ is true.
// „A‟ <= „B‟ is true.
// „A‟ > „B‟ is false. 
// „A‟ >= „B‟ is false. 
// „A‟ == „B‟ is false. 
// „A‟ != „B‟ is true. 

import java.util.Scanner;


public class Letter_comparing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char first_letter,secound_letter ;
        System.out.print("Enter a First letter :");
        first_letter=sc.nextLine().charAt(0);
        char conveted_first_letter =Character.toUpperCase(first_letter);
        System.out.print("Enter a second letter :");
        secound_letter=sc.nextLine().charAt(0);
        char conveted_secound_letter=Character.toUpperCase(secound_letter);


        
        if(conveted_first_letter<conveted_secound_letter){
            System.out.println(conveted_first_letter+" < "+conveted_secound_letter+" is True");
        } else{
            System.out.println(conveted_first_letter+" < "+conveted_secound_letter+" is False");
        }
        if(conveted_first_letter<=conveted_secound_letter){
            System.out.println(conveted_first_letter+" <= "+conveted_secound_letter+" is True");
        } else{
            System.out.println(conveted_first_letter+" <= "+conveted_secound_letter+" is False");
        }
        if(conveted_first_letter>conveted_secound_letter){
            System.out.println(conveted_first_letter+" > "+conveted_secound_letter+" is True");
        } else{
            System.out.println(conveted_first_letter+" > "+conveted_secound_letter+" is False");
        }
        if(conveted_first_letter>=conveted_secound_letter){
            System.out.println(conveted_first_letter+" >= "+conveted_secound_letter+" is True");
        } else{
            System.out.println(conveted_first_letter+" >= "+conveted_secound_letter+" is False");
        }
        if(conveted_first_letter==conveted_secound_letter){
            System.out.println(conveted_first_letter+" == "+conveted_secound_letter+" is True");
        } else{
            System.out.println(conveted_first_letter+" == "+conveted_secound_letter+" is False");
        }
        if(conveted_first_letter!=conveted_secound_letter){
            System.out.println(conveted_first_letter+" != "+conveted_secound_letter+" is True");
        }else{
            System.out.println(conveted_first_letter+" != "+conveted_secound_letter+" is False");
        }
    }
}
