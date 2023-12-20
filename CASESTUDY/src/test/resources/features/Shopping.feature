Feature: Shopping

Background: User Login
Given User is on shopping page
When User enters "sanjusanal" and "Abc1234"

Scenario: Add items to cart

When User add an item to cart
Then Items must be added to cart

Scenario: Delete an Item
Given Items must be added to cart
Then Delete an item from Cart

Scenario: Place Order
Given Items must be added to cart
Then Place order