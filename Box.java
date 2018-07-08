class Box
{
	double width;
	double height;
	double depth;

	void volume()
	{
		System.out.print("Volume is: ");
		System.out.println(width*height*depth);
	}
}
class BoxDemo3
{
	public static void main(String args[])
	{
		Box mybox1 = new Box();
		Box mybox2 = new Box();

		mybox1.width = 10;
		mybox1.height = 20;
		mybox1.depth = 30;	

		mybox2.width = 100;
		mybox2.height = 200;
		mybox2.depth = 300;
		
		System.out.println(mybox1);
		mybox2.volume();

		System.out.println(mybox2);
		mybox1.volume();
	}
}
