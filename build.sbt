name := """testing-selenium-demo"""

version := "1.0"

scalaVersion := "2.11.7"

libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.4" % "test"

libraryDependencies += "org.seleniumhq.selenium" % "selenium-chrome-driver" % "3.3.1"

libraryDependencies += "org.seleniumhq.selenium" % "selenium-java" % "3.0.1"


// Uncomment to use Akka
//libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.3.11"

