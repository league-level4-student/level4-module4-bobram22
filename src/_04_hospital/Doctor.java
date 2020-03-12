package _04_hospital;

import java.util.ArrayList;

public class Doctor {
ArrayList <Patient> p = new ArrayList <Patient>();
	public boolean performsSurgery() {
		// TODO Auto-generated method stub
		
			return false;
		
	}
	public boolean makesHouseCalls() {
		return false;
		
	}
	public void assignPatient(Patient patient) {
		// TODO Auto-generated method stub
		p.add(patient);
	}
	public ArrayList<Patient> getPatient() {
		// TODO Auto-generated method stub
		return p;
	}
	
}
