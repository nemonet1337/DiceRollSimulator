import java.util.Random;
import java.lang.NumberFormatException;
import java.util.Scanner;

class Diceroll {
	public static void main(String[] args) {

		System.out.println("サイコロを振るプログラムです");
		System.out.println("6面なら6を、それ以外なら任意の数字を入力してください");
		System.out.println("exitを入力するとプログラムを終了します");

		//変数の宣言、初期化
		String dice = "0";
		int roll = 0;
		int random = 0;

		//インスタンス化
		Scanner in = new Scanner(System.in);
		Random rnd = new Random();

		//無限ループ処理
		while (true) {
			try {
				dice = in.nextLine(); //何面ダイスを振るか選ばせる
				
				if ( dice.equals("exit") ) {		//exitを入力すると動作を終了する
						System.out.println("プログラムを終了します");
							break;
				}
				
				roll = Integer.parseInt(dice);
				random = rnd.nextInt(roll) + 1; //ダイスを振る処理
				System.out.println("サイコロの結果: " + random);	//ダイスロールの結果を出力する
			}
			catch (NumberFormatException e) {
				System.out.println("数字以外は入力できません");
			}
		}
	}
}
