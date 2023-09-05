class Andoperator
{
	public static void main(String[]  args)
	{
		int a=15,b=8;
		if((a>b) && (++b==9))//both conditions true then only execute if statement otherwise goto else part
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
}