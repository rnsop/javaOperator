package ifCondition;

public class IfElse {
	public static void main(String[] args) {
		int x=1, y=2;
		if ((x==3)&&(y==1)) { // && 은 엔퍼센트라 읽는다.
			System.out.println("x는 1이면서 y도 2이다.");
			
		}else if((x==3)||(y==1)) { // || 은 컬럼이라 읽는다.
			System.out.println("x가 1이거나 y가 2이다.");
			
		}
		else{
			System.out.println("해당사항이 없습니다.");
		}
		
	}
}
