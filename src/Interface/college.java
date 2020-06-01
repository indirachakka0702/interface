package Interface;

public class college {

	public static void main(String[] args) {
		
	/*	     class- college --> method()
		
	method() - class-sports       college-Dance - method()
	    
	                  class-student
	                  
	                  // if java allowed multiple inheritance -->
	                   so now quation is how to solve these kind of problem
*/
		//IDance id = new IDance();
		student s = new student();
		s.Activity();
		s.cricket();
		//s.BallCount=100; // it's final we can't change value but we can use the initialized value
		/*
		 * using interface we can achieve multiple inheritance
		 1. we cannot instantiate an interface
		 2. interface will have only unimplemented method. so interface can give full abstraction
		 3. Implements keyword is used by class to implement interface
		 4. class that implements interface must implement all the method of that
		 5. All the interface methods are by default public and abstract
		 6. Interface cannot be declared as private, protected
		 7. Variables which is declared in interface are by default public static and final that's why we need to initialize it
		 8. you cannot set value in entry class because all variables are final
		 9. An interface can extends any interface but cannot implement it
		10. Class can implement any number of interfaces
		11. There are 2 or more same methods in two interfaces and a class implements both interfaces implementation of the 
		    method only once Like our method activity(); 
		    
		    interface cannot static due to any one can use it
		
		 */
	}

}
