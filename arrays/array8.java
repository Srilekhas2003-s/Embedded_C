package arrays;

public class array8 {

	public static void main(String[] args) {
		//10,20,30,40,50
		//20,30,40,50,10,
       int a[]=new int[] {10,20,30,40,50,60,80};
       int temp=a[0],x;//10
       for(x=0;x<a.length-1;x++)//0 0<4 1<4 2<4 3<4 4<4f
       {
    	   a[x]=a[x+1];//a[0]=a[1]==20 a[1]=a[2]=30 a[2]=a[3]=40 a[3]=a[4]=50 
       }
       a[x]=temp;//10
       for(int t:a)
       {
    	   System.out.println(t);
       }
	}

}
