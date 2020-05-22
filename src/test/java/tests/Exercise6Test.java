package tests;

import org.testng.annotations.Test;
import pages.Exercise6Page;

import static pages.BasePage.chooseExercise;

public class Exercise6Test extends TestBase {

    @Test
    public void logInAndDownloadFile() {
        chooseExercise("6");
        Exercise6Page exercise6Page = new Exercise6Page();
        exercise6Page.logIn("tester", "123-xyz");
        exercise6Page.downloadFile();
    }
}
