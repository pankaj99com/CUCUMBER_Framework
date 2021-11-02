#Feature: Free CRM Login feature
#
  #Scenario: Free CRM Login Test Scenario
    #Given user is on login page
     #When Title of the page is Free CRM
     #Then user enters username and password
      #And clicks on login button
     #Then user is navigated to home page.
     #
     #
#
     #DataDriven without examples keyword
     #Feature: Free CRM Login feature
#
  #Scenario: Free CRM Login Test Scenario
    #Given user is on login page
     #When Title of the page is Free CRM
     #Then user enters "naveenk" and "test@123"
      #And clicks on login button
     #Then user is navigated to home page.
     #
     #
     #
     #
      #DataDriven with examples keyword
     #Feature: Free CRM Login feature
#
  #Scenario Outline: Free CRM Login Test Scenario
    #Given user is on login page
     #When Title of the page is Free CRM
     #Then user enters "<username>" and "<password>"
      #And clicks on login button
     #Then user is navigated to home page.
     #Then close the browser
     #
     #Examples:
     #|username|password|
     #|naveenk|test@123|
     #|pankaj|Admin@123|
     