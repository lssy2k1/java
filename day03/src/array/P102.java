package array;

public class P102 {

	public static void main(String[] args) {
		//int arr[] = new int[];//사이즈가 정해저 있지 않다. arr가 초기화되어있지 않다는 오류 발생.
		//int a = 100; int arr[] = new int[3]//앞의 경우엔 기본타입(프리미티브), 뒤의 경우엔 참조변수(레퍼런스)
		int a = 100;
		
		int arr[] = new int[3];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		System.out.println(arr);
		
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.printf("%d\t", arr[i]);
		}
		
		System.out.println("Type 2");//새로운 형식의 for문 ()사이에 콜론이 있고 오른쪽엔 arr명, 왼쪽엔 자료형 + data
		for (int data:arr) {
			System.out.printf("%d\t", data);	//일련번호를 달기는 어렵다.		
		}
	}

}
