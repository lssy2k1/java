package variable;

public class P64 {

	public static void main(String[] args) {
		int a = 10;
		double d = 10.2355;
			//int와 double은 기본자료형
		String str1 = "abc";
		String str2 = "abc";
		str1 = "def";//이 경우 abc값이 사라지는 것이 아니라
					 //def가 새로 생기고 str1이 그 값을 가리키게 됨
			//레퍼런스타입이다.(참조자료형), 그래서 색이 다름.
		
		System.out.printf("%d\t%4.2f\t%s\n",a,d,str1);
			//출력되는 형식이 먼저 나오고 뒤에는 순서대로 넣어라
			//package에서 propreties에서 체크한 후 버전 맞춰주기!
			//printf에서 %f는 전체자리수 4. 소수점 2에서 반올림이다.
			//전체자리수는 별 의미가 없고 앞이 두자리인데 전체자리수 4를 주면 빈공간으로 둔다.
			//\t를 통해 출력을 해보면 간격이 넓어짐.
			//\t는 일정간격 떨어트려줌 \n은 줄바꿈
		
		if(str1 == str2) {
			//str1과 str2의 주소값을 비교. 공부할때만 씀.
			System.out.println("OK");
		}
		if(str1.equals(str2)) {//equals는 실제 string과 string을 비교
			System.out.println("OOK");
		}
		
		String str3 = new String("abc");
		String str4 = new String("abc");
		
		if(str3 == str4) {
			//new로 생성하면 스트링풀이 아닌 다른 곳에 각각 저장이 된다.
			//따라서 ==로 비교 시 주소값이 다름. equals는 문자열을 비교하기 때문에 같음.
			System.out.println("oook");
		}
		if(str3.equals(str4)) {
			System.out.println("ooook");
		}
			//str은 그냥 문자열을 넣어도 되지만 new로 만들 수도 있다.
			//String은 내용 변경이 불가능하다.(객체내 값 변경 불가능)
			//리터럴을 바로 입력한 데이터는 하나의 객체를 공유(주소값 같아짐)
	}

}
