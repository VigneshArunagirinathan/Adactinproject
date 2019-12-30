Feature: Order id

  Background: 
    Given user is on Adactin page

  @Func1
  Scenario Outline: To booking room and enter order Id
    When user enters "<username>" and "<password>" and clicks the login button
    And user enters "<location>","<hotel>","<roomtype>","<number of rooms>","<check in date>","<check out date>","<adults per room>","<child per room>"
    And select the hotel and click the continue button
    And user enter the "<firstname>","<lastname>","<address>","<credit card no>","<credit card type>","<expired date>","<expired year>","<cvv no>" click the book now button
    Then verify the url

    Examples: 
      | username    | password    | location  | hotel       | roomtype | number of rooms | check in date | check out date | adults per room | child per room | firstname | lastname | address            | credit card no   | credit card type | expired date | expired year | cvv no |
      | vignesharun | sivaamuthan | Melbourne | Hotel Creek | Deluxe   | 2 - Two         | 23/12/2019    | 2/12/2019      | 2 - Two         | 2 - Two        | vignesh   | vicky    | echennai           | 9876543212345677 | VISA             | June         |         2022 |    943 |
      | vignesharun | sivaamuthan | London    | Hotel Creek | Deluxe   | 4 - Four        | 23/12/2019    | 2/12/2019      | 3 - Three       | 2 - Two        | vignesh   | vicky    | thanjavur          | 9876543212345677 | VISA             | June         |         2022 |    943 |
      | vignesharun |       12345 | Melbourne | Hotel Creek | Deluxe   | 2 - Two         | 23/12/2019    | 2/12/2019      | 2 - Two         | 2 - Two        | vignesh   | vicky    | ertyuiodfghjkcvbnm | 9876543212345677 | VISA             | June         |         2022 |    943 |

  @Retest
  Scenario: To cancel the hotel
    When user clicks Booked Itinerary
    And user clicks the check box
    And user clicks cancelSelected button
    Then user verify the message cancel get succesfull
