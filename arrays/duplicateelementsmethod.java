package arrays;

public class duplicateelementsmethod {

	public static void main(String[] args) {
		Duplicate d=new Duplicate();
		int a[]=new int[] {10,20,30,10,40,20,30,10,40,50,10,20};
		//System.out.println(d.duplicateSum(a));
		int res=d.duplicateSum(a);
		System.out.println(res);
		
        
	}

}

class Duplicate
{
	int duplicateSum(int n[])
	{
		int b[]=new int[n.length];
		int sum=0;
		for(int x=0;x<n.length;x++)
			{
			if(b[x]==1)
				continue;
			int count=1;
			for(int y=x+1;y<n.length;y++)
			{
				if(n[x]==n[y])
				{
					b[y]=1;
					count++;
				}
			}
		if(count>1)
		{
			sum=sum+n[x];
			
		}
		
	}
		return sum;
		
	}
}