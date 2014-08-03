package majorornot;
/* major 클래스
	전공일 경우 점수가 입력 되면 전공과목 학점 정책에 맞는 학점을 char형으로 반환
 */

public class major implements IGrade {

	@Override
	public char getGrade(int score) {
		if( score >=95 && score<=100)
			return 'S';
		else if(score >=90 && score<95)
			return 'A';
		else if(score >=80 && score < 90)
			return 'B';
		else if(score >=70 && score <80)
			return 'C';
		else if(score>=60 && score < 70)
			return 'D';
		else return 'F';
	}

}
