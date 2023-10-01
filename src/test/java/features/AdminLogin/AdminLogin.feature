Feature: Admin Portal Login Functionality Checking


#------------------------Admin_Login_1------------------------#

  @Suite
  Scenario Outline: 2.1 Check Admin login with Valid Data
    Given Varify that the Admin Login page is being displayed accurately
    Then Enter User Email "<Username>"
    And Enter Admin Password "<Password>"
    When Click on log in button
    Then Check that the Welcome page is displayed accurately

    Examples:
      | Username      | Password |
      | asif@qups.com | 123456   |