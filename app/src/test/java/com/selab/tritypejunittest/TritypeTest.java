package com.selab.tritypejunittest;

import static org.junit.Assert.*;
import org.junit.Test;
public class TritypeTest {
    @Test
    public void testTriang() {
        Tritype tri = new Tritype();
        assertEquals(4, tri.Triang(1, 2, 7));
    }
}