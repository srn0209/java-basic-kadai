package kadai_028;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Jyanken_Chapter28 {
    // じゃんけんの手を日本語に変換するマップ
    private static final Map<String, String> handMap = new HashMap<>();
    static {
        handMap.put("r", "グー");
        handMap.put("s", "チョキ");
        handMap.put("p", "パー");
    }

    // 自分の手を入力する
    public String getMyChoice() {
        Scanner scanner = new Scanner(System.in);
        String myHand = "";

        System.out.println("自分のじゃんけんの手を入力しましょう");
        System.out.println("グーはrockのrを入力しましょう");
        System.out.println("チョキはscissorsのsを入力しましょう");
        System.out.println("パーはpaperのpを入力しましょう");

        while (true) {
            myHand = scanner.nextLine();
            if (handMap.containsKey(myHand)) {
                break;
            } else {
                System.out.println("正しい入力ではありません。r, s, p のいずれかを入力してください。");
            }
        }

        return myHand;
    }

    // 対戦相手の手を乱数で選ぶ
    public String getRandom() {
        String[] hands = { "r", "s", "p" };
        int index = (int) Math.floor(Math.random() * 3);
        return hands[index];
    }

    // じゃんけんを行う
    public void playGame(String myHand, String enemyHand) {
        System.out.println("自分の手は " + handMap.get(myHand) + ", 対戦相手の手は " + handMap.get(enemyHand));

        if (myHand.equals(enemyHand)) {
            System.out.println("あいこです");
        } else if (
            (myHand.equals("r") && enemyHand.equals("s")) ||
            (myHand.equals("s") && enemyHand.equals("p")) ||
            (myHand.equals("p") && enemyHand.equals("r"))
        ) {
            System.out.println("自分の勝ちです");
        } else {
            System.out.println("自分の負けです");
        }
    }
}
