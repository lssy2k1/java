package array;

public class P103 {

	public static void main(String[] args) {
		
		//int arr[] = new int[3];
//		int []arr = new int[3]; //이렇게도 배열 선언 가능
//		arr[0] = 10;
//		arr[1] = 20;
//		arr[2] = 30;//이 방법처럼 데이터베이스에서 데이터를 가져와서 배열에 넣는 방법이 더 많이 씀.
		int arr[] = {10,20,30};//이렇게 쓰는 경우는 거의 없다. 
		System.out.println(arr);

		for (int data:arr) {
			System.out.printf("%d\t", data);
		}
	}

}
