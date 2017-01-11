package nativeapp.pages;

import functional.tests.core.basepage.BasePage;
import functional.tests.core.element.UIElement;
import org.testng.Assert;

public class HomePage extends BasePage {

    public HomePage() {
        super();
        this.loaded();
    }

    public UIElement button() {
        return this.find.byText("TAP");
    }

    public void loaded() {
        Assert.assertNotNull(this.button(), "HelloWorld app failed to loaded.");
        this.log.info("HelloWorld app loaded.");
    }
}
