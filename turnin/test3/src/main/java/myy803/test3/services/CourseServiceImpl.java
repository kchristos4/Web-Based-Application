package myy803.test3.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import myy803.test3.entities.Course;
import myy803.test3.DAO.CourseDAO;

@Service
public class CourseServiceImpl implements CourseService{
	@Autowired
	private CourseDAO courseRepository;
	
	public CourseServiceImpl() {
		
	}
	
	@Autowired
	public CourseServiceImpl(CourseDAO theCourseRepository) {
		courseRepository = theCourseRepository;
	}
	
	@Override
	@Transactional
	public List<Course> findAll() {
		return courseRepository.findAll();
	}
	
	@Override
	@Transactional
	public Course findById(int theId) {
		Course result = courseRepository.findById(theId);
				
		if (result != null ) {
			return result;
		}
		else {
			// we didn't find the course
			throw new RuntimeException("Did not find course id - " + theId);
		}
	}
	@Override
	@Transactional
	public void save(Course theCourse) {
		courseRepository.save(theCourse);
	}

	@Override
	@Transactional
	public void deleteById(int theId) {
		courseRepository.deleteById(theId);
	}
}