import java.util.*;
import java.lang.*;

public class cuboid {
    public static void main(String[] args) {

        Scanner sc= new Scanner (System.in);
        int length,breadth, height;
        int  area,volume;
        System.out.print("Enter the value of length : ");
        length=sc.nextInt();
        System.out.print("Enter the value of breadth : ");
        breadth=sc.nextInt();
        System.out.print("Enter the value of height : ");
        height=sc.nextInt();

        area=(2*((length*breadth)+(breadth*height)+(height*length)));
        volume= (length * breadth * height);
        System.out.println("area of cuboid is : "+area);
        System.out.println("volume of cuboid is : "+volume);
    }
}