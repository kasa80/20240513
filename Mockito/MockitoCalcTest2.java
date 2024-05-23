package app01;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Matchers.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
//import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;


class MockitoCalcTest2 extends MockitoCalc {

	@InjectMocks
	private MockitoCalc calc = new MockitoCalc();

	@Mock
	private MockitoSubCalc subCalc;

    @BeforeEach
    public void initMocks() {
        MockitoAnnotations.initMocks(this);
        System.out.println("initMocksが呼ばれました。");
    }

	@Test
	public void test() {
		//fail("まだ実装されていません"); // TODO

		// SubCalcクラスの「getValA」メソッドをモックし、実行された場合は3を返す。
        Mockito.doReturn(3).when(subCalc).getValA();

        // SubCalcクラスの「getValB」メソッドをモックし、実行された場合は4を返す。
        Mockito.doReturn(4).when(subCalc).getValB();

        // SubCalcクラスの「getValC」メソッドをモックし、実行された場合は5を返す。
        Mockito.doReturn(5).when(subCalc).getValC(anyInt(), anyInt());

        // 実行して結果を受け取る
		int actual = calc.add();

		// 期待値の設定
		int expected = 12;

		// 検証
		assertEquals(expected,actual);
		
	}

	@Test
	public void test02(){
		// ここは空振りするけど、initMocksは実行される。
	}
	
	
}
