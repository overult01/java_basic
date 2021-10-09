package assignmet;

public class OperationEx3 {
// 단락 회로 평가 실습
	public static void main(String[] args) {
		int num1 = 10;
		int i = 2;
	// 논리곱 &&
		boolean value = ((num1 = num1 + 10) < 10) && ((i = i+2) > 10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i); // 1번째 문장이 거짓이기 때문에 2번째 문장은 실행되지 x. 
	
		int num2 = 10;
		int i2 = 2;		
	// 논리항 || 	
		boolean value2 = ((num2 = num2 + 10) > 10) || ((i2 = i2+2) > 10);
		System.out.println(value2);
		System.out.println(num2);
		System.out.println(i2); // 1번째 문장이 참 이기 때문에 2번째 문장은 실행되지 x. 
		
	}
}