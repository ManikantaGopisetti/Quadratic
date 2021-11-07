package com.functionalprograms;
import java.util.Scanner;

public class Quadratic {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter a value : ");
		int a=scan.nextInt();
		System.out.print("Enter b value : ");
		int b=scan.nextInt();
		System.out.print("Enter c value : ");
		int c=scan.nextInt();
		
		System.out.println("The quadratic equation is  : ("+a+")x^2+("+b+")x+("+c+")");
		
		int delta=b*b-4*a*c;
		double root1=(-b+Math.sqrt(delta))/(2*a);
		double root2=(-b-Math.sqrt(delta))/(2*a);
		System.out.println("The root1 : "+root1);
		System.out.println("The root2 : "+root2);
		
		
	}

}
