package com.selab.tritypejunittest;

import org.junit.Test;
import static org.junit.Assert.*;

public class TritypeConditionTest {

    @Test
    public void testTriang() {
        // Test case for evaluating different branches of the Triang() method
        int result1 = Tritype.Triang(3, 4, 5); // scalene triangle
        assertEquals(1, result1);

        int result2 = Tritype.Triang(3, 3, 5); // isosceles triangle
        assertEquals(2, result2);

        int result3 = Tritype.Triang(3, 3, 3); // equilateral triangle
        assertEquals(3, result3);

        int result4 = Tritype.Triang(1, 2, 3); // not a valid triangle
        assertEquals(4, result4);
    }
}