package ActivitiesCompilation;

import java.util.Scanner;

public class Magallanes extends Activity {
	
	@Override
	public void Method() {
		System.out.println("Method");
	}
	
	@Override
	public void Inheritance() {
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
        Student student = new Student("Myca Magallanes", 20, "21B1122");
        Teacher teacher = new Teacher("Aica Garcia", 30, "Science");
        Employee employee = new Employee("Hanna Estioco", 25, "88BW233");

        System.out.println("Student Information:");
        student.personalInfo();

        System.out.println("\nTeacher Information:");
        teacher.personalInfo();

        System.out.println("\nEmployee Information:");
        employee.personalInfo();
	}
	
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
	        method1.greetings("GOOD AFTERNOON", "CINDY LEGASPINO");      // inheritance
	      // System.out.println(method1.attendance("MYCA", "MAGALLANES"));
	      
	        String fullname=method1.attendance("MYCA","MAGALLANES");
	        method1.mygreetings(fullname);  
	        method1.sum(10,5.3F);
	}

	@Override
    public void Conversion() {
		
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
	       
	        String greeting = method1.mygreetings("MYCA MAGALLANES");
	        System.out.println(greeting);
	        float result = method1.sum(10,10.3F);
	        System.out.println(result);
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
			  public void sum(int r, int b) {      
			     System.out.println(r+b);
			  }
			 public void sum(int a, int b, int c) {
			        System.out.println(a+b+c);
			   
			  }
		}   
	     MyClass thisclass = new MyClass();    //create instance of a class
	     thisclass.greetings("Hello method overloading");
	     thisclass.greetings("WELCOME TO", "   METHOD OVERLOADING");
	     thisclass.sum(19,19);
	     thisclass.sum(19,19,19);    
	}



	@Override
    public void UsingImplementKeyword() {
		interface ClassroomInterface {
			void JOIN_GCLASSROOM();
			void JOIN_GMEET();
			void JOIN_GCHAT();
			}
			class OOPClass implements ClassroomInterface {
			public void JOIN_GCLASSROOM() {
				System.out.println("Joining OOPClass on Google Classroom");
				}
					public void JOIN_GMEET() {
				System.out.println("Joining OOPClass on Google Meet");
				}
				public void JOIN_GCHAT() {
					System.out.println("Joining OOPClass on Google Chat");
				}
			}
			class Programming2 implements ClassroomInterface {
			public void JOIN_GCLASSROOM() {
					System.out.println("Joining Programming2 on Google Classroom");
				}
				public void JOIN_GMEET() {
					System.out.println("Joining Programming2 on Google Meet");
				}
				public void JOIN_GCHAT() {
					System.out.println("Joining Programming2 on Google Chat");
				}
			}
			class WebProgramming1 implements ClassroomInterface {
				public void JOIN_GCLASSROOM() {
					System.out.println("Joining WebProgramming1 on Google Classroom");
				}
				public void JOIN_GMEET() {
					System.out.println("Joining WebProgramming1 on Google Meet");
				}
				public void JOIN_GCHAT() {
					System.out.println("Joining WebProgramming1 on Google Chat");
				}
			} 
			
			OOPClass oopClass = new OOPClass();
			Programming2 programming2 = new Programming2();
			WebProgramming1 webProgramming1 = new WebProgramming1();
			oopClass.JOIN_GCLASSROOM();
			oopClass.JOIN_GMEET();
			oopClass.JOIN_GCHAT();
			programming2.JOIN_GCLASSROOM();
			programming2.JOIN_GMEET();
			programming2.JOIN_GCHAT();
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
            System.out.println("\t5. Inheritance");
            System.out.println("\t6. Using Implement Keyword");
            System.out.println("\t7. Exit");
            System.out.print("\nEnter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("----------------------------------------------");
                    System.out.println("\nSelected: All About Method\n");
                    Magallanes allAboutMethod = new Magallanes();
                    allAboutMethod.AllAboutMethod();
                    System.out.println("----------------------------------------------");
                    break;
                case 2:
                    System.out.println("----------------------------------------------");
                    System.out.println("\nSelected: Conversion\n");
                    Magallanes conversion = new Magallanes();
                    conversion.Conversion();
                    System.out.println("----------------------------------------------");
                    break;
                case 3:
                    System.out.println("----------------------------------------------");
                    System.out.println("\nSelected: Encapsulation\n");
                    Magallanes encapsulation = new Magallanes();
                    encapsulation.Encapsulation();
                    System.out.println("----------------------------------------------");
                    break;
                case 4:
                    System.out.println("----------------------------------------------");
                    System.out.println("\nSelected: Method Overloading\n");
                    Magallanes overloading = new Magallanes();
                    overloading.MethodOverloading();
                    System.out.println("----------------------------------------------");
                    break;
                case 5:
                    System.out.println("----------------------------------------------");
                    System.out.println("\nSelected: Inheritance\n");
                    Magallanes inheritance = new Magallanes();
                    inheritance.Inheritance();
                    System.out.println("----------------------------------------------");

                    break;
                case 6:
                    System.out.println("----------------------------------------------");
                    System.out.println("\nSelected: Using Implement Keyword\n");
                    Magallanes usingImplement = new Magallanes();
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
