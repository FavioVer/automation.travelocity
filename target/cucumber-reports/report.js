$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Booking.feature");
formatter.feature({
  "line": 2,
  "name": "Login",
  "description": "",
  "id": "login",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Login"
    }
  ]
});
formatter.before({
  "duration": 7063127900,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "",
  "description": "User that is not logged into Travelocity should not be able to see the profile icon",
  "id": "login;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I select the url of the Travelocity Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I go to the url of the Travelocity Home page",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I should not be able to see the profile icon",
  "keyword": "Then "
});
formatter.match({
  "location": "BasicStepsDefinitions.getUrlOfTravelocityHomePage()"
});
});