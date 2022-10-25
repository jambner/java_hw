import java.util.*;
public class PurchaseArray {
    public static void main(String[] args) {
        // Array of 5 Purchase objects
        Purchase[] purchases = new Purchase[5];
        int num;
        double amount;
        Scanner input = new Scanner(System.in);
        int x;
        final int LOW = 1000, HIGH = 8000;
        //loop over Purchase length
        for(x = 0; x < purchases.length; ++x)
        {
            purchases[x] = new Purchase();
            System.out.println("------Purchase " + (x+1) + "-------");
            System.out.print("Enter invoice number >> ");
            num = input.nextInt();
            while(num < LOW || num > HIGH)
            {
                System.out.println("Invoice number must be between " + LOW + " and " + HIGH);
                System.out.print("Enter invoice number >> ");
                num = input.nextInt();
            }
            System.out.print("Enter sale amount >> ");
            amount = input.nextDouble();
            while(amount <= 0)
            {
                System.out.println("Sale amount must be greater than 0");
                System.out.print("Enter sale amount >> ");
                amount = input.nextDouble();
            }
            // Calling methods for each purchase to set Invoice Number and Sales Amount
            purchases[x].setInvoiceNumber(num);
            purchases[x].setSaleAmount(amount);
        }
        System.out.println();
        // Printing the result
        for(x = 0; x < purchases.length; ++x)
        {
            purchases[x].display();
        }
    }
}
