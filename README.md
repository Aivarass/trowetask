# trowetask
T Rowe Price SDET Test Solution 

Summary:
Sharing a quick framework that I've created for this task. All in all this task took me about an hour. I am using Java8, Junit, and Cucumber. 
Test runners: Junit / Cucumber Junit.
In total, I've added 32 tests (19 JUnit tests and 13 cucumber tests).
NOTE: this is 100% my solution, nothing was copy pasted from the internet. 

How to get started:
1. Clone this repository using Git
2. Do clean install using maven
3. Run the tests by navigating to "src/test/java"

Locations:
1. All JUnit test cases are located: "src/test/java/junit/"
2. All Cucumber tests are located: "features/" 
3. To run Cucumber test cases you'll need to use CucumberRunner.class which is located "src/test/java/cucumber/CucumberRunner.java"
4. Cucumber Glue file is located: "src/main/java/stepdefinitions/TestGlue.java"

Scenarios covered:
1. Find one longest word
2. Find one shortest word
3. Find all longest words
4. Find all shortest words
5. Test just one word
6. Test sentence with the same word
7. Test comma
8. Test full stop
9. Test sentence which is in ascending order
10. Test sentence which is in descending order
11. Test very long sentence
12. Test empty string
13. Test null values
14. Test very long word
15. Test exclamation
16. Test question mark
17. Other tests randomly generated sentences
