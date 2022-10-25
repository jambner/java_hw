import java.util.*;
public class BirthdayReminder {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String names[] = new String[10]; // To store the names
        String birthdates[] = new String[10]; // To store the birthdates

        int c = 0; // declare and initialize to keep a count of the names entered

        while(c < 10) { //keep counting up to c reaches to 10 or ZZZ is inputted
            System.out.print("Enter a name: ");
            String name = sc.nextLine(); // Inputting the name

            if(name.equals("ZZZ")) { // If the input is "ZZZ",
                break;  // Breaking out from the loop
            }

            names[c] = name;

            System.out.print("Enter birthdate: ");
            birthdates[c] = sc.nextLine(); // Inputting the birthdate

            c++; // Increasing the count of the names entered
        }

        System.out.println();
        System.out.println("Number of names entered: " + c); // Displaying the count of the entered names
        System.out.println("Names:");
        for(int i = 0; i < c; i++)
            System.out.println(names[i]); // Displaying the entered names

        System.out.println();

        while(true) {
            System.out.print("Enter one of the names: ");
            String name = sc.nextLine();

            if(name.equals("ZZZ")) { // If the input is "ZZZ",
                break;  // Breaking out from the loop
            }

            int i, flag = 0;
            for(i = 0; i < c; i++) {
                if(name.equals(names[i])) {  // If a match is found,
                    flag = 1;  // Setting the variable- flag to 1
                    break;
                }
            }

            if(flag == 1) {
                System.out.println("Birthdate: "+birthdates[i]); // Displaying the birthdate for the match
            } else {
                System.out.println("Sorry, no entry for "+name);  // Displaying an error messgae for no match
            }

            System.out.println();
        }
    }
}