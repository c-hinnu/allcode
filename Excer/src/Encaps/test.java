package Encaps;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class test {

	@Test
	 void testcalculateinterest() {
	 Interestcalculator t = new Interestcalculator();
     float ev=200;
	float av=t.calculateinterest(200, 10, 10);
	assertEquals(ev,av);

}
}
