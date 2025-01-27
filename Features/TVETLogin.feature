Feature: Tvet Login

  @TvetLogin
  Scenario Outline: Checking the Login functionality of TVET
    Given user enters the tvet domain page
    And user clicks on the login button
    Then user enters the "<username>"
    And click on the submit button
    Then user need to enter the "<password>"
    And click on the continue button
    Then user enters in Tvet dashborad

    Examples: 
      | username                          | password      |
      | abishek+tvetcollegeuat@resbee.org | TVET@dmin2017 |
