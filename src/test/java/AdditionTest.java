import org.junit.Test;

import static org.junit.Assert.*;


public class AdditionTest {

    @Test
    public void testAdd() throws Exception {
        assertEquals(new Addition().add(2,2),4);
    }
}