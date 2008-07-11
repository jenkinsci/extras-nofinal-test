import junit.framework.TestCase;

import org.jmock.Mockery;
import org.jmock.lib.legacy.ClassImposteriser;

/**
 * @author Kohsuke Kawaguchi
 */
public class MockTest extends TestCase {
    public void test1() {
        Mockery context = new Mockery();
        context.setImposteriser(ClassImposteriser.INSTANCE);
        Foo foo = context.mock(Foo.class);
        assertTrue(foo.getClass()!=Foo.class);
        assertTrue(Foo.class.isAssignableFrom(foo.getClass()));
    }
}
