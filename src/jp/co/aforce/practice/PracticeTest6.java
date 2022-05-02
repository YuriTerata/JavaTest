package jp.co.aforce.practice;

import java.util.Random;

public class PracticeTest6 {
	public static void main(String[] args) {
		//練習問題1
		Random random = new Random();
		int fortune = random.nextInt(5);

		switch (fortune) {
		case 1:
			System.out.println("吉です");
			break;

		case 2:
			System.out.println("中吉です");
			break;

		case 3:
			System.out.println("大吉です");
			break;

		default:
			System.out.println("凶です");
			break;
		}

		//練習問題2
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 7 == 0) {
				System.out.println(i);
				sum += i;
			}
		}
		System.out.println("７の倍数の総合計は" + sum);

		//練習問題3

		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				int k = i * j;
				System.out.printf("%3d", k);
			}
			System.out.println();

		}

	}

}
