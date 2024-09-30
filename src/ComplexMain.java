
public class ComplexMain {
    public static void main(String[] args) {
        System.out.println("___________________________Complex1_________________________");
       Complex complex=new Complex();
        complex.display();
       complex.add();
        complex.substract();
        complex.multiplication();

        System.out.println("___________________________Complex2_________________________");
        Complex complex1=new Complex(2,4,6,8);
        complex1.display();
        complex1.add();
        complex1.substract();
        complex1.multiplication();
    }
}

/*
___________________________Complex1_________________________
First complex combination : 0.0 + 0.0i
Second complex combination : 0.0 + 0.0i
Addition of complexNo is : 0.0 + 0.0i
Substraction of complexNo is : 0.0 + 0.0i
Multiplication of complexNo is : 0.0 + 0.0i
___________________________Complex2_________________________
First complex combination : 2.0 + 4.0i
Second complex combination : 6.0 + 8.0i
Addition of complexNo is : 8.0 + 12.0i
Substraction of complexNo is : -4.0 + -4.0i
Multiplication of complexNo is : 12.0 + 32.0i

 */