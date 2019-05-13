package uk.co.balharrie;

import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class EmptyTest {
    @Test
    public void testNothing() {
        assertFalse(true);
    }
    @Test
    public void testException() throws Exception {
        throw new Exception("Exception being thrown message");
    }

}
