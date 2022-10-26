import java.util.Scanner;
public class SortPurchasesArray {
    public static void main(String[] args) {
        Purchase[] purchases = new purchases[5];
        int i;
        String message;
        char choice;
        final char QUIT = "Z";
        int number;
        double price;

        Scanner keyboard = new Scanner(System.in);
        //for loop that goes through the empty array up to 5 elements for the number and price
        for(i=0; i<purchases.length; ++i){
            System.out.print("Enter invoice number >> ");
            number = keyboard.nextInt();
            System.out.print("Enter sale ammount >> ");
            price = keyboard.nextDouble();
            purchases[i]= new Purchases();
            purchases[i].setInvoiceNumber(number);
            purchases[i].setSaleAmount(price);
        }

        keyboard.nextLine();
        System.out.print("\nSort purchases by (I)nvoices or by (S)ale amount? ");
        choice = keyboard.nextLine();
    }
    public static void sortBySaleAmount(Purchase[] array) {
        int a, b;
        Purchase temp;
        int highSub = array.length - 1;
        for(a=0; a<highSub; ++a)
        {
            for (b = 0; b < highSub; ++B) {
                if (array[b].getSaleAmount() > array[b+1])
                }
            }
        }
    }
    public static void sortByInvoice(Purchase[] array) {
        // Write your code here
    }
    public static void display(Purchase[] p, String msg) {
        // Write your code here
    }
}