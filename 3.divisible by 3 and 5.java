import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
		System.out.println(n);
		if(n%3==0 && n%5==0){
		    System.out.println("the num is divisible by 3 and 5");
		}
		else{
		   System.out.println("the num is not divisible by 3 and 5"); 
		}
	}
}
