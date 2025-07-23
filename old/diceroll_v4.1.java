import java.util.Random;
import java.util.InputMismatchException;
import java.util.Scanner;

class Diceroll {
	public static void main(String[] args) {

		System.out.println("サイコロを振るプログラムです");
		System.out.println("6面なら6を、それ以外なら任意の数字を入力してください");
		System.out.println("0を入力するとプログラムを終了します");

		//変数の宣言、初期化
		long dice = 0L;
		long random = 0L;

		//インスタンス化
		Scanner in = new Scanner(System.in);
		Random rnd = new Random();

		//無限ループ処理
		while (true) {
			try {
				dice = in.nextLong();	//何面ダイスを振るか選ばせる
				
				if ( dice == 0L ) {		//0を入力すると動作を終了する
					System.out.println("プログラムを終了します");
						break;
				}
				
				random = rnd.nextLong(dice) + 1; //ダイスを振る処理
				System.out.println("サイコロの結果: " + random);	//ダイスロールの結果を出力する
			}
			catch (InputMismatchException e) {		//英字を入力した際に例外処理
				System.out.println("整数以外は入力できません");
				in.next();		//これがないとScannerの引数が残っちゃう
			}
		}
	}
}
