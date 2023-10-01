Feature: Teacher Portal Login Functionality Checking


#------------------------Teacher_Login_1------------------------#

  @Suite
  Scenario Outline: 2.9 Check Teacher login With Valid Data
    Given Varify that the Teacher Login page is being displayed accurately
    Then Enter TPIN Number "<Username>"
    And Enter Teacher Password "<Password>"
    When Click on login button
    Then Check that the My Routine page is displayed accurately


    Examples:
      | Username | Password |
      | 13091    | 123456   |

