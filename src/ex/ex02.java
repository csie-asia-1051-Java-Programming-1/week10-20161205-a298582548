package ex;

/*
 * Topic: 輸入所使用的度數，換算夏月及非夏月之電費金額。
 * Date: 2016/12/05
 * Author: 105021010 邱信喆
 */
import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int v1 = scn.nextInt();
		float v2 = 0;
		float v3 = 0;
		if (v1 <= 120) {
			v2 = v1 * 2.1f;
		} else if (120 < v1 && v1 <= 330) {
			v2 = 120 * 2.1f + ((v1 - 120) * 3.02f);
		} else if (331 < v1 && v1 <=500) {
			v2 = 120 * 2.1f + 210 * 3.02f + ((v1 - 330) * 4.39f);
		} else if (501 < v1 && v1 <= 700) {
			v2 = 120 * 2.1f + 210 * 3.02f + 170 * 4.39f + ((v1 - 500) * 4.97f);
		} else if (v1 >= 701) {
			v2 = 886.2f + (170 * 4.39f) + (200 * 4.97f) + ((v1 - 700) * 5.63f);
		}
		if (v1 < 120) {
			v3 = v1 * 2.1f;
		} else if (120 < v1 && v1 <= 330) {
			v3 = 120 * 2.1f + (v1 - 120) * 2.68f;
		} else if (331 < v1 && v1 <= 500) {
			v3 = 120 * 2.1f + 210 * 2.68f + (v1 - 330) * 3.61f;
		} else if (501 < v1 && v1 <= 700) {
			v3 = 120 * 2.1f + 210 * 2.68f + 170 * 3.61f + (v1 - 500) * 4.01f;
		} else if (v1 < 701) {
			v3 = 814.8f + 170 * 3.61f + 200 * 4.01f + (v1 - 700) * 4.5f;
		}
		System.out.print("夏季電費:");
		System.out.println(v2);
		System.out.print("非夏季電費:");
		System.out.println(v3);
	}
}
