import java.util.ArrayList;

public class Student {
    private long id;
    private String firstName;
    private String lastName;
    private ArrayList<Integer> grades;

    public Student(long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.grades = new ArrayList<>();
    }

    // returns the student's id
    public long getId(){
        return id;
    }

    // returns the student's name
    public String getFirstName(){
        return firstName;
    }

    // returns the student's name
    public String getLastName(){
        return lastName;
    }

    public ArrayList<Integer> getGrades(){
        return grades;
    }



    // adds the given grade to the grades list
    public void addGrade(int grade){
        grades.add(grade);
    }
    // returns the average of the students grades
//    public double getGradeAverage();

}
