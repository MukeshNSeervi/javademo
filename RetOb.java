class Test
{
	int a ;
	
	Test(int i)
	{
		a = i;
	}
	
	Test incByTen(Test o)
	{
		Test t = new Test(a+10);
		return t;	
	}
}
class RetOb
{
	public static void main(String args[])
	{
		Test ob1 = new Test(2);
		
		System.out.println("Answer is : "+(ob1.incByTen(ob1)).a);
	}
}
