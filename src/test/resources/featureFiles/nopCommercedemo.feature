
Feature: nopComerceDemo
 

  Scenario Outline: Check the register account functionaity
    Given User is on login page
    When User enters <Email> and <Password>
    And Clicks Login button
   

    Examples: 
      | Email   | Password  |
      | karthikkristipati123@gmail.com	 |  Karthik@nopcommerce8123 |
   