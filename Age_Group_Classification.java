// 2.Age Group Classification: Write a Java program that takes an age as input and prints the corresponding age group:

// 0-12: Child
// 13-19: Teenager
// 20-64: Adult
// 65 and above: Senior

import java.util.Scanner;


public class Age_Group_Classification {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a age: ");
        int age = sc.nextInt();
        if(age>=0 && age<=12){
            System.out.println("child");
        }
        else if(age>=13 && age<=19){
            System.out.println("teenager");
        }
        else if(age>=20 && age<=64){
            System.out.println("Adult");
        }
        else if(age>=65){
            System.out.println(" Senior");
        }

    }
    
}
