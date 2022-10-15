package business;

import java.util.ArrayList;
import core.loging.Logger;
import dataAccess.course.CourseDao;
import entities.Course;
import entities.Instructor;

public class CourseManager {

	private ArrayList<Course> courses = new ArrayList<Course>();
	private CourseDao courseDao;
	private Logger[] loggers;

	public CourseManager(ArrayList<Course> courses, CourseDao courseDao, Logger[] loggers) {
		this.courses = courses;
		this.courseDao = courseDao;
		this.loggers = loggers;
	}

	public void add(Course newcourse) throws Exception {
		
		for (Course course : courses) {
			
		      if(newcourse.getCourseName() == course.getCourseName()) {
		    	  
		    	  throw new Exception("There is already a course with this name" + " " + newcourse.getCourseName());
		          
		 }
		      if(newcourse.getCoursePrice()<0) {
				
				throw new Exception("Course price cannot be less than 0 TL");
				
			}
		}
		
		courses.add(newcourse);
		 courseDao.add(newcourse);  		
		 for (Logger logger : loggers) {
				
				logger.log(newcourse.getCourseName());
			}
		
		
		
		
	

}
}
