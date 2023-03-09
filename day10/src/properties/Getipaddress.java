package properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Getipaddress {
	public static String getIPAddress() {
		String ipAddr = null;
		Properties props = new Properties();
		String fileName = "file.txt";
		try (FileInputStream in = new FileInputStream(fileName)){
			props.load(in);
		} catch (IOException e) {
			System.out.println("문제발생!!!!!");
		}
		ipAddr = props.getProperty("IP_ADDR");
		return ipAddr;
	}
}
