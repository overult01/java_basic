package reference;

public class Circle {
	
	Point point; //참조 변수로 사용(클래스 안에서 다른 클래스를 가져다 쓰는) 
	int radius;
	
	public Circle() {
		point = new Point();
	}
}
