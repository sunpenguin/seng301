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
formatter.step({
  "line": 7,
  "name": "that I am a \"driver\"",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I have a route",
  "keyword": "When "
});
formatter.step({
  "line": 9,
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
  "duration": 104533961,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
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
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
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
  "duration": 89500,
  "status": "passed"
});
formatter.match({
  "location": "AddRouteStepDefinition.iHaveStopPoints()"
});
formatter.result({
  "duration": 1044433,
  "status": "passed"
});
formatter.match({
  "location": "AddRouteStepDefinition.iShouldCreateARoute()"
});
formatter.result({
  "duration": 58184814,
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
  "duration": 66098,
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
  "duration": 70203,
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
  "duration": 1497266,
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
  "duration": 89088,
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
  "duration": 119059,
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
  "duration": 92373,
  "status": "passed"
});
});