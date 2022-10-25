import java.util.*;
public class BabyNameComparison
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[3];
        String firstName = "";

        // Ask the user to provide three (3) names.
        System.out.print("Enter a name >> ");
        names[0] = scanner.nextLine();
        System.out.print("Enter a secord name >> ");
        names[1] = scanner.nextLine();
        System.out.print("Enter a third name >> ");
        names[2] = scanner.nextLine();

        // Print the possible combinations to the user.
        System.out.println("======================");
        System.out.println("Possible Combinations:");
        System.out.println("----------------------");
        for (int i = 0; i < 3; ++i)
        {
            firstName = names[i];
            for (int j = 0; j < 3; ++j)
            {
                // Don't include the same name twice!
                if (!firstName.equals(names[j])) {
                    System.out.println(firstName + " " + names[j]);
                }
            }
        }
        System.out.println("======================");
    }
}
