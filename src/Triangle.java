/*

JAVA Assignment-4
1.    Write a program to print the area and perimeter of a triangle having sides
of 3, 4 and 5 units by creating a class named 'Triangle' with parameter in its constructor.
 */
import java.util.*;
public class Triangle {
    private double areaOfTraingle;
    private  double semiPerimeter;
    private double perimeter;
    private float side1;
    private float side2;
    private float side3;

    Triangle(){

    }
    Triangle(float side1,float side2,float side3){
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }
    void calculatePeri(){
        perimeter=side1+side2+side3;
        System.out.println("Perimeter of triangle : "+perimeter);
    }

    void calculateArea(){
        semiPerimeter= ((side1 + side2 + side3) / 2.0);
        areaOfTraingle=Math.sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3));
        System.out.println("Area of triangle : "+areaOfTraingle);
    }
}
