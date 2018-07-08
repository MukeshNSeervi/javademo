class Box
{
	double width;
	double height;
	double depth;

	Box(double w,double h,double d)
	{
		width = w;
		height = h;
		depth = d;
	}
	
	double vol()
	{
		return width*height*depth;
	}
}
class BoxDemo6
{
	public static void main(String args[]){	
	Box ob1 = new Box(10,20,30);
	Box ob2 = new Box(1,2,3);
	
	System.out.println(ob1.vol());
	System.out.println(ob2.vol());
	}
}
