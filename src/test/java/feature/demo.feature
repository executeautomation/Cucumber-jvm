Feature:
  Demo feature to demonstrate Cucumber 5


  Scenario: Perform an misc operation
    Given I login as admin
      |username|password|
      |admin   |[blank] |
    And I have few books in hand such as java, js, csharp
    Given some more information
      """json
      {
         "Name": "Karthik",
         "Company": "ExecuteAutomation",
         "Living": "New Zealand"
      }
      """