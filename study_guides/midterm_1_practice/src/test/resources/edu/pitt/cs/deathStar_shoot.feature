Feature: Shooting a planet
As a user
I want to be able to shoot planets
So that I can later confirm that the planet was damaged

  Background:
    Given a new deathStar
    And a new planet with 10 hit points

  Rule: Planet is damaged by shooting it

    Scenario: Shooting the planet damages it by 100 hit points
      When I shoot the planet
      Then the call returns "Wimpy planet was hit by the superlaser!"
      Then the planet's health becomes -90 hit points
