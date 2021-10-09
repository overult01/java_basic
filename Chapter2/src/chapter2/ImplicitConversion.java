package chapter2;

public class ImplicitConversion {
	// 묵시적 형변환 (덜 정밀한 수 -> 더 정밀한 수 로 대입되는 경우) ex. 정수 -> 실수 
	public static void main(String[] args) {
		byte bNum = 10;
		int num = bNum;
		System.out.println(num);
		
		long lNum = 10;
		float fNum = lNum; // 덜 정밀한 수 -> 더 정밀한수 로의 자연스러운 형변환(=묵시적 형변) 
		
		System.out.println(fNum);
		
		double dNum = fNum + num;
		System.out.println(dNum);
	}

	
	
}