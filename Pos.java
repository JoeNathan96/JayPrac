import java.util.Scanner;
public class Pos{

     public static void main(String []args){
        Scanner num =  new Scanner(System.in);
        int number = num.nextInt();
        if(number > 0)
        {
        System.out.println("Positive");
        }
        else
        {
        System.out.println("Negative");
        }
        
     }
}
