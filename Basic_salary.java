class Basic
{
	public static void main(String[] args)
	{
		String name="Beeraiah";
		double basic_salary=25000;
		double ta=15,da=12,tra=19,pf=0,tax=0;
		ta= ta/100*basic_salary;
		System.out.println("ta="+ ta);
		da=da/100*basic_salary;
		System.out.println("da="+da);
		tra=tra/100*basic_salary;
		System.out.println("tra="+ tra);
		double total=da+tra+ta;
		double total_salary=(basic_salary+total);
		System.out.println("total_salary="+total_salary);
		if(total_salary>300000)
		{
			pf=11.0/100.0*basic_salary;
			tax=5.0/100.0*basic_salary;
		}
		else
		{
			pf=7.0/100.0*basic_salary;
			tax=2.5/100*basic_salary;
		}
		System.out.println("pf="+pf+"    tax="+tax);
		System.out.println(basic_salary-pf-tax);
	}
}