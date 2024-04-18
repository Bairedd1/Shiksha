@Feature
Feature: To test the functionality of max()Function in Python

#THIS SCENARIO IS USED TO CHECK THE DOWNLOAD AS PDF FUNCTIONALITY IN MAX()FUNCTION IN PYTHON PAGE
@DownloadPDF
Scenario: To test the functinality of Download As PDF
Given user is on Shiksha home page
When user selects the shiksha online drop down
And user selects on max()Function in Python
And user scrolls to download pdf
And clicks on download as pdf
Then user downloads pdf successfully


#THIS SCENARIO IS USED TO CHECK THE FUNCTIONALITY OF RATING FEEDBACK FORM FOR VALID CREDENTIALS
@RatingFeedback
Scenario: To test the functinality of rating feedback form for valid credentials
Given user is on max()Function page
When user scrolls 
And user clicks the rating option 
And user is redirected to feedback form
And user selects one of the available options
And user enters Suggestions
|Content is informative|
And user clicks the submit button 
Then user submits the feedback form successfully


#THIS SCENARIO IS USED TO TEST THE FUNCTIONALITY OF ENQUIRE NOW OPTION
@Enquire
Scenario: To test the enquire now functinality 
Given user is on the max()Function page
When user clicks on popular
And user clicks on python training
And user is redirected to the python programming page
And user clicks the enquire now button
Then user is redirected to the enquired page successfully


#THIS SCENARIO IS USED TO TEST THE FUNCTIONALITY OF POSTING COMMENTS FOR VALID INPUT
@Post
Scenario: To test comment functionality
Given user is in max()function in python page
When user scrolls through the page
And enters their comment
|The articles are incredible|
And user clicks the post button
Then user is able to see the posted comment below


##THIS SCENARIO IS USED TO FIND THE MAGNIFYING ICON DEFECT IN ASK A QUESTION PAGE
@AskQuestion 
Scenario: To verify that the whats app icon is in correct position
Given user is on ask a question page
When user wants to click whats app magnifying icon
Then user finds the search bar on whats app magnifying icon





