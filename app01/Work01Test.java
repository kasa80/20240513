package app01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Work01Test {

	@Test
	void test01() {
		//fail("まだ実装されていません");
		Work01 work = new Work01();
		assertEquals(work.add1(1, 2),3);
	}

}
