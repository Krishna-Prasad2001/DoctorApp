package com.amdocs.DoctorAppointment.patientimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.amdocs.DoctorAppointment.data.Patient;
import com.amdocs.DoctorAppointment.patient.PatientDao;
import com.amdocs.DoctorAppointment.jdbc.DBUtil;

/**
 * Will Communicate to data base
 */
 
public class PatientDaoDbImpl implements PatientDao {
	
	private static final String INSERT_PATIENT="insert into employees(first_name, last_name, gender, age) values(?,?,?,?)";
	private  Connection connection=DBUtil.getConnection();
	
	@Override
	public boolean add(Patient patient) throws SQLException {
		PreparedStatement ps=connection.prepareStatement(INSERT_PATIENT);
		// Set The value
		ps.setString(1, patient.getFirstName());
		ps.setString(2, patient.getLastName());
		ps.setString(3, patient.getGender());
		ps.setInt(4, patient.getAge());
		//Execute Statement
		int executeUpdate = ps.executeUpdate();
		ps.close();
		if(executeUpdate>0) {
			return true;
		}
		return false;
	}

	@Override
	public List<Patient> findAll() {
		// execute select
		return null;
	}
}
