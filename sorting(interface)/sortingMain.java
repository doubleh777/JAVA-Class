package sorting;

import java.util.Scanner;

public class sortingMain {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		String str;
		System.out.println("Insertion Sort : S");
		System.out.println("Bubble Sort : B");
		System.out.println("Quick Sort : Q");
		
		while(true){
			str = keyboard.nextLine();
			if(str == "S" || str =="B" || str =="Q"){
				break;
			}
			continue;
		}
		sort s = new sort(str);
		s.sorting();
	}

}
