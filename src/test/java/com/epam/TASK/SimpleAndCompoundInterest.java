package com.epam.TASK;
import java.util.*;
import java.io.PrintStream;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
@SuppressWarnings("resource")
 class SimpleAndCompundInterest {

public SimpleAndCompundInterest()
{
PrintStream print_stream=new PrintStream(new FileOutputStream(FileDescriptor.out));
Scanner sc=new  Scanner(System.in);
Double principle_amount,rate,time,simple_interest,compound_interest;
print_stream.print("Calculating Simple and Compound Interest\n");

print_stream.print("Enter Principle Amount\n");
principle_amount=sc.nextDouble();

print_stream.print("Enter Time\n");
time=sc.nextDouble();

print_stream.print("Enter Rate\n");
rate=sc.nextDouble();

simple_interest=((principle_amount*time*rate)/100);
print_stream.print("Simple Interest is"+simple_interest);
print_stream.print("\n");

compound_interest=principle_amount*(Math.pow((1+rate/100),time));
print_stream.print("CompoundInterst is "+compound_interest);
System.exit(0);
}



}



