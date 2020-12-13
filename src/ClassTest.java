import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Comparator;

public class ClassTest {

    @Test(priority = 5)
    public void testMethod1() {
        System.out.println("Test method1 priority = 5");
    }

    @Test(priority = 1)
    public void testMethod2() {
        System.out.println("Test method2 priority = 1");
    }

    @Test(priority = 10)
    public void testMethod3() {
        System.out.println("Test method3 priority = 10");
    }

    @Test(priority = 7)
    private void testMethod4() {
        System.out.println("Test method4 priority = 7 (private)");
    }

    @Test
    public void testMethod5() {
        System.out.println("Test method5 priority = default");
    }

    @AfterSuite
    public void afterMethod() {
        System.out.println("AfterSuite method");
    }

    @BeforeSuite
    public void beforeSuiteMethod() {
        System.out.println("BeforeSuite method");
    }
//
//    @BeforeSuite
//    public void beforeSuiteMethod2() {
//        System.out.println("BeforeSuite method");
//    }
}
