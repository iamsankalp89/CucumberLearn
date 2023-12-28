package myHooks;


import io.cucumber.java.*;

import java.util.Scanner;

public class AmazonHooks {

    @Before("@Smoke")
    public void setup_Browser()
    {
        System.out.println("Launch Chrome browser");

    }

    @BeforeStep("@Regression")
    public void takesSnap()
    {
        System.out.println("Takes Screenshot on each step");
    }

    @AfterStep("@Regression")
    public void refresh()
    {
        System.out.println("Refresh on each step");
    }

    @After("@Smoke")
    public void close_Browser()
    {
        System.out.println("Close Chrome browser");
    }

}
