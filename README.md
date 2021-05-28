# Technical Test
The purpose of this test is 3 fold:
* To see what test scenarios you come up with
* How well you understand technical documentations
* How comfortable are you with writing automation tests and what's your approach towards it. 

## What you need to do:
* Sign up at https://gender-api.com/
* Read the api docs: https://gender-api.com/en/api-docs
* Think about how you want test the end points via automation tests

**NOTE**: You are free to use any language you are comfortable with, but for reference, we've provided a maven project using Jackson and RestAssured libraries that you can use (feel free to make any changes that you see fit)

## Using the example test framework
* `RestClient.java` simplifies the way you make a REST call using RestAssured library, just create an instance of RestClient and call utility methods such as `get` `post` to make call to an endpoint
* You can write test in either junit4 or junit5, junit5 example is in `PostsTests.java`.

## How will we rate
Our team will check following:
* Your understanding of the problem
* Scenarios Covered
* Coding Style
* Readability
 