@contact
Feature: Contact us functionality

  @smoketest
  Scenario: To validate the contact us functionality
    Given Open the browser, enter the sparsh hospital url
    And click the contactus button
    When user enters firstname lastname phno email textbox
    And select yashwantpur hospital from hospital dropdown 
    And write a message and click on send button
    Then thank you meassage should be displayed
    And bank info should available in the page

  #@tag2
  #Scenario Outline: Title of your scenario outline
   # Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
 #   Examples: 
  #    | name  | value | status  |
   #   | name1 |     5 | success |
    #  | name2 |     7 | Fail    |
