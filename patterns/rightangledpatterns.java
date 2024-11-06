package patterns;

public class rightangledpatterns {

	public static void main(String[] args) {
		/*int rows=4;
		for(int r=1;r<=rows;r++)
		{
			for(int c=1;c<=r;c++)
			{
				System.out.print("*" +" ");
			}
			System.out.println("  ");
		}
		for(int r=2;r<=rows;r++)
		{
			for(int c=r;c<=rows;c++)
			{
				System.out.print("*" +" ");
			}
			System.out.println("  ");
		}*/
		
		
		/*int rows=5;//error
		for(int r=1;r<=rows;r++)
		{
			for(int c=1;c<=r;c++)
			{
				if(c==1||r==c||r==5)
				{
					System.out.print("*" +" ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println("  ");
		}
		for(int r=1;r<=rows;r++)
		{
			for(int c=r;c<=rows;c++)
				{
				if(r==1||c==5||r==c)
				{
					System.out.print("*" +" ");
				}
				else
				{
					System.out.print("  ");
				}
				}
			System.out.println("  ");
		}*/
		
		/*int rows=5;
		for(int r=1;r<=rows;r++)
		{
			for(int c=r;c<=rows;c++)
			{
				System.out.print("*"+" ");
			}
			System.out.println("  ");
		}
		for(int r=1;r<=rows;r++)
		{
			for(int c=1;c<=r;c++)
			{
				System.out.print("*"+" ");
			}
			System.out.println("  ");
		}*/
		/*int rows=5;
		for(int r=1;r<=rows;r++)
		{
			int k=5;
			for(int c=r;c<=rows;c++)
			{
				System.out.print(k +" ");
				k--;
			}
			System.out.println("  ");
		}*/
		
		/*int rows=4;
		for(int r=1;r<=rows;r++)
		{
			char ch='A';
			for(int c=1;c<=r;c++)
			{
				System.out.print(ch +" ");
				ch++;
			}
			System.out.println("  ");
		}*/
		/*int rows=5;
		for(int r=1;r<=rows;r++)
		{
			for(int c=1;c<=r;c++)
			{
				System.out.print("*" +" ");
			}
			System.out.println("  ");
		}*/
		
		/*int rows=5;
		for(int r=1;r<=rows;r++)
		{
			for(int c=1;c<=r;c++)
			{
				if(c==1||r==c||r==5)
				{
					System.out.print("*" +" ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println("  ");
		}*/
		
	/*int rows=5;
	for(int r=1;r<=rows;r++)
	{
		for(int c=1;c<=r;c++)
		{
			if(c==1||r==5||r==c)
			{
				System.out.print(c +" ");
			}
			else
			{
				System.out.print("  ");
			}
		}
		System.out.println("  ");
	}*/
		/*int rows=4;
		for(int r=1;r<=rows;r++)
		{
			for(int c=r;c>=1;c--)
			{
				System.out.print(c +" ");
			}
			System.out.println("  ");
		}*/
		
		
		/*int rows=5;
		for(int r=1;r<=rows;r++)
		{
			for(int c=1;c<=r;c++)
			{
				if(r==c||c==1)
				{
					System.out.print("*" +" ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println(" ");
		}
		for(int r=2;r<=rows;r++)
		{
			for(int c=r;c<=rows;c++)
			{
				if(r==c||c==rows)
				{
					System.out.print("*" +" ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println("  ");
		}*/
		
		
		/*int rows=4;
		for(int r=1;r<=rows;r++)
		{
			for(int c=r;c<rows;c++)
			{
				System.out.print("  ");
			}
			for(int c=1;c<=2*r-1;c++)
			{
				System.out.print("#" +" ");
			}
			System.out.println("  ");
			}
		for(int r=2;r<=rows;r++)
		{
			for(int c=1;c<r;c++)
			{
				System.out.print("  ");
			}
			for(int c=r;c<=2*rows-r;c++)
			{
				System.out.print("#" +" ");
			}
			System.out.println("  ");
		}*/
		
		/*int rows=4;
		for(int r=1;r<=rows;r++)
		{
			for(int c=r;c<=rows;c++)
			{
				System.out.print("  ");
			}
			for(int c=1;c<=2*r-1;c++)
			{
				if(c==1||r==rows||c==2*r-1)
				{
					System.out.print("#"+" ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println("  ");
		}*/
		
		/*int rows=4;
		for(int r=1;r<=rows;r++)
		{
		for(int c=1;c<r;c++)
		{
			System.out.print("  ");
		}
		for(int c=r;c<=2*rows-r;c++)
		{
			System.out.print("#" +" ");
		}
		System.out.println(" ");
		}*/
		
		/*int rows=4;
		for(int r=1;r<=rows;r++)
		{
		for(int c=1;c<r;c++)
		{
			System.out.print("  ");
		}
		for(int c=r;c<=2*rows-r;c++)
		{
			if(r==1||c==2*rows-r||c==r)
			{
				System.out.print("#" +" ");
			}
			else
			{
				System.out.print("  ");
			}
			
		}
		System.out.println(" ");
		}*/
		
		/*int rows=4;
		for(int r=1;r<=rows;r++)
		{
			for(int c=r;c<rows;c++)
			{
				System.out.print("  ");
			}
			for(int c=1;c<=2*r-1;c++)
			{
				if(c==2*r-1||c==1)
				{
					System.out.print("#" +" ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println("  ");
		}
		for(int r=2;r<=rows;r++)
		{
			for(int c=1;c<r;c++)
			{
				System.out.print("  ");
			}
			for(int c=r;c<=2*rows-r;c++)
			{
				if(c==2*rows-r||c==r)
				{
					System.out.print("#" +" ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println("  ");
		}*/
		
		/*int rows=5,k=rows;
		for(int r=1;r<=rows;r++)
		{
			for(int c=r;c<=rows;c++)
			{
				if(r%2==0)
				{
				k++;
				System.out.print(k +" ");
				}
				else
				{
					System.out.print(k +" ");
					k--;
				}
			}
			System.out.println("  ");
		}*/
		
		/*int rows=4;
		for(int r=1;r<=rows;r++)
		{
			for(int c=r;c<=rows;c++)
			{
				System.out.print("$" +" ");
			}
			for(int c=1;c<=r;c++)
			{
				System.out.print("#" +" ");
			}
			System.out.println("  ");
		}*/
		
		/*int rows=4;
		for(int r=1;r<=rows;r++)
		{
			for(int c=1;c<r;c++)
			{
				System.out.print("  ");
			}
			for(int c=r;c<=rows;c++)
				{
				System.out.print("$" +" ");
				}
			System.out.println("  ");
		}
	}
}*/
		/*int rows=4;
		for(int r=1;r<=rows;r++)
		{
			for(int c=1;c<r;c++)
			{
				System.out.print("  ");
			}
			for(int c=r;c<=rows;c++)
				{
				if(r==c||r==1||c==rows)
				{
				System.out.print("$" +" ");
				}
				else
				{
					System.out.print("  ");
				}
				}
			System.out.println("  ");
		}*/
		
		/*int rows=4;
		for(int r=1;r<=rows;r++)
		{
			for(int c=r;c<rows;c++)
			{
				System.out.print(" ");
			}
			for(int c=1;c<=r;c++)
			{
				System.out.print("*" +" ");
			}
			System.out.println(" ");
	}*/
		
		/*int rows=4;
		for(int r=1;r<=rows;r++)
		{
			for(int c=r;c>=1;c--)
			{
				System.out.print(c+" ");
			}
			System.out.println();
		}*/
		
		/*int rows=5;
		for(int r=1;r<=rows;r++)
		{
			for(int c=1;c<=r;c++)
			{
			  if((r+c)%2==0)
			  {
				  System.out.print("1" +" ");3
			  }
			  else
			  {
				  System.out.print("0" +" ");
			  }
			}
			System.out.println();
		}*/
		
		/*int rows=5,k=1;
		for(int r=1;r<=rows;r++)
		{
			int s=k;
			for(int c=1;c<=r;c++)
			{
				System.out.print(s +" ");
				s++;
			}
			
			System.out.println();
			k++;
		}*/
		
		/*int rows=4;
		for(int r=1;r<=rows;r++)
		{
			for(int c=r;c<rows;c++)
			{
				System.out.print("  ");			
			}
			for(int c=r;c>=1;c--)
			{
				System.out.print(c+" ");
			}
			System.out.println();
		}
		for(int r=1;r<=rows;r++)
		{
			for(int c=1;c<r;c++)
			{
				System.out.print("  ");
			}
			for(int c=r;c<=rows;c++)
			{
				System.out.print(c +" ");
			}
			System.out.println();
		}*/
		
		/*int rows=5;
		for(int r=1;r<=rows;r++)
		{
			for(int c=r;c<rows;c++)
			{
				System.out.print("  ");
			}
			for(int c=1;c<=r;c++)
			{
				System.out.print(c +" ");
			}
			for(int c=r;c>=1;c--)
			{
				System.out.print(c +" ");
			}
			System.out.println();
		}*/
		
		  /*int rows=4;
		  for(int r=1;r<=rows;r++)
		  {
			  for(int c=r;c<rows;c++)
			  {
				  System.out.print(" ");
			  }
			  for(int c=1;c<=r;c++)
			  {
				  System.out.print(r +" ");
			  }
			  System.out.println();
		  }*/
		
		/*int rows=5,k=1;
		for(int r=1;r<=rows;r++)
		{
			for(int c=1;c<=rows;c++)
			{
				if(r==c||r+c==rows+1)
				{
					System.out.print(k +" ");
					k++;
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}*/
		
		/*int rows=5,k=5;
		for(int r=1;r<=rows;r++)
		{
			for(int c=1;c<r;c++)
			{
				System.out.print("  ");
			}
			int s=k;
			for(int c=r;c<=rows;c++)			
			{
				System.out.print(s+" ");
				s--;
			}
			k--;
			int m=1;
			for(int c=r;c<=rows;c++)
			{
				System.out.print(m+" ");
				m++;
			}
			System.out.println();
		}*/
		
		/*int rows=4;
		for(int r=1;r<=rows;r++)
		{
			for(int c=1;c<=r;c++)
			{
				System.out.print("*" +" ");
			}
			System.out.println();
		}
		for(int r=2;r<=rows;r++)
		{
			for(int c=r;c<=rows;c++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		for(int r=1;r<=rows;r++)
		{
			for(int c=r;c<rows;c++)
			{
				System.out.print("  ");
			}
			for(int c=1;c<=r;c++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
			for(int r=2;r<=rows;r++)
			{
				for(int c=1;c<r;c++)
				{
					System.out.print("  ");
				}
				for(int c=r;c<=rows;c++)
				{
					System.out.print("*" +" ");
				}
				System.out.println();
				
			}*/
		
		
		int rows=3,k=1;
		for(int r=1;r<=rows;r++)
		{
			for(int c=1;c<=r;)
			{
				int count=0;
				for(int i=1;i<=k;i++)
				{
					if(k%i==0)
					{
						count++;
					}
				}
				if(count==2)
				{
					System.out.print(k +" ");
					c++;
				}
				k++;
			}

			System.out.println();
		}
		}
		
	}

	



