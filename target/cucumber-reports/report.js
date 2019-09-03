$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Booking.feature");
formatter.feature({
  "line": 2,
  "name": "Base Booking",
  "description": "",
  "id": "base-booking",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@BaseBooking"
    }
  ]
});
formatter.scenarioOutline({
  "line": 9,
  "name": "Validate sum of two numbers",
  "description": "",
  "id": "base-booking;validate-sum-of-two-numbers",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 10,
  "name": "I have a \u003cnumberA\u003e",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "I have another \u003cnumberB\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I add the two numbers",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "the result of the sum is \u003cresult\u003e",
  "keyword": "Then "
});
formatter.examples({
  "line": 15,
  "name": "",
  "description": "",
  "id": "base-booking;validate-sum-of-two-numbers;",
  "rows": [
    {
      "cells": [
        "numberA",
        "numberB",
        "result"
      ],
      "line": 17,
      "id": "base-booking;validate-sum-of-two-numbers;;1"
    },
    {
      "cells": [
        "1",
        "2",
        "3"
      ],
      "line": 18,
      "id": "base-booking;validate-sum-of-two-numbers;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 10655337301,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "User should not be logged in to Travelocity",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I select the url of the Travelocity Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I go to the url of the Travelocity Home page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I should not be logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "BackgroundStepsDefinitions.getUrlOfTravelocityHomePage()"
});
formatter.result({
  "duration": 229608400,
  "status": "passed"
});
formatter.match({
  "location": "BackgroundStepsDefinitions.goToUrlOfTravelocityHomePage()"
});
formatter.result({
  "duration": 23091163400,
  "status": "passed"
});
formatter.match({
  "location": "BackgroundStepsDefinitions.secureThatNoUserIsLoggedInToTravelocity()"
});
formatter.result({
  "duration": 20492588099,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Validate sum of two numbers",
  "description": "",
  "id": "base-booking;validate-sum-of-two-numbers;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@BaseBooking"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "I have a 1",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "I have another 2",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I add the two numbers",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "the result of the sum is 3",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 9
    }
  ],
  "location": "BaseStepDefinition.getFirstNumber(int)"
});
formatter.result({
  "duration": 21356501,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 15
    }
  ],
  "location": "BaseStepDefinition.getSecondNumber(int)"
});
formatter.result({
  "duration": 702601,
  "status": "passed"
});
formatter.match({
  "location": "BaseStepDefinition.addTwoNumbers()"
});
formatter.result({
  "duration": 434800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 25
    }
  ],
  "location": "BaseStepDefinition.validateSum(int)"
});
formatter.result({
  "duration": 6141600,
  "status": "passed"
});
formatter.after({
  "duration": 3219990700,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 20,
  "name": "Validate the substraction between numbers",
  "description": "",
  "id": "base-booking;validate-the-substraction-between-numbers",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 21,
  "name": "I have a \u003cnumberA\u003e",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "I substract a \u003cnumberB\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "the result of the substraction is \u003cresult\u003e",
  "keyword": "Then "
});
formatter.examples({
  "line": 25,
  "name": "",
  "description": "",
  "id": "base-booking;validate-the-substraction-between-numbers;",
  "rows": [
    {
      "cells": [
        "numberA",
        "numberB",
        "result"
      ],
      "line": 27,
      "id": "base-booking;validate-the-substraction-between-numbers;;1"
    },
    {
      "cells": [
        "5",
        "1",
        "4"
      ],
      "line": 28,
      "id": "base-booking;validate-the-substraction-between-numbers;;2"
    },
    {
      "cells": [
        "3",
        "10",
        "-7"
      ],
      "line": 29,
      "id": "base-booking;validate-the-substraction-between-numbers;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 7226969100,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "User should not be logged in to Travelocity",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I select the url of the Travelocity Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I go to the url of the Travelocity Home page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I should not be logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "BackgroundStepsDefinitions.getUrlOfTravelocityHomePage()"
});
formatter.result({
  "duration": 323400,
  "status": "passed"
});
formatter.match({
  "location": "BackgroundStepsDefinitions.goToUrlOfTravelocityHomePage()"
});
formatter.result({
  "duration": 8764666701,
  "status": "passed"
});
formatter.match({
  "location": "BackgroundStepsDefinitions.secureThatNoUserIsLoggedInToTravelocity()"
});
formatter.result({
  "duration": 20079482100,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "Validate the substraction between numbers",
  "description": "",
  "id": "base-booking;validate-the-substraction-between-numbers;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@BaseBooking"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "I have a 5",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "I substract a 1",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "the result of the substraction is 4",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 9
    }
  ],
  "location": "BaseStepDefinition.getFirstNumber(int)"
});
formatter.result({
  "duration": 508999,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 14
    }
  ],
  "location": "BaseStepDefinition.substractTwoNumbers(int)"
});
formatter.result({
  "duration": 744300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "4",
      "offset": 34
    }
  ],
  "location": "BaseStepDefinition.validateSubstraction(int)"
});
formatter.result({
  "duration": 686900,
  "status": "passed"
});
formatter.after({
  "duration": 2606413101,
  "status": "passed"
});
formatter.before({
  "duration": 7073805701,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "User should not be logged in to Travelocity",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I select the url of the Travelocity Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I go to the url of the Travelocity Home page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I should not be logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "BackgroundStepsDefinitions.getUrlOfTravelocityHomePage()"
});
formatter.result({
  "duration": 319300,
  "status": "passed"
});
formatter.match({
  "location": "BackgroundStepsDefinitions.goToUrlOfTravelocityHomePage()"
});
formatter.result({
  "duration": 10962512901,
  "status": "passed"
});
formatter.match({
  "location": "BackgroundStepsDefinitions.secureThatNoUserIsLoggedInToTravelocity()"
});
formatter.result({
  "duration": 20082224001,
  "status": "passed"
});
formatter.scenario({
  "line": 29,
  "name": "Validate the substraction between numbers",
  "description": "",
  "id": "base-booking;validate-the-substraction-between-numbers;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@BaseBooking"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "I have a 3",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "I substract a 10",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "the result of the substraction is -7",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 9
    }
  ],
  "location": "BaseStepDefinition.getFirstNumber(int)"
});
formatter.result({
  "duration": 719001,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "10",
      "offset": 14
    }
  ],
  "location": "BaseStepDefinition.substractTwoNumbers(int)"
});
formatter.result({
  "duration": 519800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "-7",
      "offset": 34
    }
  ],
  "location": "BaseStepDefinition.validateSubstraction(int)"
});
formatter.result({
  "duration": 398200,
  "status": "passed"
});
formatter.after({
  "duration": 2511782400,
  "status": "passed"
});
});