package ifCondition;
/*
 * @ Date : 2015.07.08
 * @ Author : me
 * @ Story : IF만 있는 구문에 관한 문법
 *  * */
public class OnlyIf {
	public static void main(String[] args) {
		int x=1, y=2;
		if ((x==1)&&(y==1)) { // && 은 엔퍼센트라 읽는다.
			System.out.println("x는 1이면서 y도 2이다.");
			
		}
		if ((x==1)||(y==1)) { // || 은 컬럼이라 읽는다.
			System.out.println("x가 1이거나 y가 2이다.");
			
		}
		
	}
}
