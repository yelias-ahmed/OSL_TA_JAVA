Feature: OSL Functionality Checking Suite1


  @Suite1
Scenario: 1.1 Verify that students are able to submit new questions through the Q&A Services
Given Student can successfully login student portal
Then Q&A Menu should be displayed correctly no top navigation
When Click on Q&A Menu from top navigation
And Click proceed on any subject from Q&A services Page
Then Question and answer page should displayed
And Check that the Ask a new Question Button is available
When Click on Ask a new question button
Then Check that the ask a new question page is displayed
And Select a course from course dropdown list
And Select Subject from subject dropdown list
And Select chapter from chapter dropdown list
And Type a question in ask a question text box
When Click on submit button
Then Question and answer page should displayed

@Suite1
Scenario: 1.2 Verify that the teacher can provide answers to pending questions
Given Teacher can successfully login Teacher portal
Then Question&Answer Menu should be displayed correctly no top navigation
When Click on Question&Answer Menu from top navigation
And Click On Pending Question sub menu from dropdown
Then Check that asked question displayed in New Question section
When Click on Answer Button side QA Arc Course
Then Student's Question page should displayed
And Enter answer in the text box
When Click on submit & Next Button
Then Success! message should be displayed

@Suite1
Scenario: 1.3 Verify that students can receive notifications when a teacher responds
Given Student can successfully login student portal
Then Ensure accurate display of notification badge within the notification icon
When Click on notification icon
Then Check that the notification Page should displayed
And Check that the notification card should displayed
When click on notification card
And Check that the Answer should displayed
When click on Back to notification
Then Check that the notification Page should displayed
And Click on delete All Button
Then Check that the notification badge is gone


@Suite1
Scenario: 1.4 Verify students can request reviews for unsatisfactory Q&A answers.
Given Student can successfully login student portal
Then Q&A Menu should be displayed correctly no top navigation
When Click on Q&A Menu from top navigation
And Click proceed on any subject from Q&A services Page
Then Question and answer page should displayed
When Click on not yet icon
Then Check that the Ask a question TextBox should displayed
Then Type a reply in ask a question text box
When Click the Submit button located below the text box
Then Asked question should displayed

@Suite1
Scenario: 1.5 Verify that the teacher can Review unsatisfactory Q&A answers.
Given Teacher can successfully login Teacher portal
Then Question&Answer Menu should be displayed correctly no top navigation
When Click on Question&Answer Menu from top navigation
And Click On Pending Question sub menu from dropdown
Then Check that Review Request section should displayed
When Click on Review Button side QA Arc Course
Then Student's Question page should displayed
And Enter Review Answer in the text box
When Click on Submit & Next Button of Review Request
#    Then Success! message should be displayed

@Suite1
Scenario: 1.6 Verify that the Student can react satisfied
Given Student can successfully login student portal
When Click on notification icon
Then Check that the notification Page should displayed
And Check that the notification card should displayed
When click on notification card
Then Check that the Answer should displayed
When Click on satisfied icon
Then Check that te Satisfied mark should displayed

@Suite1
Scenario: 1.7 Verify that the Admin can Moderate Question in Q&A Services
Given Admin can successfully login Admin portal
When Click on Student Menu
Then Check that the Student Area page should displayed
When Click on Q&A2 Service
And Click on Qn&A2 Moderation
Then Check that the Moderation Page should displayed
And Enter reg number on Moderation page
When Click on View button
Then Check that the Summary Section should displayed
When Click on Moderate button
Then Check that student question page should displayed
When Click on paperclip icon and input image location
Then Check that the image should displayed
When click on update & next and exit
Then Check that the Moderation Page should displayed


@Suite1
Scenario: 1.8 Verify that the Admin can Reject Question in Q&A Services
Given Admin can successfully login Admin portal
When Click on Student Menu
Then Check that the Student Area page should displayed
When Click on Q&A2 Service
And Click on Qn&A2 Moderation
Then Check that the Moderation Page should displayed
And Enter reg number on Moderation page
When Click on View button
Then Check that the Summary Section should displayed
When Click on Moderate button
Then Check that student question page should displayed
When click on Reject & next and exit
Then Check that the Moderation Page should displayed
