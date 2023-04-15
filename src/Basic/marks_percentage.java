package Basic;

import java.util.Scanner;

public class marks_percentage {
    double total , percentage;
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Maths : ");
        float Maths = sc.nextFloat();
        System.out.print("Computer : ");
        float Computer = sc.nextFloat();
        System.out.print("English : ");
        float English =sc.nextFloat();
      double  total = Maths + Computer + English;
        System.out.println("Total marks: "+total);

      double  percentage =((total/300.0)*100);
        System.out.print("percentage : "+percentage);


    }
}
