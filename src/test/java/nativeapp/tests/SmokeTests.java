package nativeapp.tests;

import functional.tests.core.basetest.UIBaseTest;
import nativeapp.pages.HomePage;
import org.testng.annotations.Test;

public class SmokeTests extends UIBaseTest {

    @Test(groups = {"android", "ios"})
    public void test_01_smoke() throws Exception {
        HomePage homePage = new HomePage();

        // Tap 10 times the button.
        for (int i = 0; i < 10; i++) {
            homePage.button().tap();
        }

        // Verify page is still there.
        homePage.loaded();

        // Expected image is different on purpose, just ro demo what happens when images do not match.
        this.assertScreen();
    }
}
