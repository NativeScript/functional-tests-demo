package hybridapp.pages;

import functional.tests.core.basepage.BasePage;
import functional.tests.core.element.UIRectangle;
import functional.tests.core.image.Sikuli;
import org.testng.Assert;

public class HomePage extends BasePage {

    private String titleImage = "device_info_sample";
    private String osVersionButtonImage = "os_version";
    private String osVersionLabelImage = "actual_version";

    private Sikuli s;

    private UIRectangle osVersionButton() {
        return this.context.sikuliImageProcessing.findImageOnScreen(this.osVersionButtonImage, 0.9D);
    }

    private void loaded() {
        boolean found = s.waitForImage(this.titleImage, 0.7D, this.settings.defaultTimeout);
        Assert.assertTrue(found, "Home page NOT loaded.!");
        this.log.info("Home page loaded.");
    }

    public HomePage() {
        super();
        this.s = this.context.sikuliImageProcessing;
        loaded();
    }

    public void tapOSVersion() {
        this.osVersionButton().tap();
    }

    public void assertOSVersion() {
        boolean found = s.waitForImage(this.osVersionLabelImage, 0.9D, this.settings.defaultTimeout);
        Assert.assertTrue(found, "OS version not found or not correct!");
        this.log.info("OS Version is correct.");
    }
}
