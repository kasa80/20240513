package app01;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLSyntaxErrorException;

import org.junit.jupiter.api.Test;

class JdbcTest {

	@Test
	void testConn00_OK() {
		//fail("まだ実装されていません");
		Jdbc jdbc0 = new Jdbc();
		assertDoesNotThrow(() -> jdbc0.Conn00("test-db"));
	}

	@Test
	void testConn00_NG() {
		Jdbc jdbc0 = new Jdbc();
		assertThrows(SQLSyntaxErrorException.class, () -> {jdbc0.Conn00("error0");});
	}
	
}
