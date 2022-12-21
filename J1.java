
package test2;
import java.util.*;

public class J1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		int c = 0;
		System.out.println("密碼輸入測試");
		System.out.print("請輸入密碼:");
		a = sc.nextInt();
		while (true) {
			System.out.print("請再輸入一次密碼:");
			b = sc.nextInt();
			if (a == b) {
				System.out.println("密碼正確");
				break;
			}  else if (a != b) {
				System.out.println("與第一次輸入的不同 !");
				c++;
			}
			if (c == 3) {
				throw  new  RuntimeException("輸入三次錯誤！程式停止！");
			}
		}
	}
}