package myy803.test3.services;

import java.util.List;

import myy803.test3.entities.Course;

public interface CourseService{
	public List<Course> findAll();
	
	public Course findById(int theId);
	
	public void save(Course theCourse);
	
	public void deleteById(int theId);
}