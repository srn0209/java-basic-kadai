package kadai_028;

public class JyankenExec_Chapter28 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Jyanken_Chapter28 jyanken = new Jyanken_Chapter28();

        // ② 自分のじゃんけんの手を入力
        String myHand = jyanken.getMyChoice();

        // ③ 対戦相手の手を乱数で取得
        String enemyHand = jyanken.getRandom();

        // ④ 勝敗判定を実行
        jyanken.playGame(myHand, enemyHand);

	}

}
