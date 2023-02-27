package array;

public class P120 {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6,7,8,9,10};
		int sum = 0 ;
		double avg = 0.0;
		for (int c : a) {
			sum += c;
		}
		avg = (sum * 1.0) / a.length;
		System.out.printf("sum : %d, avg: %.2f",sum, avg);
	}

}
