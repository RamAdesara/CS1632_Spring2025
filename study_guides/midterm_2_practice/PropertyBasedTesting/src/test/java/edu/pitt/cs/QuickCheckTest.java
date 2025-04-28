package edu.pitt.cs;
import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.generator.*;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;

@RunWith(JUnitQuickcheck.class)
public class QuickCheckTest {
	@Property
	public void testStop(@InRange(minInt = 0, maxInt = 10) int lineLength) {
		Bus bus = new Bus();
		bus.stop(lineLength);
		int p = bus.getPassengerNum();

		// TODO: Invariant assertion for lower and upper bounds of p.

		// TODO: Invariant assertion for relationship between p and lineLength.

	}
	
	@Property
	public void testTrip() {
		Bus bus = new Bus();
		bus.trip();
		int p = bus.getPassengerNum();
		int m = bus.getMoney();

		// TODO: Invariant assertion for lower and upper bounds of p.

		// TODO: Invariant assertion for lower and upper bounds of m.

		// TODO: Invariant assertion for relationship between p and m.

	}	
}
