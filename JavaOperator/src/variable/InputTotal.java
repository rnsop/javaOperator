package variable;

import java.util.Scanner;

public class InputTotal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("국어 점수를 입력하세요");
		int kor = scanner.nextInt();
		System.out.println("영어 점수를 입력하세요");
		int eng = scanner.nextInt();
		System.out.println("수학 점수를 입력하세요");
		int math = scanner.nextInt();
		// total 지역변수를 연산식으로 초기화함
		int total = kor + eng + math;
		System.out.println("총점:" + total);
	}

}
