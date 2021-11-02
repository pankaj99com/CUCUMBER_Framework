$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/tagging.feature");
formatter.feature({
  "name": "Free CRM Application Testing",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login with correct username and password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Smoke"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "This is valid login test",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.TaggingFeatureTest.this_is_valid_login_test()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Create a case",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Smoke"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "This is create case test",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.TaggingFeatureTest.this_is_create_case_test()"
});
formatter.result({
  "status": "passed"
});
});