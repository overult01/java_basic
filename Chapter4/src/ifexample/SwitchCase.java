package ifexample;

public class SwitchCase {

	public static void main(String[] args) {
//문자열로 case 조건 주는 것도 가능 
		int rank = 1;
		char medalColor;
		
		switch(rank) {
			case 1: medalColor = 'G';
					break;  // 무조건 break써줘야 함(break만날 때까지 수행함) 
			case 2: medalColor = 'S';
					break;
			
			default: medalColor = 'A';
		}
		
		System.out.println(rank + "등 메달의 색은  " +medalColor);
	}
}