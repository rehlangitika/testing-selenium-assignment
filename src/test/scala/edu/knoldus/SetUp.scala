package edu.knoldus

import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.remote.DesiredCapabilities
import org.openqa.selenium.support.ui.WebDriverWait

trait SetUp {

  val BASE_URL = "https://www.flipkart.com/"
  val CHECKOUT_URL = "https://www.flipkart.com/checkout/init"
  val PHONE = "9999747608"
  val password = "gitika31"
  val pincode = "110063"
  val NAME = "Gitika Rehlan"
  val address = "B-3/341, Paschim Vihar"
  val landmark = "Near BSES Office"
  System.setProperty("webdriver.chrome.driver", "/home/gitika/Downloads/chromedriver/chromedriver")
  val capabilities = DesiredCapabilities.chrome()
  val driver = new ChromeDriver(capabilities)
  val driverWait = new WebDriverWait(driver, 10)

}
