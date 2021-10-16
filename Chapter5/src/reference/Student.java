package reference;

public class Student {
	
	int studentID;
	String studentName;
	
	Subject korea; // 참조 자료형 
	Subject math;
	
	
	// 참조 자료형으로 가져다 쓴 Subject를 생성 
	public Student() {
		korea = new Subject();
		math = new Subject();
	}
	
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
		
		korea = new Subject();
		math = new Subject();
	}
	
	// 그 요소들을 세팅하는 메서드 
	public void setKorea(String name, int score) {
		korea.setSubjectName(name);
		korea.setScore(score);
		
	}
	
	public void setMath(String name, int score) {
		math.setSubjectName(name);
		math.setScore(score);
		
	}
	
	
	// 정보를 꺼내주는 메서드 
	public void showStudentInfo() {
		int total = korea.getScore() + math.getScore();
		System.out.println(studentName + "학생의 총점은 " + total + "점 입니다. ");
	}
}