import java.util.*;
public class StringSort2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList values = new ArrayList();
        //String values[] = new String[15]; // To store the names

        int c = 0; // declare and initialize to keep a count of the names entered

        while(c < 15) { //keep counting up to c reaches to 10 or ZZZ is inputted
            System.out.print("Enter a string: ");
            String value = sc.nextLine(); // Inputting the name

            if(value.equals("zzz")) { // If the input is "ZZZ",
                break;  // Breaking out from the loop
            }

            values.add(value);


            c++; // Increasing the count of the names entered
        }

        System.out.println("Displaying array....");
        Collections.sort(values);
        System.out.println(values);

    }
}
