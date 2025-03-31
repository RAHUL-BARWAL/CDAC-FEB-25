import java.util.Scanner;

class BMICalculator {
    double height, weight;

    BMICalculator(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    void setHeight(double height) {
        this.height = height;
    }

    void setWeight(double weight) {
        this.weight = weight;
    }

    double calculateBMI() {
        return weight / (height * height);
    }
}

public class BMIDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter height in meters: ");
        double height = sc.nextDouble();
        System.out.print("Enter weight in kg: ");
        double weight = sc.nextDouble();

        BMICalculator bmi = new BMICalculator(height, weight);
        System.out.println("BMI: " + bmi.calculateBMI());

        sc.close();
    }
}
