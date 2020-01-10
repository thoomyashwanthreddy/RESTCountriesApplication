package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import main.Controller;

public class UnitTest {
	
    @Test
    public void testCapital() {
    	Controller test = new Controller();

        String result = test.fetchCapitalCityBasedOnCode("IND");
        assertEquals("New Delhi", result);
    }
    
    @Test
    public void testCapitalWithEmptyCode() {
    	Controller test = new Controller();

        String result = test.fetchCapitalCityBasedOnCode("");
        assertTrue(result.isEmpty());
    }
}
