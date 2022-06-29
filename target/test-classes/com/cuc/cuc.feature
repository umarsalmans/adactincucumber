Feature: Hotel booking in adactin  application
Scenario: login page
Given user launches the application 
When user enters the username and usernamefield
And user enters the userpassword and userpasswordfield
Then user clicks the login buttern and navigates to select hotel page
Scenario: select the hotel page
When user selects the location from drobdown
And user selects the hotel from drobdown
And user selects the room type from drobdown
And user enters the check in date
And user enters the check out date 
And user selects the adults per room from drobdown 
And user selects the children per room froom drobdown 
Then user clicks the search butten and navigates to select hotel page

Scenario: select the hotel page
When user clicks the radio butten
Then user clicks the continue butten and navigates to book hotel

Scenario: book a hotel page 
When user enters first name 
And user enters last name 
And user enters billing address
And user enters credit card no number
And user selects credit card type from drobdown
And user selcets expiry date select month from drobdown 
And user selects expiry date select year from drobdown
And user enters cvv number 
Then user clicks the  book now butten and navigates to booking confirmation

Scenario: booking confirmation page 
Then user clicks the myitinernary and navigates to booked itinernary

Scenario: booked itinernary page
Then user clikcks the logout butten

