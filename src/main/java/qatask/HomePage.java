package qatask;

public class HomePage extends BasePage {

    public static void homePage() {
        driver.get(LoadProp.getproperty("url"));
    }
}
