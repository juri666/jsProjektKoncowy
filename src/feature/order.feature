Feature: take order
  Scenario: Order product
    Given logged in
    When find product
    Then point product details
    Then  click modal
    Then get confirmation
    Then get checkout
    Then take screenshot