package arrays;

import java.util.*;

public class arrays {

	public static void main(String[] args) {
		/*int arr[]=new int[5];
		System.out.println("array length is "+arr.length);
		int a[]=new int[] {1,2,3,4,5};
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		for(int x=0;x<=arr.length-1;x++)
		{
			System.out.println(arr[x]);
			
		}
		for(int x=0;x<=arr.length-1;x++)
		{
			System.out.println(a[x]);
		}*/
		
		/*Scanner s=new Scanner(System.in);
		int arr[]=new int[5];
		for(int x=0;x<=arr.length-1;x++)
		{
			arr[x]=s.nextInt();
		}
//		for(int x=0;x<=arr.length-1;x++)
//		{
//			System.out.println(arr[x]);
//		}
		for(int x=arr.length-1;x>=0;x--)
		{
			System.out.println(arr[x]);
		}*/
		
		
		 /*Random r=new Random();
		 int arr[]=new int[5];
		 for(int x=0;x<=arr.length-1;x++)
		 {
			 arr[x]=r.nextInt(1,50);
		 }
		 for(int x=0;x<=arr.length-1;x++)
		 {
			 System.out.println(arr[x]);
		 }*/
		
		
		/*int arr[]=new int[] {1,2,3,4,5};
		int sum=0;
		for(int x=0;x<=arr.length-1;x++)
		{
			sum=sum+arr[x];
		}
		System.out.println("sum of array elements is "+sum);*/
		
		/*int arr[]=new int[] {1,2,3,4,5};
		int sum=0,pro=1;
		for(int x=0;x<=arr.length-1;x++)
		{
			if(arr[x]%2==0)
			{
				sum=sum+arr[x];
			}
			else
			{
				pro=pro*arr[x];
			}
		}
		System.out.println("sum of array elements "+sum);
		System.out.println("Product of array elements "+pro);*/
		
		
		/*int a[]=new int[] {7,9,8,5,3};
		Arrays.sort(a);
		int max=a[0],min=a[0];
     for(int x=0;x<=a.length-1;x++) {
			//System.out.println(a[x]);
    	 if(a[x]>max)
    	 {
    		 max=a[x];
    	 }
    	 else if(a[x]<min)
    	 {
    		 min=a[x];
    	 }
		}
     System.out.println("max element "+max);
     System.out.println("min element "+min);*/
		
		
		/*int a[]=new int[] {25,16,15,5,10};
		//Arrays.sort(a);
		for(int x=0;x<a.length;)
		{
			System.out.println(a[x]+" ");
			x=x+2;
		}*/
		
		
		/*int a[]=new int[] {8,7,9,3,4};
		Arrays.sort(a);
		for(int x=0;x<a.length;x++)
		{
			                                                                                                                              
		}
		System.out.println(a[a.length-2]);*/
		
		/*int a[]=new int[] {1,2,3,7,9,34,8,5,7};
		int sum=0;
		for(int x=0;x<a.length;x++)
		{
			if(x%2==0)
			{
				sum=sum+a[x];
			}
		}
		System.out.println(sum);*/
		
		/*int a[]=new int[] {10,20,30,40,50};
		int b[]=new int[a.length];
		int y=0;
		for(int x=a.length-1;x>=0;x--)
		{
			//System.out.println(a[x]);
			b[y]=a[x];
			y++;
		}
		for(int x=0;x<b.length;x++)
		{
			System.out.println(b[x]);
		}*/
		
		/*int a[]=new int[] {10,20,30,40,50,60,70,80};
		int b[]=new int[a.length/2];
		int c[]=new int[a.length/2];
		int d[]=new int[b.length+c.length];
		
		for(int x=0;x<=b.length-1;x++)
		{
			b[x]=a[x];
			System.out.println(b[x]);
		}
		int y=a.length-1;
		for(int x=0;x<=c.length-1;x++)
		{
			c[x]=a[y];
			y--;
			System.out.println(c[x]);
		}
		int z=b.length-1;
		for(int x=0;x<=b.length-1;x++)
		{
			d[x]=b[z];
			z--;
			System.out.println(d[x]);
		}
		int k=0;
		for(int x=d.length/2;x<=d.length-1;x++)
		{
			d[x]=c[k];
			k++;
			System.out.println(d[x]);
		}*/
		
		/*int a[]=new int[] {10,20,30,40};
		int b[]=new int[] {10,20,30,40};
		for(int x=0;x<a.length;x++)
		{
			if(a[x]!=b[x])
			{
				System.out.println("not equal");
			}
			else
			{
				System.out.println("equal");
			}
		}*/
		
		
		/*int a[]=new int[] {10,20,30,40,50};
		int max=a[0],min=a[0],smax=a[0];
		for(int x=0;x<a.length;x++)
		{
			smax=max;
			if(max<a[x])
			max=a[x];
			if(min>a[x])
				min=a[x];
			if(smax<a[x] && a[x]!=max)
				smax=a[x];
			
		}
		System.out.println(max +" max");
		System.out.println(min +" min");
		System.out.println(smax +" smax ");*/
		
		
		/*int a[]=new int[] {101,129,121,67,989};
		for(int x=0;x<=a.length-1;x++)
		{
			int rem=0,rev=0,temp=a[x];
			while(a[x]>0)
			{
				rem=a[x]%10;
				rev=rev*10+rem;
				a[x]=a[x]/10;
			}
			if(rev==temp)
			System.out.println(temp+" palindromes");
		}*/
		
		/*int a[]=new int[] {10,20,30,40,50};
		int b[]=new int[a.length];
		for(int x=0;x<a.length;x++)
		{
			if(x==0)
			{
				b[x]=a[x]+a[x+1];
			}
			else if(x==a.length-1)
			{
				b[x]=a[x]+a[x-1];
			}
			else
			{
				b[x]=a[x+1]+a[x-1];
			}
				
				System.out.println(b[x]);
		}*/
		
		/*int a[]=new int[] {11,12,13,45,67,23,98,76,54,23};
		int b[]=new int[a.length];
		int c[]=new int[a.length];
		for(int x=0;x<b.length;x++)
		{
			if(x%2==0)
			{
				b[x]=a[x];
				System.out.println("b[x] " +b[x]);
			}
		}
		for(int x=0;x<c.length;x++)
		{
			if(x%2!=0)
			{
				c[x]=a[x];
				System.out.println("c[x] " +c[x] );
			}
		}*/
		
		/*int a[]=new int[] {11,12,13,45,67,23,98,76,54};
		int b[]=new int[a.length];
		int c[]=new int[a.length];
		for(int x=0;x<b.length;x++)
		{
			if(x%2==0)
			{
				b[x]=a[x];
				System.out.println("b[x] " +b[x]);
			}
		}
		for(int x=0;x<c.length;x++)
		{
			if(x%2!=0)
			{
				c[x]=a[x];
				System.out.println("c[x] " +c[x] );
			}
		}*/
		
		/*int a[]=new int[] {11,12,13,45,67,23,98,76,54,23};
		int b[]=new int[a.length];
		int c[]=new int[a.length];
		System.out.println("even elements");
		for(int x=0;x<b.length;x++)
			{
			if(a[x]%2==0)
			
				b[x]=a[x];
			System.out.println(b[x]);
			
			}
		System.out.println("odd elements");
		for(int x=0;x<c.length;x++)
		{
			if(a[x]%2!=0)
				c[x]=a[x];
			System.out.println(c[x]);
		}*/
		
		
		/*int a[]=new int[] {50,40,30,20,10};
		for(int x=0;x<a.length;x++)
		{
			for(int y=x+1;y<a.length;y++)
			{
				if(a[x]>a[y])
				{
					int temp=a[x];
					a[x]=a[y];
					a[y]=temp;
				}
			}
		}
			for(int x=0;x<a.length;x++)
			{
				System.out.println(a[x]);
			}*/
		
		
		/*int a[]=new int[] {10,-2,5,-9,7,24,-9};
		int b[]=new int[a.length];
		for(int x=0;x<b.length;x++)
		{
			if(a[x]<0)
				b[x]=a[x];
			System.out.println(b[x]);
		}
		for(int x=0;x<b.length;x++)
		{
			if(a[x]<0)
				b[x]=a[x];
			System.out.println(b[x]);
		}*/
		
		int a[]=new int[] {1,2,34,5,6};
		int b[]=new int[] {1,2,92,3,2};
		for(int x=0;x<a.length;x++)
		{
			if(a[x]==b[x])
				System.out.println(a[x]);
		}
		}
		
	

}
