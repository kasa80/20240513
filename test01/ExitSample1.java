package app01;

public class ExitSample1 {

//	public ExitSample1() {
//		// TODO 自動生成されたコンストラクター・スタブ
//	}
//
//	public static void main(String[] args) {
//		// TODO 自動生成されたメソッド・スタブ
//
//	}
	public static void main(String[] args) {

        if (args.length == 0) {
            System.exit(1); // JVMが終了します        
        }

        System.exit(0); // JVMが終了します
    }
}
