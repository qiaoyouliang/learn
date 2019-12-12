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
        assert true;
    }
}