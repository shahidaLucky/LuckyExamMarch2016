package oop.design;

public class EmployeeInfo {
	
 /*This class can be implemented from Employee interface then add additional methods in EmployeeInfo class.
 * Also, Employee interface can be implemented into an abstract class.So create an Abstract class
 * then inherit that abstract class into EmployeeInfo class.Once you done with designing EmployeeInfo class,
 * go to CnnEmployee class to apply all the fields and attributes.
 * 
 * Important: YOU MUST USE the 
 * OOP(abstraction,Encapsulation, Inheritance and Polymorphism) concepts in every level possible.
 * Use all kind of keywords(super,this,static,final........)
 *
 */

    /*
	 * declare few static and final fields and some non-static fields
	 */
    static String companyName;
    private int employeeId;
    private String employeeName;
    private String designation;
    private String department;
    private int currentYear;
    private int performanceScore;
    private double baseSalary;
    private double phoneNumber;
    private double performanceBonus;
    private double pension;
    private double totalSalary;
	
	/*
	 * You must implement the logic for below 2 methods and 
	 * following 2 methods are prototype as well for other methods need to be design,
	 * as you will come up with the new ideas.
	 */

    /*
	 * you must have multiple constructor.
	 * Must implement below constructor.
	 */
    public EmployeeInfo(int employeeId) {
        this.employeeId = employeeId;
    }

    public EmployeeInfo(String name, int employeeId) {
        this.employeeId = employeeId;
        this.employeeName = name;
    }

    public EmployeeInfo(int employeeId, String employeeName, String designation) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.designation = designation;
    }

    public EmployeeInfo(int employeeId, String designation, String employeeName, int currentYear) {
        this.employeeId = employeeId;
        this.designation = designation;
        this.employeeName = employeeName;
        this.currentYear = currentYear;
    }

    public EmployeeInfo(int employeeId, double phoneNumber, String employeeName, String department, String designation) {
        this.employeeId = employeeId;
        this.phoneNumber = phoneNumber;
        this.employeeName = employeeName;
        this.department = department;
        this.designation = designation;
    }
	
	/*
	 * This methods should calculate Employee bonus based on salary and performance.
	 * Then it will return the total yearly bonus. So you need to implement the logic.
	 * Hints: 10% of the salary for best performance, 8% of the salary for average performance and so on. 
	 * You can set arbitrary number for performance.
	 * So you probably need to send 2 arguments.
	 * 
	 */


    public static int calculateEmployeBonus(int baseSalary, int count) {
        int total = 0;
        total = baseSalary * (count / 100);
        return total;
    }

    /*
	 * This methods should calculate Employee Pension based on salary and numbers of years with the company.
	 * Then it will return the total pension. So you need to implement the logic.
	 * Hints: pension will be 5% of the salary for 1 year, 10% for 2 years with the company and so on.
	 * So you probably need to send 2 arguments.
	 * 
	 */
    public static int calculateEmployePension() {
        int total = 0;
        //percentage = years * .5;
        //total = percentage* salary;

        return total;
    }

    public static String getCompanyName() {
        return companyName;
    }

    public static void setCompanyName(String companyName) {
        EmployeeInfo.companyName = companyName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    /*public double getBonus() {
        return bonus;
    }
	public void setBonus(double bonus) {
		//this.bonus = bonus;
	}
	public double getSalary() {
		//return salary;
	}
	public void setSalary(double salary) {
		//this.salary = salary;
	}
	public double getPerformance() {
		//return performance;
	}
	public void setPerformance(int performance) {
		//this.performance = performance;
	}
	public String getDepartment() {
		return department;
	}

	public int getCurrentYear() {
		return currentYear;
	}
	public void setCurrentYear(int currentYear) {
		this.currentYear = currentYear;
	}
	public double getPension() {
		return pension;
	}

	//@Override
	/*public String toString()
	{
		return "EmployeeInfo [employeeId=" + employeeId + ", employeeName=" + employeeName + ", bonus=" + bonus
				+ ", salary=" + salary + ", performance=" + performance + ", department=" + department
				+ ", currentYear=" + currentYear + ", pension=" + pension + "]";


	}*/

}

