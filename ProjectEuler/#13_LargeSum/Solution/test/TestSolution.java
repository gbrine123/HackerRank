/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.math.BigDecimal;
import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import solution.Solution;

/**
 *
 * @author gary.snow-brine
 * 
 * This class will test our Solution class.
 */
public class TestSolution {
    Solution solution = null;
    BigDecimal bigDec = null;
    
    public TestSolution() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        solution = new Solution();
        bigDec = new BigDecimal(0);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * This will test the addBigDecimal() method to ensure that adding two BigDecimals produces the correct result.
     */
    @Test
    public void testAddBigDecimal() {
        String s1 = "1234567890";
        BigDecimal bigDec2 = solution.addBigDecimal(bigDec, s1);
        Assert.assertEquals("Adding two BigDecimals failed", bigDec2.toString(), s1);
    }
    
    /**
     * This will test the getFirstX() method to ensure that it returns a String of the correct length and value.
     */
    @Test
    public void testGetFirstX() {
        String s1 = "1234567890111111";
        BigDecimal bd = new BigDecimal(s1);
        String firstX = solution.getFirstX(bd, 10);
        Assert.assertEquals("Failed to get first 10", firstX, s1.substring(0, 10));
        
    }
}
