package edu.pitt.cs;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.hu.De;

public class DeathStarStepDefinitions {
    DeathStar deathStar;
    Planet planet;
    String ret;

    @Given("a new deathStar")
    public void aNewDeathStar() {
        deathStar = new DeathStar();
    }

    @Given("a new planet with {int} hit points")
    public void aNewPlanetWithHitPoints(int hitPoints) {
        planet = new Planet(hitPoints);
    }

    @When("I shoot the planet")
    public void iShootThePlanet() {
        ret = deathStar.shoot(planet);
    }

    @Then("the call returns {string}")
    public void theCallReturns(String string) {
        assertEquals(string, ret);
    }

    @Then("the planet's health becomes {int} hit points")
    public void thePlanetSHealthBecomesHitPoints(int hitPoints) {
        assertEquals(hitPoints, planet.getHitPoints());
    }
}
