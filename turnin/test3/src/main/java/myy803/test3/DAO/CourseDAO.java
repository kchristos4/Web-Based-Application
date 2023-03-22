package myy803.test3.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import myy803.test3.entities.Course;

@Repository
public interface CourseDAO extends JpaRepository<Course, Integer>{
	public Course findById(int theId);
}