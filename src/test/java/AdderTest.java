import org.junit.Test;

import static org.junit.Assert.*;


public class AdderTest {

    @Test
    public void testAdd() throws Exception {
        assertEquals(new Adder().add(2,2),4);
    }
}