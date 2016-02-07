package src;

import java.util.ArrayList;


public class PrimeDivisorListImp implements PrimeDivisorList {
	private ArrayList<Integer> primeDivisorList;

	public PrimeDivisorListImp() {
		primeDivisorList = new ArrayList<>();
	}

	public void add(Integer num) {
		if (num == null) {
			throw new NullPointerException("Null cannot be added to list.");
		}
		for (int i = num - 1; i > 1; i--) {
			if (num % i == 0) {
				throw new IllegalArgumentException("Non prime number cannot be added to list.");
			}
		}
		primeDivisorList.add(num);
	}
	
	@Override
	public String toString() {
		int total = 1;
		String str = "[ ";
		for (int i = 0; i < primeDivisorList.size(); i++) {
			total *= primeDivisorList.get((int) i);
		}
		for (int i = 0; i < primeDivisorList.size(); i++) {
			if (i == primeDivisorList.size() - 1) {
				str += primeDivisorList.get(i) + " = " + total + " ]";
			}else if (primeDivisorList.get(i).equals(primeDivisorList.get(i+1))) {
				int count = 1;
				str += primeDivisorList.get(i);
				while (i != primeDivisorList.size() - 1 && primeDivisorList.get(i).equals(primeDivisorList.get(i+1))) {
					i++;
					count++;
				}
				str += "^" + count + " ";
				if (i == primeDivisorList.size() - 1) {
					str += "= " + total + " ]";
				} else {
					str += "* ";
				}
			} else {
				str += primeDivisorList.get(i) + " * ";
			}
		}
		return str;
	}
}