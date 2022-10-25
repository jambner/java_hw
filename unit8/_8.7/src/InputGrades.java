import java.util.*;
public class InputGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student student[] = new Student[10];

        for(int i = 0; i < 10; i++) {
            student[i] = new Student();

            System.out.print("Enter ID for student #"+(i + 1)+" ");
            int ID = sc.nextInt();
            sc.nextLine();

            System.out.println();

            student[i].setID(ID);

            for(int j = 0; j < 5; j++) {
                CollegeCourse cc = new CollegeCourse();

                System.out.print("Enter course ID #"+(j + 1)+" ");
                String cID = sc.nextLine();

                System.out.print("Enter credits #"+(j + 1)+" ");
                int c = sc.nextInt();
                sc.nextLine();

                char g;
                do {
                    System.out.print("Enter grade #"+(j + 1)+" ");
                    g = sc.next().charAt(0);
                    sc.nextLine();
                } while(g != 'A' && g != 'B' && g != 'C' && g != 'D' && g != 'F');

                cc.setID(cID);
                cc.setCredits(c);
                cc.setGrade(g);

                student[i].setCourse(cc, j);

                System.out.println();
            }
            System.out.println();
        }

        System.out.println("");

        for(int i = 0; i < 10; i++) {
            System.out.println("Student #"+(i + 1)+" ID #"+student[i].getID()+"");

            for(int j = 0; j < 5; j++) {
                System.out.println(student[i].getCourse(j).getID()+" "+student[i].getCourse(j).getCredits()+" -- credits. Grade is "+student[i].getCourse(j).getGrade());
            }

            System.out.println("");
        }
    }
}
