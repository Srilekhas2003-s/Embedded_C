package patterns;

public class code5 {

	public static void main(String[] args) {
		/*int rows=4,k=1;
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
		
		/*int rows=5,k=2;
		for(int r=1;r<=rows;r++)
		{
			for(int c=r;c<rows;c++)
			{
				System.out.print("  ");
			}
			for(int c=1;c<=2*r-1;c++)
			{
				if(c==2*r-1||c==1||r==rows)
				{
					System.out.print("1" +" ");
				}
				else 
				{
					System.out.print(r+ " ");
					
				}
			}
			System.out.println("  ");
		}*/
		
		int rows=3;
		char ch='A';
		for(int r=1;r<=rows;r++)
		{
			char s=ch;
			for(int c=1;c<=r;c++)
			{
				System.out.print(s +" ");
				s++;
			}
			System.out.println();
			ch++;
			}
		char m='A';
		for(int r=1;r<=rows;r++)
		{
			for(int c=1;c<=5;c++)
			{
				char n=m;
				System.out.print(n +" ");
				n++;
			}
			System.out.println();
		}
		}
		}
	

	


