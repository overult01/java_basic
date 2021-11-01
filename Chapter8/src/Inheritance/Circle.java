package Inheritance;

// 합성 예제 (not 상속. 상속이 아닌 코드의 재사용인 경우) 
public class Circle {
	
	
	// 이것은 상속이 아니라(일반적 -> 구체적 관계), 'point'를 'circle'에 활용하고 싶은 것 뿐. 
	Point point;  // 합성. has - a 관계. 참조변수를 가져다가 쓰는 것. 
	
	private int radius;
	
	public Circle() {
		point = new Point();
	}
}
