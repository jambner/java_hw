import java.util.*;
public class PhoneNumbers {
    public static void main(String[] args) {

        // creating two String arrays of 30 capacity to store names and phone

        // numbers of 30 people

        String names[] = new String[30];

        String phones[] = new String[30];

        int count; // current count of people on the phonebook

        // scanner to read user input

        Scanner scanner = new Scanner(System.in);

        String input;

        // assigning names and phone numbers of 10 contacts

        names[0] = "Gina";

        phones[0] = "(847) 341-0912";

        names[1] = "Marcia";

        phones[1] = "(847) 341-2392";

        names[2] = "Rita";

        phones[2] = "(847) 354-0654";

        names[3] = "Jennifer";

        phones[3] = "(414) 234-0912";

        names[4] = "Fred";

        phones[4] = "(414) 435-6567";

        names[5] = "Neil";

        phones[5] = "(608) 123-0904";

        names[6] = "Judy";

        phones[6] = "(608) 435-0434";

        names[7] = "Ariene";

        phones[7] = "(608) 123-0312";

        names[8] = "LaWanda";

        phones[8] = "(920)787-9813";

        names[9] = "Deepak";

        phones[9] = "(930) 412-0991";

        // setting count to 10

        count = 10;

        input = "";

        // looping until user input 'quit'

        while (!input.equalsIgnoreCase("quit")) {

            // asking and reading a name

            System.out.print("Enter a name (or quit to end): ");

            input = scanner.nextLine();

            // if input is not 'quit', searching the array

            if (!input.equalsIgnoreCase("quit")) {

                boolean found = false; // not found, initially

                // looping through the array

                for (int i = 0; i < count; i++) {

                    if (names[i].equalsIgnoreCase(input)) {

                        // found. displaying phone number

                        System.out.println("Found!");

                        System.out.println("Phone number of " + input + " is "

                                + phones[i]);

                        // setting found to true and exiting inner loop

                        found = true;

                        break;

                    }

                }

                //if not found, alerting the user

                if (!found) {

                    System.out.println(input + " does not exist on the list.");

                    //checking if array is not full

                    if (count < 30) {

                        //adding input to names array

                        names[count] = input;

                        //asking and reading phone number

                        System.out.print("Enter the phone number of " + input

                                + ": ");

                        input = scanner.nextLine();

                        //adding to phones array, updating count

                        phones[count] = input;

                        count++;

                        System.out.println("Added to the list");

                    } else {

                        //no more space in the array

                        System.out

                                .println("Unfortunately, you cannot add new entries as the list is full");

                    }

                }

            }

        }

    }

}
