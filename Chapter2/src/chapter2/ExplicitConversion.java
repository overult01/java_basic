package chapter2;

public class ExplicitConversion {

	public static void main(String[] args) {

		int iNum = 1000;
		byte bNum = (byte)iNum;
		
		System.out.println(iNum);
		System.out.println(bNum); // 더 정밀한 수 -> 덜 정밀한 수 로 형변환시 데이터 유실 
		
		double dNum = 3.14;
		iNum = (int)dNum;
		System.out.println(iNum); // 소수점 이하의 데이터가 유실 됨 
		
		float fNum = 0.9f;
		int num1 = (int)dNum + (int)fNum;
		int num2 = (int)(dNum + fNum);
		System.out.println(num1);
		System.out.println(num2);
		
		// 실수 -> 정수 로 명시적 형변환시 데이터 유실(truncate) 
	}

}
