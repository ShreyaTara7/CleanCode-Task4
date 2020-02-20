package com.epam.TASK;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class ConstructionCost 
{
	public ConstructionCost()
	{
		PrintStream printStream=new PrintStream(new FileOutputStream(FileDescriptor.out));
		Scanner sc=new  Scanner(System.in);
		printStream.print("Calculating total Construction Cost\n");
		printStream.print("Enter the Material Standard\n");
		printStream.print("Enter\n1--> standard materials\n");
		printStream.print("2--> above standard materials\n");
		printStream.print("3-->high standard material\n");
		printStream.print("4-->high standard material and fully automated home\n");
		int material_choice=sc.nextInt();
		printStream.print("Enter the total area of the house in sq. ft\n");
		int total_area=sc.nextInt();
		
		double total_cost=0,cost=0;
		switch (material_choice) 
		{
		case 1:
			cost=1200;			
			break;
		case 2:
			cost=1500;			
			break;
		case 3:
			cost=1800;			
			break;
		case 4:
			cost=2500;			
			break;

		//default:
			//break;
		}
		total_cost=total_area*cost;
		printStream.print("Total Cost of COnstruction = "+total_cost);
		System.exit(0);
	}

}
