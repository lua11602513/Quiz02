import java.util.Scanner;

public class J1 {

public static void main(String[] args) {
	outsideloop:for(int j=1 ;j<=3;j++) { 

	insideloop:for(int i=1;i<=3;i++) {

	System.out.print("密碼輸入測試:\n");
	Scanner wrt = new Scanner(System.in);
	int setpass1=wrt.nextInt();

	System.out.print("請輸入四位整數密碼:\n");
	Scanner wrti = new Scanner(System.in);
	int setpass2=wrti.nextInt();

	if (setpass1==setpass2){
	System.out.print("密碼正確");
	break outsideloop;
	} 
	else if (setpass1 !=setpass2){
	System.out.print("\n");

	if (j==3) {
		throw new RuntimeException("輸入三次錯誤！程式停止！");
	}
	}
	}
	}


	}
	}