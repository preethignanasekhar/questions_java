
//8.Check if a number is a palindrome. 

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s= new Scanner(System.in);
	    int num=s.nextInt();
	    int temp=num;
	    int rev=0;
	    while(num!=0){
	        int d=num%10;
	        rev=rev*10+d;
	        num/=10;
	    }
	    if(temp==rev){
		System.out.println(temp +" number is a palindrome.");
	    }
	    else{
	     System.out.println(+temp +" number is not a palindrome.");   
	    }
	}
}