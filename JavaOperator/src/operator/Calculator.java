package operator;

import java.util.Scanner;

/*
 * @ Date : 2015.07.08
 * @ Author : me
 * @ Story : 계산기 만들기
 * */
public class Calculator {
	public static void main(String[] args) {
		/*
		 * 스캐너로 두 값을 입력받아서
		 * 사칙연산 결과가 나오도록 하세요
		 * */
		int x, y, add, sub, gob, mok, nmg;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		x = scanner.nextInt();   			// next는 커서 다음 글자(숫자)를 변수에 할당하라
		System.out.println("숫자를 입력하세요");
		y = scanner.nextInt();
		
		 add = x+y;
		 sub = x-y;
		 gob = x*y;
		 mok = x/y;
		 nmg = x%y;
		 System.out.println(x+"+"+y+"=\t"+add);
		 System.out.println(x+"+"+y+"=\t"+sub);
		 System.out.println(x+"+"+y+"=\t"+gob);
		 System.out.println(x+"+"+y+"=\t"+mok);
		 System.out.println(x+"+"+y+"=\t"+nmg);
	
	}
}
