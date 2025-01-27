Feature: College Creation

  Scenario Outline: Checking the College creation functrionality
    Given user enters the tvet domain page
    And user clicks on the login button
    Then user enters the "<username>"
    And click on the submit button
    Then user need to enter the "<password>"
    And click on the continue button
    Then user enters in Tvet dashborad
    Given the user enters the Tvet dashboard
    Then clicks on the college module
    And click on the add new college section
    Then need to fill the General information form
    Then need to fill the Contact info form
    Then need to fill the Training info form
    Then need to fill the College facility form
    And the college creation is complete

    Examples: 
      | username                          | password      |
      | abishek+tvetcollegeuat@resbee.org | TVET@dmin2017 |
