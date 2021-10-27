package cooperation;

public class Bus {

	int busNumber;
	int passengerCount;
	int money;

	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	// 메서드 1: 버스에 태우는 메서드 
	public void take(int money) {
		passengerCount++;
		this.money += money;
	}

	// 메서드 2: 버스 정보를 알려주는 메서드 
	public void showInfo() {
		System.out.println("버스 " + busNumber + "번의 승객은 " + passengerCount + "명이고, 수입은 " + money);
	}
}