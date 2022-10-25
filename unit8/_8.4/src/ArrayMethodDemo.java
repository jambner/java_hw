public class ArrayMethodDemo {

    public static void main (String args[]) {
        int[] numbers = {3, 15, 34, 67, 4, 10, 7, 50};
        int limit = 12;

        display(numbers);
        displayReverse(numbers);
        displaySum(numbers);
        displayLessThan(numbers, limit);
        displayHigherThanAverage(numbers);
    }
    public static void display(int[] numbers) {
        //Message to be displayed before printing out the numbers
        System.out.print("Numbers in the array: ");
        //loop through the numbers in the array and print each number
        for(int x: numbers){
            System.out.print(x + " ");
        }
        //print a new line
        System.out.println();
    }
    public static void displayReverse(int[] numbers) {
        for(int i = numbers.length-1; i >= 0; i--)
            System.out.print(numbers[i] + " ");
        System.out.println();
    }
    public static void displaySum(int[] numbers) {
        //initialize the sum variable
        int sum = 0;
        //loop through the array and add each element to sum
        for(int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }
        //print out the sum
        System.out.println("Sum: "  + sum);
    }
    public static void displayLessThan(int[] numbers, int limit) {
        //Text to be displayed before printing values less than the limit
        System.out.print("Values less than limit (" + limit + "): ");
        //loop through the array and print numbers lower than the specified limit
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] < limit){
                System.out.print(numbers[i] + " ");
            }
        }
        //print a new line
        System.out.println();
    }
    public static void displayHigherThanAverage(int[] numbers) {
        //initialize the average variable
        double average = 0.0;
        //initialize the sum variable
        int sum = 0;
        //loop through the array and add each element to sum
        for(int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }
        //calculate the average
        average = sum / numbers.length;
        //Message to be displayed before printing the values higher than the average
        System.out.print("Values higher than average (" + average + "): ");
        //loop through the array and print numbers higher than the calculated average
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] > average){
                System.out.print(numbers[i] + " ");
            }
        }
        //print a new line
        System.out.println();

    }


}