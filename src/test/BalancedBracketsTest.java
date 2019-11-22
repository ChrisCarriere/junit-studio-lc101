package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        BalancedBrackets test_Class = new BalancedBrackets();
        assertTrue(test_Class.hasBalancedBrackets("[]"));
    }

    @Test
    public void testWordReturnsTrue(){
        BalancedBrackets test_Class = new BalancedBrackets();
        assertTrue(test_Class.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void testWordReturnsFalse(){
        BalancedBrackets test_Class = new BalancedBrackets();
        assertFalse(test_Class.hasBalancedBrackets("[LaunchCode"));
    }

    @Test
    public void testWordRandomPlacementBracketsReturnsTrue(){
        BalancedBrackets test_Class = new BalancedBrackets();
        assertTrue(test_Class.hasBalancedBrackets("[Launch]Code"));
    }

    @Test
    public void testWordRandomPlacementBracketsReturnsFalse(){
        BalancedBrackets test_Class = new BalancedBrackets();
        assertFalse(test_Class.hasBalancedBrackets("[LaunchCo[de"));
    }

    @Test
    public void testDoubleBracketsReturnsTrue(){
        BalancedBrackets test_Class = new BalancedBrackets();
        assertTrue(test_Class.hasBalancedBrackets("[[Launch]Code]"));
    }

    @Test
    public void testUnbalancedBrackets(){
        BalancedBrackets test_Class = new BalancedBrackets();
        assertFalse(test_Class.hasBalancedBrackets("]Test["));
    }

    @Test
    public void testMultiUnbalancedBrackets(){
        BalancedBrackets test_Class = new BalancedBrackets();
        assertFalse(test_Class.hasBalancedBrackets("]]][[["));
    }

    @Test
    public void testMultiUnbalancedBrackets2(){
        BalancedBrackets test_Class = new BalancedBrackets();
        assertFalse(test_Class.hasBalancedBrackets("]]][][[["));
    }

    @Test
    public void testStringReturnsFalse(){
        BalancedBrackets test_Class = new BalancedBrackets();
        assertFalse(test_Class.hasBalancedBrackets("LaunchCode"));
    }

}
