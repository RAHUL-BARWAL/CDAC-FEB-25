import java.util.Scanner;
import java.util.InputMismatchException;

class ElectricityBill {
    String customerName;
    double unitsConsumed, billAmount;

    ElectricityBill(String customerName, double unitsConsumed) {
        if (unitsConsumed < 0) {
            throw new IllegalArgumentException("Units consumed cannot be negative.");
        }
        this.customerName = customerName;
        this.unitsConsumed = unitsConsumed;
    }

    void calculateBillAmount() {
        if (unitsConsumed <= 100) {
            billAmount = unitsConsumed * 5;
        } else if (unitsConsumed <= 300) {
            billAmount = (100 * 5) + ((unitsConsumed - 100) * 7);
        } else {
            billAmount = (100 * 5) + (200 * 7) + ((unitsConsumed - 300) * 10);
        }
    }

    void displayBill() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Units Consumed: " + unitsConsumed);
        System.out.println("Total Bill Amount: ₹" + billAmount);
    }
}

public class ElectricityBillDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Customer Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Units Consumed: ");
            double units = sc.nextDouble();

            ElectricityBill bill = new ElectricityBill(name, units);
            bill.calculateBillAmount();
            bill.displayBill();
            
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid numeric value for units consumed.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
