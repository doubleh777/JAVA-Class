package majorornot;
/* main�Լ�
 	1. �л����� new�ϸ鼭 �̸�, ����, ��������, ���������� �Ķ���ͷ� ����
 	2. �����ڸ� �̿��� �Էµ� ������ ���� ������ ���Ͽ� �Բ� ���
*/

public class gradeMain {

	public static void main(String[] args) {
		student st1 = new student("�ε���", "Math", 95, 20);
		student st2 = new student("�ں���", "English", 90, 100);
		student st3 = new student("�Ѱ���", "Math", 76, 60);
		student st4 = new student("������", "Math", 85, 89);
		student st5 = new student("ȫ����", "English", 90, 95);
		
		System.out.println(st1.getName() + ", " + st1.getStudentNumber() + ", "+ st1.getMajor()+ ", "+ st1.getMathScore() + ", "+ st1.getMathGrade() + ", "+ st1.getEnglishScore() + ", "+ st1.getEnglishGrade());
		System.out.println(st2.getName() + ", "+ st2.getStudentNumber() + ", "+ st2.getMajor()+ ", "+ st2.getMathScore() + ", "+ st2.getMathGrade() + ", "+ st2.getEnglishScore() + ", "+ st2.getEnglishGrade());
		System.out.println(st3.getName() + ", "+st3.getStudentNumber() + ", "+ st3.getMajor()+ ", "+ st3.getMathScore() + ", "+ st3.getMathGrade() + ", "+ st3.getEnglishScore() + ", "+ st3.getEnglishGrade());
		System.out.println(st4.getName() + ", "+ st4.getStudentNumber() + ", "+ st4.getMajor()+ ", "+ st4.getMathScore() + ", "+ st4.getMathGrade() + ", "+ st4.getEnglishScore() + ", "+ st4.getEnglishGrade());
		System.out.println(st5.getName() + ", "+ st5.getStudentNumber() + ", "+ st5.getMajor()+ ", "+ st5.getMathScore() + ", "+ st5.getMathGrade() + ", "+ st5.getEnglishScore() + ", "+ st5.getEnglishGrade());
	}

}
