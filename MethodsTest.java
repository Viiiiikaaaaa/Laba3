package org.example;
import org.junit.Test;
import org.testng.Assert;


public class MethodsTest {
    private Methods object = new Methods();
    @Test
    public void testCompareStrings() {
        Assert.assertTrue(Methods.compareStrings("abc", "def"));

    }

    @Test
    public void testFactorial() {
        Assert.assertEquals(120, Methods.factorial(5));

    }

}

