package org.howard.edu.lsp.assignment7;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.Arrays;

import org.junit.Test;

public class AverageStrategyTest {
	@Test
    public void testStrategy1() {
            AverageStrategy averageStrat = new Strategy1();
            try {
                    assertEquals(5, averageStrat.compute(Arrays.asList(4,5,6)));
            } catch (EmptyListException e) {
                    fail();
            }
    }


    @Test
    public void testStrategy2() {
            AverageStrategy averageStrat = new Strategy2();
            try {
                    assertEquals(8, averageStrat.compute(Arrays.asList(5, 5, 8)));
            } catch (EmptyListException e) {
                    fail();
            }
    }


    @Test
    public void testStrategy1Exce() {
            AverageStrategy averageStrat = new Strategy1();
            try {
            	averageStrat.compute(Arrays.asList());
                    fail();
            } catch (EmptyListException e) {
            }
    }


    @Test
    public void testStrategy2Exce() {
            AverageStrategy averageStrat = new Strategy2();
            try {
            	averageStrat.compute(Arrays.asList());
                    fail();
            } catch (EmptyListException e) {
            }
    }

}
