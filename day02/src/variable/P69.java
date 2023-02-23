package variable;

public class P69 {

	public static void main(String[] args) {
		String str = "abcdef";
		str = str.toUpperCase();
		System.out.println(str);
		
		String str2 = str.replace('A', 'Z');
		System.out.println(str2);
		//str. .을 찍게 되면 주소를 갖고 무엇을 할 것이다를 표현하게 되는 것

		int lng = str.length();
		System.out.println(lng);

		int t = str.indexOf("B");
		System.out.println(t);
		
		char c = str.charAt(0);
		System.out.println(c);
		
		String str3 = str.substring(1, 3);
		System.out.println(str3);

		String email = "jmlee3838@sontonesol.com";
		String id = "";
		String domain = "";
		//id = email.substring(0, 5);
		//domain = email.substring(6, 17);
		id = email.substring(0, email.indexOf('@'));
		domain = email.substring(email.indexOf('@') + 1, email.length());
		
		
		System.out.printf("%s, %s",id, domain);
	}

}
