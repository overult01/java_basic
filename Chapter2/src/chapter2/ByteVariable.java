package chapter2;

public class ByteVariable {

	public static void main(String[] args) {
		byte bData = -128;  
		System.out.println(bData);
		
		byte bData2 = 127; 
		// 바이트는 -2^7부터  2^7 -1 까지 표현 가
		System.out.println(bData2);
	}

}
