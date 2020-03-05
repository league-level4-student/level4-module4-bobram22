package _04_hospital;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
	ArrayList <Doctor> doctors = new ArrayList <Doctor> ();
	ArrayList <Patient> patients = new ArrayList <Patient> ();
	public void addDoctor(Doctor D) {
		// TODO Auto-generated method stub
		doctors.add(D);
	}

	public ArrayList<Doctor> getDoctors() {
		// TODO Auto-generated method stub
		return doctors;
	}

	public void addPatient(Patient P) {
		// TODO Auto-generated method stub
		patients.add(P);
	}
	
	public ArrayList<Patient> getPatient(){
		return patients;
	}

}
