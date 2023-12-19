package ActivitiesCompilation;

import java.util.Scanner;


public class Ferrer extends Activity {

	@Override
	public void AllAboutMethod() {
		class allaboutmethods {
		    
		    
		    public float sum(int num1, float num2) {
		        
		        float f=(float)(num1+num2);
		        
		        return f;
		    }
		    
		    public String greetings(String message, String name) {
		        
		        String greeting = message + " " + name;
		        
		        return greeting;
		    }
		    
		    public String attendance(String firstname, String lastname) {
		        
		        String name=lastname + "  " +firstname;
		        return name;
		    }
		    
		    public String mygreetings(String mystring) {
		        
		        return "HELLO "  + mystring;
		    }
		    
		}
		
        allaboutmethods method1;   //class declaration
        method1=new allaboutmethods();  // this is how to create instance     object
        String greetingMessage =method1.greetings("GOOD AFTERNOON", "EVERYONE");      // inheritance
         System.out.println(greetingMessage);
       
       String greeting = method1.mygreetings("JOHANNA FERRER");
        System.out.println(greeting);
       float result = method1.sum(20,5.3F);
       System.out.println(result);
		
	}

	@Override
    public void Conversion() {
		 class Person {
		    public String lastname;
		    public String firstname;
		    public int age;
		    
		    public void talk() {
		        System.out.println("Nabiya Online Shop");
		    }

		    public void walk() {
		        System.out.println("Thank you!");
		    }

		    public int give() {
		       
		    return 10000;
		    
		    }
		}
	        Person student = new Person();
	        student.lastname = ("Ferrer");
	        student.firstname = ("Johanna Mae");
	        student.age = 21;

	        student.talk();
	        student.walk();
	        System.out.println("Total profit this month " + student.give() +  "for the whole year.");
	}

	@Override
    public void Encapsulation() {  
		     class myotherclass {
		   
		     private String accountno="101395";
		     private String name="FERRER";
		     private double amount=5000;
		   
		     public void displayinfo() {
		        System.out.println("ACCOUNT NUMBER : " +accountno);
		        System.out.println("ACCOUNT NAME : " +name);
		        System.out.println("AMOUNT       : " +amount); 
		    } 

		    public void withdraw() {
		        System.out.println("AMOUNT to WITHDRAW      : " +1000);
		        System.out.println("AMOUNT       : " +(amount-1000));
		       // displayinfo(); 
		    }
		    
		}
		     
	      int x=7;
	      int y=13;
	      int z=x+y;

	      System.out.println("Sum of x+y = " + z);
	      myotherclass thisclass=new myotherclass();
	       thisclass.displayinfo();
	       thisclass.withdraw();
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
			     // sum of two numbers within parameter
			    public void sum(int a, int b) {      
			     System.out.println(a+b);
			  }
			    public void sum(int a, int b, int c) {
			        System.out.println(a+b+c);
			   
			  }
			    public void sum(int a, int b, int c, int d) {
			        System.out.println(a+b+c+d);
			  }       
		}
		
	     MyClass thisclass = new MyClass();    //create instance of a class
	     thisclass.greetings("Hello Method Overloading");
	     thisclass.greetings("WELCOME TO", " METHOD OVERLOADING");
	     thisclass.sum(7,8);
	     thisclass.sum(8,11,13);
	     thisclass.sum(8,11,13,21);
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

        Student student = new Student("Johanna Mae Ferrer", 21, "21B1076");
        Teacher teacher = new Teacher("Johanna Ferrer", 30, "Science");
        Employee employee = new Employee("Hanna Ferrer", 25, "21B1076");

        System.out.println("Student Information:");
        student.personalInfo();

        System.out.println("\nTeacher Information:");
        teacher.personalInfo();

        System.out.println("\nEmployee Information:");
        employee.personalInfo();
	}

	@Override
    public void UsingImplementKeyword() {
		
		interface MyOnlineLearning {
		    public void JOIN_GCLASSROOM();
		    public void JOIN_GMEET();
		    public void JOIN_GCHAT();
		}

		class OOPClass implements MyOnlineLearning {
		    @Override
		    public void JOIN_GCLASSROOM() {
		        System.out.println("Joining OOPClass on Google Classroom");
		    }

		    @Override
		    public void JOIN_GMEET() {
		        System.out.println("Joining OOPClass on Google Meet");
		    }

		    @Override
		    public void JOIN_GCHAT() {
		        System.out.println("Joining OOPClass on Google Chat");
		    }
		}

		class Programming2 implements MyOnlineLearning {
		    @Override
		    public void JOIN_GCLASSROOM() {
		        System.out.println("Joining Programming2 on Google Classroom");
		    }

		    @Override
		    public void JOIN_GMEET() {
		        System.out.println("Joining Programming2 on Google Meet");
		    }

		    @Override
		    public void JOIN_GCHAT() {
		        System.out.println("Joining Programming2 on Google Chat");
		    }
		}

		class WebProgramming1 implements MyOnlineLearning {
		    @Override
		    public void JOIN_GCLASSROOM() {
		        System.out.println("Joining WebProgramming1 on Google Classroom");
		    }

		    @Override
		    public void JOIN_GMEET() {
		        System.out.println("Joining WebProgramming1 on Google Meet");
		    }

		    @Override
		    public void JOIN_GCHAT() {
		        System.out.println("Joining WebProgramming1 on Google Chat");
		    }
		}
		
        MyOnlineLearning OOPClass = new OOPClass();
        OOPClass.JOIN_GCLASSROOM();
        OOPClass.JOIN_GMEET();
        OOPClass.JOIN_GCHAT();

        MyOnlineLearning programming2 = new Programming2();
        programming2.JOIN_GCLASSROOM();
        programming2.JOIN_GMEET();
        programming2.JOIN_GCHAT();

        MyOnlineLearning webProgramming1 = new WebProgramming1();
        webProgramming1.JOIN_GCLASSROOM();
        webProgramming1.JOIN_GMEET();
        webProgramming1.JOIN_GCHAT();
    }
    
    public void showMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nList of Activities:");
            System.out.println("\t1. All About Method");
            System.out.println("\t2. Conversion");
            System.out.println("\t3. Encapsulation");
            System.out.println("\t4. Method Overloading");
            System.out.println("\t5. Using Extend Keyword");
            System.out.println("\t6. Using Implement Keyword");
            System.out.println("\t7. Exit");
            System.out.print("\nEnter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("----------------------------------------------");
                    System.out.println("\nSelected: All About Method\n");
                    Ferrer allaboutmethod = new Ferrer();
                    allaboutmethod.AllAboutMethod();
                    System.out.println("----------------------------------------------");
                    break;
                case 2:
                    System.out.println("----------------------------------------------");
                    System.out.println("\nSelected: Conversion\n");
                    Ferrer conversion = new Ferrer();
                    conversion.Conversion();
                    System.out.println("----------------------------------------------");
                    break;
                case 3:
                    System.out.println("----------------------------------------------");
                    System.out.println("\nSelected: Encapsulation\n");
                    Ferrer encapsulation = new Ferrer();
                    encapsulation.Encapsulation();
                    System.out.println("----------------------------------------------");
                    break;
                case 4:
                    System.out.println("----------------------------------------------");
                    System.out.println("\nSelected: Method Overloading\n");
                    Ferrer overloading = new Ferrer();
                    overloading.MethodOverloading();
                    System.out.println("----------------------------------------------");
                    break;
                case 5:
                    System.out.println("----------------------------------------------");
                    System.out.println("\nSelected: Using Extend Keyword\n");
                    Ferrer usingKeyword = new Ferrer();
                    usingKeyword.UsingExtendKeyword();
                    System.out.println("----------------------------------------------");
                    break;
                case 6:
                    System.out.println("----------------------------------------------");
                    System.out.println("\nSelected: Using Implement Keyword\n");
                    Ferrer usingImplement = new Ferrer();
                    usingImplement.UsingImplementKeyword();
                    System.out.println("----------------------------------------------");
                    break;
                case 7:
                    System.out.println("Exiting the program.......\n");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 7);
    }
}
