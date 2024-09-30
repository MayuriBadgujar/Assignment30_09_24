public class TriangleMain {
    public static void main(String[] args) {
        System.out.println("_________________________Triangle1____________________");
         Triangle triangle=new Triangle(1.0F,2.0f,3.0f);
         triangle.calculatePeri();
         triangle.calculateArea();

         System.out.println("________________________Triangle 2______________________");
        Triangle triangle1=new Triangle(1.5F,2.0f,3.0f);
        triangle1.calculatePeri();
        triangle1.calculateArea();
    }
}
/*
output:
_________________________Triangle1____________________
Perimeter of triangle : 6.0
Area of triangle : 0.0
________________________Triangle 2______________________
Perimeter of triangle : 6.5
Area of triangle : 1.3331705629813464

 */