package sorting;

public class sort {
	
	public String str;
	public sort(String str){
		this.str = str;
	}
	
	public void sorting(){
		if (str == "I"){
			ISort is = new insertionSort();
			is.sorting();
		}
		else if(str == "B"){
			ISort is = new bubbleSort();
			is.sorting();
		}
		else {
			ISort is = new quickSort();
			is.sorting();
		}
		
		
	}
}
