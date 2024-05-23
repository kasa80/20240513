package app01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MockitoCalcTest1 extends MockitoCalc {

	@Test
	void testAdd() {
		//fail("まだ実装されていません"); // TODO
		MockitoCalc calc = new MockitoCalc();
		int ret = calc.add();
		assertEquals(3, ret);
	}

}
