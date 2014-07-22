package homework;

import java.util.ArrayList;

public class AutomobileCompany {
	
	private ArrayList<Car> carList = new ArrayList<Car>(); // 기본적으로 가능한 모든 변수는 Private로 선언
	private static AutomobileCompany Company = new AutomobileCompany();

	private AutomobileCompany(){
		System.out.println("Hyundai 자동차 회사 인스턴스가 생성되었습니다.");
	}
	
	public static AutomobileCompany getCompany(){
		if(Company == null)
			Company = new AutomobileCompany();
		
		return Company;           // Sigleton pattern 구현
	}
	
	public void addCar(Car newCar){
		carList.add(newCar);  // 차를 추가하고 싶을때 addCar(자동차)을 입력하면 ArrayList에 추가됨.
	}								  // Car를 상속받은 소나타, 그랜져, 제네시스를 
	
	public int countCar(){
		return carList.size();  // carList.size는 ArrayList에 들어있는 객체 수를 리턴함.
		
	}
	
	public ArrayList<Car> getCarList(){
		return carList;
	}
	
}
