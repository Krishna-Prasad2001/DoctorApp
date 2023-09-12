package com.amdocs.DoctorAppointment.patient;

import java.sql.SQLException;
import java.util.List;
import com.amdocs.DoctorAppointment.data.Patient;

public interface PatientDao {
	//Adding Patient
	boolean add(Patient patient) throws SQLException;
	// Return all patient
	List<Patient> findAll();
}
