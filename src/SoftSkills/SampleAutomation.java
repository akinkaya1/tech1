package SoftSkills;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SampleAutomation {



//    @TC-2
    @Test
    public void test() {
        int actualResult = UnitTest.division(6, 3);
        int expectedResult = 1;
        assertEquals(expectedResult, actualResult);
    }
}
