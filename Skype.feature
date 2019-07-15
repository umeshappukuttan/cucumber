Feature: Validate Sky Page

  Scenario: Enter details using data table
    Given Luanch the Sky Page
    And Enter the Registration details
      | Fields     | Values           |
      | First name | Umesh            |
      | Lastname   | A                |
      | email      | aumesh@gmail.com |
      | Cemail     | aumesh@gmail.com |
      | Password   | Password1        |
      | CPassword  | Password1        |
    When Click on Cancel link New Page is launched
    Then Verify the new page as any element
    And Quit the browser
