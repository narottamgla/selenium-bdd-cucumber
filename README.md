# "Selenium" BDD with "Cucumber" and "Serenity"
* This project is an example of how to setup and write selenium tests using BDD approach with Serenity framework
* How to create jenkins pipeline

## Project Description:
* Project setup with Selenium WebDriver and windows 10
* serenity.version: 1.8.3
* serenity.cucumber.version: 1.6.6
* Makes use of Page Objects.
* Written in Java with Junit, Cucumber & Maven
* Can run test scripts in parallel

## Setup:
* Install [Java 8](http://www.oracle.com/technetwork/java/javase/overview/java8-2100321.html)
* Install Maven [Maven](https://maven.apache.org/)
* "mvn archetype:generate -Dfilter=net.serenity-bdd:serenity-cucumber-archetype" to setup project from scratch
* Install "natural plugin" using eclipse marketplace 

## Run tests:
* `mvn clean test site` - Run test scripts using Chrome browser.

## View HTML Report
* HTML report will be generated once execution finish -\oasisdex\target\site\allure-maven-plugin
* Open Index.html in firefox browser to see the reports