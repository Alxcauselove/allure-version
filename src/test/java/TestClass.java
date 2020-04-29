import io.qameta.allure.Attachment;
import io.restassured.response.Response;
import org.testng.annotations.*;
import utils.RequestHelper;


public class TestClass {

    @Test
    public void test1() {
        Response request = RequestHelper.getRequest();
    }

    @Attachment
    @Test
    public void test2() {
        System.out.println("1.2");
        System.out.println("1.2");
        System.out.println("1.2");
        System.out.println("1.2");
        System.out.println("1.2");
        System.out.println("1.2");
    }

    @Test
    public void test3() {
        System.out.println("1.3");
        System.out.println("1.3");
        System.out.println("1.3");
        System.out.println("1.3");
        System.out.println("1.3");
        System.out.println("1.3");
    }

    @Test
    public void test4() {
        System.out.println("1.4");
        System.out.println("1.4");
        System.out.println("1.4");
        System.out.println("1.4");
        System.out.println("1.4");
        System.out.println("1.4");
    }
}
