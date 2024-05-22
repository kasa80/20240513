package app01;

//

// JUnit System.exit するメソッドをテストする
// https://qiita.com/HomMarkHunt/items/d2ed1c983a837f2e5a71


//import static org.junit.jupiter.api.Assertions.*;
//
//import org.junit.jupiter.api.Test;
//
//class ExitSample1Test {
//
//	@Test
//	void test() {
//		fail("まだ実装されていません");
//	}
//
//}

import static org.junit.Assert.*;

import java.security.Permission;

import org.junit.Before;
import org.junit.Test;

public class ExitSsmple1Test {

    // 手順1 独自Exceptinを作成(SecurityExceptionを継承してれば名前は何でもいいです)
    class ExitException extends SecurityException {
        private static final long serialVersionUID = 1L;
        public int state = 1;

        public ExitException(int state) {
            this.state = state;
        }
    }

    @Before
    public void setUp() {
        // SecurityManagerのインスタンス作成
        SecurityManager securityManager = new SecurityManager() {

            // 手順2 exitなどの権限を扱うcheckPermission(Permission)を上書き(Override)
            @Override
            public void checkPermission(Permission permission) {
                // 何書いてもいい
            }

            // 手順3 exitメソッドが呼ばれたときに、Exceptionを投げるように上書き(Override)
            @Override
            public void checkExit(int status) {
                throw new ExitException(status);
            }
        };
        // 手順4 設定した情報をsetする
        System.setSecurityManager(securityManager);
    }

    @Test
    public void test01() {
        try {
//        	ExitSample1.
          ExitSample1.main(new String[]{}); 
        } catch (ExitException e) {
            assertTrue(e.state == 1);
        }
    }

    @Test
    public void test02() {
        try {
            ExitSample1.main(new String[]{"args1"}); 
        } catch (ExitException e) {
        	System.out.println(e.state);
            assertTrue(e.state == 0);
        }
    }

    @Test
    public void test03() {
        try {
            ExitSample1.main(new String[]{"args1", "atgs2"}); 
        } catch (ExitException e) {
            assertTrue(e.state == 0);
        }
    }
    
    
    
    

}
