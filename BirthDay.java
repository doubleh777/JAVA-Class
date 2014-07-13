package homework;

public class BirthDay {

	private	int day;
	private int month;
	private int year;
	private String getResult;
	
	public BirthDay(){};
	public BirthDay(int year, int month, int day){
		this.day = day;
		this.month = month;
		this.year = year;	
	}
	
	public void setDay(int day){
		this.day = day;
	}
	public void setMonth(int month){
		this.month = month;
	}
	public void setYear(int year){
		this.year = year;
	}
	public void setDate(int year, int month, int day){
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public String checkValidate(){
		switch(month){
		case 1: if (day>0 && day<32 && year>-1)
				getResult = "This is valid.";
			return getResult;
		case 2:
				if (year%4!=0 || (year % 100 == 0 && year % 400 != 0)){  // 28일까지 있는 경우
					if(day>0 && day<29) getResult = "This is valid.";
					else getResult = "This is invalid.";
					return getResult;
				}
				else {
					if(day>0 && day<30) getResult = "This is valid.";  // 29일까지 있는 경우
					else getResult = "This is invalid.";
					return getResult;
				}
		case 3: if (day>0 && day<32 && year>-1)
				getResult = "This is valid.";
				return getResult;
		case 4: if (day>0 && day<31 && year>-1)
				getResult = "This is valid.";
				return getResult;
		case 5: if (day>0 && day<32 && year>-1)
				getResult = "This is valid.";
				return getResult;
		case 6: if (day>0 && day<31 && year>-1)
			 	getResult = "This is valid.";
				return getResult;
		case 7: if (day>0 && day<32 && year>-1)
			 	getResult = "This is valid.";
				return getResult;
		case 8: if (day>0 && day<32 && year>-1)
			 	getResult = "This is valid.";
				return getResult;
		case 9: if (day>0 && day<31 && year>-1)
				getResult = "This is valid.";
				return getResult;
		case 10: if (day>0 && day<32 && year>-1)
			 	getResult = "This is valid.";
				return getResult;
		case 11: if (day>0 && day<31 && year>-1)
			 	getResult = "This is valid.";
				return getResult;
		case 12: if (day>0 && day<32 && year>-1)
			 	getResult = "This is valid.";
				return getResult;
		default : getResult = "This is invalid.";
				return getResult;
		}
	}
	
	
}
