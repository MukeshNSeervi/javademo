class Box
{
	double height;
	double width;
	double depth;

	double volume()
	{
		return height*width*depth;
	}
	
	void setVol(double width,double height,double depth)
	{
		this.width = width;
		this.height = height;
		this.depth= depth;
	}
}
class BoxDemo5
{
	public static void main(String args[])
	{
		Box ob1 = new Box();
		Box ob2 = new Box();

		ob1.setVol(10,20,30);
		ob2.setVol(1,2,3);

		System.out.println(ob1.volume());
		System.out.println(ob2.volume());
	}
}
