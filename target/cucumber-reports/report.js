$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/featureFiles/ScrollPage.feature");
formatter.feature({
  "name": "verify scroll function in the application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify the scroll function in react js applcation",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User launch the reactjs application",
  "keyword": "Given "
});
formatter.match({
  "location": "com.steps.ScrollPage.user_launch_the_reactjs_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click the tutorial tab",
  "keyword": "When "
});
formatter.match({
  "location": "com.steps.ScrollPage.user_click_the_tutorial_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should color of text while scroll the page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.steps.ScrollPage.user_should_color_of_text_while_scroll_the_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});