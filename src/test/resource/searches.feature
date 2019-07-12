@search
Feature: Search
  As a end user
  I want to search for a product
  So that i can view respective product


  @smoke
Scenario Outline: Search for a product
  Given I am Homepage
  When I search for a product "product"
  Then I should be able to see respective product
    Examples:
      | product |
      | nike    |








