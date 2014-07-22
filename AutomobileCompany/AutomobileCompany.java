package homework;

import java.util.ArrayList;

public class AutomobileCompany {
	
	private ArrayList<Car> carList = new ArrayList<Car>(); // �⺻������ ������ ��� ������ Private�� ����
	private static AutomobileCompany Company = new AutomobileCompany();

	private AutomobileCompany(){
		System.out.println("Hyundai �ڵ��� ȸ�� �ν��Ͻ��� �����Ǿ����ϴ�.");
	}
	
	public static AutomobileCompany getCompany(){
		if(Company == null)
			Company = new AutomobileCompany();
		
		return Company;           // Sigleton pattern ����
	}
	
	public void addCar(Car newCar){
		carList.add(newCar);  // ���� �߰��ϰ� ������ addCar(�ڵ���)�� �Է��ϸ� ArrayList�� �߰���.
	}								  // Car�� ��ӹ��� �ҳ�Ÿ, �׷���, ���׽ý��� 
	
	public int countCar(){
		return carList.size();  // carList.size�� ArrayList�� ����ִ� ��ü ���� ������.
		
	}
	
	public ArrayList<Car> getCarList(){
		return carList;
	}
	
}
