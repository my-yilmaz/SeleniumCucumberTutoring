Feature: US1011 automationexercise

  @aue1
  Scenario: TC01 Register User
    Given kullanici "aueURL" anasayfasinda
    And Verify that home page is visible successfully
    And Click on Signup Login button
    And Verify New User Signup! is visible
    And Enter name
    And Enter email adress
    And Click Signup button
    And Verify that ENTER ACCOUNT INFORMATION is visible
    And Fill details: Title, Name, Email, Password, Date of birth
    And Select checkbox Sign up for our newsletter!
    And Select checkbox Receive special offers from our partners!
    And Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
    And Click Create Account button
    And Verify that ACCOUNT CREATED! is visible
    And Click Continue button
    And Verify that Logged in as username is visible
    And Click Delete Account button
    And Verify that ACCOUNT DELETED! is visible and click Continue button
    And sayfayi kapatir

  @aue2
  Scenario: TC02 Login User with correct email and password
    Given kullanici "aueURL" anasayfasinda
    Then Verify that home page is visible successfully
    And Click on Signup Login button
    Then Verify Login to your account is visible
    And Enter correct email address and password
    And Click login button
    Then Verify that Logged in as username is visible
    And Click Delete Account button
    Then Verify that ACCOUNT DELETED! is visible
    And sayfayi kapatir

  Scenario: TC03 Login User with incorrect email and password
    Given kullanici "aueURL" anasayfasinda
    Then Verify that home page is visible successfully
    And Click on Signup Login button
    Then Verify Login to your account is visible
    And Enter incorrect email address and password
    And Click login button
    Then Verify error Your email or password is incorrect! is visible
    And sayfayi kapatir



    #2. Navigate to url 'http://automationexercise.com'
    #3. Verify that home page is visible successfully
    #4. Click on 'Signup / Login' button
    #5. Verify 'Login to your account' is visible
    #6. Enter correct email address and passwordd
    #7. Click 'login' button
    #8. Verify that 'Logged in as username' is visible
    #9. Click 'Logout' button
    #10. Verify that user is navigated to login page


















