# 🚀 Technical Test 🚀
The purpose of this test is 3 fold:
* To see what test scenarios you come up with
* Assess how well you understand technical documentation
* Assess how comfortable you are with writing automation tests and the approach taken to accomplish it

## 📕 What you need to do:
Using the testing site https://gorest.co.in/, write automation tests for the following endpoints:
1. Create a new user
2. Update user details
3. Delete user

The test scenarios are entirely up to you, and you may use additional endpoints if you feel they will provide better coverage and improve your coding solution. You will be evaluated on which test cases you create as well as on the overall quality and efficiency of your automation code (see evaluation section below).

**NOTE**: You are free to use any language you are comfortable with, but for reference, we've provided a maven project using Jackson and RestAssured libraries that you can use (feel free to make any changes that you see fit)

## 🧠 Using the example test framework
The code is built with Java 8 (but if there's features you like in later versions, then you could ugprade this!) and can be built and run using Maven.
* `RestClient.java` simplifies the way you make a REST call using RestAssured library, just create an instance of RestClient and call utility methods such as `get` `post` to make call to an endpoint
* You can write test in either junit4 or junit5, junit5 example is in `PostsTests.java`.

## 📫 Submitting the code
We take pride in keeping our Git history organised and easy to follow for the benefit of our code reviewers, so please organise your commits to reflect this.
Once complete, zip up your directory (including any .git files!) and send it to the recruiter you've been in contact with, including a summary of what you have done.
Please do not fork this repository or send in a pull request, since that would mean other applicants would be able to *cough* borrow *cough* your work!
 
## ✅ How will my work be evaluated?
Rome wasn't built in a day, and we are fair in our review given the time constraints. With this in mind, here are some of the things we are looking for:
* Is the code clean, well organised, and reusable
* Your understanding of the problem
* Scenarios Covered
* Coding Style
* Readability

Should you proceed to the next stage of the process, you may be asked to talk through the approach you took as well as what other approaches you might have taken or considered if more time would have been available. 
Good luck! 
 
