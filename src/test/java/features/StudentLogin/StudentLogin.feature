Feature: Student Portal Login Functionality Checking


#------------------------Student_Login_1------------------------#

  @Suite
  Scenario Outline: 2.5 Verify that the student can login with Valid Data
    Given Varify that the Student Login page is being displayed accurately
    Then Enter Registration Number "<Username>"
    When click on Next button
    Then Enter Your Password Page should be displayed
    And Enter Your Password "<Password>"
    When Click on login button
    Then Check that the My routine page is displayed accurately

    Examples:
      | Username | Password |
      | 2378587  | 123456   |