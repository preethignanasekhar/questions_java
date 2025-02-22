
//9.Check whether a character is a vowel or consonant. 

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    char c=s.next().charAt(0);
	    if(c=='a'||c=='A'||c=='E'||c=='e'||c=='i'||c=='I'||c=='O'||c=='o'||c=='u'||c=='U'){
	        System.out.println(c+" vowel");
	    }
	    else{
	        System.out.println(c+" consonant");   
	    }
	}
}