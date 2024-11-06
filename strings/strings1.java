package strings;

import java.util.Arrays;

public class strings1 {

	public static void main(String[] args) {
		/*String s="Hello 1 @ 2 & 3 all 4";
		String s2="";
		for(int x=0;x<s.length();x++) {
			char c=s.charAt(x);
			if(c>=48 && c<=57)
			{
				s2=s2+c;
			}
		}
		int sum=0;
		int num=Integer.parseInt(s2);
		while(num>0)
		{
			int rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		System.out.println(sum);*/
		
		//Anagram
		/*String s1="tea";
		String s2="eat";
		if(s1.length()==s2.length()) {
			char[] c1=s1.toCharArray();
			char[] c2=s2.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			if(Arrays.equals(c1,c2))
			{
				System.out.println("Anagram");
			}
			else
			{
				System.out.println("Not Anagram");
			}
		}
		else
		{
			System.out.println("Not Anagram");
		}*/
		
		/*String s1="tea";
		String s2="eat";
		char[] c1=s1.toCharArray();
		char[] c2=s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		if(s1.length()==s2.length())
		{
			int count=0;
			for(int x=0;x<c1.length;x++){
				if(c1[x]==c2[x])
				{
					count++;
				}
			}
				if(count==c1.length)
				{
					System.out.println("Anagram");
				}
		}
				else
				{
					System.out.println("Not Anagram");
				}
			
			
		}
	}*/
		
		/*String s1="tea";
		String s2="eat";
		char c1='1';
		char c2='1';
		if(s1.length()==s2.length())
		{
			for(int x=0;x<s1.length();x++)
			{
				 c1=s1.charAt(x);
			}
			for(int x=0;x<s2.length();x++)
			{
				 c2=s2.charAt(x);
			}
			if(c1==c2)
			{
				System.out.println("Anagram");
			}
			else
			{
				System.out.println("Not Anagram");
			}
		}
		else
		{
			System.out.println("Not Anagram");
		}*/
		
		
    /* String s1="hello all good morning";
     char[] c=s1.toCharArray();
     char[] b=new char[c.length];
     int maxcount=0;
     char res=' ';
     for(int x=0;x<c.length;x++)
     {
    	 if(b[x]=='1')
    		 continue;
    	 int count=1;
    	 for(int y=x+1;y<c.length;y++)
    	 {
    		 if(c[x]==c[y])
    		 {
    			 b[y]='1';
    			 count++;
    		 }
    	 }
    	 if(count>maxcount)
    	 {
    		 maxcount=count;
    		 res=c[x];
    	 }
    	
     }
    
     System.out.println(res+" "+maxcount);*/
		
		
		//print max repeated vowels
	/*String s="hello all good morning";
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
		
		}
		System.out.println(maxcount +" "+res);*/
		
		
		/*String s1="hello all good morning";
	     char[] c=s1.toCharArray();
	     int maxcount=0;
	     char res=' ';
	     int count=0;
	     for(int x=0;x<c.length;x++)
	     {
	    	 
				if(c[x]=='a'||c[x]=='e'||c[x]=='i'||c[x]=='o'||c[x]=='u'||c[x]=='A'||c[x]=='E'||c[x]=='I'||c[x]=='O'||c[x]=='U')
				{
					count++;
				}
				
	    	 
	    	 if(count>maxcount)
	    	 {
	    		 maxcount=count;
	    		 res=c[x];
	    	 }
	    	
	     }
	    
	     System.out.println(res+" "+maxcount);*/
		
		//unique characters
		/*String s="hello all good morning";
		for(int x=0;x<s.length();x++)
		{
			char ch=s.charAt(x);
			if(s.indexOf(ch)==s.lastIndexOf(ch))
			{
				System.out.println(ch);
			}
		}*/
		
		/*String s1="hello";
		String s2="hello";
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		s1=s1+"all";
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		StringBuffer sb1=new StringBuffer("one");
		StringBuffer sb2=new StringBuffer("one");
		System.out.println(sb1.hashCode());
		System.out.println(sb2.hashCode());
		sb1.append("all");
		System.out.println(sb1.hashCode());
		System.out.println(sb2.hashCode());*/
		
		
		
		//unique elements
		/*String s="hello all good morning";
		for(int x=0;x<s.length();x++)
		{
			char ch=s.charAt(x);
			if(s.indexOf(ch)==s.lastIndexOf(ch))
			{
				System.out.println(ch);
			}
		}*/
		
		
		//duplicate characters in string
		/*String s="hello all good morning";
		String s1="";
		for(int x=0;x<s.length();x++)
		{
			char ch=s.charAt(x);
			if(s.indexOf(ch)!=s.lastIndexOf(ch))
			{
				if(s1.indexOf(ch)==-1)
				{
					s1=s1+ch;
				}
			}
					
		
		
		}
		
		System.out.println(s1);*/
		
		//duplicate characters
		/*String s="hello";
		char[] ch=s.toCharArray();
		char[] b=new char[ch.length]; //[0,0,0,1,0]
		int max=0;                    //0,1,2,3,4
		char res=' ';
		for(int x=0;x<ch.length;x++)//0 1 2 3 4
		{
			if(b[x]=='1')//0==1f b[1]==1 0==1f 0==2f 0==3f 0==4f
				continue;
			int count=1;
			for(int y=x+1;y<ch.length;y++)//1 2 3 4   2 3 4  3 4 4  4
			{
				if(ch[x]==ch[y])//h==e h==l h==l h==o  ch[1]==ch[2] e==l e==l e==o l==l l==o l==o o==
				{
				b[y]='1'; //b[y]=3
				count++;//2
				}
			}
			if(count>max)
			{
			max=count;
			res=ch[x];
			}
		}
		System.out.println(res+" "+max);*/
		
		/*String s="harshitha bandam";
		int count=0;
		for(int x=0;x<s.length();x++)
		{
			char c=s.charAt(x);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
			{
				count++;
			g
			else if(c!=' ')
			{
				System.out.println(c+" consonants");
			}
			
		}
		System.out.println(count+" "+"vowels");*/
		
		/*String s1="hello";
		String s2="Hello";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		String s3=s1.substring(0,3);
		System.out.println(s3);
		System.out.println(s1.subSequence(0, 3));
		System.out.println(s1.subSequence(0, 0));*/
		
		
		//split method
		/*String s="hello all good morning";
		String a[]=s.split(" ");
		/*for(String t:a)
		{
			System.out.println(t);
		}*/
		/*StringBuffer sb=new StringBuffer(s);
		sb.reverse();
		System.out.println(sb);
		if(s.contentEquals(sb))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("Not a palindrome");
		}
		String s1=new String(sb);
		if(s.equals(s1))
		{
			System.out.println("palindrome");
		}*/
		
		//hello all good morning
		//olleh lla doog gninrom
		/*String s="hello all good morning";
		String a[]=s.split(" ");
		String t=a[0];
		a[0]=a[a.length-1];
		a[a.length-1]=t;
		for(int x=0;x<a.length;x++)
		{
			String temp=a[x];
			StringBuffer sb=new StringBuffer(temp);
			sb.reverse();
			System.out.println(sb);
		}*/
		
		//String s="abc"; //a    ab
		                  //b    bc
		                  //c    abc
		                              
		
		/*String s="abc";
		String s1=s.substring(0,1);
		System.out.println(s1);
		String s2=s.substring(0,2);
		System.out.println(s2);
		String s3=s.substring(0,3);
		System.out.println(s3);
		System.out.println(s.subSequence(1,2));
		System.out.println(s.subSequence(1,3));
		System.out.println(s.subSequence(2,3));*/
		
		
		/*String s="abc";
		for(int x=0;x<s.length();x++)
		{
			for(int y=x+1;y<=s.length();y++)
			{
				System.out.println(s.substring(x,y));
			}
		}*/
		
		//Hello all good morning  a word with max length
		//o/p=morning
		/*String s="hello all good morning";
		String a[]=s.split(" ");
		String max=a[0];
		for(int x=0;x<a.length;x++)
		{
			if(max.length()<a[x].length())
			{
				max=a[x];
			}
			
		}
		System.out.println(max);*/
		
		//vital information resources under seize   virus
		/*String s="vital information resource under seize";
		String s1="";
		String a[]=s.split(" ");
		for(int x=0;x<a.length;x++)
		{
			String temp=a[x];
			for(int y=0;y<temp.length();y++)
			{
				if(y==0)
				{
					s1=s1+temp.charAt(y);
				}
			}
			
		}
		System.out.println(s1);*/
		
		//max no. of vowels --information
		/*String s="vital information resource under seize";
		String a[]=s.split(" ");
		String res=" ";
		int maxcount=0;
		for(int x=0;x<a.length;x++)
		{
			String temp=a[x];
			int count=0;
			for(int y=0;y<temp.length();y++)
			{
				char c=temp.charAt(y);
				if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
				{
					count++;
				}
				
				if(maxcount<count)
				{
					maxcount=count;
					res=temp;
				}
				
		}
			//System.out.println(count+" "+temp);
	}
		System.out.println(res);*/
		
		//hello all good morning
		//HellO AlL GooD MorninG
		/*String s="hello all good morning";
		String s1="";
		String a[]=s.split(" ");
		for(int x=0;x<a.length;x++)
		{
			String temp=a[x];
			for(int y=0;y<temp.length();y++)
			{
				char ch=temp.charAt(y);
				if(y==0 || y==temp.length()-1)
				{
					
					char c=(char)(ch-32);
					s1=s1+c;
				}
				else   
				{
					s1=s1+ch;
				}
				
			}
		}
		System.out.println(s1);*/
		
		
		//compareTo
		/*String s="Hello";
		String s1="hello";
		System.out.println(s.compareTo(s1));
		System.out.println(s.compareToIgnoreCase(s1));
		if(s.compareTo(s1)==0)
		{
			System.out.println("s and s1 are equal");
		}
		else if(s.compareTo(s1)>0)
		{
			System.out.println("s is greater");
		}
		else if(s.compareTo(s1)<0)
		{
			System.out.println("s is smaller");
		}*/
		
		//a quick brown for jumps over the lazy dog//
		//i/p=a quick brown for jumps over the  dog
		//o/p=l z y
		/*String s1="a quick brown for jumps over the dog";
		String s2="";
		System.out.println(s1.length());
		String a[]=s1.split(" ");
		for(int x=0;x<a.length;x++)
		{
			String temp=a[x];
			for(int y=0;y<temp.length();y++)
			{
				char ch=temp.charAt(y);
				if(ch>=65 && ch<=90 || ch>=97 && ch<=122)
				{
					s2=s2+ch;
				}
			}
			
		}
		System.out.println(s2.length());
		System.out.println(s2);*/
		
		//duplicates characters from a word
		/*String s="hello all good morning";
		String a[]=s.split(" ");
		for(int x=0;x<a.length;x++)
		{
			String temp=a[x];
			String s2="";
			for(int y=0;y<temp.length();y++)
			{
				char ch=temp.charAt(y);//h e l l
				if(temp.indexOf(ch)!=temp.lastIndexOf(ch))//0!=0f 1!=1f 2!=3t 2!=3t
				{
					if(s2.indexOf(ch)==-1)//s2.indexOf(l)==-1t s2.indexOf(l)==-1f
					{
						s2=s2+ch;//l 
					}
				}
				
			}
			System.out.println(temp+" "+s2);
		}*/
		
		/*String s="hello";
		String s1="";
		for(int x=0;x<s.length();x++)
		{
			char ch=s.charAt(x);
			if(x%2==0)
			{
				s1=s1+Character.toUpperCase(ch);
			}
			else
			{
				s1=s1+Character.toLowerCase(ch);
			}
		}
		System.out.println(s1);*/
		
		/*String s="Hello All";
		String s1="";
		for(int x=0;x<s.length();x++)
		{
			char ch=s.charAt(x);
			if(Character.isUpperCase(ch))
			{
				s1=s1+Character.toUpperCase(ch);	
			}
			else if(Character.isLowerCase(ch))
			{
				s1=s1+Character.toLowerCase(ch);
			}
			else if(ch==' ')
			{
				s1=s1+ch;
			}
		}
		System.out.println(s1);*/
		
		/*String s="Hello All @ 1 & 2 & 3 & 4";
		String s1="";
		int sum=0;
		for(int x=0;x<s.length();x++)
		{
			char ch=s.charAt(x);
			if(Character.isDigit(ch))
			{
				int num=Character.getNumericValue(ch);
				sum=sum+num;
			}
			
		}
		System.out.println(sum);*/
		
		
		//a1b2c3d5
		/*String s="a1b2c3d5";
		String s1="";
		for(int x=0;x<s.length();x++)
		{
			for(int y=x+1;y<s.length();y++)
			{
				char ch=s.charAt(x);
			}
		}*/
		
		//print duplicate characters of every word
		/*String s="helloo good morning";
		String s1="";
		String a[]=s.split(" ");
		for(int x=0;x<a.length;x++)
		{
		String temp=a[x];
		for(int y=0;y<temp.length();y++)
		{
			char ch=temp.charAt(y);
			if(temp.indexOf(ch)!=temp.lastIndexOf(ch))
			{
				if(s1.indexOf(ch)==-1)
				{
					s1=s1+ch;
				}
			}
		}
		}
		System.out.println(s1);*/
		
		
		
		/*StringBuffer sb=new StringBuffer("hello everyone");
		//sb.reverse();
		//System.out.println(sb);
		//sb.delete(0,4);
		//System.out.println(sb);
		//sb.insert(5,'h');
		//System.out.println(sb);
		//sb.setLength(20);
		//System.out.println(sb);
		String s="hello everyone";
		System.out.println(s.replace("hello","hii"));
		sb.deleteCharAt(8);
		System.out.println(sb);*/
		
		//selection sort
		/*int a[]=new int[] {50,30,-2,0,27,-12};
		int min=0;
		for(int x=0;x<a.length;x++)
		{
			min=x;
			for(int y=x+1;y<a.length;y++)
			{
				if(a[min]>a[y])
					min=y;
			}
			int t=a[min];
			a[min]=a[x];
			a[x]=t;
		}
		for(int t:a)
		{
			System.out.println(t);
		}*/
		
		//duplicate characters in a string
		/*String s="hello all good morning";
		String s2="";
		for(int x=0;x<s.length();x++)
		{
			char ch=s.charAt(x);
			if(s.indexOf(ch)!=s.lastIndexOf(ch))
			{
				if(s2.indexOf(ch)==-1)
				{
					s2=s2+ch;
				}
			}
		}
		System.out.println(s2);*/
		
		//abcabcdef
		//abcdef
		/*String s="abcabcdef";
		String s1="";
		char[] a=s.toCharArray();
		char[] b=new char[a.length];
		for(int x=0;x<a.length;x++)
		{
			if(b[x]=='1')
				continue;
			int count=1;
			for(int y=x+1;y<a.length;y++)
			{
				if(a[x]==a[y])
				{
					b[y]='1';
					count++;
				}
			}
			if(count>1)
			{
				s1=s1+a[x];
			}
			else
			{
				s1=s1+a[x];
			}
		}
		System.out.println(s1);*/
		
		//1,1+2,3+5,8+11,...  n1+prime
		//10th position
		/*int n1=0,start=1,fact=10,count=0;
		while(start<=10)
		{
			if(fact%start==0)
			{
				count++;
				//System.out.println(start);
				start++;
			}
		}
		if(count==2)
		{
		   while(start<=10)
		   {
			n1=n1+start;
			start++;
		   }
		}
		System.out.println(n1);*/
		
	
		/*for(int x=0;x<=10;x++)
		{
		int start=1,count=0;
		while(start<=x)
		{
			if(x%start==0)
			{
				count++;
			}
			start++;
		}
		if(count==2)
		{
			System.out.println("prime "+x);
		}
		else
		{
			System.out.println("Not prime "+x);
		}
		}*/
		//print first 10 prime numbers
		/*int count=0;
		for(int x=1;x<=50;x++)
		{
			int c=0; 
		for(int start=1;start<=x;start++)
		{
			if(x%start==0)
			{
				c++;
			}
		}
		if(count==2) {
			count++;
			System.out.println(x);	
			if(count==10)
			{
				break;
			}
		}
		}*/
		
		//flower,flight,flow  fl
		/*String s="flower flow  flight";
		char[] a=s.toCharArray();
		char[] b=new char[a.length];
		for(int x=0;x<a.length;x++)
		{
			if(b[x]=='1')
				continue;
			int count=1;
			for(int y=x+1;y<a.length;y++)
			{
				if(a[x]==a[y])
				{
					b[y]='1';
					count++;
				}
			}
			if(count>1)
			{
				System.out.println(a[x]);
			}
		}*/
		
		//left rotation
		//10 20 30 40 50
		//20 30 40 50 10
		/*int a[]=new int[] {10,20,30,40,50};
		int temp=a[0];//10
		int x;
		for(x=0;x<a.length-1;x++)//0 1 2 3 3<4 4<4f
		{
			a[x]=a[x+1];//a[0]=a[1]=20  a[1]=a[2]=30 a[2]=a[3]=40 a[3]=a[4]=50
		}
		a[x]=temp;//10
		for(int t:a)
		{
			System.out.println(t);//to print elements
		}*/
		
		/*String s[]= {"hello","all","apple","a","egg"};
		Arrays.sort(s);
		for(int x=0;x<s.length;x++)
		{
			 System.out.println(s[x]);
		}*/
		
		//anagram or not
		/*String s="mug";
		String s1="gum";
		char[] c1=s.toCharArray();
		char[] c2=s1.toCharArray();
		if(s.length()==s1.length())
		{
			Arrays.sort(c1);
			Arrays.sort(c2);
			if(Arrays.equals(c1,c2))
			{
				System.out.println("Anagram");
			}
			else
			{
				System.out.println("Not Anagram");
			}
		}
		else {
			System.out.println("Not Anagram");
		}*/
		//unique characters
		/*String s="hello all good morning";
		for(int x=0;x<s.length();x++)
		{
			char ch=s.charAt(x);
			if(s.indexOf(ch)==s.lastIndexOf(ch))
			{
				System.out.println(ch);
			}
		}*/
		//duplicate characters
		String s="hello all good morning";
		String s2="";
		for(int x=0;x<s.length();x++)
		{
			char ch=s.charAt(x);
			if(s.indexOf(ch)!=s.lastIndexOf(ch))
			{
				if(s2.charAt(ch)==-1)
				{
					s2=s2+ch;
				}
				System.out.println(s2);
			}
		}
	}
}

