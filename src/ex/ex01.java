package ex;
/*
 * Topic: ISBN(International Standard Book Number) 是一種世界共通的書籍編碼方法，世界上任 何一本書籍之出版，皆有著唯一的一組 ISBN 碼。此碼由十個位數組成，每一位數可 以為 0~9 的任何一個數字，或者為 X ，代表此位數為 10 。其判斷方法如下，首先， 將此 ISBN 碼的十個位數分開，自左而右依次為第一位數，
 * 第二位數至第十位數，接 著進行第一次的累加，使得第二位數成為第一位數到第二位數的和，第三位數為第一 位數到第三位數的累加和，第十位數為第一位數到第十位數的累加和;進行完第一次 的累加和後，接著再依照相同之方法進行第二次的累加動作，我們稱此時最後所求得 之累加和為此 ISBN 碼之識別碼，
 * 倘若此識別碼為 11 的倍數，則此 ISBN 碼為合法 的。例如，若輸入之 ISBN 碼為 0 1 3 1 6 2 9 5 9 X ，則經由計算可得其識別碼為 165 ，乃是 11 之倍數，故此為一合法之 ISBN 碼。輸入一串 ISBN 碼，以空格隔開。
 * Date: 2016/12/05
 * Author: 105021010 邱信喆
 */

import java.util.Scanner;

public class ex01 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[][] v1 = new int[3][10];
		String str = scn.next();
		if (str.length() == 10) {
			for (int i = 0; i < 10; i++) {
				char v2 = str.charAt(i);
				if (v2 == 'x') {
					v1[0][i] = 10;
				} else {
					v1[0][i] = fun1(v2);
				}
				v1[1][0] = v1[0][0];
				v1[2][0] = v1[0][0];
				for (int j = 0; j < 2; j++) {
					for (int w = 0; w < 9; w++) {
						v1[j + 1][w + 1] = v1[j + 1][w] + v1[j][w + 1];

					}
				}
			}

			if (v1[2][9] % 11 == 0) {
				System.out.print("合法!");
			} else {
				System.out.print("不合法!");
			}
		}

		else {
			System.out.print("請重新輸入~");
		}
	}
	public static int fun1(char v2) {
		int v3 = 0;
		switch (v2) {
		case '1':
			v3 = 1;
			break;
		case '2':
			v3 = 2;
			break;
		case '3':
			v3 = 3;
			break;
		case '4':
			v3 = 4;
			break;
		case '5':
			v3 = 5;
			break;
		case '6':
			v3 = 6;
			break;
		case '7':
			v3 = 7;
			break;
		case '8':
			v3 = 8;
			break;
		case '9':
			v3 = 9;
			break;

		}
		return v3;

	}

}
