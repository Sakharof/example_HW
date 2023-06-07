public class SearchTests {
    @Test
    void successfulSearchTests() {
        open("https://www.google.com/");
        $("[name=q]").setValue("selenide").pressEnter();
        $("[id=search]").shouldHave(text("https://selenide.org"))
    }
}
