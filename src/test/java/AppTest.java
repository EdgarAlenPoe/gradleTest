/*
 * This Java source file was generated by the Gradle 'init' task.
 */
import org.junit.*;
import static org.junit.Assert.*;
import org.netbeans.jemmy.operators.*;
import javax.swing.JFrame;
import javax.swing.JButton;

public class AppTest {

    App app;

    @Before
    public void startApp() {
        app = new App();
    }

    @After
    public void closeApp() {
        app.close();
    }

    /*
    @Test public void testAppHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }
	
    @Test
    public void testAppAddPositive() {
        App classUnderTest = new App();
        int output = classUnderTest.add(1, 1);
        assertEquals(output, 2);
    }
    */

    @Test
    public void testButton() {
        //find frame
        JFrame frame = JFrameOperator.findJFrame("Test Window", true, true);

        assertNotNull(frame);

        //find button
	JButton button = JButtonOperator.findJButton(frame, "test", false, false);
	assertNotNull(button);

        JButtonOperator buttonOp = new JButtonOperator(button);

        //run click event on button
        buttonOp.doClick();

        //check value of i
        assertEquals(2, app.i);
    }
}
