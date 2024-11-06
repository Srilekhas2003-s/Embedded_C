package arrays;

public class arr2d {

	public static void main(String[] args) {
		//printing 1 2 3
		         //4 5 6
		         //7 8 9
		/*int a[][]=new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.print(a[j][i]+"  ");
			}
			System.out.println();
		}*/
		
		//printing diagonal elements
		
		/*int a[][]=new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(i==j||i+j==a.length-2+1)
				{
					System.out.print(a[i][j]+"  ");
				}
			}
			System.out.println();
		}*/
		
		
		//print sum
		/*int a[][]=new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0;i<a.length;i++)
		{
			int sum=0;
			for(int j=0;j<a.length;j++)
			{
				sum=sum+a[i][j];
			}
			System.out.println(sum);
			System.out.println();
		}*/
		
		//print each row max element
		
		/*int a[][]=new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		int max=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(max<a[i][j])
				{
					max=a[i][j];
				}
			}
			System.out.print(max);
			System.out.println();
		}*/
		
		
		//print total max element
		/*int a[][]=new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		int max=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(max<a[i][j])
				{
					max=a[i][j];
				}
			}
		}
		System.out.println(max);*/
		
		

		int a[][]=new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(i==j||i+j==a.length-2+1)
				{
					System.out.print(a[i][j]+"  ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
