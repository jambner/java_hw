import java.util.Scanner;
public class InputCharacterInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userInput;
        char aChar;
        System.out.println("Enter a character...");
        userInput= input.nextLine();
        aChar = userInput.charAt(0);
        System.out.println("The character is "+ aChar);
        //figure out if char is upper or lowercase
        if(Character.isUpperCase(aChar))
            System.out.println(aChar+" is uppercase");
        else
            System.out.println(aChar+" is not uppercase");
        if(Character.isLowerCase(aChar))
            System.out.println(aChar+" is lowercase");
        else
            System.out.println(aChar+" is not lowercase");
        //changing the char to lowercase
        aChar = Character.toLowerCase(aChar);
        System.out.println("After toLowerCase(), aChar is "+aChar);
        //changing to char to uppercase
        aChar = Character.toUpperCase(aChar);
        System.out.println("After toUpperCase(), aChar is "+aChar);
        //figure if achar is a letter/digit or whitespace
        if(Character.isDigit(aChar) || Character.isLetter(aChar))
            System.out.println(aChar+" is a letter or digit");
        else
            System.out.println(aChar+" is neither a letter nor a digit");
        if(Character.isWhitespace(aChar))
            System.out.println(aChar+" is whitespace");
        else
            System.out.println(aChar+" is not whitespace");


    }
}