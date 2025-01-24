import java.util.Scanner;

public class Multiplication_Tables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the table number you want :");
    int table_number=sc.nextInt();
    
    System.out.print("enter the table limit you want :");
    int lim=sc.nextInt();
    
    for(int i=1;i<=lim;i++){
        System.out.println(table_number + "x" +i +"="+(table_number*i));
        
    }
    }
    

}
