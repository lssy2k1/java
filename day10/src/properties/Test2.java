package properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Test2 {

	public static void main(String[] args) {
		Properties props = new Properties();
		String fileName = "file.txt";
		try (FileInputStream in = new FileInputStream(fileName)){
			props.load(in);//빨때 꽂는 행위를 try()안에 넣음으로써 리소스 자동해제를 함.
		} catch (IOException e) {
			System.out.println("문제발생!!!!!");
			return;//함수를 종료함으로 아래 구문이 실행 안되게 해줌.
		}
		String ip = props.getProperty("IP_ADDR");
		int port = Integer.parseInt(props.getProperty("PORT"));
		System.out.printf("%s 서버로 %d 포트로 접속",ip, port);
	}

}
