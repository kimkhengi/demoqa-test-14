package com.demoqa;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
public class TextBoxTests {

    @BeforeAll
    static void configure() {
        System.out.println("Test Inited!");
    }
    @Test
    void fillFormTest(){

        open("https://demoqa.com/text-box");
        /* $("#userName").setValue("Khen Gi");
        $("#userEmail").setValue("kim-vk@mail.ru");
        $("input#currentAddress").setValue("My adress");
        $("#permanentAddress").setValue(permanentAddress);
        $("#submit").click();

        $("#output #name").shouldHave(text("Khen Gi"));
        $("#output #email").shouldHave(text("kim-vk@mail.ru"));
        $("#output p#currentAddress").shouldHave(text("My adress"));
        $("#output #permanentAddress").shouldHave(text(permanentAddress));

         */
    }

}
