package homework;

import java.util.ArrayList;

public class CalculationOfCarPrice {
	// Company�� �������ִ� �ڵ������� Price�� ȯ���Ͽ� �� ���� ������ִ� Ŭ����
	private AutomobileCompany company; // Company�� ��ǲ�Ǿ� �� ������ �����ؾ��ϹǷ�
														 // ��ǲ�� Company �ν��Ͻ��� ���� �� �ִ� ���� ������ ����
	public CalculationOfCarPrice(AutomobileCompany company){
		this.company = company;
	}
	
	public int getSumPrice(){
		ArrayList<Car> tmpList = company.getCarList();
		
		int sum = 0;
		
		for(Car car : tmpList){  // for( ���� : �� ������ �̷���� �迭)  : �迭�� ����ִ� ������ ���ʷ� ���Ե�.
			sum+=car.getPrice();
		}
		
			return sum;
	}
	
	
}
