Feature: Routine Functionality Checking

  @Suite3
  Scenario: 3.1 Verify that the Routine create & publish is working properly
    Given Admin can successfully login Admin portal
    Then Check that the administration menu displayed Properly
    When Click on administration menu
    Then Check that the Routine menu showing in side navigation
    When Click on routine in side navigation
    Then Select manage class routine from dropdown
    Then Check that the manage class routine page should displayed
    Then Check that the create routine button displayed properly
    When Click On Create routine Button
    Then Check that the Create Class Routine Page is displayed properly
    Then Check that the Date is selected Properly
    Then Check that the lecture start is showing properly
#    When Click on lecture start
    Then Select start time from calender
    Then Check that the lecture end is showing properly
#    When Click on lecture end
    Then Select end time from calender
    Then Check that the Lecture Type is showing properly
    When Click on Lecture Type dropdown
    Then Select In-Branch Class from Lecture Type dropdown
    When Click on Lecture Type dropdown
    Then Select Online Class from Lecture Type dropdown
    Then Check that the Add Batch Roll button is showing properly
    When Click on Add Batch Roll
    Then Add Batch Roll  Popup should be displayed
    Then Select Organization program session and course name
    Then Enter D in Lecture And check that the suggestion are showing
    Then Select a suggestion from list
    Then Select Branch Wise from Routine by dropdown list
    Then Select mother course, Brunch, Campus, Version of study, Gender, Batch Type, Batch Time, Batch Name
    When Click on submit Button
    Then Check that the selected batch should displayed
    Then Select Interactive Class Checkbox
    Then Enter Host Teacher PIN Class Type
    When Click on Create And Publish
    Then Check that the routine is successfully created and published

  @Suite3
  Scenario: 3.2 Verify that the Routine Edit is working properly
    Given Admin can successfully login Admin portal
    Then Check that the administration menu displayed Properly
    When Click on administration menu
    Then Check that the Routine menu showing in side navigation
    When Click on routine in side navigation
    Then Select manage class routine from dropdown
    Then Check that the manage class routine page should displayed
    When Click on View button below the page
    Then Check that the routine details should displayed
    When Click on edit button
    Then Check that the Update Class Routine page should displayed
    Then Select start time from calender
    Then Select end time from calender
    Then Click On Update Button
    Then Check that the routine is successfully created and published



















