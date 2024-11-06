package patterns;

public class pattern {

	public static void main(String[] args) {
		/*for(int r=1;r<=4;r++)
		{
			for(int c=1;c<=4;c++)
			{
				System.out.print("#"+" " );
			}
			System.out.println("  ");
		}*/
		/*int rows=7,cols=5;
		for(int r=1;r<=rows;r++)
		{
			for(int c=1;c<=cols;c++)
			{
				System.out.print("#"+" " );
			}
			System.out.println("  ");
		}*/
		/*int rows=5,cols=5;
		for(int r=1;r<=rows;r++)
		{
			for(int c=1;c<=cols;c++)
			{
				if(r==1 && c==2 || r==4 && c==4)
				{
					System.out.print("&" +" ");
				}
				else if(r==3 && c==2 || r==5 && c==3)
				{
					System.out.print("$" +" ");
				}
				else
				{
					System.out.print("#"+" ");
				}
			}
			System.out.println("  ");
		}*/
		
		/*int rows=5,cols=5;
		for(int r=1;r<=rows;r++)
		{
			for(int c=1;c<=cols;c++)
			{
				if(r%2==0)
				{
					System.out.print("$"+" ");
				}
				else
				{
					System.out.print("#"+" ");
				}
			}
			System.out.println("  ");
	}
	}
}*/
		/*int rows=5,cols=5;
		for(int r=1;r<=rows;r++)
		{
			for(int c=1;c<=cols;c++)
			{
				if(r==1 || r==5 || c==1 || c==5)
				{
					System.out.print("#" +" ");
				}
				else
				{
					System.out.print("$" +" ");
				}
			}
			System.out.println("  ");
		}
	}
}*/
		/*int rows=5,cols=5;
		for(int r=1;r<=rows;r++)
		{
			for(int c=1;c<=cols;c++)
			{
				if(r==c || r+c==rows+1)
				{
					System.out.print("#"+" ");
				}
				else
				{
					System.out.print("$"+" ");
				}
			}
			System.out.println("  ");
		}
	}
}*/
		
		/*int rows=7,cols=7;
		for(int r=1;r<=rows;r++)
		{
			for(int c=1;c<=cols;c++)
			{
				if(r==1||r==7||c==1||c==7||r==c||r+c==rows+1)
				{
					System.out.print("#" +" ");
				}
				else
				{
					System.out.print("$" +" ");
				}
			}
			System.out.println("  ");
		}
	}
}*/
		/*int rows=5,cols=5;
		for(int r=1;r<=rows;r++)
		{
			for(int c=1;c<=cols;c++)
			{
		        if(r==1||r==5||c==1||c==5)
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
		
		int rows=4;
		for(int r=1;r<=rows;r++)//1 2
		{
			int x=r;
			for(int c=1;c<=r;c++)// 1 2
			{
				if(r%2==0)//1%2==0f  2%2==0t 
				{
					System.out.print(x+" ");//2
					x--;
				}
				else
				{
					System.out.print(c+" ");//1
					x++;
				}
			}
			System.out.println("  ");//1
			                         //2 
		}
		
		/*int rows=4;
		for(int r=1;r<=rows;r++)//1 1<=4 2 2<=4
		{
			for(int c=1;c<=r;c++)//1 1<=1 2 2<=1f  1<=2t 2<=2t
			{
				System.out.print("*"+" ");//*
				                          //**
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
		}*/
	}
}
			
		
		

