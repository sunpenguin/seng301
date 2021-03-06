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
  "duration": 123042324,
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
  "duration": 9955469,
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
  "duration": 774539,
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
  "duration": 1958649,
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
  "duration": 288448,
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
  "duration": 863199,
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
  "duration": 160196,
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
  "duration": 2053548,
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
  "duration": 358570,
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
  "duration": 140957,
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
  "duration": 117356,
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
  "duration": 892282,
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
  "duration": 255927,
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
  "duration": 105016,
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
  "duration": 756426,
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
  "duration": 258443,
  "status": "passed"
});
formatter.match({
  "location": "AddRouteStepDefinition.iHaveNoStopPoints()"
});
formatter.result({
  "duration": 30927,
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
  "duration": 55815,
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
  "duration": 381499,
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
  "duration": 167992,
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
  "duration": 989606,
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
  "duration": 300017,
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
  "duration": 141444,
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
  "duration": 148359,
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
  "duration": 152181,
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
  "duration": 271455,
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
  "duration": 312067,
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
  "duration": 280556,
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
  "duration": 582069,
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
  "duration": 191643,
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
  "duration": 174997,
  "status": "passed"
});
formatter.match({
  "location": "AddVehicleStepDefinition.iCanAddThemAllToMyAccount()"
});
formatter.result({
  "duration": 332814,
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
  "duration": 126409,
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
  "duration": 1224624,
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
  "duration": 1305282,
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
  "duration": 264446,
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
  "duration": 3423036,
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
  "duration": 1009788,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Book own Ride",
  "description": "",
  "id": "book-a-ride;book-own-ride",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "that I want to book ride \"Ride\" with 1 person",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "\"Ride\" was created by me",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I try to book \"Ride\"",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "\"Ride\" will still only be booked by 1 person",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Ride",
      "offset": 26
    },
    {
      "val": "1",
      "offset": 37
    }
  ],
  "location": "BookRideStepDefinition.thatIWantToBookRideWithPerson(String,int)"
});
formatter.result({
  "duration": 609707,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ride",
      "offset": 1
    }
  ],
  "location": "BookRideStepDefinition.wasCreatedByMe(String)"
});
formatter.result({
  "duration": 811591,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ride",
      "offset": 15
    }
  ],
  "location": "BookRideStepDefinition.iTryToBook(String)"
});
formatter.result({
  "duration": 99941,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ride",
      "offset": 1
    },
    {
      "val": "1",
      "offset": 36
    }
  ],
  "location": "BookRideStepDefinition.willStillOnlyBeBookedByPerson(String,int)"
});
formatter.result({
  "duration": 103619,
  "status": "passed"
});
formatter.uri("calculateCost.feature");
formatter.feature({
  "line": 1,
  "name": "Calculate Cost for Rides",
  "description": "",
  "id": "calculate-cost-for-rides",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Calculate Cost",
  "description": "",
  "id": "calculate-cost-for-rides;calculate-cost",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "I have a vehicle \"car\" with performance \"6\"",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "I want to go from stop point \"SP1\" to university",
  "keyword": "And "
});
formatter.step({
  "line": 5,
  "name": "I create a ride using \"SP1\" with 4 distance",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "the cost of the ride from the stop point \"SP1\" will be $\"2.40\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "car",
      "offset": 18
    },
    {
      "val": "6",
      "offset": 41
    }
  ],
  "location": "CalculateCostStepDefinition.iHaveAVehicleWithPerformance(String,String)"
});
formatter.result({
  "duration": 7835065,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "SP1",
      "offset": 30
    }
  ],
  "location": "CalculateCostStepDefinition.iWantToGoFromStopPointToUniversity(String)"
});
formatter.result({
  "duration": 114606,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "SP1",
      "offset": 23
    },
    {
      "val": "4",
      "offset": 33
    }
  ],
  "location": "CalculateCostStepDefinition.iCreateARideUsingWithDistance(String,int)"
});
formatter.result({
  "duration": 592699,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "SP1",
      "offset": 42
    },
    {
      "val": "2.40",
      "offset": 57
    }
  ],
  "location": "CalculateCostStepDefinition.theCostOfTheRideFromTheStopPointWillBe$(String,String)"
});
formatter.result({
  "duration": 169947,
  "status": "passed"
});
formatter.uri("cancelRideDriver.feature");
formatter.feature({
  "line": 1,
  "name": "Cancel a Ride as a Driver",
  "description": "",
  "id": "cancel-a-ride-as-a-driver",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Cancel a Ride with Passengers",
  "description": "",
  "id": "cancel-a-ride-as-a-driver;cancel-a-ride-with-passengers",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "I have a passenger \"pass12\" in my ride \"Ride\"",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "I cancel my ride \"Ride\"",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "passenger \"pass12\" will be notified",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "pass12",
      "offset": 20
    },
    {
      "val": "Ride",
      "offset": 40
    }
  ],
  "location": "CancelRideDriverStepDefinition.iHaveAPassengerInMyRide(String,String)"
});
formatter.result({
  "duration": 7582403,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ride",
      "offset": 18
    }
  ],
  "location": "CancelRideDriverStepDefinition.iCancelMyRide(String)"
});
formatter.result({
  "duration": 172550,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "pass12",
      "offset": 11
    }
  ],
  "location": "CancelRideDriverStepDefinition.passengerWillBeNotified(String)"
});
formatter.result({
  "duration": 163762,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Cancel a Full Ride",
  "description": "",
  "id": "cancel-a-ride-as-a-driver;cancel-a-full-ride",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "I have two passengers \"pass12\" and \"pass13\" in my ride \"Ride\"",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "\"Ride\" is full",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I cancel my ride \"Ride\"",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "passengers \"pass12\" and \"pass13\" will be notified",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "pass12",
      "offset": 23
    },
    {
      "val": "pass13",
      "offset": 36
    },
    {
      "val": "Ride",
      "offset": 56
    }
  ],
  "location": "CancelRideDriverStepDefinition.iHaveTwoPassengersAndInMyRide(String,String,String)"
});
formatter.result({
  "duration": 1483370,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ride",
      "offset": 1
    }
  ],
  "location": "CancelRideDriverStepDefinition.isFull(String)"
});
formatter.result({
  "duration": 86802,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ride",
      "offset": 18
    }
  ],
  "location": "CancelRideDriverStepDefinition.iCancelMyRide(String)"
});
formatter.result({
  "duration": 78572,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "pass12",
      "offset": 12
    },
    {
      "val": "pass13",
      "offset": 25
    }
  ],
  "location": "CancelRideDriverStepDefinition.passengersAndWillBeNotified(String,String)"
});
formatter.result({
  "duration": 87672,
  "status": "passed"
});
formatter.uri("cancelRidePassenger.feature");
formatter.feature({
  "line": 1,
  "name": "Cancel a Booked Ride as a Passenger",
  "description": "",
  "id": "cancel-a-booked-ride-as-a-passenger",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Cancel a Booked Ride",
  "description": "",
  "id": "cancel-a-booked-ride-as-a-passenger;cancel-a-booked-ride",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "I have booked the ride \"Hummus\" by driver \"Hansen\"",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "I cancel my booking on \"Hummus\"",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "my reason is \"I hurt my foot\"",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "the driver will receive the notification \"I hurt my foot\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Hummus",
      "offset": 24
    },
    {
      "val": "Hansen",
      "offset": 43
    }
  ],
  "location": "CancelRidePassengerStepDefinition.iHaveBookedTheRideByDriver(String,String)"
});
formatter.result({
  "duration": 1253474,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hummus",
      "offset": 24
    }
  ],
  "location": "CancelRidePassengerStepDefinition.iCancelMyBookingOn(String)"
});
formatter.result({
  "duration": 172236,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "I hurt my foot",
      "offset": 14
    }
  ],
  "location": "CancelRidePassengerStepDefinition.myReasonIs(String)"
});
formatter.result({
  "duration": 108664,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "I hurt my foot",
      "offset": 42
    }
  ],
  "location": "CancelRidePassengerStepDefinition.theDriverWillReceiveTheNotification(String)"
});
formatter.result({
  "duration": 326909,
  "status": "passed"
});
formatter.uri("createAccount.feature");
formatter.feature({
  "line": 1,
  "name": "",
  "description": "",
  "id": "",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Create a Passenger Account",
  "description": "",
  "id": ";create-a-passenger-account",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "I want to use the application",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "I create an account with id \"zx908\"",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "have other details \"zx908@uclive.ac.nz\". \"password\", \"name\", \"address\", 1234567, 1234567",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "I create a \"Passenger\" account",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateAccountStepDefinition.iWantToUseTheApplication()"
});
formatter.result({
  "duration": 131573,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "zx908",
      "offset": 29
    }
  ],
  "location": "CreateAccountStepDefinition.iCreateAnAccountWithId(String)"
});
formatter.result({
  "duration": 69893,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "zx908@uclive.ac.nz",
      "offset": 20
    },
    {
      "val": "password",
      "offset": 42
    },
    {
      "val": "name",
      "offset": 54
    },
    {
      "val": "address",
      "offset": 62
    },
    {
      "val": "1234567",
      "offset": 72
    },
    {
      "val": "1234567",
      "offset": 81
    }
  ],
  "location": "CreateAccountStepDefinition.haveOtherDetails(String,String,String,String,int,int)"
});
formatter.result({
  "duration": 215774,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Passenger",
      "offset": 12
    }
  ],
  "location": "CreateAccountStepDefinition.iCreateAAccount(String)"
});
formatter.result({
  "duration": 71988,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Create Driver Account",
  "description": "",
  "id": ";create-driver-account",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "I attend \"UC\"",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I create an account with id \"zx908\"",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "have other details \"zx908@uclive.ac.nz\". \"password\", \"name\", \"address\", 1234567, 1234567",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "have a licence with details \"type\", \"licence\", issue \"12/12/2013\", expiry \"12/12/2023\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I create a \"Driver\" account",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "UC",
      "offset": 10
    }
  ],
  "location": "CreateAccountStepDefinition.iAttend(String)"
});
formatter.result({
  "duration": 115914,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "zx908",
      "offset": 29
    }
  ],
  "location": "CreateAccountStepDefinition.iCreateAnAccountWithId(String)"
});
formatter.result({
  "duration": 47883,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "zx908@uclive.ac.nz",
      "offset": 20
    },
    {
      "val": "password",
      "offset": 42
    },
    {
      "val": "name",
      "offset": 54
    },
    {
      "val": "address",
      "offset": 62
    },
    {
      "val": "1234567",
      "offset": 72
    },
    {
      "val": "1234567",
      "offset": 81
    }
  ],
  "location": "CreateAccountStepDefinition.haveOtherDetails(String,String,String,String,int,int)"
});
formatter.result({
  "duration": 120237,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "type",
      "offset": 29
    },
    {
      "val": "licence",
      "offset": 37
    },
    {
      "val": "12/12/2013",
      "offset": 54
    },
    {
      "val": "12/12/2023",
      "offset": 75
    }
  ],
  "location": "CreateAccountStepDefinition.haveALicenceWithDetailsIssueExpiry(String,String,String,String)"
});
formatter.result({
  "duration": 239591,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Driver",
      "offset": 12
    }
  ],
  "location": "CreateAccountStepDefinition.iCreateAAccount(String)"
});
formatter.result({
  "duration": 165084,
  "status": "passed"
});
formatter.uri("editAccount.feature");
formatter.feature({
  "line": 1,
  "name": "Edit Account Details",
  "description": "",
  "id": "edit-account-details",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Edit Licence Details",
  "description": "",
  "id": "edit-account-details;edit-licence-details",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "I have a licence with expiry \"12/12/2016\"",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "it is linked to the account \"ari54\"",
  "keyword": "And "
});
formatter.step({
  "line": 5,
  "name": "I update expiry to \"12/12/2026\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "account \"ari54\" will have a licence with expiry date \"12/12/2026\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "12/12/2016",
      "offset": 30
    }
  ],
  "location": "EditAccountStepDefinition.iHaveALicenceWithExpiry(String)"
});
formatter.result({
  "duration": 319610,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ari54",
      "offset": 29
    }
  ],
  "location": "EditAccountStepDefinition.itIsLinkedToTheAccount(String)"
});
formatter.result({
  "duration": 107918,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "12/12/2026",
      "offset": 20
    }
  ],
  "location": "EditAccountStepDefinition.iUpdateExpiryTo(String)"
});
formatter.result({
  "duration": 181096,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ari54",
      "offset": 9
    },
    {
      "val": "12/12/2026",
      "offset": 54
    }
  ],
  "location": "EditAccountStepDefinition.accountWillHaveALicenceWithExpiryDate(String,String)"
});
formatter.result({
  "duration": 173119,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Edit Account Details",
  "description": "",
  "id": "edit-account-details;edit-account-details",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "I have an account \"war10\" with address \"18 Old Lane\"",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I update address to \"29 New Street\"",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "account \"war10\" will have an address of \"29 New Street\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "war10",
      "offset": 19
    },
    {
      "val": "18 Old Lane",
      "offset": 40
    }
  ],
  "location": "EditAccountStepDefinition.iHaveAnAccountWithAddress(String,String)"
});
formatter.result({
  "duration": 113026,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "29 New Street",
      "offset": 21
    }
  ],
  "location": "EditAccountStepDefinition.iUpdateAddressTo(String)"
});
formatter.result({
  "duration": 36494,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "war10",
      "offset": 9
    },
    {
      "val": "29 New Street",
      "offset": 41
    }
  ],
  "location": "EditAccountStepDefinition.accountWillHaveAnAddressOf(String,String)"
});
formatter.result({
  "duration": 51028,
  "status": "passed"
});
formatter.uri("editVehicle.feature");
formatter.feature({
  "line": 1,
  "name": "Editing a Vehicle",
  "description": "",
  "id": "editing-a-vehicle",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Edit Performance",
  "description": "",
  "id": "editing-a-vehicle;edit-performance",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "I have a vehicle \"car\" with 15 performance",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "I edit the performance from 15 to 10",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "the vehicle \"car\" will have a performance of 10",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "car",
      "offset": 18
    },
    {
      "val": "15",
      "offset": 28
    }
  ],
  "location": "EditVehicleStepDefinition.iHaveAVehicleWithPerformance(String,int)"
});
formatter.result({
  "duration": 251820,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "15",
      "offset": 28
    },
    {
      "val": "10",
      "offset": 34
    }
  ],
  "location": "EditVehicleStepDefinition.iEditThePerformanceFromTo(int,int)"
});
formatter.result({
  "duration": 95385,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "car",
      "offset": 13
    },
    {
      "val": "10",
      "offset": 45
    }
  ],
  "location": "EditVehicleStepDefinition.theVehicleWillHaveAPerformanceOf(String,int)"
});
formatter.result({
  "duration": 64828,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Edit Seats",
  "description": "",
  "id": "editing-a-vehicle;edit-seats",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "I have a vehicle \"car\" with 1 seat",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I edit the seats from 1 to 10",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "the vehicle \"car\" will have 10 seats",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "car",
      "offset": 18
    },
    {
      "val": "1",
      "offset": 28
    }
  ],
  "location": "EditVehicleStepDefinition.iHaveAVehicleWithSeat(String,int)"
});
formatter.result({
  "duration": 242500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 22
    },
    {
      "val": "10",
      "offset": 27
    }
  ],
  "location": "EditVehicleStepDefinition.iEditTheSeatsFromTo(int,int)"
});
formatter.result({
  "duration": 106934,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "car",
      "offset": 13
    },
    {
      "val": "10",
      "offset": 28
    }
  ],
  "location": "EditVehicleStepDefinition.theVehicleWillHaveSeats(String,int)"
});
formatter.result({
  "duration": 76064,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Edit Registration",
  "description": "",
  "id": "editing-a-vehicle;edit-registration",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "I have a vehicle \"car\" with registration expiry \"12/12/2016\"",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "I edit the expiry date from \"12/12/2016\" to \"12/12/2019\"",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "the vehicle \"car\" will have a registration expiry of \"12/12/2019\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "car",
      "offset": 18
    },
    {
      "val": "12/12/2016",
      "offset": 49
    }
  ],
  "location": "EditVehicleStepDefinition.iHaveAVehicleWithRegistrationExpiry(String,String)"
});
formatter.result({
  "duration": 200753,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "12/12/2016",
      "offset": 29
    },
    {
      "val": "12/12/2019",
      "offset": 45
    }
  ],
  "location": "EditVehicleStepDefinition.iEditTheExpiryDateFromTo(String,String)"
});
formatter.result({
  "duration": 488646,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "car",
      "offset": 13
    },
    {
      "val": "12/12/2019",
      "offset": 54
    }
  ],
  "location": "EditVehicleStepDefinition.theVehicleWillHaveARegistrationExpiryOf(String,String)"
});
formatter.result({
  "duration": 85437,
  "status": "passed"
});
formatter.uri("logIn.feature");
formatter.feature({
  "line": 1,
  "name": "",
  "description": "",
  "id": "",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Log in with an account",
  "description": "",
  "id": ";log-in-with-an-account",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "that I have an account with username \"skj32\" and password \"23jks\"",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "I enter \"skj32\" and \"23jks\" to the log in screen",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "I will get my account details email \"skj32@uclive.ac.nz\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "skj32",
      "offset": 38
    },
    {
      "val": "23jks",
      "offset": 59
    }
  ],
  "location": "LogInStepDefinition.thatIHaveAnAccountWithUsernameAndPassword(String,String)"
});
formatter.result({
  "duration": 165802,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "skj32",
      "offset": 9
    },
    {
      "val": "23jks",
      "offset": 21
    }
  ],
  "location": "LogInStepDefinition.iEnterAndToTheLogInScreen(String,String)"
});
formatter.result({
  "duration": 78034,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "skj32@uclive.ac.nz",
      "offset": 37
    }
  ],
  "location": "LogInStepDefinition.iWillGetMyAccountDetailsEmail(String)"
});
formatter.result({
  "duration": 53216,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Log in without an account",
  "description": "",
  "id": ";log-in-without-an-account",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "I have the username \"klj12\"",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I enter \"klj32\" and \"klj32\" to the log in screen",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I will fail to log in",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "klj12",
      "offset": 21
    }
  ],
  "location": "LogInStepDefinition.iHaveTheUsername(String)"
});
formatter.result({
  "duration": 64052,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "klj32",
      "offset": 9
    },
    {
      "val": "klj32",
      "offset": 21
    }
  ],
  "location": "LogInStepDefinition.iEnterAndToTheLogInScreen(String,String)"
});
formatter.result({
  "duration": 51531,
  "status": "passed"
});
formatter.match({
  "location": "LogInStepDefinition.iWillFailToLogIn()"
});
formatter.result({
  "duration": 26671,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Wrong Password",
  "description": "",
  "id": ";wrong-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "that I have an account with username \"skj32\" and password \"23jks\"",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "I enter \"skj32\" and \"23jsk\" to the log in screen",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "I will fail to log in",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "skj32",
      "offset": 38
    },
    {
      "val": "23jks",
      "offset": 59
    }
  ],
  "location": "LogInStepDefinition.thatIHaveAnAccountWithUsernameAndPassword(String,String)"
});
formatter.result({
  "duration": 83391,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "skj32",
      "offset": 9
    },
    {
      "val": "23jsk",
      "offset": 21
    }
  ],
  "location": "LogInStepDefinition.iEnterAndToTheLogInScreen(String,String)"
});
formatter.result({
  "duration": 48092,
  "status": "passed"
});
formatter.match({
  "location": "LogInStepDefinition.iWillFailToLogIn()"
});
formatter.result({
  "duration": 14461,
  "status": "passed"
});
formatter.uri("notifications.feature");
formatter.feature({
  "line": 1,
  "name": "",
  "description": "",
  "id": "",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Driver Licence Expire",
  "description": "",
  "id": ";driver-licence-expire",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "that my licence expiry date is \"12/12/2001\" on licence number \"ABC123\"",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "I log in to my account with licence \"ABC123\"",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "I get a notification with the message \"Your licence has expired. Please renew your licence as soon as possible!\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "12/12/2001",
      "offset": 32
    },
    {
      "val": "ABC123",
      "offset": 63
    }
  ],
  "location": "NotificationsStepDefinition.thatMyLicenceExpiryDateIsOnLicenceNumber(String,String)"
});
formatter.result({
  "duration": 1761569,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ABC123",
      "offset": 37
    }
  ],
  "location": "NotificationsStepDefinition.iLogInToMyAccountWithLicence(String)"
});
formatter.result({
  "duration": 105464,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Your licence has expired. Please renew your licence as soon as possible!",
      "offset": 39
    }
  ],
  "location": "NotificationsStepDefinition.iGetANotificationWithTheMessage(String)"
});
formatter.result({
  "duration": 172643,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "WOF Expire",
  "description": "",
  "id": ";wof-expire",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "I have a vehicle \"Jeep\" with WOF expiry on \"11/11/2011\"",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I log in to my account with vehicle \"Jeep\"",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I get the notification message \"Your WOF for one of your vehicles has expired. Please renew your WOF as soon as possible!\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Jeep",
      "offset": 18
    },
    {
      "val": "11/11/2011",
      "offset": 44
    }
  ],
  "location": "NotificationsStepDefinition.iHaveAVehicleWithWOFExpiryOn(String,String)"
});
formatter.result({
  "duration": 387079,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Jeep",
      "offset": 37
    }
  ],
  "location": "NotificationsStepDefinition.iLogInToMyAccountWithVehicle(String)"
});
formatter.result({
  "duration": 60899,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Your WOF for one of your vehicles has expired. Please renew your WOF as soon as possible!",
      "offset": 32
    }
  ],
  "location": "NotificationsStepDefinition.iGetTheNotificationMessage(String)"
});
formatter.result({
  "duration": 168686,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Registration Expire",
  "description": "",
  "id": ";registration-expire",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "I have a vehicle \"Alpine\" with registration expiry on \"01/01/2016\"",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "I log in to my account with vehicle \"Alpine\"",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "I get the notification message \"Your registration for one of your vehicles has expired. Please renew your registration as soon as possible!\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Alpine",
      "offset": 18
    },
    {
      "val": "01/01/2016",
      "offset": 55
    }
  ],
  "location": "NotificationsStepDefinition.iHaveAVehicleWithRegistrationExpriyOn(String,String)"
});
formatter.result({
  "duration": 230606,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Alpine",
      "offset": 37
    }
  ],
  "location": "NotificationsStepDefinition.iLogInToMyAccountWithVehicle(String)"
});
formatter.result({
  "duration": 29655,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Your registration for one of your vehicles has expired. Please renew your registration as soon as possible!",
      "offset": 32
    }
  ],
  "location": "NotificationsStepDefinition.iGetTheNotificationMessage(String)"
});
formatter.result({
  "duration": 110049,
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
  "duration": 156752,
  "status": "passed"
});
formatter.match({
  "location": "SearchStopPointsStepDefinition.iWantToSearchStopPoints()"
});
formatter.result({
  "duration": 7185783,
  "status": "passed"
});
formatter.match({
  "location": "SearchStopPointsStepDefinition.iTypeInTheCriteriaAndSearchStopPoints()"
});
formatter.result({
  "duration": 345232,
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
  "duration": 97927,
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
  "duration": 50269,
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
  "duration": 266444,
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
  "duration": 86816,
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
  "duration": 87552,
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
  "duration": 535616,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "",
  "description": "",
  "id": "searching-stop-points;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 18,
  "name": "I want to search for stop point \"Steed\"",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "I search with \"Steed\" as the address",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "the results will be displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "a map of the location will be shown",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Steed",
      "offset": 33
    }
  ],
  "location": "SearchStopPointsStepDefinition.iWantToSearchForStopPoint(String)"
});
formatter.result({
  "duration": 613941,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Steed",
      "offset": 15
    }
  ],
  "location": "SearchStopPointsStepDefinition.iSearchWithAsTheAddress(String)"
});
formatter.result({
  "duration": 183836,
  "status": "passed"
});
formatter.match({
  "location": "SearchStopPointsStepDefinition.theResultsWillBeDisplayed()"
});
formatter.result({
  "duration": 185896,
  "status": "passed"
});
formatter.match({
  "location": "SearchStopPointsStepDefinition.aMapOfTheLocationWillBeShown()"
});
formatter.result({
  "duration": 27020,
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
  "duration": 215697,
  "status": "passed"
});
formatter.match({
  "location": "SeeRidesGivenStopPointStepDefinition.iSelectAStopPoint()"
});
formatter.result({
  "duration": 882082,
  "status": "passed"
});
formatter.match({
  "location": "SeeRidesGivenStopPointStepDefinition.iWantToSeeTheRidesAssociatedWithTheStopPoints()"
});
formatter.result({
  "duration": 1897487,
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
  "duration": 246214,
  "status": "passed"
});
formatter.match({
  "location": "ShareRideStepDefinition.iHaveCreatedARide()"
});
formatter.result({
  "duration": 2040331,
  "status": "passed"
});
formatter.match({
  "location": "ShareRideStepDefinition.iCanShareMyRide()"
});
formatter.result({
  "duration": 1013767,
  "status": "passed"
});
formatter.uri("storeData.feature");
formatter.feature({
  "line": 1,
  "name": "Store data",
  "description": "",
  "id": "store-data",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Store my account",
  "description": "",
  "id": "store-data;store-my-account",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "that I am a \"user\"",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "I want to save my account \"acc111\"",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "I close the application",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "user",
      "offset": 13
    }
  ],
  "location": "AddVehicleStepDefinition.thatIAmA(String)"
});
formatter.result({
  "duration": 178265,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "acc111",
      "offset": 27
    }
  ],
  "location": "StoreDataStepDefinition.iWantToSaveMyAccount(String)"
});
formatter.result({
  "duration": 2051225,
  "status": "passed"
});
formatter.match({
  "location": "StoreDataStepDefinition.iCloseTheApplication()"
});
formatter.result({
  "duration": 23565,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Store Stop Points",
  "description": "",
  "id": "store-data;store-stop-points",
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
  "name": "I want to save the stop point \"SP1\"",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I close the application",
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
  "duration": 212870,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "SP1",
      "offset": 31
    }
  ],
  "location": "StoreDataStepDefinition.iWantToSaveTheStopPoint(String)"
});
formatter.result({
  "duration": 111682,
  "status": "passed"
});
formatter.match({
  "location": "StoreDataStepDefinition.iCloseTheApplication()"
});
formatter.result({
  "duration": 8872,
  "status": "passed"
});
formatter.uri("viewBookedRides.feature");
formatter.feature({
  "line": 1,
  "name": "View Booked Rides",
  "description": "",
  "id": "view-booked-rides",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Seeing Booked Rides as a Passenger",
  "description": "",
  "id": "view-booked-rides;seeing-booked-rides-as-a-passenger",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "I have booked the ride \"Ride\" on my account \"lep10\"",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "I view my booked rides in my account \"lep10\"",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "I should see the ride \"Ride\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Ride",
      "offset": 24
    },
    {
      "val": "lep10",
      "offset": 45
    }
  ],
  "location": "ViewBookedRidesStepDefinition.iHaveBookedTheRideOnMyAccount(String,String)"
});
formatter.result({
  "duration": 886022,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "lep10",
      "offset": 38
    }
  ],
  "location": "ViewBookedRidesStepDefinition.iViewMyBookedRidesInMyAccount(String)"
});
formatter.result({
  "duration": 73486,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ride",
      "offset": 23
    }
  ],
  "location": "ViewBookedRidesStepDefinition.iShouldSeeTheRide(String)"
});
formatter.result({
  "duration": 44460,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Seeing Rides as a Driver",
  "description": "",
  "id": "view-booked-rides;seeing-rides-as-a-driver",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "I have shared the ride \"Ride\" on my account \"pel92\"",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I view my shared rides in my account \"pel92\"",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I should see the ride \"Ride\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Ride",
      "offset": 24
    },
    {
      "val": "pel92",
      "offset": 45
    }
  ],
  "location": "ViewBookedRidesStepDefinition.iHaveSharedTheRideOnMyAccount(String,String)"
});
formatter.result({
  "duration": 777762,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "pel92",
      "offset": 38
    }
  ],
  "location": "ViewBookedRidesStepDefinition.iViewMySharedRidesInMyAccount(String)"
});
formatter.result({
  "duration": 48622,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ride",
      "offset": 23
    }
  ],
  "location": "ViewBookedRidesStepDefinition.iShouldSeeTheRide(String)"
});
formatter.result({
  "duration": 27863,
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
  "duration": 183451,
  "status": "passed"
});
formatter.match({
  "location": "ViewRideDetailsStepDefinition.iChooseARide()"
});
formatter.result({
  "duration": 660511,
  "status": "passed"
});
formatter.match({
  "location": "ViewRideDetailsStepDefinition.iWantToSeeTheDetailsOfTheRide()"
});
formatter.result({
  "duration": 460533,
  "status": "passed"
});
});