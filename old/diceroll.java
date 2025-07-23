class Diceroll {
	public static void main(String[] args) {
		
		System.out.println("これは1d○○のダイスを振るプログラムです");
		System.out.println("使用するダイスの数値を選択してください(1d100なら100を)");	//何面ダイスを振るか
		int dicename = new java.util.Scanner(System.in).nextInt();
		
		//指定された面数でダイス目を指定してるかの処理
		switch (dicename) {
			case 100:
				break;
			case 20:
				break;
			case 12:
				break;
			case 10:
				break;
			case 8:
				break;
			case 6:
				break;
			case 4:
				break;
			case 3:
				break;
			
			default:
			System.out.println("振れるダイスは1d100/20/12/10/8/6/4/3です。");
			System.exit(0);
		}
		
		int r = new java.util.Random().nextInt(dicename + 1);	//0~ダイス目の間でダイスを振る
		
		if (r == 0) {	//ダイス目が0になってしまった時に1を出力する苦肉の策
			//System.out.println("ダイス出力結果が0");
			r++;
		}
		
		System.out.println("1d" + dicename + "ダイスロールの結果: " + r);	//出力
	}
}
