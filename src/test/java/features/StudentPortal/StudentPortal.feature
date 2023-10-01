Feature: Student Portal Functionality Checking

  @Suite
  Scenario: 2.6 Verify that the Master Class page is being Load and displayed accurately
    Given Student can successfully login student portal
    Then Master Class Menu should be displayed correctly no top navigation
    When Click on Master Class Menu from top navigation
    Then Verify that the Master Class page is Displayed By Course
    When Click on Proceed in any Master Class
    Then Check that the Master Class page is displayed By Lecture
    And Check that the Master Class page is being Load and displayed accurately

  @Suite
  Scenario: 2.7 Verify that the Master Class page Search is working
    Given Student can successfully login student portal
    Then Master Class Menu should be displayed correctly no top navigation
    When Click on Master Class Menu from top navigation
    Then Verify that the Master Class page is Displayed By Course
    When Click on Proceed in any Master Class
    Then Check that the Master Class page is displayed By Lecture
    And Check that the Search bar is displayed accurately
    When Type a search keyword into the search bar
    Then Check that the search result is showing

  @Suite
  Scenario: 2.8 Verify that the Student can take quiz from master class
    Given Student can successfully login student portal
    Then Master Class Menu should be displayed correctly no top navigation
    When Click on Master Class Menu from top navigation
    Then Verify that the Master Class page is Displayed By Course
    When Click on Proceed in any Master Class
    Then Check that the Master Class page is displayed By Lecture
    When Click on any subject quiz
    And click on Start Quiz or retake quiz
    Then Select options from questions
    When Click on submit
    Then Check that a pop up is showing
    When Click on yes button
    Then check that the Analysis Report is showing




