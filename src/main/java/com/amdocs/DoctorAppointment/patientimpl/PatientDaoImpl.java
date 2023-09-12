package com.amdocs.DoctorAppointment.patientimpl;

import java.util.ArrayList;
import java.util.List;

import com.amdocs.DoctorAppointment.data.Patient;
import com.amdocs.DoctorAppointment.patient.PatientDao;

/**
 * Communicate with Repository
 */
public class PatientDaoImpl implements PatientDao {
	
	private List<Patient> patients=new ArrayList<>();

	@Override
	public boolean add(Patient patient) {
		return patients.add(patient);		
	}

	@Override
	public List<Patient> findAll() {		
		return patients;
	}
}