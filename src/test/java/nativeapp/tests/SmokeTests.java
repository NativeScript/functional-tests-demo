package nativeapp.tests;

import functional.tests.core.basetest.UIBaseTest;
import nativeapp.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Smoke test for hello-world native app.
 * <p>
 * Groups:
 * If test is in "android" group this means this tests will be executed on android.
 * Same for iOS.
 * If you want to make tests running only on one of the platforms then include it in only one group.
 * <p>
 * Notes:
 * Those tests are just samples and some of them might not be meaningful.
 */
public class SmokeTests extends UIBaseTest {

    @Test(description = "Verify home page looks correct",
            groups = {"android", "ios"})
    public void test_01_smoke() throws Exception {
        HomePage homePage = new HomePage();

        // Get text of the message after tap
        String initialText = homePage.getMessageText();

        // Verify text changed after tap
        Assert.assertEquals(initialText, "42 taps left", "Message is not changed after tap.");

        // Tap the TAP button
        homePage.tapButton();

        // Get text of the message after tap
        String changedText = homePage.getMessageText();

        // Verify text changed after tap
        Assert.assertEquals(changedText, "41 taps left", "Message is not changed after tap.");

        // Expected image is different on purpose,
        // just ro demo what happens when images do not match.
        this.assertScreen(this.settings.shortTimeout);
    }

    @Test(description = "Verify application preserve state after run in background",
            groups = {"android", "ios"})
    public void test_02_run_in_background() throws Exception {
        HomePage homePage = new HomePage();

        // Tap the button.
        // We need to make some changes on the page before run in background.
        homePage.tapButton();

        // Get the actual message
        // Notes: Not hard-codding 41, since we do not restart app between tests and button might be already pressed in previous tests.
        String message = homePage.getMessageText();

        // Run in background for 10 seconds
        this.app.runInBackground(10);

        // Verify message is same after run in background
        Assert.assertEquals(homePage.getMessageText(), message, "Message is not changed after tap.");
    }
}
