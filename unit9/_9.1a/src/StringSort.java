import java.util.*;
public class StringSort
{
    public static void main(String[] args)
    {
        String[] values =  {"mouse", "dog", "cat", "horse", "cow",
                "moose", "tiger", "lion", "elephant", "bird", "hamster",
                "guinea pig", "leopard", "aardvark", "hummingbird"};

        System.out.println("The unorganized array is: ");
        //display array
        for(String string : values){
            System.out.println(string+" ");
        }
        System.out.println("Organized array: ");
        Arrays.sort(values);
        for(String string : values){
            System.out.println(string+" ");
        }
    }
}

