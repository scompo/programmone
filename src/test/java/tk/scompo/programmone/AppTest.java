package tk.scompo.programmone;

import org.junit.Test;
import static org.junit.Assert.*;

/**
* Tests for App.
*/
public class AppTest {

    @Test
    public void testAppHasAGreeting() {
            final App classUnderTest = new App();
            assertNotNull("App should have a greeting", classUnderTest.getGreeting());
    }

    @Test
    public void testMainShouldNotThrowAnException() {
            try {
                App.main(new String[]{});
            }catch (Exception e) {
                fail("An exception during main: " + e.getMesage());
            }
    }
}
