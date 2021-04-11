Feature: Verify AdactinHotelApp Cancel booking functionality

  Scenario Outline: Verifying AdactinHotelApp navigated to Booked Itinerary page and verify order id
    Given User is on the AdactinHotelApp login page
    When User should enter valid "<userName>" , "<passWord>" and click the login button
    Then User should search hotels with all valid details
      | location | hotels      | roomType | numberOfRooms | checkIn    | checkOut   | apr | cpr |
      | Sydney   | Hotel Creek | Double   |             2 | 05/04/2021 | 06/04/2021 |   2 |   2 |
    Then User should select hotel and click the continue button
    Then User should book hotel using valid user details and click book now
      | firstName | lastName | address        | crediCardNo        | creditCardType | expiryMonth | expiryYear | cvv |
      | sand      | kumar    | 18 kodambakkam | 987654321123456789 | AMEX           |          11 |       2021 | 123 |
    Then User should verify order id and click Booked Itinerary
    Then User sould click cancel order and click ok

    Examples: 
      | userName | passWord |
      | prakash0 | J5M3AD   |

  Scenario Outline: Verifying AdactinHotelApp navigated to Booked Itinerary page and verify order id
    Given User is on the AdactinHotelApp login page
    When User should enter valid "<userName>" , "<passWord>" and click the login button
    Then User should search hotels with all valid details
      | location | hotels      | roomType | numberOfRooms | checkIn    | checkOut   | apr | cpr |
      | Sydney   | Hotel Creek | Double   |             2 | 05/04/2021 | 06/04/2021 |   2 |   2 |
    Then User should select hotel and click the continue button
    Then User should book hotel using valid user details and click book now
      | firstName | lastName | address        | crediCardNo        | creditCardType | expiryMonth | expiryYear | cvv |
      | sand      | kumar    | 18 kodambakkam | 987654321123456789 | AMEX           |          11 |       2021 | 123 |
    Then User should verify order id and click Booked Itinerary
    Then User sould click cancel order no "S0YZ23AEJL" and click ok

    Examples: 
      | userName | passWord |
      | prakash0 | J5M3AD   |
