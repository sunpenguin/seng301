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
  "duration": 182703397,
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
  "duration": 13392052,
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
  "duration": 950828,
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
  "duration": 1915614,
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
  "duration": 264803,
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
  "duration": 1080561,
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
  "duration": 82520,
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
  "duration": 2960457,
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
  "name": "Add a Route 2 Stop Points",
  "description": "",
  "id": "add-route;add-a-route-2-stop-points",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "that I am a using a \"driver\" account",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "I have a StopPoint called \"122B Walker Road\"",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "I have a StopPoint called \"2 Head Lane\"",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "I can create a route called \"Route\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "driver",
      "offset": 21
    }
  ],
  "location": "AddRouteStepDefinition.thatIAmAUsingAAccount(String)"
});
formatter.result({
  "duration": 417527,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "122B Walker Road",
      "offset": 27
    }
  ],
  "location": "AddRouteStepDefinition.iHaveAStopPointCalled(String)"
});
formatter.result({
  "duration": 187620,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2 Head Lane",
      "offset": 27
    }
  ],
  "location": "AddRouteStepDefinition.iHaveAStopPointCalled(String)"
});
formatter.result({
  "duration": 132607,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Route",
      "offset": 29
    }
  ],
  "location": "AddRouteStepDefinition.iCanCreateARouteCalled(String)"
});
formatter.result({
  "duration": 805494,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Add a Route 1 Stop Point",
  "description": "",
  "id": "add-route;add-a-route-1-stop-point",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "that I am a using a \"driver\" account",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I have a StopPoint called \"76 Jackson Street\"",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I can create a route called \"Route\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "driver",
      "offset": 21
    }
  ],
  "location": "AddRouteStepDefinition.thatIAmAUsingAAccount(String)"
});
formatter.result({
  "duration": 282046,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "76 Jackson Street",
      "offset": 27
    }
  ],
  "location": "AddRouteStepDefinition.iHaveAStopPointCalled(String)"
});
formatter.result({
  "duration": 229085,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Route",
      "offset": 29
    }
  ],
  "location": "AddRouteStepDefinition.iCanCreateARouteCalled(String)"
});
formatter.result({
  "duration": 1801482,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Add a Route no Stop Points",
  "description": "",
  "id": "add-route;add-a-route-no-stop-points",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 14,
  "name": "that I am a using a \"driver\" account",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "I have no stop points",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "I can create a route called \"Route\" with no stop points",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "driver",
      "offset": 21
    }
  ],
  "location": "AddRouteStepDefinition.thatIAmAUsingAAccount(String)"
});
formatter.result({
  "duration": 298468,
  "status": "passed"
});
formatter.match({
  "location": "AddRouteStepDefinition.iHaveNoStopPoints()"
});
formatter.result({
  "duration": 93194,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Route",
      "offset": 29
    }
  ],
  "location": "AddRouteStepDefinition.iCanCreateARouteCalledWithNoStopPoints(String)"
});
formatter.result({
  "duration": 99352,
  "status": "passed"
});
formatter.uri("addStopPoints.feature");
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
  "duration": 295184,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "76 Happy Lane",
      "offset": 7
    }
  ],
  "location": "AddStopPointsStepDefinition.iAddAsAStopPoint(String)"
});
formatter.result({
  "duration": 312837,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "76 Happy Lane",
      "offset": 29
    }
  ],
  "location": "AddStopPointsStepDefinition.theStopPointWithAddressIsCreated(String)"
});
formatter.result({
  "duration": 1553921,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Add a Stop Point already available",
  "description": "",
  "id": "stop-points;add-a-stop-point-already-available",
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
  "name": "I add \"76 Happy Lane\" as a stop point",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "\"76 Happy Lane\" is already in the data",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "the stop point with address \"76 Happy Lane\" is not added again",
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
  "duration": 417937,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "76 Happy Lane",
      "offset": 7
    }
  ],
  "location": "AddStopPointsStepDefinition.iAddAsAStopPoint(String)"
});
formatter.result({
  "duration": 225390,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "76 Happy Lane",
      "offset": 1
    }
  ],
  "location": "AddStopPointsStepDefinition.isAlreadyInTheData(String)"
});
formatter.result({
  "duration": 164630,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "76 Happy Lane",
      "offset": 29
    }
  ],
  "location": "AddStopPointsStepDefinition.theStopPointWithAddressIsNotAddedAgain(String)"
});
formatter.result({
  "duration": 271782,
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
  "name": "I add a car \"Lamborghini\"",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "the \"car\" should be added to my account",
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
  "duration": 265625,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Lamborghini",
      "offset": 13
    }
  ],
  "location": "AddVehicleStepDefinition.iAddACar(String)"
});
formatter.result({
  "duration": 242634,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "car",
      "offset": 5
    }
  ],
  "location": "AddVehicleStepDefinition.theShouldBeAddedToMyAccount(String)"
});
formatter.result({
  "duration": 302573,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "",
  "description": "",
  "id": "add-vehicle;",
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
  "name": "I want to add a car \"Beetle\"",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I want to add a car \"Porsche\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I can add them all to my account",
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
  "duration": 340344,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Beetle",
      "offset": 21
    }
  ],
  "location": "AddVehicleStepDefinition.iWantToAddACar(String)"
});
formatter.result({
  "duration": 102226,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Porsche",
      "offset": 21
    }
  ],
  "location": "AddVehicleStepDefinition.iWantToAddACar(String)"
});
formatter.result({
  "duration": 234012,
  "status": "passed"
});
formatter.match({
  "location": "AddVehicleStepDefinition.iCanAddThemAllToMyAccount()"
});
formatter.result({
  "duration": 1083845,
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
  "name": "Book a Ride as Passenger",
  "description": "",
  "id": "book-a-ride;book-a-ride-as-passenger",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "that I am using a \"passenger\" account",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "I want to book a ride called \"Ride\"",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "I assign myself to the ride called \"Ride\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "passenger",
      "offset": 19
    }
  ],
  "location": "AddRideStepDefinition.thatIAmUsingAAccount(String)"
});
formatter.result({
  "duration": 161755,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ride",
      "offset": 30
    }
  ],
  "location": "BookRideStepDefinition.iWantToBookARideCalled(String)"
});
formatter.result({
  "duration": 2155373,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ride",
      "offset": 36
    }
  ],
  "location": "BookRideStepDefinition.iAssignMyselfToTheRideCalled(String)"
});
formatter.result({
  "duration": 1138448,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Book a Ride as Driver",
  "description": "",
  "id": "book-a-ride;book-a-ride-as-driver",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "that I am using a \"driver\" account",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I want to book a ride called \"Ride\"",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I assign myself to the ride called \"Ride\"",
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
  "duration": 252487,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ride",
      "offset": 30
    }
  ],
  "location": "BookRideStepDefinition.iWantToBookARideCalled(String)"
});
formatter.result({
  "duration": 1893444,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ride",
      "offset": 36
    }
  ],
  "location": "BookRideStepDefinition.iAssignMyselfToTheRideCalled(String)"
});
formatter.result({
  "duration": 1101499,
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
  "duration": 169966,
  "status": "passed"
});
formatter.match({
  "location": "SearchStopPointsStepDefinition.iWantToSearchStopPoints()"
});
formatter.result({
  "duration": 3602553,
  "status": "passed"
});
formatter.match({
  "location": "SearchStopPointsStepDefinition.iTypeInTheCriteriaAndSearchStopPoints()"
});
formatter.result({
  "duration": 1472223,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "",
  "description": "",
  "id": "searching-stop-points;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "I am a \"user\"",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I want to find the stop point with the address \"Rose\"",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I type \"Rose\" in and search by address",
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
  "duration": 95658,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Rose",
      "offset": 48
    }
  ],
  "location": "SearchStopPointsStepDefinition.iWantToFindTheStopPointWithTheAddress(String)"
});
formatter.result({
  "duration": 73078,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Rose",
      "offset": 8
    }
  ],
  "location": "SearchStopPointsStepDefinition.iTypeInAndSearchByAddress(String)"
});
formatter.result({
  "duration": 358818,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "",
  "description": "",
  "id": "searching-stop-points;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "I am a \"user\"",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "I want to find the stop point with the suburb \"Halswell\"",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "I type \"Halswell\" in and search by suburb",
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
  "duration": 206505,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Halswell",
      "offset": 47
    }
  ],
  "location": "SearchStopPointsStepDefinition.iWantToFindTheStopPointWithTheSuburb(String)"
});
formatter.result({
  "duration": 124396,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Halswell",
      "offset": 8
    }
  ],
  "location": "SearchStopPointsStepDefinition.iTypeInAndSearchBySuburb(String)"
});
formatter.result({
  "duration": 606378,
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
  "duration": 424916,
  "status": "passed"
});
formatter.match({
  "location": "SeeRidesGivenStopPointStepDefinition.iSelectAStopPoint()"
});
formatter.result({
  "duration": 586261,
  "status": "passed"
});
formatter.match({
  "location": "SeeRidesGivenStopPointStepDefinition.iWantToSeeTheRidesAssociatedWithTheStopPoints()"
});
formatter.result({
  "duration": 8349300,
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
  "duration": 246739,
  "status": "passed"
});
formatter.match({
  "location": "ShareRideStepDefinition.iHaveCreatedARide()"
});
formatter.result({
  "duration": 3009722,
  "status": "passed"
});
formatter.match({
  "location": "ShareRideStepDefinition.iCanShareMyRide()"
});
formatter.result({
  "duration": 1105603,
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
  "duration": 272604,
  "status": "passed"
});
formatter.match({
  "location": "ViewRideDetailsStepDefinition.iChooseARide()"
});
formatter.result({
  "duration": 4129695,
  "status": "passed"
});
formatter.match({
  "location": "ViewRideDetailsStepDefinition.iWantToSeeTheDetailsOfTheRide()"
});
formatter.result({
  "duration": 721742,
  "status": "passed"
});
});