package chap01;

import java.util.Scanner;
	//조건판단과 분기
public class judgeSign {

	public static void main(String[] args) {
		//입력한 정숫값의 부호를 판단해 출력
		//Q. 입력한 정숫값이 양수인지 음수인지 0인지 판단합니다
		Scanner input = new Scanner(System.in);
		int num;

		System.out.print("정수를 입력하세요 : ");
		num = input.nextInt();

		if(num>0) {
			System.out.println("이 수는 양수입니다");
		}else if(num<0) {
			System.out.println("이 수는 음수입니다");
		}else {
			System.err.println("이 수는 0입니다");
		}
	}
}
