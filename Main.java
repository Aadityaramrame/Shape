import java.util.*;

class Main{
    public static void main(String args[]){
            Scanner scan = new Scanner(System.in);
            
            System.out.println("Enter length of circle: ");
            double length = Double.parseDouble(scan.nextLine());

            Cube cub= new Cube(length);
            System.out.println("Area of Circle: " + cub.calculateArea());
            System.out.println("Perimeter of Circle: " + cub.calculatePerimeter());
    }
}
