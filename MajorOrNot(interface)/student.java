package majorornot;
/* student 클래스
 	1. 학생들의 정보가 담긴 인스턴스를 생성하기 위함
 	2. main함수에서 전달받은 이름, 전공, 수학점수, 영어점수를 인스턴스멤버에 저장
 	3. 학번은 static변수를 이용해 new된 순서대로 1부터 1씩 증가하며 지정되게 하였음
 	4. setGrade 메소드는 전공과 수학점수, 영어점수를 파라미터로 받아
 	    인터페이스 타입으로 전공학점정책과 비전공학점정책 인스턴스를 생성하여
 	    학점을 setting함(생성자에서 학점 초기화를 위해 setGrade메소드 호출)
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
