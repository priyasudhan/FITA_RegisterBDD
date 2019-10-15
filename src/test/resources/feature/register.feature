@reg
@maintest
Feature: Demo automation login

Scenario Outline: Registration
Given User launches demo automation site
When User is displayed with Skip sign in and Sign In button
Then Click on Skip sign In
Then Enter the value for first name "<first name>"
And Enter the value for last name "<Last name>" 
And Enter the value for address "<Address>" 
And Enter the value for email "<Email Address>" 
And Enter the value for phone "<Phone>" 
And Select the "Male" option
And Select the Hobbies as "Cricket" and "Movies"
And Select the Languages as "English"
And Select the skills as "C" 
And Select the Country as "India"
And Select the Select Country as "India"
And Select the Year as "2000"
And Select the Month as "October"
And Select the Day as "6"
And Enter the Password as "<PW>"
And Enter the Confirm Password as "<CPW>"
And Click on "Submit" button


Examples:
|first name| Last name|Address|Email Address|Phone|PW|CPW|
|Jeffrin|Daniel|Cbe|xxx@gmail.com|1256542156|P@$$W0rd|P@$$W0rd|