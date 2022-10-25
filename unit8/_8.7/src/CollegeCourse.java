public class CollegeCourse {
    private String courseID;
    private int credits;
    private char grade;

    public String getID() {
        return this.courseID;
    }

    public int getCredits() {
        return this.credits;
    }

    public char getGrade() {
        return this.grade;
    }

    public void setID(String idNum) {
        this.courseID = idNum;
    }

    public void setCredits(int cr) {
        this.credits = cr;
    }

    public void setGrade(char gr) {
        this.grade = gr;
    }
}
