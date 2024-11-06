package patterns;

public class pattern7 {

	public static void main(String[] args) {
		/* 1
		 * 2 6 
		 * 3 7 10
		 * 4 8 11 13
		 * 5 9 12 14 15
		 */
          int rows=5,k=1;
          for(int r=1;r<=rows;r++)
          {
        	  
        	  for(int c=1;c<=r;c++)
        	  {
        		  System.out.print(k+" ");
        		  k++;
        	  }
        	  System.out.println();
        	  
          }
          int num=(int)Math.sqrt(4);
          System.out.println(num);
	}

}
