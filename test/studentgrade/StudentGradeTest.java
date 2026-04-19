package studentgrade;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

public class StudentGradeTest {

    @Test
    @DisplayName("score 95 should return A")
    public void testGetGrade95() {
        String result = StudentGrade.getGrade(95);
        assertEquals("A", result);
    }

    @Test
    @DisplayName("score 90 boundary should return A")
    public void testGetGrade90() {
        String result = StudentGrade.getGrade(90);
        assertEquals("A", result);
    }

    @Test
    @DisplayName("score 100 boundary should return A")
    public void testGetGrade100() {
        String result = StudentGrade.getGrade(100);
        assertEquals("A", result);
    }

    @Test
    @DisplayName("score 85 should return B")
    public void testGetGrade85() {
        String result = StudentGrade.getGrade(85);
        assertEquals("B", result);
    }

    @Test
    @DisplayName("score 80 boundary should return B")
    public void testGetGrade80() {
        String result = StudentGrade.getGrade(80);
        assertEquals("B", result);
    }

    @Test
    @DisplayName("score 89 boundary should return B")
    public void testGetGrade89() {
        String result = StudentGrade.getGrade(89);
        assertEquals("B", result);
    }

    @Test
    @DisplayName("score 50 should return F")
    public void testGetGrade50() {
        String result = StudentGrade.getGrade(50);
        assertEquals("F", result);
    }

    @Test
    @DisplayName("score 79 boundary should return F")
    public void testGetGrade79() {
        String result = StudentGrade.getGrade(79);
        assertEquals("F", result);
    }

    @Test
    @DisplayName("score above 100 should return F")
    public void testGetGradeAbove100() {
        String result = StudentGrade.getGrade(110);
        assertEquals("F", result);
    }

    @Test
    @DisplayName("score 0 should return F")
    public void testGetGrade0() {
        String result = StudentGrade.getGrade(0);
        assertEquals("F", result);
    }
}