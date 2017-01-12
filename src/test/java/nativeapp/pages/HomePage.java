package nativeapp.pages;

import functional.tests.core.basepage.BasePage;
import functional.tests.core.element.UIElement;
import org.testng.Assert;

import java.util.List;

/**
 * Representation of home page of hello-world native app.
 */
public class HomePage extends BasePage {

    public HomePage() {
        super();
        this.loaded();
    }

    /**
     * The "TAP" button.
     *
     * @return The "TAP" button.
     */
    private UIElement button() {
        // This will find text "TAP" as exact text.
        return this.find.byText("TAP");
        // If TAP is in the middle of text of some element this element will not be located.
        // By default search will be case insensitive.
        // If you want to make it case sensitive then you can use this:
        // this.find.byLocator(this.locators.byText("TAP", true, true));
        // First boolean param is "exactMatch" and define if we search for exact text or we want element with text that contains TAP.
        // Second boolean param is "caseSensitive" and define if we search for exact case.
    }

    /**
     * Message element below "TAP" button.
     *
     * @return Message element.
     */
    private UIElement message() {
        // locators.textViewLocator() is cross-platform locator that will find TextView elements for both Android and iOS.
        List<UIElement> textViews = this.find.elementsByLocator(this.locators.textViewLocator());
        if (textViews != null && !textViews.isEmpty()) {
            return textViews.get(textViews.size() - 1);
        } else {
            Assert.fail("Not able to find message element.");
            return null;
        }
    }

    /**
     * Tap the "TAP" button.
     */
    public void tapButton() {
        this.button().tap();
    }

    /**
     * Get text of message element.
     *
     * @return Text of message element.
     */
    public String getMessageText() {
        return message().getText();
    }

    /**
     * Verify home page loaded.
     */
    public void loaded() {
        Assert.assertNotNull(this.button(), "HelloWorld app failed to loaded.");
        this.log.info("HelloWorld app loaded.");
    }
}
