package tests;

import Pages.BasePage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertNotNull;


public class FirstTest extends BasePage {


    @BeforeTest
    public void setUp(){
    super.setUp();
}
    @Test (priority =1 )
    public void LinkToTheAceWebsite(){
        homePage.Button("ACE");
        assertNotNull(utilities.waitForElement(searchPage.GoogleAndALinkToTheAceWebsite(),50));
    }

    @Test (priority = 2)
    public void searchforProducts(){
        homePage.searchInput("Products" );
        assertNotNull(utilities.waitForElement(searchPage.WebsiteSearchBar(), 20));

    }
    @Test (priority = 3)
    public void Buttons(){
        homePage.Button("Button To The Page");
        assertNotNull(utilities.waitForElement(searchPage.ButtonsOnTheWebSite(),30));
    }

    @Test (priority = 4)
    public void Arrows (){
     homePage.Button("Arrows to the ace");
     assertNotNull(utilities.selectFromTheList(searchPage.ArrowsWithinTheSite(),10));

    }

   @Test (priority =5)
    public void PossibilityOfBrowsing() {
        homePage.Button("Browsing Site");
        assertNotNull(utilities.waitForElement(searchPage.PresentsThePossibilityOfBrowsing(), 25));
    }

        @Test(priority = 6)
        public void RegisterToAce() {
            homePage.submit("name");
            assertNotNull(utilities.waitForElement(searchPage.RegisterToAceSite(), 15));
        }

        @Test(priority = 7)
        public void SearchListContent() {
            homePage.Button("bikes");
            assertNotNull(utilities.selectFromTheList(searchPage.SearchListContent(), 30));

        }

        @Test(priority = 8)
        public void ActivityOptions() {
            homePage.searchInput("select Activity Options");
            assertNotNull(utilities.selectFromTheList(searchPage.SelectTheActivityOptions(), 30));
        }

        @Test (priority = 9)
        public void ClickOnTheProduct(){
        homePage.searchInput("Click on the product");
        assertNotNull(utilities.waitForElement(searchPage.ClickOnTheProduct(),20));
        }

       @Test (priority = 10)
       public void ClickToBuy(){
        homePage.Button("BUY");
        assertNotNull(utilities.selectFromTheList(searchPage.ClickToBuy(),30));
       }
        @Test (priority = 11)
        public void PriceBeforeAndAfterLow(){
        homePage.Button("Price");
        assertNotNull(utilities.waitForElement(searchPage.ProductPriceBeforeAndAfterLow(),20));
        }

        @Test(priority = 12)
        public void AddToCart(){
        homePage.Button("add to cart bike ");
        assertNotNull(utilities.selectFromTheList(searchPage.AddToCart(),30));
        }

        @Test (priority = 13)
        public void AddAnotherProduct(){
        homePage.Button("add another bike to cart");
        assertNotNull(utilities.waitForElement(searchPage.AddAnotherProduct(),20));
        }

        @Test (priority = 14)
        public void AddACouponCode(){
        homePage.searchInput("write code coupon ");
        assertNotNull(utilities.waitForElement(searchPage.AddToCart(),10));
        }

        @Test (priority = 15)
        public void ThePayment(){
        homePage.searchInput("payment all the products");
        assertNotNull(utilities.waitForElement(searchPage.ClickToBuy(),100));
        }
        public void tearDown () throws IOException {
            utilities.screenshot();
            super.tearDown();
        }
    }


