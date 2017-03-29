package edu.knoldus

import java.util.concurrent.TimeUnit

import org.openqa.selenium.By
import org.openqa.selenium.support.ui.ExpectedConditions
import org.scalatest.FlatSpec

class FlipKartTest extends FlatSpec with SetUp {

  "A user" should "visit on flipkart.com" in {

    driver.manage().window().maximize()
    driver.get(BASE_URL)
    val title = driver.getTitle
    val page_source = driver.getPageSource.length()
    if (driver.getCurrentUrl == BASE_URL) {
      println("Welcome to FLIPKART.COM with title " + title)
      println("The length of the pagesource is: " + page_source)
    }
    else {
      println("Something Went Wrong.")
    }
  }

  "user" should "logged in" in {

    driver.manage().window().maximize()
    driver.get(BASE_URL)
    driver.findElement(By.cssSelector("ul._3Ji-EC li._2sYLhZ:nth-child(9) a._2k0gmP")).click()
    driver.findElement(By.cssSelector("div._1XBjg-.row form div._39M2dM:nth-child(1) input")).sendKeys(PHONE)
    driver.findElement(By.cssSelector("div._1XBjg-.row form div._39M2dM:nth-child(2) input")).sendKeys(password)
    driver.findElement(By.cssSelector("div._1XBjg-.row form div._1avdGP button")).click()
  }

  "user" should "select an item from the Category" in {

    driver.manage().window().maximize()
    driver.get(BASE_URL)
    driver.findElement(By.cssSelector("div._3Ed3Ub ul._114Zhd li.Wbt_B2:nth-child(1) a")).click()
    driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("ul._3GtRpC")))
    driver.findElement(By.cssSelector("ul._3GtRpC li._1GPxMV:nth-child(1) ul li._2GG4xt:nth-child(1) ul li._1KCOnI:nth-child(8) a")).click()
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS)
    driver.findElement(By.cssSelector("div._2SxMvQ div.col.zZCdz4:nth-child(7) a")).click()
    if (driver.findElement(By.cssSelector("div._1oaFsP ul li button")).getText == "ADD TO CART") {
      driver.findElement(By.cssSelector("div._1oaFsP ul li button")).click()
      driver.findElement(By.cssSelector("div._1EA4La div._2BPjzq button")).click()
      driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div._1QdAN_")))
      driver.findElement(By.cssSelector("div._1QdAN_ a button")).click()
    }
    else {
      driver.findElement(By.cssSelector("div._1oaFsP ul li button")).click()
      driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div._1QdAN_")))
      driver.findElement(By.cssSelector("div._1QdAN_ a button")).click()
    }

  }


  "user" should "select another item from the Category" in {

    driver.manage().window().maximize()
    driver.get(BASE_URL)
    driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.zi6sUf div._3Ed3Ub ul._114Zhd li.Wbt_B2:nth-child(4) a")))
    driver.findElement(By.cssSelector("div.zi6sUf div._3Ed3Ub ul._114Zhd li.Wbt_B2:nth-child(4) a")).click()
    driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div._3Ed3Ub ul._114Zhd li.Wbt_B2:nth-child(4) ul._3GtRpC")))
    driver.findElement(By.cssSelector("div._3Ed3Ub ul._114Zhd li.Wbt_B2:nth-child(4) ul._3GtRpC li._1GPxMV:nth-child(1) ul li._2GG4xt:nth-child(3) ul li._1KCOnI:nth-child(2) a")).click()
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS)
    driver.findElement(By.cssSelector("div._2SxMvQ div._3yI_5w div.col.col-3-12.col-md-3-12.MP_3W3 div._3liAhj a._2cLu-l")).click()
    driver.findElement(By.cssSelector("div.rPoo01 div._37KLG6 div._2a2WU_ ul li._3XkO0t a")).click()
    driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div._2fCBwf")))
    if (driver.findElement(By.cssSelector("div._2fCBwf div div div._1oaFsP ul li:nth-child(1) button")).getText == "ADD TO CART") {
      driver.findElement(By.cssSelector("div._2fCBwf div div div._1oaFsP ul li:nth-child(1) button")).click()
      driver.findElement(By.cssSelector("div._1EA4La div._2BPjzq button")).click()
      driverWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("div._1QdAN_")))
      driver.findElement(By.cssSelector("div._1QdAN_ form button")).click()
    }
    else {
      driver.findElement(By.cssSelector("div._2fCBwf div div div._1oaFsP ul li:nth-child(1) button")).click()
      driverWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("div._1QdAN_")))
      driver.findElement(By.cssSelector("div._1QdAN_ form button")).click()
    }

  }

  "user" should "place an order" in {

    if (driver.getCurrentUrl == CHECKOUT_URL) {
      driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.pure-u-4-5")))
      driver.findElement(By.cssSelector("div.pure-g-r div.pure-u-1-2 a")).click()
    }
    else {
      driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.pure-g-r")))
      driver.findElement(By.cssSelector("div.pure-g-r div.pure-u-2-3 table tbody tr:nth-child(1) td:nth-child(2) input")).sendKeys(NAME)
      driver.findElement(By.cssSelector("div.pure-g-r div.pure-u-2-3 table tbody tr:nth-child(2) td:nth-child(2) input")).sendKeys(pincode)
      driver.findElement(By.cssSelector("div.pure-g-r div.pure-u-2-3 table tbody tr:nth-child(3) td:nth-child(2) textarea")).sendKeys(address)
      driver.findElement(By.cssSelector("div.pure-g-r div.pure-u-2-3 table tbody tr:nth-child(4) td:nth-child(2) input")).sendKeys(landmark)
      driver.findElement(By.cssSelector("div.pure-g-r div.pure-u-2-3 table tbody tr:nth-child(8) td:nth-child(2) input:nth-child(2)")).sendKeys(PHONE)
      driver.findElement(By.cssSelector("div.pure-g-r div.pure-u-2-3 table tbody tr:nth-child(9) td:nth-child(2) input")).submit()
      driver.findElement(By.cssSelector("div.pure-g-r div.pure-u-1-2 a")).click()
    }
  }

}

