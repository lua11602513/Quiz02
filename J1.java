
package test2;
import java.util.*;

public class J1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		int c = 0;
		System.out.println("�K�X��J����");
		System.out.print("�п�J�K�X:");
		a = sc.nextInt();
		while (true) {
			System.out.print("�ЦA��J�@���K�X:");
			b = sc.nextInt();
			if (a == b) {
				System.out.println("�K�X���T");
				break;
			}  else if (a != b) {
				System.out.println("�P�Ĥ@����J�����P !");
				c++;
			}
			if (c == 3) {
				throw  new  RuntimeException("��J�T�����~�I�{������I");
			}
		}
	}
}