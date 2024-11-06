package arrays;

public class arrays1 {

	public static void main(String[] args) {
		int a[]=new int[] {1,2,3,4,5};
		int arr[]=new int[a.length];
		int sum=0;
		for(int x=0;x<=a.length-1;x++)
		{
			sum=sum+a[x];
		}
		for(int x=0;x<=a.length-1;x++) 
		{
			arr[x]=sum/a[x];
			//System.out.println(quo);
		}
		
		System.out.print("{ ");
		
       for(int x=0;x<arr.length;x++) {
    	   System.out.print(arr[x]+" , ");
       }
       System.out.println(" }");
	}

}
