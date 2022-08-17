package com.demoqa;

import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
public class TextBoxTests {

    @Test
    void fillFormTest(){
        String MyPermanentAddress = "My permanent address";

        open("https://demoqa.com/text-box");
        $("#userName").setValue("Khen Gi");
        $("#userEmail").setValue("kim-vk@mail.ru");
        $("#currentAddress").setValue("My adress");
        $("#permanentAddress").setValue(MyPermanentAddress);
        $("#submit").click();

        $("#output").shouldHave(text("Khen"));
        $("#output").shouldHave(text("kim-vk@mail.ru"));
        $("#output").shouldHave(text("My adress"));
        $("#output").shouldHave(text(MyPermanentAddress));

    }

}
