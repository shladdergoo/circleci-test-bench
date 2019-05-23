package com.foo;

import org.junit.Test;

import static org.junit.Assert.*;

import com.foo.testbench.App;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test.
     */
    @Test
    public void testApp() {

        App app = new App();

        assertNotNull(app);
    }
}
