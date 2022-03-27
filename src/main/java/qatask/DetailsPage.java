package qatask;

import cucumber.api.DataTable;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class DetailsPage extends BasePage {

  By Gotocomparequotes = By.xpath("//button[@data-testid='submit'][contains(.,'Go to compare quotes')]");

    public DetailsPage() {
      PageFactory.initElements(driver, this);
    }



  public void Dropdownselection(DataTable details) throws InterruptedException {
    driver.manage().window().maximize();
    List<List<String>> data = details.raw();
    for(int i=1;i<18;i++){
    By dropdown = By.xpath("(//select[contains(@class,'form-control')])["+data.get(i).get(1)+"]");
    selectByText(dropdown,data.get(i).get(0));

}

  }

  public void Inputvalue(DataTable details) throws InterruptedException {
    List<List<String>> data = details.raw();
    for (int i = 0; i < 9; i++) {
      By Inputtextbox = By.xpath("(//input[contains(@type,'text')])[" + data.get(1).get(i) + "]");
      enterText(Inputtextbox, data.get(0).get(i));

    }

  }

  public void clickbutton(DataTable details) throws InterruptedException {
    List<List<String>> data = details.raw();
    for (int i = 0; i < 20; i++) {
      By button = By.xpath("(//button[contains(@type,'button')])[" + data.get(1).get(i) + "]");

      //click(button);
      JavascriptExecutor executor = (JavascriptExecutor)driver;
      executor.executeScript("arguments[0].click();", driver.findElement(button));

    }
  }

  public void clickgotocomparequotes(){
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", driver.findElement(Gotocomparequotes));
  }

}
