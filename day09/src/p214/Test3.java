package p214;

import java.io.IOException;
import java.io.InputStreamReader;

public class Test3 {

	public static void main(String[] args) {
		double a = 0;
		double result = 10 / a;
		System.out.println(result);
		try {
			Thread.sleep(5000);// 빨간줄 오류가 나는데 치명적인 오류로 종료될 수 있으니 try ctach쓰세요 나옴.
							   // 쓰레드 5초 쉬기
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		InputStreamReader ir = new InputStreamReader(System.in);
		// InputStreamReader는 콘솔입력을 읽어오기 위한 스트림
		System.out.println("input character");
		int b = 0;
		try {
			b = ir.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(b);
		System.out.println("end");
	}

}
