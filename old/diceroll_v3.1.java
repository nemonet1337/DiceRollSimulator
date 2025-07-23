import java.util.Random;
import java.util.Scanner;

class Diceroll {
	public static void main(String[] args) {

		//変数の宣言、初期化
		String dicenum = "0";
		int random = 0;
		int roll = 0;

		Scanner in = new Scanner(System.in);
		Random rnd = new Random();

		System.out.println("振れるダイスの種類は1d100/20/12/10/8/6/4/3です。");
		System.out.println("1d100を振る場合は100を入力してください、exitを入力するとプログラムを終了します");

		//無限ループ処理
		dice: while (true) {
			dicenum = in.nextLine(); //何面ダイスを振るか選ばせる

			//1d100,20,12,10,8,6,4,3以外はループを抜けられない
			switch (dicenum) {
				case "100":
					break;
				case "20":
					break;
				case "12":
					break;
				case "10":
					break;
				case "8":
					break;
				case "6":
					break;
				case "4":
					break;
				case "3":
					break;
				case "exit":	//exitを入力すると動作を終了する処理
				System.out.println("プログラムを終了します");
					break dice;
				default:	//違う値が入力された時にループの最初に戻る処理
				System.out.println("ダイスの数値が間違っています、振れるダイスの種類は1d100/20/12/10/8/6/4/3です。");
					continue;
			}
			
			roll = Integer.parseInt(dicenum);
			random = rnd.nextInt(roll) + 1; //ダイスを振る処理
			System.out.println("1d" + roll+ "ダイスロールの結果: " + random);	//ダイスロールの結果を出力する
			
		}
	}
}
