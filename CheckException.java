import java.io.*;
public class CheckException
{
public void ValidateAge(int age) 
{
	if(age<18)
	{
		try{
		throw new IOException("not eligible");
		}
		catch( Exception ae)
		{
		System.out.println(ae);	
		}
		
		
	}
	else
	{
		System.out.println("eligible to vote");
	}
}
	public static void main(String args[])
	{
		CheckException c = new CheckException();
		c.ValidateAge(17);
		
		System.out.println("rest of the code");
	}
}