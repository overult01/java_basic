package classpart;

public class Student {

		int studentID;
		String studentName;
		int grade;
		String address;
		
		public void showStudentInfor() {
			System.out.println(studentName + "," + address );
		}
		
		
		// 매서드를 쓸 땐, 사용하는 입장에서 쓴다(클라이언트 코드 입장) 
		// String 값으로 반환, 매개변수 x 
		public String getStudentName( ) {
			return studentName;
		}
		
		
		// 반환형이 없음(void) , 매개변수가 있다 
		public void setStudentName(String name) {
			studentName = name;
			
		}
}