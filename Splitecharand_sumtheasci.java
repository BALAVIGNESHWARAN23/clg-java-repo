
import java.util.Scanner;

public class Splitecharand_sumtheasci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a string with an special char :");
        String name = sc .next();
        String splited_name = name.replaceAll("[^a-z,A-Z]", "");
        System.out.println(splited_name);
        int asci=0;
        for (int i=0;i<splited_name.length();i++){
            
            asci +=(int)splited_name.charAt(i);

        }
        System.out.println(asci);
         while(asci >= 10){
            int sum=0;
            while (asci>0) {
                sum +=asci%10;  
                asci/=10;
           }{
              
           }asci=sum;
         }
         System.out.println(asci);

    }
}
