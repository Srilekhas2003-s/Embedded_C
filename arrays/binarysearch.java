package arrays;

import java.util.Arrays;

public class binarysearch {

	public static void main(String[] args) {
		//binary search
		/*int a[]=new int[] {10,20,60,30,40,50,90,80,70};
		Arrays.sort(a);
		int f=0,l=a.length-1,m,search=800;
		while(f<=l)
		{
			m=(f+l)/2;
			if(search==a[m])
			{
				System.out.println("element found");
				break;
			}
			else if(search>a[m])
				f=m+1;
			else if(search<a[m])
				l=m-1;
		}
		if(f>l)
			System.out.println("element not found");*/
		
		
		//selection sort
		/*int a[]=new int[] {23,67,90,45,-12,-98,45,27,-78};
		int min=0;
		for(int x=0;x<a.length;x++)
		{
			min=x;
			for(int y=x+1;y<a.length;y++)
			{
				if(a[min]>a[y])
				{
					min=y;
				}
			}
			int t=a[x];
			a[x]=a[min];
			a[min]=t;
		}
    for(int t:a)
    {
    	System.out.println(t);
    }*/
		
		//binary search in descending order
		/*int a[]=new int[] {50,40,30,20,10};
		int f=0,l=a.length-1,m,search=50;
		while(f<=l)
		{
			m=(f+l)/2;
			if(search==a[m])
			{
				System.out.println("element found");
				break;
			}
			else if(search<a[m])
				f=m+1;
			else if(search>a[m])
				l=m-1;
		}
		if(f>l)
		{
			System.out.println("element not found");
		}*/
		
	}

}
