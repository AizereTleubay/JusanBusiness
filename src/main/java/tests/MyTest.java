package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import ru.yandex.qatools.allure.annotations.Attachment;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class MyTest {
    Action a = new Action();

    @BeforeClass
    public static void setUp() {
        Configuration.timeout = 35000;
        Configuration.browserSize = ("1920x1080");
    }

    @Test
    public void myTest() {
        a.logIn();
        a.productsBinding();
        a.logOut();
    }

    @After
    public void screenshotForReport() {
        if (WebDriverRunner.hasWebDriverStarted() != false) {
            saveScreenshot();
        }
    }

    @Attachment(value = "Screenshot", type = "image/png")
    public byte[] saveScreenshot() {
        return ((TakesScreenshot) getWebDriver()).getScreenshotAs(OutputType.BYTES);
    }

    @AfterClass
    public static void quitWebDriver() {
        WebDriverRunner.clearBrowserCache();
        WebDriverRunner.closeWebDriver();
    }
}
