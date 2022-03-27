package qatask;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class BasePage {
    public static WebDriver driver;

    public void enterText(By path, String data){



        driver.findElement(path).sendKeys(data, Keys.DOWN);

    }

    public void click(By path) throws InterruptedException {

        Thread.sleep(300);
        driver.findElement(path).click();
    }

    public void selectByText(By path, String Text){

        Select select = new Select(driver.findElement(path));
       select.selectByVisibleText(Text);



    }
}
