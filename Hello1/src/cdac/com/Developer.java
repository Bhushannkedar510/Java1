package cdac.com;

public class Developer extends Employee{

	String pname;

	public Developer(int empno, String name, float sal, String pname) {
		super(empno, name, sal);
		this.pname = pname;
	}
	public void DeveloperDetails() {
		super.displayEmployee();
		System.out.print(pname+" ");
	}
	public void findDeveloperSal() {
		float netsal =sal+2000;
		System.out.print(netsal+" ");
	}
}
