import junit.framework.TestCase;


public class CheckSidesTest extends TestCase {

    public void testTriangle() {
        CheckSides tester = new CheckSides();
        assertEquals("YES", tester.triangle(3, 5, 14));
    }

}