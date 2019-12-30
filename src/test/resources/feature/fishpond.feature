Feature: purchase the prouct

  Scenario Outline: User want to purchase product from fishpond website
    Given User is on fishpond page
    When User clicks sigin
    And User enters "<Username>" and "<password>" and clicks sigin button
    And user enters "<products>" and click search
    And User select the product and add the product to cart
    And user clicks the checkout and make payment
    And user clicks the confirm order
    Then User navigates to payment page

    Examples: 
      | username    | password    | products    |
      | vignesharun | sivaamuthan | Story books |
