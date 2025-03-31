class Complex {
    double real, imag;

    Complex() {
        real = 0;
        imag = 0;
    }

    Complex(double real) {
        this.real = real;
        this.imag = 0;
    }

    Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    Complex add(Complex c) {
        return new Complex(this.real + c.real, this.imag + c.imag);
    }

    Complex multiply(Complex c) {
        double newReal = this.real * c.real - this.imag * c.imag;
        double newImag = this.real * c.imag + this.imag * c.real;
        return new Complex(newReal, newImag);
    }

    void display() {
        System.out.println(real + " + " + imag + "i");
    }
}

public class ComplexDemo {
    public static void main(String[] args) {
        Complex c1 = new Complex(3, 2);
        Complex c2 = new Complex(4, -2);

        Complex sum = c1.add(c2);
        Complex product = c1.multiply(c2);

        System.out.print("Sum: ");
        sum.display();
        System.out.print("Product: ");
        product.display();
    }
}
