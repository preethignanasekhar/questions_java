


import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int a=s.nextInt();
	    int b=s.nextInt();
	    int c=s.nextInt();
	    int d=s.nextInt();
	    if(a>b&&a>c&&a>d){
	     System.out.println("gratest no. is "+a);   
	    }
	    else if(b>a&&b>c&&b>d){
	     System.out.println("gratest no. is "+b);   
	    }
	    else if(c>a&&c>b&&c>d){
	     System.out.println("gratest no. is "+c);   
	    }
		else{
		  System.out.println("gratest no. is "+d);    
		}
	}
}