package com.selab.tritypejunittest;

import org.junit.Test;
import static org.junit.Assert.*;

public class TritypeDecisionTest {

    @Test
    public void testTriang() {
        // Test cases to achieve decision coverage
        int result1 = Tritype.Triang(3, 4, 5); // Scalene triangle
        assertEquals(1, result1);

        int result2 = Tritype.Triang(3, 3, 5); // Isosceles triangle
        assertEquals(2, result2);

        int result3 = Tritype.Triang(3, 3, 3); // Equilateral triangle
        assertEquals(3, result3);

        int result4 = Tritype.Triang(1, 2, 3); // Not a valid triangle
        assertEquals(4, result4);

        int result5 = Tritype.Triang(1, 1, 2); // Not a valid triangle
        assertEquals(4, result5);

        int result6 = Tritype.Triang(1, 1, 1); // Equilateral triangle
        assertEquals(3, result6);

        int result7 = Tritype.Triang(0, 0, 0); // Not a valid triangle
        assertEquals(4, result7);
    }
}