package majorornot;
/* main함수
 	1. 학생들을 new하면서 이름, 전공, 수학점수, 영어점수를 파라미터로 전달
 	2. 생성자를 이용해 입력된 정보에 학점 정보를 더하여 함께 출력
*/

public class gradeMain {

	public static void main(String[] args) {
		student st1 = new student("민도희", "Math", 95, 20);
		student st2 = new student("박보영", "English", 90, 100);
		student st3 = new student("한가인", "Math", 76, 60);
		student st4 = new student("정은지", "Math", 85, 89);
		student st5 = new student("홍진영", "English", 90, 95);
		
		System.out.println(st1.getName() + ", " + st1.getStudentNumber() + ", "+ st1.getMajor()+ ", "+ st1.getMathScore() + ", "+ st1.getMathGrade() + ", "+ st1.getEnglishScore() + ", "+ st1.getEnglishGrade());
		System.out.println(st2.getName() + ", "+ st2.getStudentNumber() + ", "+ st2.getMajor()+ ", "+ st2.getMathScore() + ", "+ st2.getMathGrade() + ", "+ st2.getEnglishScore() + ", "+ st2.getEnglishGrade());
		System.out.println(st3.getName() + ", "+st3.getStudentNumber() + ", "+ st3.getMajor()+ ", "+ st3.getMathScore() + ", "+ st3.getMathGrade() + ", "+ st3.getEnglishScore() + ", "+ st3.getEnglishGrade());
		System.out.println(st4.getName() + ", "+ st4.getStudentNumber() + ", "+ st4.getMajor()+ ", "+ st4.getMathScore() + ", "+ st4.getMathGrade() + ", "+ st4.getEnglishScore() + ", "+ st4.getEnglishGrade());
		System.out.println(st5.getName() + ", "+ st5.getStudentNumber() + ", "+ st5.getMajor()+ ", "+ st5.getMathScore() + ", "+ st5.getMathGrade() + ", "+ st5.getEnglishScore() + ", "+ st5.getEnglishGrade());
	}

}
