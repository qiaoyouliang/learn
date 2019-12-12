import com.microsoft.demo.Demo;
import org.junit.Test;

public class MyTest {
    @Test
    public void test_method_1() {
        Demo d = new Demo();
        d.doSomething(true);
    }

    @Test
    public void test_method_2() {
        Demo d = new Demo();
        boolean value = d.businessCheck("Test");
        Assert.assertEquals(false,value);
    }
}