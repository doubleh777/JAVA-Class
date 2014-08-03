package majorornot;
/* non_major 클래스
	비전공일 경우 점수가 입력 되면 비전공과목 학점 정책에 맞는 학점을 char형으로 반환
*/

public class non_major implements IGrade {

	@Override
		public char getGrade(int score) {
			if(score >=90 && score<=100)
				return 'A';
			else if(score >=80 && score < 90)
				return 'B';
			else if(score >=70 && score <80)
				return 'C';
			else if(score>=55 && score < 70)
				return 'D';
			else return 'F';
		}
}
