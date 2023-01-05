Feature: Scenario related to Employee

  Background: Background steps
    Given User opens URL "https://opensource-demo.orangehrmlive.com/"
    When User Enters username as "Admin" and password as "admin123"

  @AddEmp
  Scenario Outline: Add new Employee
    When User hover over PIM menu
    And clicks on Add Employee menu item
    Then User fills info of new Employee
      | <First name> | <Middle name> | <Last name> |
      | "Akshay"     | "Vijay"       | "More"      |
    And clicks on Save button
    Then User is added successfully

  @SearchEmp
  Scenario Outline: Search for a given employee
    When User hover over PIM menu
    And Clicks on Employee List menu item
    When User searchs for this employee <Employee name>
    And clicks on Search button
    Then it displays 'message'

    Examples: 
      | Employee name     |
      | "Charlie  Carter" |

  @DeleteEmp
  Scenario Outline: Search for a given employee
    When User hover over PIM menu
    And Clicks on Employee List menu item
    When User searchs for this employee <Employee name>
    And clicks on Search button
    Then it displays 'message'
    When User clicks on select all
    And clicks on delete button
    Then confirmation pop up will appear
    And record will be deleted

    Examples: 
      | Employee name |
      | "Alice Duval" |
