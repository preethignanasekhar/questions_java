
// 6.Check whether a year is a leap year. 

import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner (System.in);
	    int n=s.nextInt();
	    if(n%4==0&&n%100==0||n%400==0){
	        
	        System.out.print(+n +" is leap year");
	    }
	    else{
		System.out.println(+n +" is not a leap year");
	    }
	}
}