# Feature: incVal interface

# As a user
# I want to be able to incVal the Value
# So that I can later getVal the Value to see how many times I inced.

# Background: 
#   Given a Value

# Rule: getVal returns a number equal to the number of times incVal was called.
 
#   Scenario: if I call incVal 0 times, then getVal returns 0
#     When I call incVal 0 times
#     Then getVal returns 0

#   Scenario: if I call incVal 1 time, then getVal returns 1
#     When I call incVal 1 time
#     Then getVal returns 1

#   Scenario: if I call incVal 2 times, then getVal returns 2
#     When I call incVal 2 times
#     Then getVal returns 2




Feature: Add stress to pitcher

Background:
  Given a pitcher

Rule: On first call to addStress(int), getStress() returns the amount of stress added.

Scenario: After adding 10 stress to pitcher, getStress returns 10.
When 10 stress is added to pitcher
Then getStress returns 10

Rule: On subsequent calls to addStress(int), stress is accumulated.

Scenario: After adding 20 stress and then 30 stress to pitcher, getStress returns 50.
When 20 stress is added to pitcher
When 30 stress is added to pitcher
Then getStress returns 50
