package Basic;
import java.util.Scanner;

public class fourteen {
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        int n;

        System.out.print("Enter a number : ");
        n=sc.nextInt();
        if(n%2==0){
            System.out.println("even number");
        }
        else{
            System.out.println("odd number");
        }

    }
}

