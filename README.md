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
* `mvn clean verify` OR `mvn clean verify -Dwebdriver.driver=chrome`  - Run test scripts using Chrome browser.
* `mvn clean verify -Dwebdriver.driver=firefox`  - Run test scripts using Firefox browser.

## View HTML Report
* HTML report will be generated once execution finish -bdd-cucumber\target\site\serenity
* Open Index.html in browser to see the reports

## Run tests in parallel:
* TBD
# Setting jenkins pipeline for Selenium(Cucumber serenity project)
* This project is example how can setup jenkins pipeline for selenium project step by step
## Setup
* Download latest jenkins.war [Jenkins download link](https://updates.jenkins-ci.org/download/war/)
* Start jenkins.jar on default port using command 'java -jar jenkins.war'
* Start jenkins.jar on specific port using command 'java -jar jenkins.war --httpPort=portnumber'
* Open localhost:portnumber and login using displayed insructions on browser screens
* Now install all default plugin and set user & password
## Installing required plugins
* Navigate to jenkins home and click on "Manage jenkins" tab
* Now click on "Manage plugins"
* In "Available plugins" tab, perform serach for "Pipeline Maven Integration" and install
* Follwing above steps, install "HTML Publisher" plugin
## Setting up Java-jdk and maven
* Navigate to "Manage jenkins->Global Tool configuration"
* Configure java-jdk & maven with java8 & maven_3_5_0 name respectivelly
## Global configuration for Github
* Navigate to "Manage jenkins->Configure System" and in Github section configure github credentials
## Creating jenkins pipe line
* Navigate to "https://github.com/narottamgla/selenium-bdd-cucumber/blob/master/Jenkinsfile" and have similar file in github root
* Now navigate to click New Item and create pipeline type of job
* Now navigate to pipeline section of job and select "Pipeline script from SCM"
* Enter repositary url and select github credentials and keep other details default
* Save the changes

## Running created pipeline
* Click build now and execution will be started
* Pipeline steps will be displayed on jenkins screen
* Once execution finish, Click on "HTML Report" tab to view serenity HTML Reports

