package CertainPageTesting;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MainPageTests extends MainMethods {

    @Test
    public void testEasy1() {
        driver.get("http://demo.guru99.com/test/guru99home/");
        String title = driver.getTitle();
        System.out.println(title + " VEIKIA");
        Assert.assertTrue(title.contains("Demo Guru99 Page"));
    }


    @Test
    public void testEasy2() {
        driver.get("http://demo.guru99.com/test/guru99home/");
        String title = driver.getTitle();
        System.out.println(title + " VEIKIA");
        Assert.assertTrue(title.contains("Demo Guru99 Page"));
    }

}
