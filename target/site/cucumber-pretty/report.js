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
  "duration": 138882400,
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
  "duration": 7965439,
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
  "duration": 797283,
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
  "duration": 1963647,
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
  "duration": 262750,
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
  "duration": 849012,
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
  "duration": 154777,
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
  "duration": 1596618,
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
  "duration": 269319,
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
  "duration": 86625,
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
  "duration": 62814,
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
  "duration": 524680,
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
  "duration": 236885,
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
  "duration": 95657,
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
  "duration": 823148,
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
  "duration": 178588,
  "status": "passed"
});
formatter.match({
  "location": "AddRouteStepDefinition.iHaveNoStopPoints()"
});
formatter.result({
  "duration": 25454,
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
  "duration": 73488,
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
  "duration": 366208,
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
  "duration": 191316,
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
  "duration": 1056749,
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
  "duration": 209790,
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
  "duration": 87857,
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
  "duration": 66509,
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
  "duration": 74720,
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
  "duration": 197062,
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
  "duration": 165861,
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
  "duration": 231139,
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
  "duration": 235243,
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
  "duration": 128912,
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
  "duration": 146155,
  "status": "passed"
});
formatter.match({
  "location": "AddVehicleStepDefinition.iCanAddThemAllToMyAccount()"
});
formatter.result({
  "duration": 241401,
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
  "duration": 122343,
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
  "duration": 1055517,
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
  "duration": 1042379,
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
  "duration": 239759,
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
  "duration": 1532162,
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
  "duration": 898688,
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
  "duration": 2082296,
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
  "duration": 101816,
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
  "duration": 87446,
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
  "duration": 732006,
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
  "duration": 72667,
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
  "duration": 59529,
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
  "duration": 199526,
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
  "duration": 159292,
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
  "duration": 68151,
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
  "duration": 1740720,
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
  "duration": 99352,
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
  "duration": 146155,
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
  "duration": 87857,
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
  "duration": 188852,
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
  "duration": 324332,
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
  "duration": 235655,
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
  "duration": 207326,
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
  "duration": 103047,
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
  "duration": 81699,
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
  "duration": 71845,
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
  "duration": 40644,
  "status": "passed"
});
formatter.match({
  "location": "LogInStepDefinition.iWillFailToLogIn()"
});
formatter.result({
  "duration": 20938,
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
  "duration": 93605,
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
  "duration": 71025,
  "status": "passed"
});
formatter.match({
  "location": "LogInStepDefinition.iWillFailToLogIn()"
});
formatter.result({
  "duration": 27096,
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
  "duration": 401515,
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
  "duration": 127270,
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
  "duration": 258235,
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
  "duration": 905257,
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
  "duration": 164630,
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
  "duration": 594473,
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
  "duration": 255771,
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
  "duration": 34896,
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
  "duration": 94426,
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
  "duration": 252897,
  "status": "passed"
});
formatter.match({
  "location": "SearchStopPointsStepDefinition.iWantToSearchStopPoints()"
});
formatter.result({
  "duration": 1468938,
  "status": "passed"
});
formatter.match({
  "location": "SearchStopPointsStepDefinition.iTypeInTheCriteriaAndSearchStopPoints()"
});
formatter.result({
  "duration": 568197,
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
  "duration": 138354,
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
  "duration": 178998,
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
  "duration": 368672,
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
  "duration": 146976,
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
  "duration": 187620,
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
  "duration": 294773,
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
  "duration": 282457,
  "status": "passed"
});
formatter.match({
  "location": "SeeRidesGivenStopPointStepDefinition.iSelectAStopPoint()"
});
formatter.result({
  "duration": 200347,
  "status": "passed"
});
formatter.match({
  "location": "SeeRidesGivenStopPointStepDefinition.iWantToSeeTheRidesAssociatedWithTheStopPoints()"
});
formatter.result({
  "duration": 1580607,
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
  "duration": 309142,
  "status": "passed"
});
formatter.match({
  "location": "ShareRideStepDefinition.iHaveCreatedARide()"
});
formatter.result({
  "duration": 3758149,
  "status": "passed"
});
formatter.match({
  "location": "ShareRideStepDefinition.iCanShareMyRide()"
});
formatter.result({
  "duration": 1704592,
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
  "duration": 1004609,
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
  "duration": 482804,
  "status": "passed"
});
formatter.match({
  "location": "StoreDataStepDefinition.iCloseTheApplication()"
});
formatter.result({
  "duration": 37771,
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
  "duration": 268908,
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
  "duration": 235654,
  "status": "passed"
});
formatter.match({
  "location": "StoreDataStepDefinition.iCloseTheApplication()"
});
formatter.result({
  "duration": 21759,
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
  "duration": 1671749,
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
  "duration": 101405,
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
  "duration": 76362,
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
  "duration": 5146210,
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
  "duration": 82109,
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
  "duration": 148618,
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
  "duration": 318585,
  "status": "passed"
});
formatter.match({
  "location": "ViewRideDetailsStepDefinition.iChooseARide()"
});
formatter.result({
  "duration": 1191408,
  "status": "passed"
});
formatter.match({
  "location": "ViewRideDetailsStepDefinition.iWantToSeeTheDetailsOfTheRide()"
});
formatter.result({
  "duration": 799746,
  "status": "passed"
});
});