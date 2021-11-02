Feature: Free crm app test
@First
Scenario: free crm create deal test

Given user is on deal page
When user fills the deal form
Then deal is created

@Second
Scenario: Free CRM contact test

Given user is on Contact page
When user fills the contact form
Then contact is created
@Third
Scenario Outline: 	Free Crm create mail test

Given useris on mail page
When user fills the mail form
Then mail is created

Examples:
|Test@yahoo.com|
|Test1@yahoo.co.in|
|Pank@gmail.com|