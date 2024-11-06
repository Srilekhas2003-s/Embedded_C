package patterns;

public class test {

	public static void main(String[] args) {
		/*int num=13500,rem=0,rev=0,rev1=0,rem1=0,count=0,check=0;
			   while(num>0)
				{
					rem=num%10;
					count++;
					rev=rev*10+rem;
					num=num/10;
				}
			   while(rev>0)
			   {
				   rem1=rev%10;
				   check++;
				   //rev1=rev1*10+rem1;
				   switch(rem1)
				   {
				   case 1:
					   System.out.print("I");
					   break;
				   case 3:
					   System.out.print("III");
					   break;
				   case 5:
					   System.out.print("v");
					   break;
				   }
				   rev=rev/10;
			   }
			   //System.out.println(rem1);
			   int res=count-check;
			   for(int x=1;x<=res;x++)
			   {
				   System.out.print("0");
			   }*/
		int num=1543,rem=0,check=0,sum=0,pro=1;
		while(num>0)
		{
			rem=num%10;
			check++;
			num=num/10;
		if(check==1 || check==3)
		{
			sum=sum+rem;
		}
		else if(check==2 || check==4)
		{
			pro=pro*rem;
		}
		}
		int sum2=sum+pro;
		System.out.println(sum2);

	}

}
