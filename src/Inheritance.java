//superclass
 public class Inheritance {

	public static void main(String[] args)
	{
		Cricket a1 = new Cricket();
		a1.bat();
		
	}
	
	
}
 class Ingradients
{
	 public void bat()
		{
			System.out.println("using bat");
			
		}
		public void ball()
		{
			System.out.println("using ball to play");
			
		}
		
		public void stamp()
		{
			System.out.println("using stamp to play");
			
		}
}

class Cricket extends Ingradients
{
	public void cap()
	{
		System.out.println("using cap");
	}
	
}