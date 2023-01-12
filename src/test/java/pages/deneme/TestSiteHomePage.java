package pages.deneme;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestSiteHomePage {

    private WebDriver driver;

    public TestSiteHomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }

    @FindBy(id="search")
    private WebElement searchBox;

    @FindBy(className="h-4 w-4 ltr:mr-2.5 rtl:ml-2.5")
    private WebElement searchButton;


    public void search(String key){
        searchBox.sendKeys(key);
        searchButton.click();
    }
}
