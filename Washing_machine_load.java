
import java.util.Scanner;

// 1.A washing machine works on the principle of Fuzzy System, the weight of clothes put 
// inside it for washing is uncertain but based on weight measured by sensors and the water 
// level chosen, it decides total time needed. 

// For low level water, the time estimate is 25 minutes, where approximately weight is 
// between 2000 grams or any nonzero positive number below that.

// For medium level water, the time estimate is 35 minutes, where approximately weight is 
// between 2001 grams and 4000 grams.

// For high level water, the time estimate is 45 minutes, where approximately weight is 
// above 4000 grams. 
// Assume the capacity of machine is maximum 7000 grams. 
// When the weight is zero, time needed is 
// 0 minutes. 

// If the weight exceeds maximum weight limit, then, print “OVERLOADED”, and for all 
// negative weights, the output is “INVALID INPUT”.
// Sample Input-1: 2000, L
// Sample Output-1: Time Estimated: 25 minutes

public class Washing_machine_load {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the weight of clothes (in grams): ");
        int weight=sc.nextInt();
        System.out.print("Enter water level (L for Low, M for Medium, H for High): ");
        char level= sc.next().toUpperCase().charAt(0);
        if(weight<=0){
            System.out.println("INVALID INPUT");
        }
        else if (weight==0){
            System.out.println("the time taken is 0 minutes");
        }
        else if(weight>=7000 ){
            System.out.println("OVERLOADED");
        }
        else{
            int time=0;

            if(level == 'L' && weight <= 2000) {
                time=25;
            }
            else if(level =='M' && weight==2000 && weight<=4000){
                time=35;
            }
            else if(level == 'H' && weight>=4000){
                time=45;
            }
            else{
                System.out.println("INVALID INPUT");
            }
            System.out.println("Time Estimated:" + time + " minutes");
        }
    }
}
