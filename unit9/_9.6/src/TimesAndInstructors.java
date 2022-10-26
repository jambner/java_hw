import java.util.*;
class TimesAndInstructors
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String[] courses = {"CIS101", "CIS210", "MKT100", "ACC150", "CIS101"};
        String[] times = {"Mon 9 am", "Mon 11 am", "Tues 8:30 am", "Tues 6 pm", "Fri 1 pm"};
        String[] instructors = {"Farrell", "Patel", "Wong", "Deitrich", "Lennon"};
        //declare a boolean for checking if course is true
        boolean found = false;

        System.out.print("Enter a course: ");
        String course= sc.nextLine(); //user input

        //check the courses in the array
        for(int i=0; i<courses.length; i++) {
            if(courses[i].equals(course)){
               found=true; //if the element in the array equals to user input change boolean

                // if the course found, print the result
                System.out.print("Course: "+course);
                System.out.print("\nTime: "+times[i]);
                System.out.print("\nInstructor: "+instructors[i]);
            }
        }
        if(!found)
            System.out.println("Invalid Entry: No such course.");
    }
}