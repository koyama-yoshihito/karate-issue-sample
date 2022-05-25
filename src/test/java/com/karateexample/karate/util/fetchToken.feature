@ignore
Feature: FetchToken

  Background:
    * def LM = Java.type('com.karateexample.karate.headers.GetAccessTokenLogModifier')
    * configure logModifier = new LM

  Scenario: FetchToken
    Given url 'http://localhost:8080'
    And header Authorization = 'dummy'
    And path '/token'
    When method post
    And status 200
    And match response == "token"
    And def token = response.body
