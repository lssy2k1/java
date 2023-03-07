package p214;

import java.util.Random;

public class Test4 {

	public static void main(String[] args) {
		int ar [] =new int[9];
		Random r = new Random();
		
		for(int i = 0; i < ar.length; i++) {
			ar[i] = r.nextInt(10) + 1;
		}
		
		for (int data : ar) {
			System.out.println(data);
			try {
				Thread.sleep(2000);//실행 간격을 두어서 서버 부하를 줄인다.
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
