package hybridapp.pages;

import functional.tests.core.basepage.BasePage;
import functional.tests.core.element.UIRectangle;

public class HomePage extends BasePage {

    private String titleImage = "device_info_sample";
    private String osVersionButtonImage = "os_version";
    private String osVersionLabelImage = "actual_version";

    private UIRectangle osVersionButton() {
        return this.context.sikuliImageProcessing.findImageOnScreen(this.osVersionButtonImage, 0.9D);
    }

    private void loaded() {
        this.context.sikuliImageProcessing.waitForImage(this.titleImage, 0.9D, this.settings.defaultTimeout);
        this.log.info("Home page loaded.");
    }

    public HomePage() {
        super();
        loaded();
    }

    public void tapOSVersion() {
        this.osVersionButton().tap();
    }

    public void assertOSVersion() {
        this.context.sikuliImageProcessing.waitForImage(this.osVersionLabelImage, 0.9D, this.settings.defaultTimeout);
        this.log.info("OS Version is correct.");
    }
}
