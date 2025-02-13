## Implementation

    ````java[]

import java.util.*;
public class Main
{
    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("FULLY AUTOMATIC VENDING MACHINE");
        System.out.println("C-coffee");
        System.out.println("T-tea");
        System.out.println("S-soups");
        System.out.println("B-beverages");
        System.out.print("Enter your main menu :");
        char mainchoice=s.next().charAt(0);
        System.out.print("enter your sub menu :");
        int submenu=s.nextInt();
        String result = "Invalid output";
        switch(mainchoice)
        {
            case 'c':
            switch(submenu)
            {
                case 1: result="espresso coffee";
                break;
                case 2: result="cappucino coffee";
                break;
                case 3: result="lattle coffee";
                break;
            }
            break;
            case 't':
            switch(submenu)
            {
                case 1: result="plain tea";
                break;
                case 2: result="assam tea";
                break;
                case 3: result="ginger tea";
                break;
                case 4: result="cardamom tea";
                break;
                case 5: result="masala tea";
                break;
                case 6: result="lemon tea";
                break;
                case 7: result="green tea";
                break;
                case 8: result="organic dargeeling tea";
                break;
                
            }
            break;
            case 's':
            switch(submenu)
            {
                case 1: result="hot and sour soup";
                break;
                case 2: result="veg corn soup";
                break;
                case 3: result="tomato soup";
                break;
                case 4: result="spicy tomato soup";
                break;
            }
            break;
            case 'b':
            switch(submenu)
            {
                case 1: result=" badam drink";
                break;
                case 2: result="hot chocolate drink";
                break;
                case 3: result="badam-pista drink";
                break;
            }
        }
        if(!result.equals("Invalid output"))
        {
        System.out.println("Welcome to CCD!");
        System.out.println("Enjoy your "+result);
            
        }
        else
        {
            System.out.println(result);
        }
    }
}

````
