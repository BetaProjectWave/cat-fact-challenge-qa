# Interview Challenge - Cat Facts Automation

We would like you to improve the test suite for the cat fact application.

## Prerequisite

- Maven
- Java 8 or above
- Chrome

## Running

Build and Run Tests

```
    mvn clean verify
```

Start Application

```
    mvn spring-boot:run
```

## Resources

- Home Page: `http://localhost:8080`
- Swagger Docs: `http://localhost:8080/swagger-ui/`
- API Endpoint: `http://localhost:8080/facts?limit=5`
- CatFact API: `https://catfact.ninja`

### Preconfigured

The following areas are preconfigured, however feel free to use your preferred frameworks/tooling.

- Cucumber: 
    - `src/test/resources` 
    - `src/test/java/io/asto/app/cucumber/tCucumberTest.java`
    
- Selenium: `src/test/java/io/asto/app/selenium/SeleniumTest.java`


## Requirements

We would like to cover the following

### Basic Requirements

Feature request.

`As a cat person, I want to be view random facts about cats so that I can choose the most interesting fact.`

For the above we would like to:

- Define acceptance test(s) criteria.
- Build an automated test suite to verify the acceptance criteria.

NOTE: While working through this exercise feel free to refactor and amend the code and the project structure as you see fit, although be prepared to explain your reasoning and judgement. As examples, you might consider things such as DRY, readability, separation of concerns, code-cleanliness, approachability/accessibility etc.

### Stretch Goals

- We would like to validate non-functional requirements for the cat-fact application.  

## General

You are free to add additional functionality in addition to the above if you so wish.

You may tackle the problem in any suitable development environment. If you so wish, you can tackle the problem using a different language or framework.

This challenge is intended to be completed by candidates of all levels and experience, so you should attempt to complete as much as you feel demonstrates your capability. There is no expectation that all candidates will be able to complete all parts of this challenge. There is no time limit, but time taken may be taken into consideration during assessment.