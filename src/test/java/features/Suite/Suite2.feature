Feature: OSL Functionality Checking Suite2

@Suite2
Scenario Outline: 2.1 Check Admin login with Valid Data
Given Varify that the Admin Login page is being displayed accurately
Then Enter User Email "<Username>"
And Enter Admin Password "<Password>"
When Click on log in button
Then Check that the Welcome page is displayed accurately

Examples:
| Username      | Password |
| asif@qups.com | 123456   |

@Suite2
Scenario Outline: 2.2 Verify that the student can login with Valid Data
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



@Suite2
Scenario Outline: 2.3 Check Teacher login With Valid Data
Given Varify that the Teacher Login page is being displayed accurately
Then Enter TPIN Number "<Username>"
And Enter Teacher Password "<Password>"
When Click on login button
Then Check that the My Routine page is displayed accurately


Examples:
| Username | Password |
| 13091    | 123456   |


@Suite2
Scenario: 2.4 Verify that the Q&A Services page is being Load and displayed accurately
Given Student can successfully login student portal
Then Q&A Menu should be displayed correctly no top navigation
When Click on Q&A Menu from top navigation
Then Verify that the Q&A Services page is being Load and displayed accurately

@Suite2
Scenario: 2.5 Verify that the Question and Answer page is being Load and displayed accurately
Given Student can successfully login student portal
Then Q&A Menu should be displayed correctly no top navigation
When Click on Q&A Menu from top navigation
And Click proceed on any subject from Q&A services Page
Then Question and answer page should displayed
And Verify that the page is being Load and displayed accurately

@Suite2
Scenario: 2.6 Verify that the Question and Answer page Search question is working properly
Given Student can successfully login student portal
Then Q&A Menu should be displayed correctly no top navigation
When Click on Q&A Menu from top navigation
And Click proceed on any subject from Q&A services Page
Then Question and answer page should displayed
And Input a search keyword into the search bar
When Select a search suggestion by clicking on it
Then Confirm the display of the searched question and its corresponding answer

@Suite2
Scenario: 2.7 Verify that the Master Class page is being Load and displayed accurately
Given Student can successfully login student portal
Then Master Class Menu should be displayed correctly no top navigation
When Click on Master Class Menu from top navigation
Then Verify that the Master Class page is Displayed By Course
When Click on Proceed in any Master Class
Then Check that the Master Class page is displayed By Lecture
And Check that the Master Class page is being Load and displayed accurately

@Suite2
Scenario: 2.8 Verify that the Master Class page Search is working
Given Student can successfully login student portal
Then Master Class Menu should be displayed correctly no top navigation
When Click on Master Class Menu from top navigation
Then Verify that the Master Class page is Displayed By Course
When Click on Proceed in any Master Class
Then Check that the Master Class page is displayed By Lecture
And Check that the Search bar is displayed accurately
When Type a search keyword into the search bar
Then Check that the search result is showing

@Suite2
Scenario: 2.9 Verify that the Student can take quiz from master class
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