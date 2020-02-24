@executeAllOffers @Tests
Feature: Cluno offers
Cluno getting the offers  

@getAllOfferAvailableSet @TestScenario1
Scenario: Test scenario one -Cluno get all offers and verify the available set to true for all offers
Given fetch the "https://api.cluno.com/offerservice/v1/offer" for the cluno with the endpoint "/query"
And Execute the webservice for the get method
Then verify the response code and response with available set to true for all offers


@getAllOfferEnviro @TestScenario2
Scenario: Test scenario two - Cluno get all offers and verify the fuel type or emmission label and environmentFriendly
Given fetch the "https://api.cluno.com/offerservice/v1/offer" for the cluno with the endpoint "/query"
And Execute the webservice for the get method
Then verify the response code and response if environmentFriendly is true only for cars with fuelType electric or Hybrid or with emissionLabel A

@getAllOfferEstim @TestScenario3
Scenario: Test Scenario three - Cluno get all offers and verify the isAvailableAtShortNotice and estimatedDeliveryTime
Given fetch the "https://api.cluno.com/offerservice/v1/offer" for the cluno with the endpoint "/query"
And Execute the webservice for the get method
Then verify the response code and response for all offers if isAvailableAtShortNotice is set to true and verify the estimatedDeliveryTime as "innerhalb von 2 Wochen" for the same


@getASpecificOffer @TestScenario4
Scenario: Test scenario four -Cluno get specific offers and verify the isAvailableAtShortNotice and estimatedDeliveryTime
Given fetch the "https://api.cluno.com/offerservice/v1/offer" for the cluno with the endpoint "/117"
And Execute the webservice for the get method
Then verify the response code and response if isAvailableAtShortNotice is set to true and verify the estimatedDeliveryTime as "innerhalb von 2 Wochen" for the same

@getASpecificOffer @TestScenario5
Scenario: Test scenario two - Cluno get all offers and verify the fuel type or emmission label and environmentFriendly
Given fetch the "https://api.cluno.com/offerservice/v1/offer" for the cluno with the endpoint "/117"
And Execute the webservice for the get method
Then verify the response code for specific offer and response if environmentFriendly is true only for cars with fuelType electric or Hybrid or with emissionLabel A





