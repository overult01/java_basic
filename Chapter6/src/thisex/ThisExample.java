package thisex;

// Birthday 클래스 생성 
class Birthday{
	int day;
	int month;
	int year;
	
	public void setYear(int year) {
		// 자기자신 인스턴스의 변수값에다가 year를 넣어라 (내가 생성한 클래스인 Birthday의 year에 값을 넣을 목적 )
		this.year = year; // 자바에서는 set, get 메서드를 쓸 때, 같은 변수명을 씀. 따라서 이런 형식에 익숙해져야. 
		// 만약 위 코드에서 this 를 생략하면, year는 파라미터로 사용되는 year로 인식된다. 
	}
	
	public void printThis() {
		System.out.println(this);
	}
}

public class ThisExample {

	public static void main(String[] args) {

		Birthday b1 = new Birthday();
		Birthday b2 = new Birthday();
		
		System.out.println(b1);
		b1.printThis(); // 위에서 내가 만든 메서드 
		// b1의 메모리 주소값 == b1의 this의 메모리 주소값 임을 알 수 있다.
		// 여기에서 this는 현재 자기자신의 인스턴스의 주소값을 가리키는 것이라는 걸 알 수 있다. 

		System.out.println(b2);
		b2.printThis(); // 위에서 내가 만든 메서드 
		// b2의 메모리 주소값 == b2의 this의 메모리 주소값 임을 알 수 있다.
		
		
	}

}
