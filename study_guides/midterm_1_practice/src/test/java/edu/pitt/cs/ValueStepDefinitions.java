package edu.pitt.cs;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

public class ValueStepDefinitions {
	Value value;

	@Given("a Value")
	public void aValue() {
		value = new Value();
	}

	@When("I call incVal {int} time(s)")
	public void iCallIncValTimes(int n) {
		for (int i = 0; i < n; i++) {
			value.incVal();
		}
	}

	@Then("getVal returns {int}")
	public void getValReturns(int n) {
		int ret = value.getVal();
		assertEquals(n, ret);
	}
}
