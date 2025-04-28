package edu.pitt.cs;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;
import gov.nasa.jpf.vm.Verify;
import static org.junit.Assert.*;

public class JPFTest extends TestJPF {
	@Test
	public void testStop() {
		if (verifyNoPropertyViolation() == false) {
			return;
		}

		// TODO: Initialize lineLength to test all lengths between 0 ~ 10.
		int lineLength = Verify.getInt(0, 10);

		Bus bus = new Bus();
		bus.stop(lineLength);
		int p = bus.getPassengerNum();

		// TODO: Invariant assertion for lower and upper bounds of p.
		

		// TODO: Invariant assertion for relationship between p and lineLength.

	}

	@Test
	public void testTrip() {
		if (verifyNoPropertyViolation() == false) {
			return;
		}

		Bus bus = new Bus();
		bus.trip();
		int p = bus.getPassengerNum();
		int m = bus.getMoney();

		// TODO: Invariant assertion for lower and upper bounds of p.

		// TODO: Invariant assertion for lower and upper bounds of m.

		// TODO: Invariant assertion for relationship between p and m.

	}
}
