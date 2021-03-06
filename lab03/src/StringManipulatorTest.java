import static org.junit.Assert.*;
import org.junit.*;

/**
 * JUnit test case class for testing the functionality of methods from the StringManipulator class.
 */
public class StringManipulatorTest {
    private StringManipulator sm;

    @Before
    public void setUp() throws Exception {
        sm = new StringManipulator();
    }
    /**
     * Test the basic functionality of makeUserName.
     * Don't check for correct case.
     */
    @Test(timeout = 100)
    public void testMakeUserNameBasic() {
        String ret = sm.makeUserName("john doe");
        String message = "makeUserName(): check if username follows the basic Unix style structure";
        assertEquals(message, "jdoe", ret);
    }

    @Test(timeout = 100)
    public void testMakeUserNameLower() {
        String ret = sm.makeUserName("Jack Yuan");
        String message = "makeUserName(): check if username follows the basic Unix style structure";
        assertEquals(message, "jyuan", ret);
    }

    @Test(timeout = 100)
    public void testMakeEmail() {
        String ret = sm.makeEmail("jyuan","Purdue.EDU");
        String message = "makeUserName(): check if username follows the basic Unix style structure";
        assertEquals(message, "jyuan@purdue.edu", ret);
    }
}  