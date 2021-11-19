Feature: JobValidation

Background: User logging into the Orange Application

Given the user Open Orange HRP Url 
Then user Login to the Orange Portal

Scenario: Verification of Job Title  

Given the user Clicks on Admin Link 
When the user Clicks on Job 
Then validate text Job Title