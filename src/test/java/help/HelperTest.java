package help;

import junit.framework.TestCase;
import org.junit.Test;

public class HelperTest extends TestCase {
    @Test
    public void testMaximum() {
        assertEquals(new Helper().maximum(1,2),2);
    }
}