package properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Test {

	public static void main(String[] args) {
		Properties props = new Properties();
		String fileName = "file.txt";
		FileInputStream in = null;
		try {
			in = new FileInputStream(fileName);//in이라는 파이프를 꽂아서 정보를 가져올거다.
			props.load(in);
		} catch (IOException e) {//위 두가지 코드에 대해 익셉션이 발생하면 IOException으로 한번에 잡겠다.
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {//정상적으로 끝나도, 비정상적으로 끝나도 close는 실행해줘야 한다.
			try {
				in.close();
			} catch (IOException e) {//1초 후 in.close를 실행하게 작성을 하면 Thread.sleep(1000)을 try-catch 해야함... 무한반복
				e.printStackTrace();
			}
		}
		String ip = props.getProperty("IP_ADDR");
		System.out.println(ip);
	}

}
