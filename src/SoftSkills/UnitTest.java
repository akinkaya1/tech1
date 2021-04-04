package SoftSkills;
import org.junit.*;
import static org.junit.Assert.*;

public class UnitTest {
//
    public static int division(int a, int b) {
        int result = a / b;
        return result;
    }
    @Test
    public void test() {
        int actualResult = UnitTest.division(6, 3);
        int expectedResult = 1;
        assertEquals(expectedResult, actualResult);
    }
}