package hybridapp.tests;

import functional.tests.core.basetest.UIBaseTest;
import nativeapp.pages.HomePage;
import org.testng.annotations.Test;

public class SmokeTests extends UIBaseTest {

    @Test(description = "Verify home page looks correct",
            groups = {"android", "ios"})
    public void test_01_smoke() throws Exception {
        HomePage homePage = new HomePage();
        homePage.tapButton();

        this.assertScreen(2);
    }
}
