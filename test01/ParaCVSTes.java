package app01;

import static org.junit.Assert.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ParaCVSTest {

	public ParaCVSTest() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

// JUnit5のParameterizedTestで網羅的なテストをする
// https://qiita.com/n_slender/items/6f5082d4a9862d611ff8
	
	public static int tax(int price) {
		   return (int) Math.floor(price * 0.10); 
		}
	
	
	@ParameterizedTest
	@CsvSource({
	   "9,0",
	   "10,1",
	   "100,10",
	})
	void shouldReturnTax(int price, int expected) {
	     int actual = ParaCVSTest.tax(price);

	     assertEquals(expected, actual);
	}

	
	
	public static int add1(String[] args) {
		   return  args.length; 
		}
	
	
	@ParameterizedTest
	@CsvSource({
	   "9,'',2",
	   "10,1,2",
	   "120,12,2"
	})
	void stringReturn(String arg1, String arg2,int num) {
		String[] strs = new String[];
		for( int i = 0 ; i < 3 ; i++) {
			int a = 1;
		}
		int i = 0;
		if ( arg1 != "" ) {
			strs[i] = arg1;
			i++;
		}
		if ( arg2 != "" ) {
			strs[i] = arg2;
			i++;
		}
//	    int actual = ParaCVSTest.add1(new String[] {arg1, arg2});
	    int actual = ParaCVSTest.add1(strs);

	     assertEquals(num,actual);
	}
	
}
