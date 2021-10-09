package loopexample;

public class ForExample {

	public static void main(String[] args) {
		//for문 구구단 
		/*
		int dan;
		int times;
		
		for(dan = 2; dan <=9; dan++) {
			
			for (times = 1; times <=9; times++) {
				
				System.out.println(dan + "X" +times +"="+ dan*times);
			}
			
		}
		*/
		
		//while문 구구단 
		int dan=2;
		int times=2;
		
		while(dan <=9) {
			times = 1;
			while(times <=9) {
				System.out.println(dan + "X" +times +"="+ dan*times);				
				times++;
			}
			dan++;
		}
	}
}