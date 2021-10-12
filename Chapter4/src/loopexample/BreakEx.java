package loopexample;

public class BreakEx {

	public static void main(String[] args) {
// 반복문에서 break 문을 만나면 더 이상 반복을 수행하지 않고 반복문을 빠져나옴
// 중첩된 반복문(while, for문) 내부에 있는 경우, 가장 가까운 반복문 하나만 빠져나옴. 
		int sum = 0;
		int num = 1;
		
		while(true) {
			sum += num;
			
			if (sum > 100) 
				break;
			num++;
		}
		
		System.out.println(sum);
		System.out.println(num);
		
	}
} 