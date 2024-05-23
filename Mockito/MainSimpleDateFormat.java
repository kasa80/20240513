package app01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainSimpleDateFormat {

	public static void main(String[] args) {
		MainSimpleDateFormat date = new MainSimpleDateFormat();
		date.getDateDisp0(date.getDate0());
	}

	public Date getDate0() {
		// ② 現在時刻を取得してくる値を 変数 date に格納
		Date date = new Date();
		return date;
	}

	public void getDateDisp0(Date date) {

		// SimpleDateFormat をオブジェクト化し、任意のフォーマットを設定
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		// フォーマット指定なし
		System.out.println(date);
		// フォーマット指定あり
		System.out.println(sdf.format(date));
	}
}
