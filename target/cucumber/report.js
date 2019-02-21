$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/etsy.feature");
formatter.feature({
  "name": "Etsy search functionality",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@etsy"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Testing any product search",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user on the etsy home page",
  "keyword": "Given "
});
formatter.step({
  "name": "user search for \"\u003canything\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user see should see \"\u003canything\u003e\" in the title\u003e",
  "keyword": "Then "
});
formatter.examples({
  "name": "searching for any product",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "anything"
      ]
    },
    {
      "cells": [
        "pc"
      ]
    },
    {
      "cells": [
        "watch"
      ]
    },
    {
      "cells": [
        "pencil"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Testing any product search",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@etsy"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user on the etsy home page",
  "keyword": "Given "
});
formatter.match({
  "location": "EtsySearch_steps.user_on_the_etsy_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user search for \"pc\"",
  "keyword": "When "
});
formatter.match({
  "location": "EtsySearch_steps.user_search_for(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user see should see \"pc\" in the title\u003e",
  "keyword": "Then "
});
formatter.match({
  "location": "EtsySearch_steps.user_see_should_see_in_the_title(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Testing any product search",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@etsy"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user on the etsy home page",
  "keyword": "Given "
});
formatter.match({
  "location": "EtsySearch_steps.user_on_the_etsy_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user search for \"watch\"",
  "keyword": "When "
});
formatter.match({
  "location": "EtsySearch_steps.user_search_for(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user see should see \"watch\" in the title\u003e",
  "keyword": "Then "
});
formatter.match({
  "location": "EtsySearch_steps.user_see_should_see_in_the_title(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Testing any product search",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@etsy"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user on the etsy home page",
  "keyword": "Given "
});
formatter.match({
  "location": "EtsySearch_steps.user_on_the_etsy_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user search for \"pencil\"",
  "keyword": "When "
});
formatter.match({
  "location": "EtsySearch_steps.user_search_for(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user see should see \"pencil\" in the title\u003e",
  "keyword": "Then "
});
formatter.match({
  "location": "EtsySearch_steps.user_see_should_see_in_the_title(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});