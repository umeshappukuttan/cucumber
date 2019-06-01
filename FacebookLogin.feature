Feature: This test case used to verify Facebook login page

  Scenario: Login verificaiton without password
  
  Given launch the facebook
  When Enter the username "aumesh@gmail.com" without password and click Login
  Then Validate the new page and quit the browser
