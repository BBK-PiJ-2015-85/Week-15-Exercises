package src.codeflow;

import java.util.List;
import java.util.ArrayList;

public class CodeFlow {
	List<Integer> myList = new ArrayList<Integer>();
	
	public void launch(int userInput) {
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		intList.add(5);
		intList.add(6);
		try {
			intList.remove(0);
			System.out.println(intList.get(userInput));
			intList.remove(0);
			System.out.println(intList.get(userInput));
			intList.remove(0);
			System.out.println(intList.get(userInput));
			intList.remove(0);
			System.out.println(intList.get(userInput));
			intList.remove(0);
			System.out.println(intList.get(userInput));
			intList.remove(0);
			System.out.println(intList.get(userInput));
			intList.remove(0);
			System.out.println(intList.get(userInput));
		} catch (IndexOutOfBoundsException ex) {
			ex.printStackTrace();
		}
	}
	/*
	public void launch2() {
		try {
			myList.add(1);
			myList.add(2);
			myList.add(3);
			myList.add(4);
			myList.add(5);
		} catch (Exception ex) {
			ex.printStackTrace();
		} catch (NullPointerException ex) {
			ex.printStackTrace();
		}
	}
	*/
	public static void main(String[] args) {
		CodeFlow cf = new CodeFlow();
		
		//cf.launch(6);
		
		//cf.launch2();
	}
}