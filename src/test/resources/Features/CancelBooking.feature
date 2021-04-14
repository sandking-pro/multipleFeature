Feature: Verify AdactinHotelApp Cancel booking functionality

  #Scenario-1
  Scenario Outline: Verifying AdactinHotelApp navigated to Booked Itinerary page and verify cancelled order id
    Given User is on the AdactinHotelApp login page
    When User should enter valid "<userName>" , "<passWord>" and click the login button
    Then User should verify login "<userName>" and search hotels with valid details "<location>", "<hotels>", "<roomType>", "<numberOfRooms>","<checkIn>", "<checkOut>", "<adultPerRoom>" and "<childPerRoom>"
    Then User should select hotel and click continue button
    Then User should book hotel using valid user details "<firstName>", "<lastName>", "<address>" and click book now
      | creditCardNo       | creditCardType   | expiryMonth | expiryYear | cvv |
      | 987654321123456789 | American Express | June        |       2021 | 123 |
      | 551236321123456789 | VISA             | July        |       2021 | 777 |
      | 888777921123456789 | Master Card      | June        |       2021 | 888 |
    Then User should verify order id and click Booked Itinerary
    Then User should search order id clicks cancel order and click ok
    Then User should verify order "The booking has been cancelled" is displayed

    Examples: 
      | userName | passWord | location | hotels      | roomType | numberOfRooms | checkIn    | checkOut   | adultPerRoom | childPerRoom | firstName | lastName | address        |
      | prakash0 | J5M3AD   | Sydney   | Hotel Creek | Double   | 1 - One       | 13/04/2021 | 14/04/2021 | 1 - One      | 1 - One      | sand      | kumar    | 18 kodambakkam |
  
  #Scenario-2
  #Scenario Outline: Verifying AdactinHotelApp navigated to Booked Itinerary page and verify cancelled order id
    #Given User is on the AdactinHotelApp login page
    #When User should enter valid "<userName>" , "<passWord>" and click the login button
    #Then User should verify login and search hotels with valid details "<location>", "<hotels>", "<roomType>", "<numberOfRooms>","<checkIn>", "<checkOut>", "<adultPerRoom>" and "<childPerRoom>"
    #Then User should select hotel and click continue button
    #Then User should book hotel using valid user details and click book now
      #| creditCardNo       | creditCardType   | expiryMonth | expiryYear | cvv |
      #| 987654321123456789 | American Express | June        |       2021 | 123 |
      #| 551236321123456789 | VISA             | July        |       2021 | 777 |
      #| 888777921123456789 | Master Card      | June        |       2021 | 888 |
    #Then User should verify order id and click Booked Itinerary
    #Then User should click cancel order "<orderId>" and click ok
    #Then User should verify "The booking has been cancelled" is displayed
#
    #Examples: 
      #| userName | passWord | orderId    | location | hotels      | roomType | numberOfRooms | checkIn    | checkOut   | adultPerRoom | childPerRoom | firstName | lastName | address        |
      #| prakash0 | J5M3AD   | FI2MD6UG28 | Sydney   | Hotel Creek | Double   |             2 | 13/04/2021 | 14/04/2021 |            2 |            2 | sand      | kumar    | 18 kodambakkam |
