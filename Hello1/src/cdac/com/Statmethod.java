package cdac.com;


public class Statmethod {
	int patid;
	String patname;
	int days;
	int charge;
	static String hosname;
	
	public void Statmethod(int id,String na,int da,int cha){
		patid=id;
		patname=na;
		days=da;
		charge=cha;
		
		
	}
	public static void hosname()
	{
		String hospname="Nirmal";
	}
	public void displaypat() {
		System.out.println(patid+patname+days+charge);
	}
	
	
	public static void main(String[] args) {
		 Statmethod s=new Statmethod();
		s.Statmethod(5,"nmu",10,10);
		hosname();
		s.displaypat();
	}
	

}