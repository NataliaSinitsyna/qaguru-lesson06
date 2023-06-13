import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class CheckGragAndDrop {
    @BeforeAll
    static void beforeAll() {
        Configuration.holdBrowserOpen = true;
    }

    @Test
    void checkDD() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        $("#column-a").dragAndDropTo($("#column-b"));
        $("#column-b").shouldHave(text("A"));
        $("#column-a").shouldHave(text("B"));

    }
}