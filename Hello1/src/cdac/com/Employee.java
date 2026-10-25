package cdac.com;

public class Employee {
int empno;
String name;
float sal;
public Employee(int empno, String name, float sal) {
	
	this.empno = empno;
	this.name = name;
	this.sal = sal;
}
   public void displayEmployee() {
	   System.out.print(" "+empno+name+sal);
   }
   


}
