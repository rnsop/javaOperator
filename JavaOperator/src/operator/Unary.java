package operator;
/*
 * @ Date : 2015.07.08
 * @ Author : me
 * @ Story : 단항 연산자 문법
 * */
public class Unary {
	/*
	 * 단항 연산자
	 * i++(후위연산자) 또는  ++i(전위연산자)
	 * */
	public static void main(String[] args) {
		int i=5, j=0, x=5, y=0;  //지역변수는 디폴트 값으로 초기화
		
		j = i++; //후위형은 변수값을 읽어온 후 연산한다.
		y = ++x; //전위형은 x값을 증가시키고 연산한다.
		// i = i + 1;
		System.out.println("j의 값은\t"+j+"\t입니다");
		System.out.println("y의 값은\t"+y+"\t입니다");
	}
}
