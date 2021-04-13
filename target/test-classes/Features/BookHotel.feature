Feature: Verify AdactinHotelApp Book Hotel Functionality

  #Scenario-1
  Scenario Outline: Verifying AdactinHotelApp booking functionality with valid details
    Given User is on the AdactinHotelApp login page
    When User should enter valid "<userName>" , "<passWord>" and click the login button
    Then User should verify login "<userName>" and search hotels with valid details "<location>", "<hotels>", "<roomType>", "<numberOfRooms>","<checkIn>", "<checkOut>", "<adultPerRoom>" and "<childPerRoom>"
    Then User should select hotel and click continue button
    Then User should book hotel using valid user details "<firstName>", "<lastName>", "<address>" and click book now
      | creditCardNo       | creditCardType   | expiryMonth | expiryYear | cvv |
      | 987654321123456789 | American Express | June        |       2021 | 123 |
      | 551236321123456789 | VISA             | July        |       2021 | 777 |
      | 888777921123456789 | Master Card      | June        |       2021 | 888 |
    Then User should verify order id is displayed

    Examples: 
      | userName | passWord | location | hotels      | roomType | numberOfRooms | checkIn    | checkOut   | adultPerRoom | childPerRoom | firstName | lastName | address        |
      | prakash0 | J5M3AD   | Sydney   | Hotel Creek | Double   |             2 | 13/04/2021 | 14/04/2021 |            2 |            2 | sand      | kumar    | 18 kodambakkam |

  #Scenario-2
  Scenario Outline: Verifying AdactinHotelApp booking functionality without passing any field
    Given User is on the AdactinHotelApp login page
    When User should enter valid "<userName>" , "<passWord>" and click the login button
    Then User should verify login and search hotels with valid details "<location>", "<hotels>", "<roomType>", "<numberOfRooms>","<checkIn>", "<checkOut>", "<adultPerRoom>" and "<childPerRoom>"
    Then User should select hotel and click continue button
    Then User should click book now without passing any details
    Then User should verify "Please Enter your First Name", "Please Enter you Last Name", "Please Enter your Address", "Please Enter your 16 Digit Credit Card Number","Please Select your Credit Card Type","Please Select your Credit Card Expiry Month","Please Enter your Credit Card CVV Number" is displayed

    Examples: 
      | userName | passWord | location | hotels      | roomType | numberOfRooms | checkIn    | checkOut   | adultPerRoom | childPerRoom | firstName | lastName | address        |
      | prakash0 | J5M3AD   | Sydney   | Hotel Creek | Double   |             2 | 13/04/2021 | 14/04/2021 |            2 |            2 | sand      | kumar    | 18 kodambakkam |
