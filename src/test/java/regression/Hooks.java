package regression;

import cucumber.api.java.After;
import cucumber.api.java.Before;

/**
 * Created by mac on 8/19/17.
 */
public class Hooks {

    @Before
    public void setUp(){
        new DriverManager().openBrowser();
    }

    @After
    public void tearDown(){
        new DriverManager().closeBrowser();
    }
}
