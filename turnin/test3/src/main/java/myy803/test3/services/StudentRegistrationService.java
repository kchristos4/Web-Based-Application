package myy803.test3.services;

import java.util.List;

import myy803.test3.entities.StudentRegistration;

public interface StudentRegistrationService{
	public List<StudentRegistration> findAll();
	
	public StudentRegistration findById(int theId);
	
	public void save(StudentRegistration theStudentRegistration);
	
	public List<StudentRegistration> findAllByCourseid(int theId);
	
	public void deleteById(int theId);
}