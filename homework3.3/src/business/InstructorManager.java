package business;

import java.util.ArrayList;
import core.loging.Logger;
import dataAccess.course.CourseDao;
import dataAccess.instructor.InstructorDao;
import entities.Category;
import entities.Instructor;

public class InstructorManager {

	private ArrayList<Instructor> instructors = new ArrayList<Instructor>();
	private InstructorDao instructorDao;
	private Logger[] loggers;

	public InstructorManager(ArrayList<Instructor> instructors, InstructorDao instructorDao, Logger[] loggers) {
		super();
		this.instructors = instructors;
		this.instructorDao = instructorDao;
		this.loggers = loggers;
	}

	public void add(Instructor newinstructor) throws Exception {

		
		for (Instructor instructor : instructors) {
			
		      if(newinstructor.getFirstName()==instructor.getFirstName() && newinstructor.getLastName() == instructor.getLastName()) {
		    	  
		    	  throw new Exception("There is already a instructor with this name" + " " + newinstructor.getFirstName() + " " + newinstructor.getLastName());
		          
		 }
		}
		
		instructors.add(newinstructor);
		 instructorDao.add(newinstructor);  		
		 for (Logger logger : loggers) {
				
				logger.log(newinstructor.getFirstName() +" "+ newinstructor.getLastName());
			}
		

	}

}
