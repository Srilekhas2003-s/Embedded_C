package strings;

public class strings3 {

	public static void main(String[] args) {
		//duplicate characters
				/*String s="hello all good morning";
				String s2="";
				for(int x=0;x<s.length();x++)
				{
					char ch=s.charAt(x);
					if(s.indexOf(ch)!=s.lastIndexOf(ch))
					{
						if(s2.indexOf(ch)==-1)
							s2=s2+ch;
					}
				}
				System.out.println(s2);*/
		//length of a string  print string in reverse order
		/*String s="hello all good morning",s2="";
		System.out.println(s.length());
		for(int x=s.length()-1;x>=0;x--)
		{
			s2=s2+s.charAt(x);
		}
		System.out.println(s2);*/
		
		//vowels and consonants
		/*String s="hello all good morning";
		for(int x=0;x<s.length();x++)
		{
			char ch=s.charAt(x);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			{
				System.out.println("vowels "+ch);
			}
			else
			{
				System.out.println("consonants "+ch);
			}*/
		
		//reverse alternate words in a string
		/*String s="hello all good morning";
		String s2="";
		String a[]=s.split(" ");
		for(int x=0;x<a.length;x++)
		{
			if(x%2==0)
			{
			    String temp=a[x];
				String rev="";
				for(int y=temp.length()-1;y>=0;y--)
				{
					rev=rev+a[x].charAt(y);
				}
				s2=s2+rev;
			}
			else
			{
				s2=s2+a[x];
			}
		}
		System.out.println(s2);*/
		
		//print duplicate characters of every word
		/*String s="hello all good morning";
		String a[]=s.split(" ");
		for(int x=0;x<a.length;x++)
		{
			String temp=a[x];
			String s2="";
			for(int y=x+1;y<temp.length()-1;y++)
			{
				char ch=temp.charAt(y);
				if(temp.indexOf(ch)!=temp.lastIndexOf(ch))
				{
					if(s2.indexOf(ch)==-1)
					{
						s2=s2+ch;
					}
				}
			}
			System.out.println(s2);
		}*/
		
		//vital information under seize
		/*String s="vital information resource under seize";
		String a[]=s.split(" ");
		for(int x=0;x<a.length;x++)
		{
			String temp=a[x];
			String s2="";
			for(int y=0;y<temp.length();y++)
			{
				if(y==0)
				{
					s2=s2+temp.charAt(y);
				}
			}
			System.out.print(s2);
		}*/
		
		//a word with maximum length
		/*String s="hello all good morning";
		String s2="";
		String a[]=s.split(" ");
		String max=a[0];
		for(int x=0;x<a.length;x++)
		{
			if(max.length()<a[x].length())
			{
				max=a[x];
				s2=s2+max;
			}
		}
		System.out.println(s2);*/
		
		//print max repeated vowels
		String s="hello all good morning";
		int count=0,maxcount=0;
		char res=' ';
		for(int x=0;x<s.length();x++)
		{
			char ch=s.charAt(x);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			{
				count++;
			}
       if(count>maxcount)
       {
    	   maxcount=count;
    	   res=ch;
       }
       System.out.println(res);
		}
  
}

}
