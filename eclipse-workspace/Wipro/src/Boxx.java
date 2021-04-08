
 class Boxdemo
{

		int width,height,depth;
		Boxdemo (int w,int h,int d)
		{
			width=w;
			height=h;
			depth=d;
		}
		
		public void display()
		{
			int volume=width*height*depth;
			System.out.println("volume of a box is " + volume);
		}
}
	
		public class Boxx
		{
		
		public static void main(String[] args) 
		{
			Boxdemo b1=new Boxdemo(10,20,30);
			b1.display();
			
		}

}
