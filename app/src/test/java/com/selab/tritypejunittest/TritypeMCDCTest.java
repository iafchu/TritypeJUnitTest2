package com.selab.tritypejunittest;

import org.junit.Test;
import static org.junit.Assert.*;

public class TritypeMCDCTest {

    @Test
    public void testTriang() {
        // Test cases to achieve MC/DC coverage
        int result1 = Tritype.Triang(3, 4, 5); // Scalene triangle
        assertEquals(1, result1);

        int result2 = Tritype.Triang(4, 3, 5); // Scalene triangle (different order)
        assertEquals(1, result2);

        int result3 = Tritype.Triang(3, 3, 5); // Isosceles triangle
        assertEquals(2, result3);

        int result4 = Tritype.Triang(5, 5, 3); // Isosceles triangle (different order)
        assertEquals(2, result4);

        int result5 = Tritype.Triang(3, 3, 3); // Equilateral triangle
        assertEquals(3, result5);

        int result6 = Tritype.Triang(2, 2, 2); // Equilateral triangle (different values)
        assertEquals(3, result6);

        int result7 = Tritype.Triang(1, 2, 3); // Not a valid triangle
        assertEquals(4, result7);

        int result8 = Tritype.Triang(1, 1, 2); // Not a valid triangle (different values)
        assertEquals(4, result8);
    }
}