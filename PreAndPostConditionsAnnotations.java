import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PreAndPostConditionsAnnotations {

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before class annotation");
    }

    @Test
    public void testMethod() {
        System.out.println("Test method");
    }

    @Test
    public void testMethod2() {
        System.out.println("Test method 2");
    }

    @Test
    public void testMethod3() {
        System.out.println("Test method 3");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After method test");
    }

}
