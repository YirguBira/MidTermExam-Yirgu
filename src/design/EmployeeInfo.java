package design;

import java.util.*;

public class EmployeeInfo implements Employee {

 /*This class can be implemented from Employee interface then add additional methods in EmployeeInfo class.
 * Also, Employee interface can be implemented into an abstract class.So create an Abstract class
 * then inherit that abstract class into EmployeeInfo class.Once you done with designing EmployeeInfo class,
 * go to FortuneEmployee class to apply all the fields and attributes.
 * 
 * Important: YOU MUST USE the 
 * OOP(abstraction,Encapsulation, Inheritance and Polymorphism) concepts in every level possible.
 * Use all kind of keywords(super,this,static,final........)
 * Implement Nested class.
 * Use Exception Handling.
 *
 */

	/*
	 * declare few static and final fields and some non-static fields
	 */
	static String companyName = "ABC Soccer League";
	final double MAX_WEEKLY_SALARY = 350000.00;

	public double getMaxSalary(double MAX_WEEKLY_SALARY){
        System.out.println(MAX_WEEKLY_SALARY);
        return MAX_WEEKLY_SALARY;
    }

    /*
	 * You must implement the logic for below 2 methods and 
	 * following 2 methods are prototype as well for other methods need to be design,
	 * as you will come up with the new ideas.
	 */
	
	/*
	 * you must have multiple constructor.
	 * Must implement below constructor.
	 */
	public EmployeeInfo(int employeeId){

	}
    public EmployeeInfo(String name, int employeeId){

	}
	
	/*
	 * This methods should calculate Employee bonus based on salary and performance.
	 * Then it will return the total yearly bonus. So you need to implement the logic.
	 * Hints: 10% of the salary for best performance, 8% of the salary for average performance and so on. 
	 * You can set arbitrary number for performance.
	 * So you probably need to send 2 arguments.
	 * 
	 */
	public static int calculateEmployeeBonus(int numberOfYearsWithCompany){
		int total=0;
		return total;
	}

    public static int calculateEmployeeBonus(int numberOfYearsWithCompany, int NumberOfEmployees, int Amt){
//        numberOfYearsWithCompany = 20;
//        NumberOfEmployees = 200;
//        Amt = 6000;
        int total = numberOfYearsWithCompany * NumberOfEmployees * Amt;
        System.out.println(total);
        return total;
    }
	
	/*
	 * This methods should calculate Employee Pension based on salary and numbers of years with the company.
	 * Then it will return the total pension. So you need to implement the logic.
	 * Hints: pension will be 5% of the salary for 1 year, 10% for 2 years with the company and so on.
	 * 
	 */
	public static int calculateEmployeePension(){
		int total=0;
		Scanner sc  = new Scanner(System.in);
		System.out.println("Please enter start date in format (example: May,2015): ");
		String joiningDate = sc.nextLine();
		System.out.println("Please enter today's date in format (example: August,2017): ");
		String todaysDate = sc.nextLine();
        String convertedJoiningDate = DateConversion.convertDate(joiningDate);
        String convertedTodaysDate = DateConversion.convertDate(todaysDate);

        //implement numbers of year from above two dates
		//Calculate pension

		return total;
	}

	public int employeeId() {
	    int ID = 0;
		List<Integer> empID = new ArrayList<Integer>();
		empID.add(0001);
		empID.add(0002);
		empID.add(0003);
		empID.add(0004);
		empID.add(0005);
		empID.add(0006);
		empID.add(0007);
		System.out.println(empID);
		return ID;
	}

	public String employeeName() {
		String name = "";
		List<String> empName = new ArrayList<String>();
		empName.add("Ashley Young");
		empName.add("Patrice Evra");
		empName.add("Nemanja Vidic");
		empName.add("Eric Cantona");
		empName.add("Chris Smalling");
		empName.add("Romelu Lukaku");
		empName.add("Marcus Rashford");
		System.out.println(empName);

		return name;
	}

	public void EmployeeNameAndID(){
		//Adding employee name and id to map
		Map <String, String> empNameAndID = new HashMap<>();
		empNameAndID.put("0001", "Ashley Young");
		empNameAndID.put("0002", "Patrice Evra");
		empNameAndID.put("0003", "Nemanja Vidic");
		empNameAndID.put("0014", "Eric Cantona");
		empNameAndID.put("0015", "Chris Smalling");
		empNameAndID.put("0106", "Romelu Lukaku");
		empNameAndID.put("0107", "Marcus Rashford");
		for (Map.Entry NameID : empNameAndID.entrySet()) {
			System.out.println(NameID.getKey()+" - "+NameID.getValue());
		}
	}

	public void assignDepartment() {
		//Adding employee name and id to map
		Map<String, String> empDept = new HashMap<>();
		empDept.put("Ashley Young", "Main Soccer Team");
		empDept.put("Patrice Evra", "Main Soccer");
		empDept.put("Nemanja Vidic", "Main Soccer");
		empDept.put("Eric Cantona", "Marketing");
		empDept.put("Chris Smalling", "Human Resource");
		empDept.put("Romelu Lukaku", "Finance");
		empDept.put("Marcus Rashford", "U21 Soccer Team");
		for (Map.Entry Dept : empDept.entrySet()) {
			System.out.println(Dept.getKey()+" - "+Dept.getValue());
		}
	}

	public int calculateSalary() {
		return 0;
	}

    public int calculateSalary(int NumOfEmp, int AvgSalary) {
        NumOfEmp = 200;
        AvgSalary = 6000;
	    int TotSalary = NumOfEmp * AvgSalary;
	    System.out.println(TotSalary);
		return TotSalary;
	}

	public void benefitLayout() {

	}

	public void benefitLayout(int YearsWorked, double Salary) {
		double HlthInsurancePay = Salary%20;
		double RetirementFund = Salary%10;
		int AnnualLeaveDays = 15+(YearsWorked*2);
		System.out.println("Health insurance: "+HlthInsurancePay+ " Retirement contribution: "+RetirementFund+ " Annual leave days: "+AnnualLeaveDays);

	}

	private static class DateConversion {

		public DateConversion(Months months){}
		public static String convertDate(String date) {
			String [] extractMonth = date.split(",");
			String givenMonth = extractMonth[0];
			int monthDate = whichMonth(givenMonth);
			String actualDate = monthDate + "/" + extractMonth[1];
			return actualDate;
		}

		public static int whichMonth(String givenMonth) {
			Months months = Months.valueOf(givenMonth);
			int date = 0;
			switch (months) {
				case January:
					date = 1;
					break;
				case February:
					date = 2;
					break;
				case March:
					date = 3;
					break;
				case April:
					date = 4;
					break;
				case May:
					date = 5;
					break;
				case June:
					date = 6;
					break;
				case July:
					date = 1;
					break;
				case August:
					date = 1;
					break;
				case September:
					date = 1;
					break;
				case October:
					date = 1;
					break;
				case November:
					date = 1;
					break;
				case December:
					date = 1;
					break;
				default:
					date = 0;
					break;
			}
			return date;

		}
	}
}
