import java.util.*;
import java.io.*;
import java.io.FileReader;
import java.io.FileNotFoundException;


class C
{
	public static void main(String args[]) throws SQLException
	{
		/*try
		{
			FileReader file=new FileReader("C:\\Users\\HP\\OneDrive\\Pictures\\Desktop\\B.txt");
			System.out.println("no exception");
	
		}
		catch(FileNotFoundException ar)

		{
			System.out.println("no error ");
		}*/

		
				
			Scanner sc=new Scanner(System.in);
			System.out.println("enter a number between 1-4");
			int num=sc.nextInt();	
			
			switch(num)
			{
				case 1:
				try{
					System.out.println(10/0);
				}
				catch(ArithmeticException a)
				{
					System.out.println("JVM throws the unchecked exception");
				}
				break;
				case 2:
				try
				{
					throw new ArithmeticException();
				}
				catch(ArithmeticException ae)
				{
					System.out.println("Explicit/ user throws the unchecked exception");						
				}
				break;
				case 3:
				try
				{
					throw new SQLException();
				}
				catch(SQLException se)
				{
					System.out.println("user throws the Checked exception");

				}
				break;
				case 4:
				try
				{
					FileReader file=new FileReader("C:\\Users\\HP\\OneDrive\\Pictures\\Desktop\\B.txt");
					System.out.println("no exception");

				}
				catch(FileNotFoundException fe)
				{
					System.out.println("JVM throws the Checked exception");
				}
				break;
				default:
				System.out.println("invalid user input");

														
			}
		
	}
}