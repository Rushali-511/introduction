Feature: To check functionality of loginpage

Scenario Outline: Verification of login
Given Open chromedriver and intialize driver
When Navigate to "http://www.qaclickacademy.com/"
And Land on the landing page and click on login button
And Enter <username> and <password> 
Then Verify that user is logged in

Examples:

|username	|password	|
|test	    |12345	    |
|test99	    |1234876	|


