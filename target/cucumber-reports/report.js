$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("cluno.feature");
formatter.feature({
  "line": 2,
  "name": "Cluno offers",
  "description": "Cluno getting the offers",
  "id": "cluno-offers",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@executeAllOffers"
    },
    {
      "line": 1,
      "name": "@Tests"
    }
  ]
});
formatter.scenario({
  "line": 6,
  "name": "Test scenario one -Cluno get all offers and verify the available set to true for all offers",
  "description": "",
  "id": "cluno-offers;test-scenario-one--cluno-get-all-offers-and-verify-the-available-set-to-true-for-all-offers",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@getAllOfferAvailableSet"
    },
    {
      "line": 5,
      "name": "@TestScenario1"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "fetch the \"https://api.cluno.com/offerservice/v1/offer\" for the cluno with the endpoint \"/query\"",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Execute the webservice for the get method",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "verify the response code and response with available set to true for all offers",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://api.cluno.com/offerservice/v1/offer",
      "offset": 11
    },
    {
      "val": "/query",
      "offset": 89
    }
  ],
  "location": "getOffersStepDefinition.fetch_the_for_the_cluno_with_the_endpoint(String,String)"
});
formatter.result({
  "duration": 1200130100,
  "status": "passed"
});
formatter.match({
  "location": "getOffersStepDefinition.execute_the_webservice_for_the_get_method()"
});
formatter.result({
  "duration": 2090193700,
  "status": "passed"
});
formatter.match({
  "location": "getOffersStepDefinition.verify_the_response_code_and_response_with_available_set_to_true_for_all_offers()"
});
formatter.result({
  "duration": 4943018900,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Test scenario two - Cluno get all offers and verify the fuel type or emmission label and environmentFriendly",
  "description": "",
  "id": "cluno-offers;test-scenario-two---cluno-get-all-offers-and-verify-the-fuel-type-or-emmission-label-and-environmentfriendly",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@getAllOfferEnviro"
    },
    {
      "line": 12,
      "name": "@TestScenario2"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "fetch the \"https://api.cluno.com/offerservice/v1/offer\" for the cluno with the endpoint \"/query\"",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "Execute the webservice for the get method",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "verify the response code and response if environmentFriendly is true only for cars with fuelType electric or Hybrid or with emissionLabel A",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://api.cluno.com/offerservice/v1/offer",
      "offset": 11
    },
    {
      "val": "/query",
      "offset": 89
    }
  ],
  "location": "getOffersStepDefinition.fetch_the_for_the_cluno_with_the_endpoint(String,String)"
});
formatter.result({
  "duration": 820600,
  "status": "passed"
});
formatter.match({
  "location": "getOffersStepDefinition.execute_the_webservice_for_the_get_method()"
});
formatter.result({
  "duration": 307905900,
  "status": "passed"
});
formatter.match({
  "location": "getOffersStepDefinition.verify_the_response_code_and_response_if_environmentFriendly_is_true_only_for_cars_with_fuelType_electric_or_Hybrid_or_with_emissionLabel_A()"
});
formatter.result({
  "duration": 14551785800,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Test Scenario three - Cluno get all offers and verify the isAvailableAtShortNotice and estimatedDeliveryTime",
  "description": "",
  "id": "cluno-offers;test-scenario-three---cluno-get-all-offers-and-verify-the-isavailableatshortnotice-and-estimateddeliverytime",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 18,
      "name": "@getAllOfferEstim"
    },
    {
      "line": 18,
      "name": "@TestScenario3"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "fetch the \"https://api.cluno.com/offerservice/v1/offer\" for the cluno with the endpoint \"/query\"",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "Execute the webservice for the get method",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "verify the response code and response for all offers if isAvailableAtShortNotice is set to true and verify the estimatedDeliveryTime as \"innerhalb von 2 Wochen\" for the same",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://api.cluno.com/offerservice/v1/offer",
      "offset": 11
    },
    {
      "val": "/query",
      "offset": 89
    }
  ],
  "location": "getOffersStepDefinition.fetch_the_for_the_cluno_with_the_endpoint(String,String)"
});
formatter.result({
  "duration": 381600,
  "status": "passed"
});
formatter.match({
  "location": "getOffersStepDefinition.execute_the_webservice_for_the_get_method()"
});
formatter.result({
  "duration": 360229900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "innerhalb von 2 Wochen",
      "offset": 137
    }
  ],
  "location": "getOffersStepDefinition.verify_the_response_code_and_response_for_all_offers_if_isAvailableAtShortNotice_is_set_to_true_and_verify_the_estimatedDeliveryTime_as_for_the_same(String)"
});
formatter.result({
  "duration": 28075762500,
  "status": "passed"
});
formatter.scenario({
  "line": 26,
  "name": "Test scenario four -Cluno get specific offers and verify the isAvailableAtShortNotice and estimatedDeliveryTime",
  "description": "",
  "id": "cluno-offers;test-scenario-four--cluno-get-specific-offers-and-verify-the-isavailableatshortnotice-and-estimateddeliverytime",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 25,
      "name": "@getASpecificOffer"
    },
    {
      "line": 25,
      "name": "@TestScenario4"
    }
  ]
});
formatter.step({
  "line": 27,
  "name": "fetch the \"https://api.cluno.com/offerservice/v1/offer\" for the cluno with the endpoint \"/117\"",
  "keyword": "Given "
});
formatter.step({
  "line": 28,
  "name": "Execute the webservice for the get method",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "verify the response code and response if isAvailableAtShortNotice is set to true and verify the estimatedDeliveryTime as \"innerhalb von 2 Wochen\" for the same",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://api.cluno.com/offerservice/v1/offer",
      "offset": 11
    },
    {
      "val": "/117",
      "offset": 89
    }
  ],
  "location": "getOffersStepDefinition.fetch_the_for_the_cluno_with_the_endpoint(String,String)"
});
formatter.result({
  "duration": 313200,
  "status": "passed"
});
formatter.match({
  "location": "getOffersStepDefinition.execute_the_webservice_for_the_get_method()"
});
formatter.result({
  "duration": 257821300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "innerhalb von 2 Wochen",
      "offset": 122
    }
  ],
  "location": "getOffersStepDefinition.verify_the_response_code_and_response_if_isAvailableAtShortNotice_is_set_to_true_and_verify_the_estimatedDeliveryTime_as_for_the_same(String)"
});
formatter.result({
  "duration": 14349200,
  "status": "passed"
});
formatter.scenario({
  "line": 32,
  "name": "Test scenario two - Cluno get all offers and verify the fuel type or emmission label and environmentFriendly",
  "description": "",
  "id": "cluno-offers;test-scenario-two---cluno-get-all-offers-and-verify-the-fuel-type-or-emmission-label-and-environmentfriendly",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 31,
      "name": "@getASpecificOffer"
    },
    {
      "line": 31,
      "name": "@TestScenario5"
    }
  ]
});
formatter.step({
  "line": 33,
  "name": "fetch the \"https://api.cluno.com/offerservice/v1/offer\" for the cluno with the endpoint \"/117\"",
  "keyword": "Given "
});
formatter.step({
  "line": 34,
  "name": "Execute the webservice for the get method",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "verify the response code for specific offer and response if environmentFriendly is true only for cars with fuelType electric or Hybrid or with emissionLabel A",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://api.cluno.com/offerservice/v1/offer",
      "offset": 11
    },
    {
      "val": "/117",
      "offset": 89
    }
  ],
  "location": "getOffersStepDefinition.fetch_the_for_the_cluno_with_the_endpoint(String,String)"
});
formatter.result({
  "duration": 375200,
  "status": "passed"
});
formatter.match({
  "location": "getOffersStepDefinition.execute_the_webservice_for_the_get_method()"
});
formatter.result({
  "duration": 206694800,
  "status": "passed"
});
formatter.match({
  "location": "getOffersStepDefinition.verify_the_response_code_for_specific_offer_and_response_if_environmentFriendly_is_true_only_for_cars_with_fuelType_electric_or_Hybrid_or_with_emissionLabel_A()"
});
formatter.result({
  "duration": 31271000,
  "status": "passed"
});
});