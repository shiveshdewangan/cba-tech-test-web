## CBA Tech Test - Web UI Test Automation

Technology used - Java, Selenium, Cucumber, Maven and CircleCI

### There are two options to run this project.

**Running locally using editors like IntelliJ Idea**
- Clone the repo https://github.com/shiveshdewangan/cba-tech-test-web.git
- Import the project as maven project on IntelliJ
- Install all maven dependencies on pom.xml file
- Go to **webtesting/src/test/java/TestRunner***
- Locate **Runner.java** file within **TestRunner** folder
- Right click on the **Runner.java** file and Run it

**Running locally from Command Line**

*Please make sure you have **Java** and **Maven** installed and configured on your system.*

- Clone the repo https://github.com/shiveshdewangan/cba-tech-test-web.git
- Open a Terminal window
- `cd cba-tech-test-web`
- `mvn clean test -DbrowserName=Chrome` for running it on Chrome browser
- `mvn clean test -DbrowserName=Edge` for running it on MS Edge browser
- `mvn clean test -DbrowserName=Firefox` for running it on Firefox browser

##### Note: After test execution, please look inside `**ui-automation/reports**` for HTML Reports.

#### Running on Circle CI
I have added CI Steps under `.circleci/config.yml` which enables us to run it on **Circle CI Pipeline**.
To run in CI - https://app.circleci.com/pipelines/github/shiveshdewangan/cba-tech-test-web

#### Bugs found and My Notes
