Feature: validate login of gmail

  Scenario: test login home page
    Given open firefox and start with application
    When i enter valid username and valid password
    Then then user should be able to login succesfully
    When i click on log out it
    Then it should be log out
    And browser should be closed