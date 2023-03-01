# Task for Java position

We’d like you to create a feature flag service using Spring in Java. 

## Here are the requirements for this service:

* As an admin user, I want to be able to create a feature which defaults to disabled
* As an admin user, I want to be able to switch on a feature for a user
* As a user, I want to be able to get all the enabled features (a mix of all the globally enabled ones and the ones
  enabled just for my user)
  
### Some notes:

This is deliberately open ended - you can focus this service on backend clients or mobile clients, include security or
not include it, but we’ll expect you to explain why and how you’ve chosen to do it.

Work your way through the features in the time frame, as you would if this was given to you at work. 
In the face to face, we can talk about what else would need to be added before pushing it to production.
We will also ask you to add to the code during the face to face interview.

### We are not assessing you on:

* Your knowledge of Spring - feel free to google what you need
* What technologies you use - anything that you can justify well is good

### What we’re assessing you on:

* Understanding of REST and API design
* Testing
* Understanding how clients integrate with this service
* Simplicity

# Guide

## How to run tests

Simply after opening project with Gradle run:

``./gradlew test``

## How to run application

* in project's root execute

``docker-compose up``

* run the project using IDE or

``./gradlew bootRun``

# Solution

