package classpart;

public class StudentTest {

	public static void main(String[] args) {
		// 다른 클래스에서 사용하는 방법: main을 다른 클래스에 두기 
		int i = 10;
		
		Student studentLee = new Student();
		// 힙 메모리 studentLee 가 생성됨 
		studentLee.studentName = "이순신";
		studentLee.studentID =100;
		studentLee.address = "서울시 영등포구 여의도";
		
		Student studentKim = new Student();
		studentKim.studentName = "김유신";
		studentKim.studentID =101;
		studentKim.address = "미국 산호세";
		
		studentLee.showStudentInfor();
		studentKim.showStudentInfor();
		
		// 클래스의 풀네임(패키지.클래스명) + @ + 32바이트 (16진수의 1자리가 4바이트) 
		System.out.println(studentLee);
		System.out.println(studentKim);		
	}
}