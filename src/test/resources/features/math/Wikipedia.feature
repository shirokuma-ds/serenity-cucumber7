@WikipediaFeature
Feature: Test Wikipedia

  Scenario: Search on Wikipedia
    Given I open Wikipedia
    When I search 'banana'
    Then Page search found