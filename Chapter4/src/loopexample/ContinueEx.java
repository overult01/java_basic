package loopexample;

public class ContinueEx {

	public static void main(String[] args) {

// for문을 통해서 1부터 100까지 짝수만 더하기 	
/* continue 문 : 반복문과 함께 사용.
continue 문을 만나면 이후 반복되는 부분을 수행하지 않고, 조건식이나 증감식을 수행함 */		

		int total = 0;
		int num;
		
		for(num=1; num<=100; num++) {
			
			if ((num%2)==0 ) {
				continue;
			}
			total += num;	
		}
		
		System.out.println(total);
	}
}