package ActivitiesCompilation;

import java.util.Scanner;

class Activity {
	
	public void Method() {
		System.out.println("Method");
	}
	public void Inheritance() {
		System.out.println("Inheritance");
	}
    public void AllAboutMethod() {
    	System.out.println("All About Method");
    }

    public void Conversion() {
        System.out.println("Conversion");
    }

    public void Encapsulation() {
        System.out.println("Encapsulation");
    }

    public void MethodOverloading() {
        System.out.println("Method Overloading");
    }

    public void MethodOverriding() {
        System.out.println("Method Overriding");
    }

    public void UsingExtendKeyword() {
        System.out.println("Using Extend Keywords");
    }

    public void UsingImplementKeyword() {
        System.out.println("Using Implement Keywords");
    }
}

class Vigo extends Activity {
	
	@Override
    public void AllAboutMethod() {
    class allaboutmethods {
            private int x;
            private float y;
            private double z=6.9;
            
            //niremove yung void part 1
            public int sum(int x, float y) {
            	this.x = x;
            	this.y = y;
                return (int) (x + y);
            }
            
            //niremove yung void part 2
            public String greetings(String message, String name) {
                return message + " " + name;
            }
            
            public String attendance(String firstname, String lastname) {
                String name=lastname + "  " +firstname;
                return name;
            }
            
            //niremove yung void part 3
            public String mygreetings(String mystring) {
                return "Charles Vigo "+ mystring;
            }
            
        }
			allaboutmethods methods = new allaboutmethods();
			System.out.println("\nSum Method");
			int add = methods.sum(20, 30);
			System.out.println(add);
			
			System.out.println("\nGreeting Method");
			String greet = methods.greetings("Hello to java", "Charles Vigo");
			System.out.println(greet);
			
			System.out.println("\nAttendance Method");
			String attendance = methods.attendance("Charles", "Vigo");
			System.out.println(attendance);
			
			System.out.println("\nMyGreeting Method");
			String mygreeting = methods.mygreetings("Welcome to Java programming!!");
			System.out.println(mygreeting);
    }
    
	@Override
	public void Conversion() {
    class Student {
        String studentId, lastName, firstName;

        void displayInfo(String studentId, String lastName, String firstName) {
            System.out.println("Student Info: " + studentId + " " +lastName + " " +firstName);
        }

        void changeLast(String lastName, String newLastName) {
            System.out.println("Old lastname: " + lastName + "\n" + "New lastname: " + newLastName);
        }

        void changeFirst(String firstName, String newFirstName) {
            System.out.println("Old firstname: " + firstName + "\n" + "New firstname: " + newFirstName);
        }
    }
    
    Student studentOne = new Student();
    studentOne.displayInfo("20B0849", "Vigo", "Charles Mc");
    studentOne.changeLast("Vigo", "VigoVigo");
    studentOne.changeFirst("Charles Mc", "MCMC");
}

	@Override
    public void Encapsulation() {
		
		 class Student {
			//private variables
			private String student_id;
			private String student_name;
			private double grades;
			
			
			//method setter for student name
			public void setStudentName(String name) {
				student_name = name;
			}
			
			//method setter for student id
			public void setStudentId (String id) {
				student_id = id;
			}
			
			//method getter for student name
			public String getStudentName() {
				return student_name;
			}
			
			//method getter for student id
			public String getStudentId() {
				return student_id;
			}
			
			//adding grade method
			public double addGrade(double oop, double webprog, double im, double mobileAppDev, double systemAd, double sia, double methodOfResearch) {
				
				double totalGrade = oop + webprog + im + mobileAppDev + systemAd + sia + methodOfResearch;
				
				System.out.println("GRADES IN SOFTWARE DEVELOPMENT SUBJECTS :");
				System.out.println();
				System.out.println("Object Oriented Programming         : "+oop);
				System.out.println("Web Programming                     : "+webprog);
				System.out.println("Information Management              : "+im);
				System.out.println("Mobile Application Development      : "+mobileAppDev);
				System.out.println("System Administration               : "+systemAd);
				System.out.println("System Integration and Architecture : "+sia);
				System.out.println("Methods of Research                 : "+methodOfResearch);


				double totalAverage = totalGrade/7;	
				grades = totalAverage;
				return grades;
			}
		}
		Student studentOne = new Student();
			
			//applying the method setter
			studentOne.setStudentName("Charles Mc L. Vigo");
			studentOne.setStudentId("5420B0");
			
			//applying the method getter
			String studentName = studentOne.getStudentName();
			String studentId = studentOne.getStudentId();
			
			//displaying the name and student id
			System.out.println("Student name : "+studentName);
			System.out.println("Student ID   : "+studentId);
			System.out.println();
			
			//object oriented programming (first parameter)
			//web programming (second parameter)
			//information management (third parameter)
			//mobile application development (fourth parameter)
			//system administration (fifth parameter)
			//system integration and architecture (sixth parameter)
			//methods of research (seventh parameter)
			double studentGrades = studentOne.addGrade(2.0, 2.0, 2.3, 2.7, 2.2, 1.8, 1.6);
			
			//using Math.round() method to display result in two decimal places only
	        double roundedGrades = Math.round(studentGrades * 100.0) / 100.0;
	        
	        //displaying the grade
	        System.out.println();
			System.out.print("Total Average Grade                 : "+roundedGrades);
			System.out.println();

    }
	
	@Override
    public void MethodOverloading() {
		class MyClass { 
			void greetings(String s) {
				
				System.out.println(s);
			}
			
			void greetings(String s, String t) {  
				System.out.println(s + t);  
			}
			    
				//int to int
			void sum(int numOne, int numTwo) {
					int answer = numOne + numTwo;
					System.out.println("Int to Int : "+numOne+" + "+numTwo+ " = "+answer);
				}
				
			//int to float
			void sum(int numOne, float numTwo) {
				float answer = numOne + numTwo;
				System.out.println("Int to float : "+numOne+" + "+numTwo+ " = "+answer);
			}
				
			//int to double
			void sum(int numOne, double numTwo) {
				double answer = numOne + numTwo;
				System.out.println("Int to double : "+numOne+" + "+numTwo+ " = "+answer);
			}
				
			//int to int to float
			void sum(int numOne, int numTwo, float numTres) {
				float answer = numOne + numTwo + numTres;
				System.out.println("Int to Int to Float : "+numOne+" + "+numTwo+" + "+numTres+ " = "+answer);
			}
			
			//with return type. int to int to double
			double sum(int numOne, int numTwo, double numTres) {
				return numOne + numTwo + numTres;
			}
		}
		    MyClass thisclass = new MyClass();    //create instance of a class
		     thisclass.greetings("Hello method overloading");
		     thisclass.greetings("WELCOME TO", "   METHOD OVERLOADING");
		     
		     //int to int
		     thisclass.sum(3, 5);
		     
		     //int to float
		     thisclass.sum(5, 10.6f);
		     
		     //int to double
		     thisclass.sum(3, 3.30);
		     
		     //int to int to float
		     thisclass.sum(3, 5,50f);
	     
		     //int to int to double with return type
		     double answer = thisclass.sum(5, 10, 17d);
		     System.out.println(answer);
	}
	
	@Override
    public void MethodOverriding() {
		 class Vehicle {
	        public void displayInfo() {
	            System.out.println("I am a vehicle");
	        }
	    }

	     class Car extends Vehicle {
	        @Override
	        public void displayInfo() {
	            System.out.println("I am a car");
	        }
	    }
         Car myCar = new Car();
         myCar.displayInfo();
    }
    
    @Override
    public void UsingExtendKeyword() {
    	  class Person {
        	
        	public void personalInfo(){
        		System.out.println("I'm a person!");
        	}
        }
         class Students extends Person{
        	
        	@Override
        	public void personalInfo(){
        		System.out.println();
        		System.out.println("I'm a Student!");
        		System.out.println("MSC Student!");
        		System.out.println("Major in Software Development");

        	}
        }
         class Teacher extends Person{
        	
        	@Override
        	public void personalInfo(){
        		System.out.println();
        		System.out.println("I'm a Teacher!");
        		System.out.println("Teaching in MSC!");
        		System.out.println("Welness instructor!");

        	}
        }

         class Employee extends Person{
        	
        	@Override
        	public void personalInfo(){
        		System.out.println();
        		System.out.println("I'm an Employee!");
        		System.out.println("Working in new jersey");
        		System.out.println("A system analyst");


        	}
        }
    	Person person = new Person();
    	person.personalInfo();
    	
    	Students student = new Students();
    	student.personalInfo();
    	
    	Teacher teacher = new Teacher();
    	teacher.personalInfo();
    	
    	Employee employee = new Employee();
    	employee.personalInfo();
    }
    
    @Override
    public void UsingImplementKeyword() {

    	    interface MyInterface {
    	    	void JOIN_GCLASSROOM();
    	    	void JOIN_GMEET();
    	    	void JOIN_GCHAT();
    	    }
    	    
    	     class OOPCLASS implements MyInterface{
    	    	public void JOIN_GCLASSROOM() {
    	    		System.out.println("has joined the gclassroom in OOP Class");
    	    	};
    	    	public void JOIN_GMEET() {
    	    		System.out.println("has joined the meeting in OOP Class");
    	    	};
    	    	public void JOIN_GCHAT() {
    	    		System.out.println("has joined the group chat OOP Class");
    	    	};
    	    }
    	    
    	     class PROGRAMMING2 implements MyInterface{
    	    	public void JOIN_GCLASSROOM() {
    	    		System.out.println("has joined the gclassroom in Programing2");
    	    	};
    	    	public void JOIN_GMEET() {
    	    		System.out.println("has joined the meeting in Programing2");
    	    	};
    	    	public void JOIN_GCHAT() {
    	    		System.out.println("has joined the group chat in Programing2");
    	    	};
    	    }
    	    
    	     class WEBPROGRAMMING1 implements MyInterface{
    	    	public void JOIN_GCLASSROOM() {
    	    		System.out.println("has joined the gclassroom in web programming 1 ");
    	    	};
    	    	public void JOIN_GMEET() {
    	    		System.out.println("has joined the meeting in web programming 1 ");
    	    	};
    	    	public void JOIN_GCHAT() {
    	    		System.out.println("has joined the group chat in web programming 1 ");
    	    	};
    	    	
    	    }
    	    	OOPCLASS oopClass = new OOPCLASS();
    	    	System.out.println("OOP CLASS");
    	    	oopClass.JOIN_GCLASSROOM();
    	    	oopClass.JOIN_GMEET();
    	    	oopClass.JOIN_GCHAT();
    	    	System.out.println();
    	    	
    	    	PROGRAMMING2 programming2 = new PROGRAMMING2();
    	    	System.out.println("PROGRAMMING 2");
    	    	programming2.JOIN_GCLASSROOM();
    	    	programming2.JOIN_GMEET();
    	    	programming2.JOIN_GCHAT();
    	    	System.out.println();

    	    	
    	    	WEBPROGRAMMING1 webProgramming = new WEBPROGRAMMING1();
    	    	System.out.println("WEB PROGRAMMING 1");
    	    	webProgramming.JOIN_GCLASSROOM();
    	    	webProgramming.JOIN_GMEET();
    	    	webProgramming.JOIN_GCHAT();
    	    	System.out.println();
    }


    public void showMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nList of Activities:");
            System.out.println("\t1. All about Method");
            System.out.println("\t2. Conversion");
            System.out.println("\t3. Encapsulation");
            System.out.println("\t4. Method Overloading");
            System.out.println("\t5. Method Overriding");
            System.out.println("\t6. Using Extend Keyword");
            System.out.println("\t7. Using Implement Keyword");
            System.out.println("\t8. Exit");
            System.out.print("\nEnter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("----------------------------------------------");
                    System.out.println("\nSelected: All about Method\n");
                    Vigo allaboutmethod = new Vigo();
                    allaboutmethod.AllAboutMethod();
                    System.out.println("----------------------------------------------");
                    break;
                case 2:
                    System.out.println("----------------------------------------------");
                    System.out.println("\nSelected: Conversion\n");
                    Vigo conversion = new Vigo();
                    conversion.Conversion();
                    System.out.println("----------------------------------------------");
                    break;
                case 3:
                    System.out.println("----------------------------------------------");
                    System.out.println("\nSelected: Encapsulation\n");
                    Vigo encapsulation = new Vigo();
                    encapsulation.Encapsulation();
                    System.out.println("----------------------------------------------");
                    break;
                case 4:
                    System.out.println("----------------------------------------------");
                    System.out.println("\nSelected: Method Overloading\n");
                    Vigo overloading = new Vigo();
                    overloading.MethodOverloading();
                    System.out.println("----------------------------------------------");
                    break;
                case 5:
                    System.out.println("----------------------------------------------");
                    System.out.println("\nSelected: Method Overriding\n");
                    Vigo overriding = new Vigo();
                    overriding.MethodOverriding();
                    System.out.println("----------------------------------------------");
                    break;
                case 6:
                    System.out.println("----------------------------------------------");
                    System.out.println("\nSelected: Using Extend Keyword\n");
                    Vigo usingExtend = new Vigo();
                    usingExtend.UsingExtendKeyword();
                    System.out.println("----------------------------------------------");
                    break;
                case 7:
                    System.out.println("----------------------------------------------");
                    System.out.println("\nSelected: Using Implement Keyword\n");
                    Vigo usingImplement = new Vigo();
                    usingImplement.UsingImplementKeyword();
                    System.out.println("----------------------------------------------");
                    break;
                case 8:
                    System.out.println("Exiting the program.......\n");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 8);
    }
}

public class Main {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	int choice;
    	do {
        	System.out.println("List of students in this program:");
        	System.out.println("\t1. Charles Mc Vigo"
        			+ "\n\t2. Johanna Mae Ferrer"
        			+ "\n\t3. Myca Magallanes"
        			+ "\n\t4. Kenneth Paul Montero"
        			+ "\n\t5. Exit");
        	System.out.print("\nSelect student to view their activities : ");
        	choice=scanner.nextInt();
        	
        	switch(choice) {
        	case 1:
                System.out.println("----------------------------------------------");
        		System.out.println("Student name : Charles Mc Vigo");
                System.out.println("----------------------------------------------");
                Vigo charles = new Vigo();
                charles.showMenu();
        		break;
        	case 2:
                System.out.println("----------------------------------------------");
        		System.out.println("Student name : Johanna Mae Ferrer");
                System.out.println("----------------------------------------------");
                Ferrer johanna = new Ferrer();
                johanna.showMenu();
        		break;
        	case 3:
                System.out.println("----------------------------------------------");
        		System.out.println("Student name : Myca Magallenes");
                System.out.println("----------------------------------------------");
                Magallanes myca = new Magallanes();
                myca.showMenu();
        		break;
        	case 4:
                System.out.println("----------------------------------------------");
        		System.out.println("Student name : Kenneth Paul Montero");
        		Montero kenneth = new Montero();
        		kenneth.showMenu();
                System.out.println("----------------------------------------------");
        		break;
        	case 5:
        		System.out.println("Exiting program.....");
        		break;
        	default:
        		System.out.println("Invalid Selection!\n");
        		break;
        	}
        	
		} while (choice!=5);
    	scanner.close();
    }
}
