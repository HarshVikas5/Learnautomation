Feature: Student Register Form
As a student 
I want to register into portal 
So that I can register myself

@UITEST
Scenario Outline: Verify the Student register form
Given User is on registration page
And Enter FirstName as "Nitin", LastName as "Singh" and Email as "nitin@gmail.com"
When User click on gender as "Male"
And Enter Mobile number as "8557037939"
And User Enters "<Subject>", "<Hobbies>", Date and "<Address>"
And Upload the picture
And Select state as "NCR" and city as "Delhi"
And Click on the submit button
Then User should register successfully into the portal

Examples: 
      | Subject |  | Hobbies |  | Address    |
      | Maths   |  | Sports |  | SBP Mohali |
     
