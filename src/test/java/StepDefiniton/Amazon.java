package StepDefiniton;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class Amazon {
    WebDriver driver = new ChromeDriver();
    AmazonPage page;

    @Given("browser is open")
    public void browser_is_open() {
        String CHROMEDRIVER_PATH = "/home/davit/IdeaProjects/simple_automation1/src/chromedriver/chromedriver";
        System.setProperty("webdriver.chrome.driver",CHROMEDRIVER_PATH  );


    }
    @And("we are in amazon page")
    public void we_are_in_amazon_page() {

      page = new AmazonPage(driver);
    }
    @When("enter a laptop in searchbox")
    public void enter_a_laptop_in_searchbox() {
       page.Search("laptop");
    }
    @And("press enter")
    public void press_enter() {
        page.enter();
    }
    @Then("get all elements which price is less than {int}")
    public void get_all_elements_which_price_is_less_than(Integer int1) {
        int count = 1;
        for (int i=1; i<=3; i++) {
            List<Product> products = page.GetSearchedProducts();
            System.out.println("\n"+products.size()+" elements was taken from page " + i+"\n");
            for (Product elem : products) {
                if (elem.GetPrice()<500 && elem.GetPrice()>0)
                    System.out.println((count++)+". "+elem.GetName() + " ===== " + elem.GetPrice()+"$");

            }
            page.NextPage();
        }
    }

}
