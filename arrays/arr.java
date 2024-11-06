package arrays;

import java.util.Scanner;

public class arr {

	public static void main(String[] args) {
		/*Scanner s=new Scanner(System.in);
		int a[]=new int[10];
		System.out.println("enter 10 array elements");
		for(int x=0;x<a.length;x++)
		{
			 a[x]=s.nextInt();
		}
		System.out.println("enter the search element");
		int search=s.nextInt();
		int count=0;
		for(int x=0;x<a.length;x++)
		{
			if(a[x]==search)
			{
				System.out.println(a[x]+" element found");
				count++;
				break;
			}
		}
		if(count==0)
		System.out.println("element not found");*/
		
		
		//positive negative even odd
		/*Scanner s=new Scanner(System.in);
		int a[]=new int[10];
		System.out.println("enter 10 array elements");
		for(int x=0;x<a.length;x++)
		{
			 a[x]=s.nextInt();
		}
		for(int x=0;x<a.length;x++)
		{
			if(a[x]>0)
			{
				System.out.println("positive elements "+a[x]);
			}
		}
		for(int x=0;x<a.length;x++)
		{
			if(a[x]<0)
			{
				System.out.println("negative elements "+a[x]);
			}
		}
		for(int x=0;x<a.length;x++)
		{
			if(a[x]%2==0)
			{
				System.out.println("even elements "+a[x]);
			}
		}
		for(int x=0;x<a.length;x++)
		{
			if(a[x]%2!=0)
			{
				System.out.println("odd elements "+a[x]);
			}
		}*/
		//sum of array elements
		/*Scanner s=new Scanner(System.in);
		int a[]=new int[5];
		System.out.println("enter 10 array elements");
		for(int x=0;x<a.length;x++)
		{
			 a[x]=s.nextInt();
		}
		int sum=0;
		for(int x=0;x<a.length;x++)
		{
			sum=sum+a[x];
		}
		System.out.println(sum);*/
		
		//min and max element in an array
		/*Scanner s=new Scanner(System.in);
		int a[]=new int[5];
		System.out.println("enter 5 array elements");
		for(int x=0;x<a.length;x++)
		{
			 a[x]=s.nextInt();
		}
		int min=a[0],max=a[0];
		for(int x=0;x<a.length;x++)
		{
			if(max<a[x])
			{
				max=a[x];
			}
			else if(min>a[x])
			{
				min=a[x];
			}
		}
		System.out.println("max element "+max);
		System.out.println("min element "+min);*/
		
		//unique elements in an array
		/*Scanner s=new Scanner(System.in);
		int a[]=new int[5];
		System.out.println("enter 5 array elements");
		for(int x=0;x<a.length;x++)
		{
			 a[x]=s.nextInt();
		}
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
			{
				System.out.println(a[x]);
			}
		}*/
		
		//right rotate the array for 5 times using 2 loops
		int a[]=new int[] {10,20,30,40,50,60};
		int temp=a[a.length-1];
		for(int x=a.length-1;x>=0;x--)
		{
			
		}
		
	}
}
