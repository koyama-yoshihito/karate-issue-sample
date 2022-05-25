Feature: Sample Testing

  Background:
    * configure headers =
    """
      {
        Authorization : #(authorizationHeader),
      }
    """

  Scenario: CanGetResponse
    Given url 'http://localhost:8080'
    And path '/hello'
    When method get
    Then status 200
    And match response == "hello"
