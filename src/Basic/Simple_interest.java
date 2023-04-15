package Basic;
import java.util.Scanner;
public class Simple_interest {
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        int PI, time, rate,SI;
        System.out.print("Principle amount : ");
         PI = sc.nextInt();
         System.out.print("Time : ");
         time= sc.nextInt();
         System.out.print("rate of  interest : ");
         rate= sc.nextInt();
         SI = ((PI * rate * time)/100);
         System.out.println("Simple interest : "+SI);


    }
}
