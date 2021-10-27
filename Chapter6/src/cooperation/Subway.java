package cooperation;

public class Subway {

	int lineNumber;
	int passengerCount;
	int money;

	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	// 메서드 1: 지하철에 태우는 메서드 
	public void take(int money) {
		passengerCount++;
		this.money += money;
	}

	// 메서드 2: 지하철 정보를 알려주는 메서드 
	public void showInfo() {
		System.out.println("지하철 " + lineNumber + "번의 승객은 " + passengerCount + "명이고, 수입은 " + money);
	}
}