package assignment1_spring;

public class Student {

    private String id;
    private String name;
    private String major;
    private int age;
    private int yearsOfEnrollment;
    private double gpa;
    private int numberOfIncompleteCourses;

    public Student(String id, String name, String major, int age,
                   int yearsOfEnrollment, double gpa, int numberOfIncompleteCourses) 
    {
        this.id = id;
        this.name = name;
        this.major = major;
        this.age = age;
        this.yearsOfEnrollment = yearsOfEnrollment;
        this.gpa = gpa;
        this.numberOfIncompleteCourses = numberOfIncompleteCourses;
    }

    public String getMajor() 
    { 
    	return major; 
    }
    public int getAge() 
    { 
    	return age; 
    }
    public double getGpa() 
    { 
    	return gpa; 
    }
}