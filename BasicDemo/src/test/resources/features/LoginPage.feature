Feature: Login to HRMLogin

  Background: 
    Given User is on "HRMLogin" page

  @ValidLogin
  Scenario: Login with valid credential
    When User login with success account "Admin" and "admin123"
    Then User is taken to Dashboard page

  @InvalidLogin
  Scenario Outline: Login with invalid credentials
    When User login with "<username>" and "<password>"
    Then The "<errorMessage>" is displayed

    Examples: 
      | username | password  | errorMessage        |
      | Admin    | admin12$$ | Invalid credentials |
      | admin$$  | admin123  | Invalid credentials |
      | abc123   | xyz$$     | Invalid credentials |

  @MissingUsername
  Scenario: Login with blank username
    When User enters username as " " and password as "admin123"
    Then The "Required" error is displayed under Username field
