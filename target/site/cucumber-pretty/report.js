$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("addRide.feature");
formatter.feature({
  "line": 1,
  "name": "Add Ride",
  "description": "",
  "id": "add-ride",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Add a Ride",
  "description": "",
  "id": "add-ride;add-a-ride",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "that I am using a \"driver\" account",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "I have a route called \"Route 1\"",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "a vehicle called \"car\"",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "I can create a ride called \"Ride 1\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "driver",
      "offset": 19
    }
  ],
  "location": "AddRideStepDefinition.thatIAmUsingAAccount(String)"
});
formatter.result({
  "duration": 157563944,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Route 1",
      "offset": 23
    }
  ],
  "location": "AddRideStepDefinition.iHaveARouteCalled(String)"
});
formatter.result({
  "duration": 11386529,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "car",
      "offset": 18
    }
  ],
  "location": "AddRideStepDefinition.aVehicleCalled(String)"
});
formatter.result({
  "duration": 875697,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ride 1",
      "offset": 28
    }
  ],
  "location": "AddRideStepDefinition.iCanCreateARideCalled(String)"
});
formatter.result({
  "duration": 1566238,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Add Multiple Rides",
  "description": "",
  "id": "add-ride;add-multiple-rides",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "that I am using a \"driver\" account",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I have a route called \"Route 1\"",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "a vehicle called \"car\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I can create multiple rides called \"Ride 1\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "driver",
      "offset": 19
    }
  ],
  "location": "AddRideStepDefinition.thatIAmUsingAAccount(String)"
});
formatter.result({
  "duration": 234422,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Route 1",
      "offset": 23
    }
  ],
  "location": "AddRideStepDefinition.iHaveARouteCalled(String)"
});
formatter.result({
  "duration": 669192,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "car",
      "offset": 18
    }
  ],
  "location": "AddRideStepDefinition.aVehicleCalled(String)"
});
formatter.result({
  "duration": 64045,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ride 1",
      "offset": 36
    }
  ],
  "location": "AddRideStepDefinition.iCanCreateMultipleRidesCalled(String)"
});
formatter.result({
  "duration": 1902065,
  "status": "passed"
});
formatter.uri("addRoute.feature");
formatter.feature({
  "line": 1,
  "name": "Add Route",
  "description": "",
  "id": "add-route",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Add a Route",
  "description": "",
  "id": "add-route;add-a-route",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "that I am a \"driver\"",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "I have 2 stop points",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "I should create a route",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "driver",
      "offset": 13
    }
  ],
  "location": "AddVehicleStepDefinition.thatIAmA(String)"
});
formatter.result({
  "duration": 189262,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 7
    }
  ],
  "location": "AddRouteStepDefinition.iHaveStopPoints(int)"
});
formatter.result({
  "duration": 1106836,
  "status": "passed"
});
formatter.match({
  "location": "AddRouteStepDefinition.iShouldCreateARoute()"
});
formatter.result({
  "duration": 800567,
  "status": "passed"
});
formatter.uri("addVehicle.feature");
formatter.feature({
  "line": 1,
  "name": "Add Vehicle",
  "description": "",
  "id": "add-vehicle",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Add a Car",
  "description": "",
  "id": "add-vehicle;add-a-car",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "that I am a \"driver\"",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "I add \"car\"",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "the \"car\" should be added to the \"account\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "driver",
      "offset": 13
    }
  ],
  "location": "AddVehicleStepDefinition.thatIAmA(String)"
});
formatter.result({
  "duration": 121112,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "car",
      "offset": 7
    }
  ],
  "location": "AddVehicleStepDefinition.iAdd(String)"
});
formatter.result({
  "duration": 122754,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "car",
      "offset": 5
    },
    {
      "val": "account",
      "offset": 34
    }
  ],
  "location": "AddVehicleStepDefinition.theShouldBeAddedToThe(String,String)"
});
formatter.result({
  "duration": 141228,
  "status": "passed"
});
formatter.uri("bookRide.feature");
formatter.feature({
  "line": 1,
  "name": "Book a Ride",
  "description": "",
  "id": "book-a-ride",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Book a Ride",
  "description": "",
  "id": "book-a-ride;book-a-ride",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "that I am a \"passenger\"",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "I want to book a ride",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "I assign myself to a shared ride",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "passenger",
      "offset": 13
    }
  ],
  "location": "AddVehicleStepDefinition.thatIAmA(String)"
});
formatter.result({
  "duration": 104279,
  "status": "passed"
});
formatter.match({
  "location": "BookRideStepDefinition.iWantToBookARide()"
});
formatter.result({
  "duration": 68562,
  "status": "passed"
});
formatter.match({
  "location": "BookRideStepDefinition.iAssignMyselfToASharedRide()"
});
formatter.result({
  "duration": 33254,
  "status": "passed"
});
formatter.uri("searchStopPoints.feature");
formatter.feature({
  "line": 1,
  "name": "Searching Stop Points",
  "description": "",
  "id": "searching-stop-points",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Search Stop Points",
  "description": "",
  "id": "searching-stop-points;search-stop-points",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "I am a \"user\"",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "I want to search stop points",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "I type in the criteria and search stop points",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "user",
      "offset": 8
    }
  ],
  "location": "SearchStopPointsStepDefinition.iAmA(String)"
});
formatter.result({
  "duration": 135070,
  "status": "passed"
});
formatter.match({
  "location": "SearchStopPointsStepDefinition.iWantToSearchStopPoints()"
});
formatter.result({
  "duration": 1183197,
  "status": "passed"
});
formatter.match({
  "location": "SearchStopPointsStepDefinition.iTypeInTheCriteriaAndSearchStopPoints()"
});
formatter.result({
  "duration": 330901,
  "status": "passed"
});
formatter.uri("seeRidesGivenStopPoint.feature");
formatter.feature({
  "line": 1,
  "name": "See Rides Given a Stop Point",
  "description": "",
  "id": "see-rides-given-a-stop-point",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "See Rides Given a Stop Point",
  "description": "",
  "id": "see-rides-given-a-stop-point;see-rides-given-a-stop-point",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "that I am a \"passenger\"",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "I select a stop point",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "I want to see the rides associated with the stop points",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "passenger",
      "offset": 13
    }
  ],
  "location": "AddVehicleStepDefinition.thatIAmA(String)"
});
formatter.result({
  "duration": 93194,
  "status": "passed"
});
formatter.match({
  "location": "SeeRidesGivenStopPointStepDefinition.iSelectAStopPoint()"
});
formatter.result({
  "duration": 64456,
  "status": "passed"
});
formatter.match({
  "location": "SeeRidesGivenStopPointStepDefinition.iWantToSeeTheRidesAssociatedWithTheStopPoints()"
});
formatter.result({
  "duration": 28738,
  "status": "passed"
});
formatter.uri("shareRide.feature");
formatter.feature({
  "line": 1,
  "name": "Share Ride",
  "description": "",
  "id": "share-ride",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Share a Ride",
  "description": "",
  "id": "share-ride;share-a-ride",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "that I am a \"driver\"",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "I have created a ride",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "I can share my ride",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "driver",
      "offset": 13
    }
  ],
  "location": "AddVehicleStepDefinition.thatIAmA(String)"
});
formatter.result({
  "duration": 74309,
  "status": "passed"
});
formatter.match({
  "location": "ShareRideStepDefinition.iHaveCreatedARide()"
});
formatter.result({
  "duration": 1771922,
  "status": "passed"
});
formatter.match({
  "location": "ShareRideStepDefinition.iCanShareMyRide()"
});
formatter.result({
  "duration": 2308918,
  "status": "passed"
});
formatter.uri("stopPoints.feature");
formatter.feature({
  "line": 1,
  "name": "Stop Points",
  "description": "",
  "id": "stop-points",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Add a Stop Point",
  "description": "",
  "id": "stop-points;add-a-stop-point",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "that I am a \"driver\"",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "I add \"76 Happy Lane\" as a stop point",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "the stop point with address \"76 Happy Lane\" is created",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "driver",
      "offset": 13
    }
  ],
  "location": "AddVehicleStepDefinition.thatIAmA(String)"
});
formatter.result({
  "duration": 70203,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "76 Happy Lane",
      "offset": 7
    }
  ],
  "location": "StopPointsStepDefinition.iAddAsAStopPoint(String)"
});
formatter.result({
  "duration": 113722,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "76 Happy Lane",
      "offset": 29
    }
  ],
  "location": "StopPointsStepDefinition.theStopPointWithAddressIsCreated(String)"
});
formatter.result({
  "duration": 97711,
  "status": "passed"
});
formatter.uri("viewRideDetails.feature");
formatter.feature({
  "line": 1,
  "name": "Viewing Ride Details",
  "description": "",
  "id": "viewing-ride-details",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Viewing Ride Details",
  "description": "",
  "id": "viewing-ride-details;viewing-ride-details",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "that I am a \"passenger\"",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "I choose a ride",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "I want to see the details of the ride",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "passenger",
      "offset": 13
    }
  ],
  "location": "AddVehicleStepDefinition.thatIAmA(String)"
});
formatter.result({
  "duration": 83752,
  "status": "passed"
});
formatter.match({
  "location": "ViewRideDetailsStepDefinition.iChooseARide()"
});
formatter.result({
  "duration": 94837,
  "status": "passed"
});
formatter.match({
  "location": "ViewRideDetailsStepDefinition.iWantToSeeTheDetailsOfTheRide()"
});
formatter.result({
  "duration": 19296,
  "status": "passed"
});
});