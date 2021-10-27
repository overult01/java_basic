package staticex;

public class StudentTest1 {

	public static void main(String[] args) {
		
		Student studentJ = new Student();
		System.out.println(studentJ.studentID);
		
		
		Student studentT = new Student();
		System.out.println(studentT.studentID);
		
		// 서로다른 두 개의 인스턴스가 공유되는 값 (static 변수 )
		System.out.println(Student.serialNum);   // 보통 static 변수는 사용할 때 클래스 명. 으로 사용(not 인스턴스명) 
		System.out.println(Student.serialNum);
		
	}

}