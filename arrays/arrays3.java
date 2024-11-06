package arrays;

public class arrays3 {

	public static void main(String[] args) {
		/*int a[]=new int[] {11,12,13,45,67,23,98,76,54,23,34};
		for(int x=0;x<a.length-1;x+=2)
		{
			int temp=a[x]; //temp=a[0]
			a[x]=a[x+1];   //a[0]=a[1]
			a[x+1]=temp;   //a[1]=temp
		}
		for(int t:a)
		{
			System.out.println(t);
	
	}*/
		
		/*int a[]=new int[] {3,2,7,5};
		for(int x=0;x<a.length;x++)
		{
			int sum=0;
			for(int y=0;y<a.length;y++)
			{
				sum=sum+a[y];
			}
			sum=sum-a[x];
			if(sum>a[x])
				a[x]=sum;
		}
		for(int t:a)
		{
			System.out.println(t);
	
	}*/
		/*int a[]=new int[] {3,2,7,5};
		for(int x=0;x<a.length;x++)
		{
			int sum=0;
			for(int y=0;y<a.length;y++)
			{
				if(y==x)
					continue;
				else
					sum=sum+a[y];
			}
			if(sum>a[x])
				a[x]=sum;*/
		
		
		
		/*int a[]=new int[] {1,80,87,34,20};
		int max=Integer.MIN_VALUE;
		int smax=Integer.MIN_VALUE;
		for(int x=0;x<a.length;x++)
		{
			if(max<a[x])
			{
				smax=max;
				max=a[x];
			}
			if(smax<a[x] && smax!=a[x])
			{
				smax=a[x];
			}
			
		}
		System.out.println(smax);*/
		
		/*int a[]=new int[] {1,2,3,5,6,7,8,9};
		int k;
		for(k=1;k<=9;k++)
		{
			int c=0;
			for(int x=0;x<=a.length-1;x++)
			{
				if(a[x]==k)
				{
					c++;
					break;
				}
			}
			
			
		
		if(c==0)
		{
			System.out.printcxln(k);
		}
		}*/
		
		//frequency of all elements
		/*int a[]=new int[] {10,20,30,30,50,10,20,20};
		int b[]=new int[a.length];
		System.out.println("frequency of all elements ");
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
			
			System.out.println(a[x]);*/
		
		//duplicate elements in an array
		/*int a[]=new int[] {10,20,30,30,50,10,20,20};
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
				System.out.println(a[x]+"  "+count);
		}*/
		
		//unique elements in an array
		/*int a[]=new int[] {10,20,30,30,50,10,20,20};
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
			if(count==1)
			System.out.println(a[x]+"  "+count);
		}*/
		
		//bubble sort
		/*int a[]=new int[] {10,3,5,13,0,-5,-1,25};
		for(int x=0;x<a.length-1;x++)
		{
			
			for(int y=0;y<a.length-2-x;y++)
			{
				if(a[y]>a[y+1])
				{
					int temp=a[y];
					a[y]=a[y+1];
					a[y+1]=temp;
				}
			}
		}
		for(int t:a)
		{
			System.out.println(t);
		}*/
		
		//bubble sort in descending order
		/*int a[]=new int[] {10,3,5,13,0,-5,-1,25};
		for(int x=0;x<a.length-1;x++)
		{
			for(int y=a.length-2-x;y>=0;y--)
			{
				if(a[y]<a[y+1])
				{
					int temp=a[y];
					a[y]=a[y+1];
					a[y+1]=temp;
				}
			}
		}
		for(int t:a)
		{
			System.out.println(t);
		}
		*/
		//print first repeated duplicate element
		/*int a[]=new int[] {10,20,30,10,40,20,30,10,40,50,10,20};
		for(int x=0;x<a.length;x++)
		{
			for(int y=x+1;y<a.length;y++)
			{
				if(a[x]==a[y])
				{
					System.out.println("first repeated duplicate element "+a[x]);
					return;
				}
				
			}
		}*/
		
		//print first maximum repeated duplicate element
		/*int a[]=new int[] {10,20,30,10,40,20,30,10,40,50,10,20,30,20};
		int maxCount=0,firstMaxRepeated=0;
		for(int x=0;x<a.length;x++) 
		{
			int count=0;
			for(int y=0;y<a.length;y++)
			{
				if(a[x]==a[y])
				{
					count++;
				}
			}
			if(count>maxCount)
			{
				maxCount=count;
				firstMaxRepeated=a[x];
			}
		}
		System.out.println(firstMaxRepeated);*/
		
		
}
}
		


