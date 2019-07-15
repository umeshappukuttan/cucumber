Feature: Validate Sky Page with different data

  @SkyBrowserLaunch
  Scenario: Launch Sky Browsers
    Given: Click on the Sky Sign-up page
    When: Launch the Sky Page
    Then: title of the Sky Page


  @SkyBrowserQuit
  Scenario: Quit Sky Browser
    Given: Verify whether browser is active
    When: If the browser is active
    Then: Quit the browser