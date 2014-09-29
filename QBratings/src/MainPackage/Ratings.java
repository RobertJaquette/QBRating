package MainPackage;

import java.util.*;

public class Ratings {

	
	public static void main(String[] args){
	
		System.out.print("number of passing attempts: ");
			
		Scanner scan = new Scanner(System.in);
			
		double attempts = scan.nextDouble();
			
		System.out.print("number of passes caught: ");
			
		double completions = scan.nextDouble();
			
		System.out.print("Number of yards thrown: ");
			
		double yards = scan.nextDouble();
			
		System.out.print("Number of Touchdowns thrown: ");
			
		double touchdowns = scan.nextDouble();
			
		System.out.print("Number of interceptions thrown: ");
			
		double interceptions = scan.nextFloat();
		scan.close(); //done with the scanner
	    double A = (((completions/attempts)-.3)*5);
		double B = (((yards/attempts)-3)*.25);
		double C = ((touchdowns/attempts)*20);
		double D = (2.375 - ((interceptions/attempts)*25));
		if (A>=2.375){
			A = 2.375;}
		else if (A<=0){
			A = 0;}
		if (B>=2.375){
			B = 2.375;}
		else if (B<=0){
			B = 0;}
		if (C>=2.375){
		    C = 2.375;}
		else if (C<=0){
			C = 0;}	
		if (D>=2.375){
			D = 2.375;}
		else if (D<=0){
			D = 0;}
		double QbRating = (((A + B + C + D)/6)*100);
		System.out.println("The QB rating is: " + QbRating);	
		}
}		

