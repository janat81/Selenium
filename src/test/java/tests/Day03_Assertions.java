package tests;

import org.junit.Assert;
import org.junit.Test;

public class Day03_Assertions {

    @Test
    public void assertions(){

        Assert.assertEquals(5,5);
        Assert.assertEquals("java","java");
        Assert.assertEquals("java".contains("j"),true);

        Assert.assertTrue("java".contains("j"));

        Assert.assertFalse("Java".contains("j"));

    }


}
