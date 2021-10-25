package thisex;

// this 예약어의 활용 3가지 (1~3번호로 아래서 확인) -> 1, 3 번을 많이 씀 

// Person이라는 클래스 만들기 
class Person{
	
	// 이 클래스의 멤버변수 name, age 
	String name;
	int age;
	
	
	// 생성자 만들기. 디폴트 생성자
	public Person() {
		
		// (2) this 를 이용하여 다른 생성자를 호출할 때는 그 이전에 어떠한 statement도 사용할 수 없다. (어떤 문장도 쓸 수 없다 )
		// : name은 Person이라는 인스턴스가 다 생성되어야(메모리가 잡히고) 만들어지는 멤버변수.
		// 원래 Person에서 생성을 하려고 들어감 -> 아래에서는 this로 다른 생성자 호출 -> 따라서 그 다른 생성자에서 초기화가 다 끝나야 statement를 쓸 수 있다. 
		// name = "test"; <- 생성자에서 다른 생성자를 호출하는 this로 사용할 때, 이 this는 가장 처음 나오는 statement여야 한다. 
		
		
		// this 예약어를 통해서 아래 클래스 호출 가능.생성자가 여러개일 경우 매개변수, 타입이 맞으면 그거에 맞는 생성자가 알아서 호출이 될 것임. 
		this("이름없음", 1);
	}
	
	
	// (1) Person을 만들 때, 이름하고 나이를 파라미터로 받겠다. 
	public Person(String name, int age) {
		this.name = name;
		this.age = age; 
	}
	
	
	// (3) this는 자기자신의 인스턴스 주소값을 반환할 수 있다.
	public Person returnSelf() { // 두 번째 처럼 데이터 타입은 자기자신 클래스명 기입 ex. Person 
		return this; // 현재 인스턴스의 주소값 반환 
	}
	
}

public class CallAnotherConst {

	public static void main(String[] args) {

		Person p1 = new Person(); 
		System.out.println(p1.name);   // "이름없음" 출력 
		
		System.out.println(p1.returnSelf()); // 3번 결과 출력. 현재 인스턴스의 주소값을 반환하는 것. 
	}

}
