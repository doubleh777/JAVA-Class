package homework;

import java.util.ArrayList;

public class CalculationOfCarPrice {
	// Company가 가지고있는 자동차들을 Price로 환산하여 총 합을 계산해주는 클래스
	private AutomobileCompany company; // Company가 인풋되어 그 정보를 리턴해야하므로
														 // 인풋된 Company 인스턴스를 담을 수 있는 참조 변수를 선언
	public CalculationOfCarPrice(AutomobileCompany company){
		this.company = company;
	}
	
	public int getSumPrice(){
		ArrayList<Car> tmpList = company.getCarList();
		
		int sum = 0;
		
		for(Car car : tmpList){  // for( 변수 : 그 변수로 이루어진 배열)  : 배열에 들어있는 변수가 차례로 대입됨.
			sum+=car.getPrice();
		}
		
			return sum;
	}
	
	
}
