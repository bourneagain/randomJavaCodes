import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Created by srajendran on 7/18/15.
 */
public class CheckAppTest extends TestCase {


    public void testGetA() throws Exception {
        System.out.println("running testgeta");
        Assert.assertEquals(new CheckApp().getA(), 0);
    }

    public void testSetA() throws Exception {
        System.out.println("running testSetA");
        CheckApp a = new CheckApp();
        a.setA(2);
        Assert.assertEquals(a.getA(), 2);
    }
}