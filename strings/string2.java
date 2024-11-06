package strings;

import java.util.Scanner;

public class string2 {

	public static void main(String[] args) {
		//reverse of a string
		/*Scanner s=new Scanner(System.in);
		System.out.println("enter the name");
		String name=s.nextLine();
		String rev="";
		for(int x=name.length()-1;x>=0;x--)
		{
			rev=rev+name.charAt(x);
		}
     System.out.println(rev);*/
		
		//palindrome string
		/*Scanner s=new Scanner(System.in);
		System.out.println("enter the name");
		String name=s.nextLine();
		String rev="";
		for(int x=name.length()-1;x>=0;x--)
		{
			rev=rev+name.charAt(x);
		}
		if(rev.equals(name))
		{
			System.out.println("palindrome string");
		}
		else
		{
			System.out.println("not a palindrome string");
		}*/
		
		//substring
		String s="hello";
		for(int x=0;x<s.length();x++)
		{
			for(int y=x+1;y<=s.length()-1;y++)
			{
				System.out.println(s.substring(x,y));
			}
		}
	}

}
