
//count the number odd num form start and end

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int start =s.nextInt();
	    int end=s.nextInt();
	    int count=0;
	    for(int i=start;i<=end;i++){
	        if(i%2!=0){
	            count++;   
	        }
	    }
		System.out.println(count);
	}
}
