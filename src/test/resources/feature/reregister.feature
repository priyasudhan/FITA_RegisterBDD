@test
Feature: Demo automation login

Scenario Outline: Registration

Given User launching demo automation site
When User is display with Skip sign in and Sign In button 
Then Click Skip sign In 
And Enter the value for first name "<first name>"

Examples:
|first name|
|Jeffy|