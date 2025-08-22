package kadai_015;

public class Car_Chapter15 {
    // フィールド（初期値付き）
    private int gear = 1;   // 初期ギアは1速
    private int speed = 10; // 初期速度は10km

    // ギアチェンジメソッド
    public void changeGear(int afterGear) {
        gear = afterGear;

        // ギアに応じて速度を設定
        switch (gear) {
            case 1:
                speed = 10;
                break;
            case 2:
                speed = 20;
                break;
            case 3:
                speed = 30;
                break;
            case 4:
                speed = 40;
                break;
            case 5:
                speed = 50;
                break;
            default:
                speed = 10; // 上記以外のギアは10km
        }
    }

    // 走行メソッド（速度を表示）
    public void run() {
        System.out.println("現在の速度は " + speed + "km です。");
    }
}
