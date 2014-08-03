package majorornot;
/* student Ŭ����
 	1. �л����� ������ ��� �ν��Ͻ��� �����ϱ� ����
 	2. main�Լ����� ���޹��� �̸�, ����, ��������, ���������� �ν��Ͻ������ ����
 	3. �й��� static������ �̿��� new�� ������� 1���� 1�� �����ϸ� �����ǰ� �Ͽ���
 	4. setGrade �޼ҵ�� ������ ��������, ���������� �Ķ���ͷ� �޾�
 	    �������̽� Ÿ������ ����������å�� ������������å �ν��Ͻ��� �����Ͽ�
 	    ������ setting��(�����ڿ��� ���� �ʱ�ȭ�� ���� setGrade�޼ҵ� ȣ��)
 */

public class student {
	
	private String name;
	private String major;
	private int mathScore;
	private int englishScore;
	private int studentNumber;
	private static int studentNumberGenerater=0;
	private char mathGrade;
	private char englishGrade;
	
	public student (String name, String major, int mathScore, int englishScore){
		this.name = name;
		this.major = major;
		this.mathScore = mathScore;
		this.englishScore = englishScore;
		this.studentNumber = ++studentNumberGenerater;
		this.setGrade(major, mathScore, englishScore);
	}

	public void setGrade(String major, int mathScore, int EnglishScore){
		IGrade mj = new major();
		IGrade nmj = new non_major();
		
		if (major == "Math"){
			mathGrade = mj.getGrade(mathScore);
			englishGrade = nmj.getGrade(englishScore);
		}
		else{
			mathGrade = nmj.getGrade(mathScore);
			englishGrade = mj.getGrade(englishScore);
		}
	
	}
	
	//getter & setter
	public char getMathGrade() {
		return mathGrade;
	}
	public char getEnglishGrade() {
		return englishGrade;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStudentNumber(){
		return studentNumber;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public int getMathScore() {
		return mathScore;
	}
	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}
	public int getEnglishScore() {
		return englishScore;
	}
	public void setEnglishScore(int englishScore) {
		this.englishScore = englishScore;
	}
	
	
}
