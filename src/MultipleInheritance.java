
interface PT1
{
	default void show()
	{
		System.out.println("print dafault pt1");
	}
}

interface PT2
{
	default void show()
	{
		System.out.println("Default PT2");
	}
}


public class MultipleInheritance implements PT1,PT2
{
    @Override
	public void show()
	{
		PT1.super.show();
		
		PT2.super.show();
	}
    
    public static void main(String[] args)
    {
    	MultipleInheritance mn = new MultipleInheritance();
    	mn.show();
    	 			
    }
}
