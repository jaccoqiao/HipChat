# HipChat

HipChat MessageParser API parses message and returns results in JSON. The API parses the following data
from the input: Mentions, Emoticons and Links. JSON formats returned by the API is like this:
{
  "mentions": [
    "bob",
    "john"
  ],
  "emoticons": [
    "success"
  ],
  "links": [
    {
      "url": "https://twitter.com/jdorfman/status/430511497475670016",
      "title": "Justin Dorfman on Twitter: &quot;nice @littlebigdetail from @HipChat (shows hex colors when pasted in chat). http://t.co/7cI6Gjy5pq&quot;"
    }
  ]
}

Endpoint:
POST parse/

Library used:
1. ANTLR4
This API uses ANTLR to define the parsing rules. I chose this library for 2 reasons: 1) Make the API code
clean; 2) The parsing rules defined in the ANTLR gramma file are easy to understand and maintain.

2. Spring Boot Web Starter
This library makes setting up server framework very easy and handles the object serialization to JSON.

3. JUnit and Mockito
Both of them make unit tests easy to verify the code logic. Mockito allows to mock the external dependency's
behavior.

TODO:
1. Need to create integration tests to test the integration with external resources.
2. Need to define exceptions in service and throw them with meaningful messages rather than throw those exception
from JAVA library.
3. Need to build access check and reject unauthorized requests.
4. Messages may need to be encrypted during transmission.