## Positive or Negative

````java[]


import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    if(n>0){
		System.out.println("positive");
	    }
	    else{
	      System.out.println("negative");  
	    }
	}
}

````

## Odd or Even

````java[]

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    if(n%2==0){
		System.out.println("even");
	    }
	    else{
	     System.out.println("odd");   
	    }
	}
}
 ````

## divisible by 3 and 5

````java[]

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
````

##  largest of three 

````java[]

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int a=s.nextInt();
	    int b=s.nextInt();
	    int c=s.nextInt();
	    if(a>b&&a>c){
		System.out.println("largest is "+a);
	   }
	    else if(b>a&&b>c){
		System.out.println("largest is "+b);
	   }   
	    else{
	    System.out.println("largest is "+c);    
	   }    
	}
}
````

##  prime number. 

````java[]
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if (n <= 1) {
            System.out.println("not a prime number "+n);
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.println("not a prime number "+n);
            }
        }
        System.out.println("prime number " +n);
    }
}
````
