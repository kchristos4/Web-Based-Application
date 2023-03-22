package myy803.test3.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import myy803.test3.entities.StudentRegistration;
import java.util.*;


public interface StudentRegistrationDAO extends JpaRepository<StudentRegistration, Integer>{
	public StudentRegistration findById(int theId);
	public List<StudentRegistration> findAllByCourseid(int theId);
}