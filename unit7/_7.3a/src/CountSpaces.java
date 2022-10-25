public class CountSpaces
{
    public static void main(String[] args)
    {
        String quote = "The concept of infinity is meaningless inside of an insane human mind.";
        int nrSpaces = calculateSpaces(quote);
        System.out.println("Nr spaces in your quote is " + nrSpaces);
    }



    public static int calculateSpaces(String inString)
    {
        int count = 0;
        for (int i = 0; i < inString.length(); i++) {
            if (inString.charAt(i) == ' ') {
                count++;
            }
        }
        return count;
    }
}
