Feature: Verify AdactinHotelApp Book Hotel Functionality

  Scenario Outline: Verifying AdactinHotelApp booking functionality with all valid fields
    Given User is on the AdactinHotelApp login page
    When User should enter valid "<userName>" , "<passWord>" and click the login button
    Then User should search hotels with all valid details
      | location | hotels      | roomType | numberOfRooms | checkIn    | checkOut   | apr | cpr |
      | Sydney   | Hotel Creek | Double   |             2 | 05/04/2021 | 06/04/2021 |   2 |   2 |
    Then User should select hotel and click the continue button
    Then User should book hotel using valid user details and click book now
      | firstName | lastName | address        | crediCardNo        | creditCardType | expiryMonth | expiryYear | cvv |
      | sand      | kumar    | 18 kodambakkam | 987654321123456789 | AMEX           |          11 |       2021 | 123 |
    Then User should verify order id is displayed

    Examples: 
      | userName | passWord |
      | prakash0 | J5M3AD   |

   Scenario Outline: Verifying AdactinHotelApp booking functionality without passing any field
    Given User is on the AdactinHotelApp login page
    When User should enter valid "<userName>" , "<passWord>" and click the login button
    Then User should search hotels with all valid details
      | location | hotels      | roomType | numberOfRooms | checkIn    | checkOut   | apr | cpr |
      | Sydney   | Hotel Creek | Double   |             2 | 05/04/2021 | 06/04/2021 |   2 |   2 |
    Then User should select hotel and click the continue button
    Then User should click book now without passing any field
    Then User should verify "Please Enter your First Name","Please Enter you Last Name","Please Enter your Address","Please Enter your 16 Digit Credit Card Number","Please Select your Credit Card Type","Please Select your Credit Card Expiry Month","Please Enter your Credit Card CVV Number" is displayed

    Examples: 
      | userName | passWord |
      | prakash0 | J5M3AD   |