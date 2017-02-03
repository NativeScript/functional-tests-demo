package hybridapp.tests;

import functional.tests.core.basetest.UIBaseTest;
import functional.tests.core.image.Sikuli;
import hybridapp.pages.HomePage;
import org.testng.annotations.Test;

public class SmokeTests extends UIBaseTest {

    @Test(description = "Verify version of device is correct.",
            groups = {"android", "ios"})
    public void test_01_os_version_is_correct() throws Exception {
        HomePage homePage = new HomePage();
        homePage.tapOSVersion();
        homePage.assertOSVersion();
    }

    @Test(description = "Verify device platform.",
            groups = {"android", "ios"})
    public void test_01_smoke_same_as_above_without_page_objects() throws Exception {
        Sikuli s = this.context.sikuliImageProcessing;
        s.waitForImage("device_platform", 0.9D, this.settings.defaultTimeout);
        s.findImageOnScreen("device_platform", 0.9D).tap();
        s.waitForImage("actual_platform", 0.9D, this.settings.defaultTimeout);
    }
}
