package ActivitiesCompilation;

import java.util.Scanner;

public class Montero extends Activity{
	
	@Override
    public void AllAboutMethod() {
		 class allaboutmethods {
		    int x;
		    float y;
		    double z=6.9;

		    public void sum(int num1, float num2) {
		        
		        float f=(float)(num1+num2);
		        
		        System.out.println(f);
		    }
		    
		    public void greetings(String message, String name) {
		        
		        System.out.println("" +message + " " +name);
		    }
		    
		    public String attendance(String firstname, String lastname) {
		        
		        String name=lastname + "  " +firstname;
		        return name;
		    }
		    
		    public void mygreetings(String mystring) {
		        
		        System.out.println("HELLO   "  +mystring);
		    }
		}
	        allaboutmethods method1;   //class declaration
	        method1=new allaboutmethods();  // this is how to create instance     object
	        method1.greetings("GOOD AFTERNOON", "Sir");      // inheritance
	      
	      
	        String fullname=method1.attendance("Kenneth","Montero");
	      	method1.mygreetings(fullname);  
	      	method1.sum(10,5.3F);
		 
	}

	@Override
    public void Conversion() {
		 class Person {
		    public String lastname;
		    public String firstname;
		    public int age;


		    public void talk() {
		        System.out.println("shoppee");
		    }

		    public void walk() {
		        System.out.println("Thank you!");
		    }

		    public int give() {
		       
		    return 10000;
		    
		    }
		}   
	        Person student = new Person();
	        student.lastname = ("Montero");
	        student.firstname = ("Kenneth Paul");
	        student.age = 20;

	        student.talk();
	        student.walk();
	        System.out.println("Total profit this month " + student.give() +  "for the whole year.");
	}

	@Override
    public void Encapsulation() {

		class MyOtherClass {

		    private String accountNo = "999999";
		    private String name = "Kenneth";
		    private double amount = 5000;

		    public void displayInfo() {
		        System.out.println("ACCOUNT NUMBER: " + accountNo);
		        System.out.println("ACCOUNT NAME: " + name);
		        System.out.println("AMOUNT: " + amount);
		    }

		    public void withdraw() {
		        double withdrawalAmount = 5000;
		        System.out.println("AMOUNT to WITHDRAW: " + withdrawalAmount);
		        amount -= withdrawalAmount;
		        System.out.println("AMOUNT: " + amount);
		    }
		}
        int x = 7;
        int y = 13;
        int z = x + y;

        System.out.println("Sum of x + y = " + z);

        MyOtherClass thisClass = new MyOtherClass();
        thisClass.displayInfo();
        thisClass.withdraw();
    }

	@Override
    public void MethodOverloading() {
		 class MyClass {   
			  public void greetings(String s) {
			      
			      System.out.println(s);
			      
			  }
			    public void greetings(String s, String t) {
			      
			      System.out.println(s + t);
			      
			  }
			  public void sum(int r, int b) {      
			     System.out.println(r+b);
			 }
			 public void sum(int a, int b, int c) {
			        System.out.println(a+b+c);
			 }
		}  
	     MyClass thisclass = new MyClass();    
	     thisclass.greetings("Hello method overloading");
	     thisclass.greetings("WELCOME TO", "   METHOD OVERLOADING");
	     thisclass.sum(19,19);
	     thisclass.sum(19,19,19);
	}

	@Override
    public void MethodOverriding() {
		interface joiningclass {
		    void joinGClassroom();
		    void joinGMeet();
		    void joinGChat();
		}

		class OOPClass implements joiningclass {
		    public void joinGClassroom() {
		        System.out.println("Kenneth Montero joined the OOP class on Google Classroom.");
		    }

		    public void joinGMeet() {
		        System.out.println("Kenneth Montero joined the OOPClass to Google Meet.");
		    }

		    public void joinGChat() {
		        System.out.println("Kenneth Montero joined to Google Chat.");
		    }
		}

		class Programming2 implements joiningclass {
		    public void joinGClassroom() {
		        System.out.println("I Joined Programming2 to Google Classroom.");
		    }

		    public void joinGMeet() {
		        System.out.println("I Joined Programming2 to Google Meet.");
		    }

		    public void joinGChat() {
		        System.out.println("I Joined Programming2 to Google Chat.");
		    }
		}

		class WebProgramming1 implements joiningclass {
		    public void joinGClassroom() {
		        System.out.println("Joined WebProgramming1 to Google Classroom.");
		    }

		    public void joinGMeet() {
		        System.out.println("Joined WebProgramming1 to Google Meet.");
		    }

		    public void joinGChat() {
		        System.out.println("Joined WebProgramming1 to Google Chat.");
		    }
		}
        OOPClass oopClass = new OOPClass();
        oopClass.joinGClassroom();
        oopClass.joinGMeet();
        oopClass.joinGChat();

        Programming2 programming2 = new Programming2();
        programming2.joinGClassroom();
        programming2.joinGMeet();
        programming2.joinGChat();

        WebProgramming1 webProgramming1 = new WebProgramming1();
        webProgramming1.joinGClassroom();
        webProgramming1.joinGMeet();
        webProgramming1.joinGChat();
	}

	@Override
    public void UsingExtendKeyword() {
		class Person {
		    private String name;
		    private int age;

		    public Person(String name, int age) {
		        this.name = name;
		        this.age = age;
		    }

		    public String getName() {
		        return name;
		    }

		    public int getAge() {
		        return age;
		    }

		    public void personalInfo() {
		        System.out.println("Name: " + name);
		        System.out.println("Age: " + age);
		    }
		}

		class Student extends Person {
		    private String studentId;

		    public Student(String name, int age, String studentId) {
		        super(name, age);
		        this.studentId = studentId;
		    }

		    public void personalInfo() {
		        super.personalInfo();
		        System.out.println("Student ID: " + studentId);
		    }
		}
		class Teacher extends Person {
		    private String subject;

		    public Teacher(String name, int age, String subject) {
		        super(name, age);
		        this.subject = subject;
		    }

		    public void personalInfo() {
		        super.personalInfo();
		        System.out.println("Subject: " + subject);
		    }
		}

		class Employee extends Person {
		    private String employeeId;

		    public Employee(String name, int age, String employeeId) {
		        super(name, age);
		        this.employeeId = employeeId;
		    }

		    public void personalInfo() {
		        super.personalInfo();
		        System.out.println("Employee ID: " + employeeId);
		    }
		}
		
        Student student = new Student("Kenneth Montero", 20, "21B1323");
        Teacher teacher = new Teacher("Lorimer Imperio", 30, "OOP");
        Employee employee = new Employee("Juan Tama", 25, "88BW233");

        System.out.println("Student Information:");
        student.personalInfo();

        System.out.println("\nTeacher Information:");
        teacher.personalInfo();

        System.out.println("\nEmployee Information:");
        employee.personalInfo();
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
	                    Montero allAboutMethod = new Montero();
	                    allAboutMethod.AllAboutMethod();
	                    System.out.println("----------------------------------------------");
	                    break;
	                case 2:
	                    System.out.println("----------------------------------------------");
	                    System.out.println("\nSelected: Conversion\n");
	                    Montero conversion = new Montero();
	                    conversion.Conversion();
	                    System.out.println("----------------------------------------------");

	                    break;
	                case 3:
	                    System.out.println("----------------------------------------------");
	                    System.out.println("\nSelected: Encapsulation\n");
	                    Montero encapsulation = new Montero();
	                    encapsulation.Encapsulation();
	                    System.out.println("----------------------------------------------");

	                    break;
	                case 4:
	                    System.out.println("----------------------------------------------");
	                    System.out.println("\nSelected: Method Overloading\n");
	                    Montero overloading = new Montero();
	                    overloading.MethodOverloading();
	                    System.out.println("----------------------------------------------");

	                    break;
	                case 5:
	                    System.out.println("----------------------------------------------");
	                    System.out.println("\nSelected: Method Overriding\n");
	                    Montero overriding = new Montero();
	                    overriding.MethodOverriding();
	                    System.out.println("----------------------------------------------");

	                    break;
	                case 6:
	                    System.out.println("----------------------------------------------");
	                    System.out.println("\nSelected: Using Extend Keyword\n");
	                    Montero usingExtend = new Montero();
	                    usingExtend.UsingExtendKeyword();
	                    System.out.println("----------------------------------------------");

	                    break;

	                case 7:
	                    System.out.println("Exiting the program.......\n");
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        } while (choice != 8);

	    }
	}
