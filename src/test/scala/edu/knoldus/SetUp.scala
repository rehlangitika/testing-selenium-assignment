package edu.knoldus

import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.remote.DesiredCapabilities
import org.openqa.selenium.support.ui.WebDriverWait

trait SetUp {

  val BASE_URL = "https://www.flipkart.com/"
  val CHECKOUT_URL = "https://www.flipkart.com/checkout/init"
  val PHONE = "***********"
  val password = "*******"
  val pincode = "*****"
  val NAME = "*********"
  val address = "*****************"
  val landmark = "*************"
  System.setProperty("webdriver.chrome.driver", "/home/gitika/Downloads/chromedriver/chromedriver")
  val capabilities = DesiredCapabilities.chrome()
  val driver = new ChromeDriver(capabilities)
  val driverWait = new WebDriverWait(driver, 10)

}
