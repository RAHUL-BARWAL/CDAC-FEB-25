import java.util.Scanner;

class ElectricityBill {
    String customerName;
    double unitsConsumed, billAmount;

    ElectricityBill(String customerName, double unitsConsumed) {
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

        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Units Consumed: ");
        double units = sc.nextDouble();

        ElectricityBill bill = new ElectricityBill(name, units);
        bill.calculateBillAmount();
        bill.displayBill();

        sc.close();
    }
}
