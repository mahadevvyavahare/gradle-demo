import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class SubtractorTest {

    Subtractor obj;
    @Before
    public void beforeTest()throws Exception {
        obj=new Subtractor();
    }
    @Test
    public void testSubtract() throws Exception {
        assertEquals(obj.subtract(10,10),0);
    }
}