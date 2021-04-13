Feature: Verify AdactinHotelApp Search Hotels functionality

  #Scenario-1
  Scenario Outline: Verifying AdactinHotelApp navigated to select hotel page by giving valid details
    Given User is on the AdactinHotelApp login page
    When User should enter valid "<userName>" , "<passWord>" and click the login button
    Then User should verify login "<userName>" and search hotels with valid details "<location>", "<hotels>", "<roomType>", "<numberOfRooms>","<checkIn>", "<checkOut>", "<adultPerRoom>" and "<childPerRoom>"
    Then User should verify "Select Hotel" is displayed

    Examples: 
      | userName | passWord | location | hotels      | roomType | numberOfRooms | checkIn    | checkOut   | adultPerRoom | childPerRoom |
      | prakash0 | J5M3AD   | Sydney   | Hotel Creek | Double   | 1 - One       | 13/04/2021 | 14/04/2021 | 1 - One      | 1 - One      |

  #Scenario-2
  Scenario Outline: Verifying AdactinHotelApp navigated to select hotel page by giving mandatory fields
    Given User is on the AdactinHotelApp login page
    When User should enter valid "<userName>" , "<passWord>" and click the login button
    Then User should verify login "<userName>" and search hotels with mandatory details "<location>", "<numberOfRooms>","<checkIn>", "<checkOut>" and "<adultPerRoom>"
    Then User should verify "Select Hotel" is displayed

    Examples: 
      | userName | passWord | location | numberOfRooms | checkIn    | checkOut   | adultPerRoom |
      | prakash0 | J5M3AD   | Sydney   | 1 - One       | 13/04/2021 | 14/04/2021 | 1 - One      |

  #Scenario-3
  Scenario Outline: Verifying AdactinHotelApp search functionality with invalid checkin and checkout date
    Given User is on the AdactinHotelApp login page
    When User should enter valid "<userName>" , "<passWord>" and click the login button
    Then User should verify login "<userName>" and search hotels using invalid checkin and checkout date "<location>", "<numberOfRooms>","<checkIn>", "<checkOut>" and "<adultPerRoom>"
    Then User should verify "Check-In Date shall be before than Check-Out Date" and "Check-Out Date shall be after than Check-In Date" is displayed

    Examples: 
      | userName | passWord | location | numberOfRooms | checkIn    | checkOut   | adultPerRoom |
      | prakash0 | J5M3AD   | Sydney   | 1 - One       | 14/04/2021 | 13/04/2021 | 1 - One      |

  #Scenario-4
  Scenario Outline: Verifying AdactinHotelApp search functionality without selecting location
    Given User is on the AdactinHotelApp login page
    When User should enter valid "<userName>" , "<passWord>" and click the login button
    Then User should verify login "<userName>" and search hotels without selecting location
    Then User should verify error "Please Select a Location" is displayed

    Examples: 
      | userName | passWord |
      | prakash0 | J5M3AD   |
