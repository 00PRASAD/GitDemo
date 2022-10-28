Feature: Portal Login

Background:
Given Validate the browser
When Browser is triggered
Then Check if browser is started

@PortalTest
Scenario: Home page default login
Given User is on NetBanking landing page
When User login into appication with "jin" and password "1234"
Then Home page is populated 
And Cards displayed are "true"


Scenario: Home page default login
Given User is on NetBanking landing page
When User login into appication with "jhon" and password "4321"
Then Home page is populated 
And Cards displayed are "false"

@PortalTest
Scenario: Home page default login
Given User is on NetBanking landing page
When User sign up with following details
| jenny | abcd | john@abcd.com | Australia | 3242353 | 
Then Home page is populated 
And Cards displayed are "false"

@PortalTest
Scenario: Home page default login
Given User is on NetBanking landing page
When User login into appication with "jhon" and password "4321"
Then Home page is populated 
And Cards displayed are "false"