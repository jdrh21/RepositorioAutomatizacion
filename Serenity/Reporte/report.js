$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/NewTours.Feature");
formatter.feature({
  "name": "Login en new tours",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@LoginFeature"
    }
  ]
});
formatter.scenario({
  "name": "Login in new tours",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@LoginFeature"
    },
    {
      "name": "@GoodLogin"
    }
  ]
});
formatter.step({
  "name": "The new tours page",
  "keyword": "Given "
});
formatter.match({
  "location": "NewToursStepsDefinitions.the_new_tours_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill the user and password field",
  "keyword": "When "
});
formatter.match({
  "location": "NewToursStepsDefinitions.i_fill_the_user_and_password_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click the submit button",
  "keyword": "And "
});
formatter.match({
  "location": "NewToursStepsDefinitions.click_the_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I acces to a new page",
  "keyword": "Then "
});
formatter.match({
  "location": "NewToursStepsDefinitions.i_acces_to_a_new_page()"
});
formatter.result({
  "status": "passed"
});
});