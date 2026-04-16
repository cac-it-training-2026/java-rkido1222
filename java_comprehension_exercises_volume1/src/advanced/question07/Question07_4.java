package advanced.question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question07_4 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		// 登録済み商品（値は変更可）
		String[] itemNames = { "ノート", "ボールペン", "消しゴム", "はさみ", "のり" };
		// 単価（値は変更可）
		int[] prices = { 120, 80, 50, 250, 100 };
		// 購入数（変更不可）
		int[] amounts = new int[5];

		// TODO: 実装ここから
		int sum = 0;
		double wari = 0;

		for (int i = 0; i < 5; i++) {
			System.out.print(itemNames[i] + "の購入数:>");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String str = reader.readLine();
			amounts[i] = Integer.parseInt(str);

		}

		for (int i = 0; i < 5; i++) {
			sum += prices[i] * amounts[i];
		}

		System.out.println("割引前合計：" + sum);
		if (sum >= 5000) {
			wari = sum * 0.9;
			System.out.println("割引適用(10%OFF):" + wari);
			System.out.println("税込金額:" + (wari + (wari / 10)) + "円");

		} else {
			System.out.println("税込金額:" + (sum + (sum / 10)) + "円");

		}
	}

}
