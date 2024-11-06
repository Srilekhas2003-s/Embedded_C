package patterns;

public class code6 {

	public static void main(String[] args) {
		/*int rows=4,cols=4;
		char ch='A';
		int x=1;
		for(int r=1;r<=rows;r++)
		{
			if(r==2)
			{
				x=1;
			}
			for(int c=1;c<=cols;c++)
			{
				if(r%2==0)
				{
					System.out.print(x +" ");
				}
				else
				{
					System.out.print(ch +" ");
				}
				x++;
				ch++;
			}
			System.out.println("  ");
		}*/
		/*int rows=4,cols=4;
		char ch='A';
		char k='a';
		for(int r=1;r<=rows;r++)
		{
			if(r==2)
			{ 
				k='a';
			}
			for(int c=1;c<=cols;c++)
			{
				if(r%2==0)
				{
					System.out.print(k +" ");
				}
				else
				{
					System.out.print(ch +" ");
				}
				k++;
				ch++;
			}
			System.out.println("  ");
		}*/
		
		/*int rows=4,cols=4;
		char ch='A';
		for(int r=1;r<=rows;r++)
		{
			char k=ch;
			for(int c=1;c<=cols;c++)
			{
				System.out.print(k +" ");
				k++;
			}
			ch++;
			System.out.println("  ");
		}*/
		
		int rows=4,cols=4;
		int k=1;
		for(int r=1;r<=rows;r++)
		{
			int s=k;
			for(int c=1;c<=cols;c++)
			{
				System.out.print(s +" ");
				s++;
			}
			k++;
			System.out.println("  ");
		}
	}
}