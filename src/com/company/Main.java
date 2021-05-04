package com.company;

public class Main {

    public static void main(String[] args) {
	    User userStudent  = new User();
		userStudent.setId(1);
		userStudent.setFirstName("Sinem");
		userStudent.setLastName("Güner");

	    UserManager userManager = new UserManager();
	    userManager.logIn(userStudent);
	    User userInstructor = new User();
	    userInstructor.setId(1);
	    userInstructor.setFirstName("iso");
	    userInstructor.setLastName("gümüşer");
	    userManager.logIn(userInstructor);

		Instructor instructor = new Instructor();
		instructor.setId(1);
		instructor.setFirstName("simge");
		instructor.setLastName("güner");
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addToCourse(instructor);



	}
}
