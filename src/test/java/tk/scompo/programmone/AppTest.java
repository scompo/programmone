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
            assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }
}
