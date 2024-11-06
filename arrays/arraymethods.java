/*package arrays;

public class arraymethods {

	public static void main(String[] args) {
		arraymethods obj=new arraymethods();
		int a[]=new int[] {5,4,3,2,1};
		for(int x=0;x<a.length;x++) {
			int res=obj.factorial(a[x],a[x],1);
			System.out.println(res);
		}
	}
	int factorial(int x,int start, int pro)
	{
		while(start>0)
		{
			pro=pro*start;
			start--;
		}
		return pro;
	}
}*/

/*package arrays;

public class arraymethods {

	public static void main(String[] args) {
		arraymethods obj=new arraymethods();
		int a[]=new int[] {231,989,656};
		for(int x=0;x<a.length;x++)
		{
			int res=obj.palindrome(a[x]);
			//System.out.println(res);
			if(res!=0)
			{
				System.out.println("palindrome "+a[x]);
			}

			
		}
		}
	
	int palindrome(int x)
	{
		int rem=0,rev=0,temp=x;
		while(x>0)
		{
			rem=x%10;
			rev=rev*10+rem;
			x=x/10;
		}
		if(rev==temp)
		{
			return rev;
		}
		else 
		{
			return 0;
		}
	}
	}*/
	


/*package arrays;

public class arraymethods {

	public static void main(String[] args) {
		arraymethods obj=new arraymethods();
		int a[]=new int[] {153,1634,370,371};
		for(int x=0;x<a.length;x++)
		{
			int res=obj.armstrong(a[x]);
			if(res==a[x])
			{
				System.out.println("armstrong "+a[x]);
			}
			else
			{
				System.out.println("not armstrong "+a[x]);
			}
		}
		}
	
	int armstrong(int x)
	{
		int rem=0,count=0,power=0,sum=0,temp=x;
		while(x>0)
		{
			count++;
			x=x/10;
		}
		while(temp>0)
		{
			rem=temp%10;
			power=(int)Math.pow(rem,count);
			sum=sum+power;
			temp=temp/10;
		}
		return sum;
	}
}*/



/*package arrays;

public class arraymethods {

	public static void main(String[] args) {
		arraymethods obj=new arraymethods();
		int a[]=new int[] {2,4,6};
		for(int x=0;x<a.length;x++)
		{
			obj.factors(a[x]);
		
}
}
	
	
	void factors(int x)
	{
		for(int start=1;start<=x;start++)
		{
			if(x%start==0)
			{
				System.out.println(start);
			}
			
			
		}
		System.out.println();
	}
}*/



package arrays;

public class arraymethods {

	public static void main(String[] args) {
		arraymethods obj=new arraymethods();
		int a[]=new int[] {2,4,6};
		for (int x = 0; x < a.length; x++) {
            int[] res = obj.factors(a[x]);
            System.out.print("Factors of " + a[x] + ": ");
            for (int factor : res) {
                System.out.print(factor + " ");
            }
            System.out.println();
        }
    }
	
	
	int[] factors(int x)
	{
		int fact=x;
		for(int start=1;start<=fact;start++)
		{
			if(x%start==0)
			{
				return start;
			}
			
			
		}
		
		
	}
}

		