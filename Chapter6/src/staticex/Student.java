package staticex;

public class Student {

	static int serialNum = 10000;

	int studentID;
	String studentName;
	
	// 학생이 증가될 때마다 serialNum 을 1씩 증가시키기.
	public Student() {
		serialNum++;   // 이 값은 공유되면서 계속 증가가 됨 
		studentID = serialNum;  // 내 studenID 값은 serialNum에서 복사되어서 각각 가지게 됨 
	}
}