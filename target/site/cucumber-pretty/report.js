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
  "name": "that I am a \"driver\"",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "I have a route",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "I can create a ride",
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
  "duration": 90114720,
  "status": "passed"
});
formatter.match({
  "location": "AddRideStepDefinition.iHaveARoute()"
});
formatter.result({
  "duration": 73967483,
  "status": "passed"
});
formatter.match({
  "location": "AddRideStepDefinition.iCanCreateARide()"
});
formatter.result({
  "duration": 1774385,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "",
  "description": "",
  "id": "add-ride;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "that I am a \"driver\"",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I have a route",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I can create multiple rides",
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
  "duration": 105921,
  "status": "passed"
});
formatter.match({
  "location": "AddRideStepDefinition.iHaveARoute()"
});
formatter.result({
  "duration": 777577,
  "status": "passed"
});
formatter.match({
  "location": "AddRideStepDefinition.iCanCreateMultipleRides()"
});
formatter.result({
  "duration": 2739171,
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
  "name": "I have stop points",
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
  "duration": 66509,
  "status": "passed"
});
formatter.match({
  "location": "AddRouteStepDefinition.iHaveStopPoints()"
});
formatter.result({
  "duration": 45982,
  "status": "passed"
});
formatter.match({
  "location": "AddRouteStepDefinition.iShouldCreateARoute()"
});
formatter.result({
  "duration": 325564,
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
  "duration": 116185,
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
  "duration": 144102,
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
  "duration": 125628,
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
  "duration": 103047,
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
  "duration": 13959,
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
  "duration": 100995,
  "status": "passed"
});
formatter.match({
  "location": "SearchStopPointsStepDefinition.iWantToSearchStopPoints()"
});
formatter.result({
  "duration": 1007483,
  "status": "passed"
});
formatter.match({
  "location": "SearchStopPointsStepDefinition.iTypeInTheCriteriaAndSearchStopPoints()"
});
formatter.result({
  "duration": 216358,
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
  "duration": 130554,
  "status": "passed"
});
formatter.match({
  "location": "SeeRidesGivenStopPointStepDefinition.iSelectAStopPoint()"
});
formatter.result({
  "duration": 63224,
  "status": "passed"
});
formatter.match({
  "location": "SeeRidesGivenStopPointStepDefinition.iWantToSeeTheRidesAssociatedWithTheStopPoints()"
});
formatter.result({
  "duration": 17243,
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
  "duration": 100995,
  "status": "passed"
});
formatter.match({
  "location": "ShareRideStepDefinition.iHaveCreatedARide()"
});
formatter.result({
  "duration": 2734656,
  "status": "passed"
});
formatter.match({
  "location": "ShareRideStepDefinition.iCanShareMyRide()"
});
formatter.result({
  "duration": 2713718,
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
  "duration": 93605,
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
  "duration": 117006,
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
  "duration": 82520,
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
  "duration": 105921,
  "status": "passed"
});
formatter.match({
  "location": "ViewRideDetailsStepDefinition.iChooseARide()"
});
formatter.result({
  "duration": 68561,
  "status": "passed"
});
formatter.match({
  "location": "ViewRideDetailsStepDefinition.iWantToSeeTheDetailsOfTheRide()"
});
formatter.result({
  "duration": 25044,
  "status": "passed"
});
});