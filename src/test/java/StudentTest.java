import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void testID() {
        Student student = new Student(1, "Taylor", "Made");
        long expected = 1;
        long actual = student.getId();

        assertTrue(actual >= expected);
    }

    @Test
    public void testFirstNameCase() {
        Student student = new Student(1, "Taylor", "Made");
        String name = student.getFirstName();
        char expected = name.toUpperCase().charAt(0);
        char actual = student.getFirstName().charAt(0);

        assertEquals(expected, actual);
    }

    @Test
    public void testLastNameCase() {
        Student student = new Student(1, "Taylor", "Made");
        String name = student.getLastName();
        char expected = name.toUpperCase().charAt(0);
        char actual = student.getLastName().charAt(0);

        assertEquals(expected, actual);
    }

    public void testGradesArray(){
        Student student = new Student(1, "Taylor", "Made");
        student.addGrade(90);
        student.addGrade(80);
        student.addGrade(70);
        ArrayList<Integer> expected = ;
        ArrayList<Integer> actual = student.getGrades();

        assertArrayEquals(expected, actual);
    }

}
