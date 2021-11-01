package Inheritance;

// 상속 예제 
public class Customer {

	protected int customerID;
	protected String customerName;
	protected String customerGrade;  // protected: 상속관계에서는 보인다(visible) -> 패키지가 달라도 상속관계면 ok. 
	int bonusPoint;  // 적립 포인트 . 접근 제어자가 명시x면 : default 
	double bonusRatio; // 고객의 등급에 따른 적립 비율 
	
	
//	public Customer() {
//		customerGrade = "SIVER";
//		bonusRatio = 0.01;
//		
//		// 하위 클래스가 생성될 때는, 상위 클래스도 생성됨을 확인하기 위해
//		System.out.println("상위 클래스인 Customer() 호출;");
//	}
	
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerGrade = customerName;
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public String showCustomerInfo() {
		return customerName + "님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.";
	}

	// get, set 펑션 
	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	
}
