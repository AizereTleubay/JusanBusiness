package tests;

import com.codeborne.selenide.Condition;

import java.time.Duration;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Action {
    Value v = new Value();
    Path p = new Path();

    public void logIn() {
        open(v.url);

        $(byXpath(p.toMerchCab)).shouldBe(Condition.exist, Duration.ofMillis(12000)).scrollTo().click();

        $(byXpath(p.emailField)).shouldBe(Condition.exist, Duration.ofMillis(12000)).click();
        $(byXpath(p.emailField)).sendKeys(v.email);

        $(p.passField).val(v.password);

        $(p.logInBtn).click();

        $(byXpath(p.jusanLogo)).shouldBe(Condition.visible, Duration.ofMillis(12000));

        // Checks
        $(byText(v.ordersModule)).shouldBe(Condition.visible);
        $(byText(v.statementModule)).shouldBe(Condition.visible);
        $(byText(v.productsModule)).shouldBe(Condition.visible);
        $(byText(v.settingsModule)).shouldBe(Condition.visible);
    }

    public void checkFilter(String by) {
        $(byXpath(p.bindSearchField)).val(by);
        $(byXpath(p.foundProduct)).shouldBe(Condition.visible, Duration.ofMillis(12000));

        $(p.cross).click();
        $(byXpath(p.list)).shouldBe(Condition.visible, Duration.ofMillis(12000));
    }

    public void openListOfProd(String path) {
        $(byXpath(path)).click();
        $(byXpath(p.list)).shouldBe(Condition.visible, Duration.ofMillis(12000));
    }

    public void productsBinding() {
        $(byText(v.binding)).click();
        $(byXpath(p.bindSearchField)).shouldBe(Condition.visible);

        checkFilter(v.article);

        checkFilter(v.productName);

        // Require clarification
        openListOfProd(p.reqClarBtn);

        // Link the product
        $(byXpath(p.linkProd)).click();

        // Linking another product
        $(byXpath(p.chooseAnotherProd)).click();

        $(byXpath(p.window)).shouldBe(Condition.visible, Duration.ofMillis(12000));
        $(byXpath(p.recommendedProd)).shouldBe(Condition.visible);
        $(byXpath(p.recommendedProd)).click();
        $(byXpath(p.linkProdBtn)).click();

        // Unrecognized
        openListOfProd(p.unrecognizedBtn);

        $(byXpath(p.chooseProd)).click();

        $(byXpath(p.window)).shouldBe(Condition.visible, Duration.ofMillis(12000));
        $(byText(v.searchResults)).shouldBe(Condition.visible);

        $(byXpath(p.cancelBtn)).click();
    }

    public void logOut() {
        $(byXpath(p.logOutBtn)).click();
    }
}
