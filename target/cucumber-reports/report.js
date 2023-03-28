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
  "error_message": "java.lang.AssertionError: expected:\u003cfalse\u003e but was:\u003ctrue\u003e\r\n\tat org.junit.Assert.fail(Assert.java:89)\r\n\tat org.junit.Assert.failNotEquals(Assert.java:835)\r\n\tat org.junit.Assert.assertEquals(Assert.java:120)\r\n\tat org.junit.Assert.assertEquals(Assert.java:146)\r\n\tat com.steps.ScrollPage.user_should_color_of_text_while_scroll_the_page(ScrollPage.java:43)\r\n\tat ✽.user should color of text while scroll the page(file:///D:/Java%20Testing/Aspire/src/test/resources/featureFiles/ScrollPage.feature:6)\r\n",
  "status": "failed"
});
});