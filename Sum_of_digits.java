
import java.util.Scanner;

public class Sum_of_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the digits to sum :");
        int get_num=sc.nextInt();
        int sum=0;
        while (get_num>0) {
             sum +=get_num%10;
             get_num/=10;
        }{
            System.out.println(sum);
        }
    }
}
