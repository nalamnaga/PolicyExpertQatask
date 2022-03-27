# QA Automation Assignment

I have added  test: 
- UI-Test.feature for filling the Policy quotation form. 


## Test Automation Framework

- This is a Maven based framework
- `pom.xml` should have everything you need to create and run the tests. Please add further dependencies if you require it.

The following folder `src/test/java/AutomationTest/qatask` contains the following class:

- `Hook` - this is the before and after. This launches and kills the browser.
- `RunnerTest` - contains the CucumberOptions which runs the BDD's
- `StepDefinitions` - To integarte the code between feature files and pages

The following folder `src/main/java/AutomationTest/qatask` contains the following class:

- `BrowserSetup` - This contains the setup of a given browser based on what is set to Browser property within `TestData.properties` 
-  `DetailsPage` - Written the three method for filling the text control,form control and button control. Instead of creating different xpath only one xpath is written and fetch xpath notation from cucumber file and appended in the xpath and form is filled.

 
## Steps to execute this project

- Pre-requisites
    - JAVA SDK 1.8 or higher
    - Maven CLI
    
- Steps
    - Clone the project to local
    - Got o command line or any IDE that supports JAVA & Maven dependencies
    - We may need to import the Maven dependencies (Scope got set to Compile for Newly added dependencies in pom.xm)
    - Execute the command: `mvn clean test`
    - We can run the `RunnerTest` file using testng then form is filled wih all the details
    - Alternatively, we can run `testng.xml` from IDE after downloading the dependencies
    - Result will be captured in `test-output` folder
    

