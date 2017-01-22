package hybridapp.pages;

import functional.tests.core.basepage.BasePage;
import functional.tests.core.element.UIRectangle;

public class HomePage extends BasePage {

    private String tapBtnImageMap = "tap";

    public HomePage()
    {
        super();
    }

    /**
     * The "TAP" button.
     *
     * @return The "TAP" button.
     */
    private UIRectangle button() {
        return this.context.sikuliImageProcessing.findImageOnScreen(tapBtnImageMap, 0.7);
    }

    /**
     * Tap the "TAP" button.
     */
    public void tapButton() {
        this.button().tap();
    }
}
