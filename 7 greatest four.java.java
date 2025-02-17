
/*7.Find the greatest of four numbers. */

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int a[]=new int[4];
	    for(int i=0;i<4;i++){
	        a[i]=s.nextInt();
	        }
	   int max=a[0];
	    for(int i=0;i<4;i++){
	        if(a[i]<a[i]+1){
	        max=a[i];
	            
	        }
	    }
	    System.out.print("the greatest of four numbers "+max);
	    
	}
}


