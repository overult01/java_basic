package assignmet;

public class OperationEx5 {

	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 10;
		
		int result = num1 & num2; // 비트연산자 & :두 비트가 모두 1인 경우만 1 아니면 0 
		System.out.println(result); // 2진수로 나타냈을 때 둘 다 1인 경우가 없었으므로 0이 됨  

		int result2 = num1 | num2; // 비트연산자 | :두 비트가 모두 0인 경우만 0 아니면 1 
		System.out.println(result2); // 2진수로 나타냈을 때 | 에 따라서 00...001111 이 됨.(즉, 십진수 15)   	
		
		int num3 = 5;  // 0000101;
		System.out.println(num3 << 3); // (왼쪽 시프트 ) 곱하기 2^3임. but num3값 자체는 바뀌지 않음 
		System.out.println(num3);
		
		System.out.println(num3 >> 1);  // (오른쪽 시프트 ) 한자리수가 잘림 (나누기 2^1와 같음 ). 000010; 
	}
}