package arrays;

public class arrays2 {

	public static void main(String[] args) {
		/*int a[]=new int[] {10,20,30,10,30,20,45,35,46};
		int search=45, count=0;
		for(int x=0;x<a.length;x++)
		{
			if(a[x]==search)
			{
				count++;
				break;
			}
			
		}
		System.out.println("element is found");
		if(count==0)
			System.out.println("element is not found");
*/
		
		// 10 20 30 40 50 right rotation
		// 50 10 20 30 40
		
	 /* int a[]=new int[] {10,20,30,40,50};
	  int temp=a[a.length-1],x;
	  for(x=a.length-1;x>0;x--)
	  {
		  a[x]=a[x-1];
	  }
	  a[x]=temp;
	  for(int t:a)
	  {
		  System.out.println(t);
	  }*/
		
		//10 20 30 40 50 left rotation
		//20 30 40 50 10
		
		/*int a[]=new int[] {10,20,30,40,50};
		int temp=a[0],x;
		for(x=0;x<a.length-1;x++)
		{
			a[x]=a[x+1];
		}
		a[x]=temp;
		for(int t:a)
		  {
			  System.out.println(t);
		  }*/
		
        //multiple rotations
		/*int a[]=new int[] {10,20,30,40,50};
		int rotations=5;
		for(int r=1;r<=rotations;r++)
		{
		int temp=a[0],x;
		for(x=0;x<a.length-1;x++)
		{
			a[x]=a[x+1];
		}
		a[x]=temp;
		System.out.println("rotations " +r);
		for(int t:a)
		  {
			  System.out.println(t);
		  }
		}*/
		
		//remove an element from array
		/*int a[]=new int[] {10,20,30,12,34,45,12,67,12};
		int k=5,x;
		for(x=k;x<a.length-1;x++)
		{
			a[x]=a[x+1];
		}
		a[x]=0;
		for(int t:a)
		  {
			  System.out.println(t);
		  }*/
		
		//inserting an element to array
		/*int a[]=new int[] {10,20,30,40,50,60,70,80,0};
		int k=5,insert=45,x;
		for(x=a.length-1;x>k;x--)
		{
			a[x]=a[x-1];
		}
		a[x]=insert;
		for(int t:a)
		  {
			  System.out.println(t);
		  }*/
		
		//12 23 45 78
		
		/*int a[]=new int[] {12,23,45,78,45,23,89,45,0,0,8};
		for(int x=0;x<a.length;x++)
		{
			System.out.println(a[x]);
			if(a[x]>a[x+1])  //12>23 23>45 45>78
			break;	
			
		}*/
		
		//missing element in the array  //7
		int a[]=new int[] {1,5,3,8,4,2,9,6};
		int n=0,sum=0;
		int start=1;
		while(start<=9)
		{
			n=(start*(start+1))/2;
			start++;
		}
		for(int x=0;x<a.length;x++)
		{
			sum=sum+a[x];
		}
		System.out.println(n + " natural");
		System.out.println(sum + " sum");
		System.out.println(n-sum);
		
		/*int a[]=new int[] {10,20,30,40,50,60,70,80,90};
		int rotations=4 ;
		for(int r=1;r<=rotations;r++)
		{
		int x,temp=a[a.length-1];
		for(x=a.length-1;x>0;x--)
		{
			a[x]=a[x-1];//90=80 80=70 70=60 60=50 50=40 40=30 30=20 20=10
			
		}
		a[x]=temp;
		
	}
		for(int t:a)
		  {
			  System.out.println(t);//80 70 60 50 40 30 20 10  90
		  }*/
		
		//print common elements from  2 arrays
		/*int a[]=new int[] {10,20,30,40,50};
		int b[]=new int[] {1,2,40,3,5};
		for(int x=0;x<a.length;x++)
		{
			if(a[x]==b[x])
			{
				System.out.println(a[x]);
			}
		}*/
		
		/*int a[]=new int[] {11,12,13,45,67,23,98,76,54,23};
		int b[]=new int[a.length];
		int c[]=new int[a.length];
		System.out.println("even index " );
		for(int x=0;x<b.length;x++)
		{
			if(x%2==0)
			{
				b[x]=a[x];
				System.out.println(b[x]);
			}
		}
		System.out.println("odd index " );
		for(int x=0;x<c.length;x++)
		{
			if(x%2!=0)
			{
				c[x]=a[x];
				System.out.println(c[x]);
			}
		}*/
		/*int a[]=new int[] {11,12,13,45,67,23,98,76,54};
		int b[]=new int[a.length];
		int c[]=new int[a.length];
		System.out.println("even index " );
		for(int x=0;x<b.length;x++)
		{
			if(x%2==0)
			{
				b[x]=a[x];
				System.out.println(b[x]);
			}
		}
		System.out.println("odd index " );
		for(int x=0;x<c.length;x++)
		{
			if(x%2!=0)
			{
				c[x]=a[x];
				System.out.println(c[x]);
			}
		}*/
		
		/*int a[]=new int[] {11,12,13,45,67,23,98,76,54,23};
		int b[]=new int[a.length];
		int c[]=new int[a.length];
		System.out.println("even elements");
		for(int x=0;x<a.length;x++)
		{
			if(a[x]%2==0)
			{
				b[x]=a[x];
				System.out.println(b[x]);
			}
		}
		System.out.println("odd elements");
		for(int x=0;x<a.length;x++)
		{
			if(a[x]%2!=0)
			{
				c[x]=a[x];
				System.out.println(c[x]);
			}
		}*/
		
		/*int a[]=new int[] {11,12,13,45,67,23,98,76,54,23,34};
		for(int x=0;x<a.length-1;x+=2)
		{
			int temp=a[x]; //temp=a[0]
			a[x]=a[x+1];   //a[0]=a[1]
			a[x+1]=temp;   //a[1]=temp
		}
		for(int t:a)
		{
			System.out.println(t);*/
		}
		}

	
	


