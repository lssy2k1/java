package ifcontrol;

public class P91 {

	public static void main(String[] args) {
		int a = 20;
		int b = 40;
		int c = 30;
		
		//세 수의 최대 값과 최소 값을 구하시오.
		int max = 0;
		int min = 0;

//풀이1		
//		max = (a > b) ? (b > c) ? a : (a > c) ? a : c : (b > c) ? b : c;
//		min = (a < b) ? (b < c) ? a : (a < c) ? a : c : (b < c) ? b : c;
//위에는 불필요한 과정이 추가됨(내가 품)		
		max = (a > b) ? ((a > c) ? a : c) : (b > c) ? b : c;
		min = (a < b) ? ((a < c) ? a : c) : (b < c) ? b : c;
		
//풀이2		
//		if (a >= b) {
//			max= a;
//			min= b;
//		}else {
//			max=b;
//			min=a;
//			
//		}if (c>max)
//			max=c;
//		if(c<min)
//			min=c;

		
//풀이3
//		if (a > b) {
//			max = a;
//			min = b;
//			if (a <c) {
//				max = c;
//			}else {
//				if (b > c) {
//					min = c;
//				}
//			}
//		}else  {
//			max = b;
//			min = a;
//			if (b < c) {
//				max = c;
//			}else {
//				if (a > c) {
//					min = c;
//				}
//			}
//		}
		
//		풀이4
//		max = a;
//		
//		if (b > max) {
//			max = b;
//		}if (c > max) {
//			max = c;
//		}
//		
//		min = a;
//		if (b < min) {
//			min = b;
//		}if (c < min) {
//			min = c;
//		}
		
//		풀이5(Math 이용)
//		if (a > b) {
//			max = Math.max(a, c);
//			min = Math.min(b, c);
//		}else {
//			max = Math.max(b, c);
//			min = Math.min(a, c);
//		}
		
		System.out.printf("MAX : %d, MIN : %d",max,min);
	}

}
