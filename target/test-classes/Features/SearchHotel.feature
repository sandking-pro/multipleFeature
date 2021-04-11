Feature: Verify AdactinHotelApp Search Hotels functionality

  Scenario Outline: Verifying AdactinHotelApp navigated to select hotel page by giving valid details
    Given User is on the AdactinHotelApp login page
    When User should enter valid "<userName>" , "<passWord>" and click the login button
    Then User should search hotels with all valid details
      | location | hotels      | roomType | numberOfRooms | checkIn    | checkOut   | apr | cpr |
      | Sydney   | Hotel Creek | Double   |             2 | 05/04/2021 | 06/04/2021 |   2 |   2 |
    Then User should verify "Select Hotel" is displayed

    Examples: 
      | userName | passWord |
      | prakash0 | J5M3AD   |

  Scenario Outline: Verifying AdactinHotelApp navigated to select hotel page by giving mandatory fields
    Given User is on the AdactinHotelApp login page
    When User should enter valid "<userName>" , "<passWord>" and click the login button
    Then User should verify login and search hotels using only mandatory details
      | location | numberOfRooms | checkIn    | checkOut   | apr |
      | Sydney   |             2 | 05/04/2021 | 06/04/2021 |   2 |
    Then User should verify "Select Hotel" is displayed

    Examples: 
      | userName | passWord |
      | prakash0 | J5M3AD   |

  Scenario Outline: Verifying AdactinHotelApp search functionality with invalid checkin and checkout date
    Given User is on the AdactinHotelApp login page
    When User should enter valid "<userName>" , "<passWord>" and click the login button
    Then User should verify login and search hotels using only mandatory details other than invalid checkin and checkout date
      | location | numberOfRooms | checkIn    | checkOut   | apr |
      | Sydney   |             2 | 22/04/2021 | 01/04/2021 |   2 |
    Then User should verify "before than Check-Out Date" and "after than Check-In Date" is displayed

    Examples: 
      | userName | passWord |
      | prakash0 | J5M3AD   |

  Scenario Outline: Verifying AdactinHotelApp search functionality without selecting location
    Given User is on the AdactinHotelApp login page
    When User should enter "<userName>" , "<passWord>" and click the login button
    Then User should verify login and search hotels without selecting location
      | hotels      | roomType | numberOfRooms | checkIn    | checkOut   | apr | cpr |
      | Hotel Creek | Double   |             2 | 05/04/2021 | 06/04/2021 |   2 |   2 |
    Then User should verify "Please Select a Location" is displayed

    Examples: 
      | userName | passWord |
      | prakash0 | J5M3AD   |
