class Diceroll {
	public static void main(String[] args) {

		//変数の宣言
		int dicenum;
		int random;

		System.out.println("これは1d○○のダイスを振るプログラムです");
		System.out.println("使用するダイスの数値を選択してください(1d100なら100を)");

		//無限ループ処理
		dice: while(true) {
			dicenum = new java.util.Scanner(System.in).nextInt(); //何面ダイスを振るか選ばせる

			//1d100,20,12,10,8,6,4,3以外はループを抜けられない
			switch (dicenum) {
				case 100:
					break dice;
				case 20:
					break dice;
				case 12:
					break dice;
				case 10:
					break dice;
				case 8:
					break dice;
				case 6:
					break dice;
				case 4:
					break dice;
				case 3:
					break dice;
				default:	//違う値が入力された時にループの最初に戻る処理
				System.out.println("振れるダイスは1d100/20/12/10/8/6/4/3です。"); 
			}
		}

		random = new java.util.Random().nextInt(dicenum + 1);	//ダイスを振る処理
		if (random == 0) random++;	//ダイス目が0になってしまった時に1を出力する苦肉の策
		System.out.println("1d" + dicenum + "ダイスロールの結果: " + random);	//ダイスロールの結果を出力する
	}
}
