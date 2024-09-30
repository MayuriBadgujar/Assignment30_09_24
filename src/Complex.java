/*
Print the sum, difference and product of two complex numbers
 by creating a class, named 'Complex' with separate methods for each
 operation whose real and imaginary parts are entered by user.
 Use Constructors to initialize the data members.
 */
public class Complex {
    // member varaible
    private double real1;
    private double imaginary1;
    private double real2;
    private double imaginary2;
    private double newReal;
    private  double newImaginary;

    Complex(){

    }
    // parameterized Constructor
    public Complex(double real1, double imaginary1,double real2,double imaginary2) {
        this.real1= real1;
        this.imaginary1 = imaginary1;
        this.real2=real2;
        this.imaginary2=imaginary2;
    }

    // addition of two complex numbers
    public void add() {
        newReal = this.real1 + this.real2;
       newImaginary = this.imaginary1 + this.imaginary2;
       System.out.println("Addition of complexNo is : "+newReal+" + "+newImaginary+"i");
    }

    public void substract() {
        newReal = this.real1 - this.real2;
        newImaginary = this.imaginary1 - this.imaginary2;
        System.out.println("Substraction of complexNo is : "+newReal+" + "+newImaginary+"i");
    }

    public void multiplication() {
        newReal = this.real1 * this.real2;
        newImaginary = this.imaginary1 * this.imaginary2;
        System.out.println("Multiplication of complexNo is : "+newReal+" + "+newImaginary+"i");
    }
     public void display(){
        System.out.println("First complex combination : "+real1+" + "+imaginary1+"i");
         System.out.println("Second complex combination : "+real2+" + "+imaginary2+"i");

     }


}
