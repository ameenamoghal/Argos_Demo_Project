@search
Feature: Search
  As a end user
  I want to search for a product
  So that i can view respective product

  @regression
  Scenario Outline: search for a product
    Given:I am on homepage
    When :I search for a product
    Then:I should be able to see respective product

    Examples:
        nike  |
          | adidas
