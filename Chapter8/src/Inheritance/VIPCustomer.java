package Inheritance;

// 상속 예제: 더 구체적인 VIP 고객이 일반 고객을 extends( 상속받음 ) 
public class VIPCustomer extends Customer{

	private double salesRatio;
	private int agentID;
	
	
	public VIPCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		
		System.out.println("하위 클래스인 VIPCustomer() 호출 확인 ;");
	}
	
	public int getAgentID() {
		return agentID;
	}
}
