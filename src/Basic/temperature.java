package Basic;

import java.util.Scanner;

public class temperature {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Fahrenheit : ");
        float Fahrenheit = sc.nextFloat();
        System.out.println("Temperature in Celsius : " +TemperatureConv(Fahrenheit));
    }
    public static double TemperatureConv(float Fahrenheit){
        return ((Fahrenheit-32)/1.8);

    }
}
