package com.amdocs.DoctorAppointment;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.amdocs.DoctorAppointment.patient.PatientDao;
import com.amdocs.DoctorAppointment.patientimpl.PatientDaoImpl;
import com.amdocs.DoctorAppointment.patientimpl.PatientDaoDbImpl;
import com.amdocs.DoctorAppointment.data.Patient;

public class Test1 {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		try {
			while (true) {
				System.out.println("\n 1. Register Patient.");
				System.out.println("\n 2. Modify Patient Details.");
				System.out.println("\n 3. Delete Customer Details");
				System.out.println("\n 4. View Single Record");
				System.out.println("\n 5. View all Records");
				System.out.println("\n 0. Exit");
				System.out.println("\n Enter your choice");
				int ch = Integer.parseInt(scanner.nextLine());
				switch (ch) {
				case 1:
					addPatient();
					break;
				case 2:
					updatePatient();
					break;
				case 3:
					deletePatient();
					break;
				case 4:
					viewPatient();
					break;
				case 5:
					viewPatient();
					break;
				case 0:
					System.exit(0);
				default:
					System.out.println("Try again");
					break;
				}
			}
		} catch (NumberFormatException e) {
			System.out.println("Number Format : " + e.getMessage());
		} catch (Exception e) {

			System.out.println("Error : " + e.getMessage());
		}
	}

	private static Patient createPatient() throws SystemException {
		Patient obj = new Patient();
		try {
			 System.out.println("Enter The Id: "); 
			 int id = Integer.parseInt(scanner.nextLine()); 
			 obj.setId(id); 
			 id = obj.getId();
			 System.out.println("Enter The First Name: ");
			 String firstName = scanner.nextLine();
			 obj.setFirstName(firstName);
			 firstName = obj.getFirstName();
			 System.out.println("Enter The Last Name: ");
			 String lastName = scanner.nextLine();
			 obj.setLastName(lastName);
			 lastName = obj.getLastName();
			 System.out.println("Enter The Gender: ");
			 String gender = scanner.nextLine();
			 obj.setGender(gender);
			 gender = obj.getGender();
			 System.out.println("Enter The Age "); 
			 int age = Integer.parseInt(scanner.nextLine()); 
			 obj.setAge(age); 
			 age = obj.getAge();
			} catch (NumberFormatException e) {
				throw new SystemException("Please Provide a number value\n " + e.getMessage());
		}

			return obj;
	}

	private static void displayPatient(Patient patient) {
		System.out.println(patient);
	}

	private static PatientDao dao = new PatientDaoDbImpl();

		private static void addPatient() {
			Patient createPatient;
			try {
				createPatient = createPatient();
				dao.add(createPatient);
			} catch (SQLException e) {
				System.out.println(e);
			}catch (SystemException e) {
				System.out.println(e);
			}

		}

		private static void displayAllPatient() {
			PatientDao dao=new PatientDaoImpl();
			List<Patient> allPatient = dao.findAll();
			for (Patient patient : allPatient) {
				if (patient != null)
					System.out.println(patient);
			}
		}

	}