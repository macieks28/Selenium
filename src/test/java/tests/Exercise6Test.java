package tests;

import driver.DriverUtils;
import org.testng.annotations.Test;
import pages.Exercise6Page;

import static navigation.ApplicationURLs.EXERCISE_6;

public class Exercise6Test extends TestBase {

    @Test
    public void logInAndDownloadFile() {
        DriverUtils.navigateToPage(EXERCISE_6);
        Exercise6Page exercise6Page = new Exercise6Page();
        exercise6Page
                .typeLogin("tester")
                .typePassword("123-xyz")
                .downloadFile();
        //TODO Assert (confirmation) needed.
    }
}
