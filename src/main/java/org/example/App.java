package org.example;

import org.example.homecost.*;
import org.example.interest.*;

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);

        System.out.format("%s", "Enter \"interest\" to calculate SI or CI or \"cost\" to calculate cost of construction\n");
        String choice = sc.nextLine();
        switch(choice)
        {
            case "interest" :
                double p,r,t;
                int option;

                System.out.format("%s", "Enter principal\n");
                p = sc.nextDouble();

                System.out.format("%s", "Enter rate of interest\n");
                r = sc.nextDouble();

                System.out.format("%s", "Enter time\n");
                t = sc.nextDouble();

                Interest ob = new Interest(p,r,t);

                System.out.format("%s","Enter 1 for SI and 2 for CI\n");
                option = sc.nextInt();

                if(option == 1)
                    System.out.format("%s",ob.calculate_SI());
                else if(option == 2)
                    System.out.format("%s",ob.calculate_CI());
                else
                    System.out.format("%s","Wrong choice");
                break;

            case "cost" :
                System.out.format("%s","Enter \"sm\" for standard material\nEnter \"asm\" for above standard material\nEnter \"hsm\" for high standard material\n");
                String material = sc.next();

                System.out.format("%s", "Enter total area of house\n");
                double area = sc.nextDouble();

                System.out.format("%s", "Want fully automated home ? (True/False)\n");
                Boolean opt = sc.nextBoolean();
                Home h = new Home(material, area, opt);
                System.out.format("%s","Total cost is "+h.totalCost());
                break;

            default :
                System.out.format("%s", "Wrong choice");
                break;
        }
    }
}
