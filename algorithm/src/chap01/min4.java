package chap01;

public class min4 {
	//Q3. 네 값의 최솟값을 구하는 min4 메서드를 작성하세요

	static int min4(int a, int b, int c, int d) {
		int min = a;
		if(b<min) min = b;
		if(c<min) min = c;
		if(d<min) min = d;

		return min;
	}
	public static void main(String[] args) {
		System.out.println("min4(1,2,3,4) = " + min4(1,2,3,4));
		System.out.println("min4(3,9,2,5) = " + min4(3,9,2,5));
		System.out.println("min4(8,7,6,5) = " + min4(8,7,6,5));

	}

}
