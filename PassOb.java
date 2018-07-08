class Test
{
	double a;
	double b;
	
	Test()
	{

	}

	Test(double i,double j)
	{
		a = i;
		b = j;
	}

	void equal(Test o)
	{
		System.out.println(o.a+" "+a+" "+o.b+" "+b);
	}
	void equal(int w,int e)
	{
		System.out.println(a+" "+b);
		System.out.println(w+" "+e);
	}
}
class PassOb
{
	public static void main(String args[])
	{
		Test ob1 = new Test(100,200);
		Test ob2 = new Test(-1,-2);
		Test ob3 = new Test();
	
		ob3.equal(10,20);
		ob1.equal(ob2);
		ob2.equal(ob1);
		ob1.equal(10,12);
	}
}
