package hybridapp.tests;

import functional.tests.core.basetest.UIBaseTest;
import functional.tests.core.image.Sikuli;
import hybridapp.pages.HomePage;
import org.testng.annotations.Test;

public class SmokeTests extends UIBaseTest {

    @Test(description = "Verify home page loaded.",
            groups = {"android", "ios"})
    public void test_01_smoke() throws Exception {
        HomePage homePage = new HomePage();
        homePage.tapOSVersion();
        homePage.assertOSVersion();
    }

    @Test(description = "Verify home page loaded.",
            groups = {"android", "ios"})
    public void test_01_smoke_same_as_above_without_page_objects() throws Exception {
        Sikuli s = this.context.sikuliImageProcessing;
        s.waitForImage("device_info_sample", 0.9D, this.settings.defaultTimeout);
        s.waitForImage("os_version", 0.9D, this.settings.defaultTimeout);
        s.findImageOnScreen("os_version", 0.9D).tap();
        s.waitForImage("4.4.2", 0.9D, this.settings.defaultTimeout);
    }
}
