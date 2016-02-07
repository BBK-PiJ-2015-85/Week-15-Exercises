package src.patient;

import java.util.List;
import java.util.ArrayList;

public class Patient {
	private int age;
	private String name;
	private List<Patient> patientList;
	
	public Patient (int age, String name) throws IllegalArgumentException {
		if (age < 0 | age > 130) {
			throw new IllegalArgumentException("Invalid age.");
		}
		this.age = age;		
		this.name = name;
	}
	
	public Patient() {
		this.patientList = new ArrayList();
	}
	
	public void launch() {
		int age;
		String str;
		boolean finished = false;
		while (!finished) {
			try {
				System.out.println("Please enter the src.patient.Patient's year of birth: ");
				str = System.console().readLine();
				age = 2015 - Integer.parseInt(str);
				System.out.println("Please enter the src.patient.Patient's name: ");
				str = System.console().readLine();
				patientList.add(new Patient(age, str));
				System.out.println("Would you like to add another patient? N to exit.");
				str = System.console().readLine();
				if (str.equals("N")) {
					finished = true;
				}
			} catch (NumberFormatException ex) {
				System.out.println("That was not a valid birth year.");
			}			
		}
	}
	
	public static void main(String[] args) {
		Patient p = new Patient();
		p.launch();
		for (int i = 0; i < p.patientList.size(); i++) {
			System.out.println(p.patientList.get(i).name + " " + p.patientList.get(i).age);
		}
	}
}