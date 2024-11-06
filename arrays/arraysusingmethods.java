/*package arrays;

public class arraysusingmethods {

	public static void main(String[] args) {
	arraysusingmethods aum=new arraysusingmethods();
	int a[]=new int[] {10,20,30,40,50};  
    int res[]=aum.rev(a);
    for(int t:a)
    {
    	System.out.println(t);
    }
	}
	
	int[] rev(int a[])
	{
		int b[]=new int[a.length]; 
		int y=0;
		for(int x=a.length-1;x>=0;x--)
		{
			b[y]=a[x];
			y++;
		}
		return b;
	}
}*/


package arrays;

import java.util.Arrays;

public class arraysusingmethods {

	public static void main(String[] args) {
	/*int a[]=new int[] {60,40,50,20,10,30};
	Arrays.sort(a);
	int f=0,l=a.length-1,m,search=100;
	while(f<=l)
	{
		m=(f+l)/2;
		if(search==a[m])
		{
			System.out.println("element found");
		break;
		}
		else if(search>a[m])
			f=m+1;
		else if(search<a[m])
			l=m-1;
			
	}
	if(f>l)
	{
		System.out.println("element not found");
	}*/
		//first repeated duplicate element in array
		int a[]=new int[] {10,20,30,20,20,10,40,60,50,64};
		int b[]=new int[a.length];
		for(int x=0;x<a.length;x++)
		{
			if(b[x]==1)
			continue;
			int count=1;
			for(int y=x+1;y<a.length;y++)
			{
				if(a[x]==a[y])
				{
					b[y]=1;
					count++;
					
				}
			}
			if(count>1)
			System.out.println("first repeated duplicate element in array " +a[x]);
			break;
		}
		
		
	}
}
