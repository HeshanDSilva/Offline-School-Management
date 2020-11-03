package dataClass;

public class Enrollment implements java.io.Serializable{
    public String courseID;
    public String studentID;
    public String year;
    public String sem;
    private String grade;
    
    public Enrollment(String courseID,String studentID,String year,String sem, String grade){
        this.courseID = courseID;
        this.sem = sem;
        this.studentID = studentID;
        this.year = year;
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
    
    
    
}
