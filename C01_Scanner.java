package day03_Scanner;

import java.util.Scanner;

public class C01_Scanner {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		
	@SuppressWarnings("resource")
	Scanner scan=new Scanner (System.in);	
	
	System.out.println("Lutfen cemberin yaricapini giriniz");
	
	double yaricap=scan.nextDouble();
	
	double cevre= 2*3.14*yaricap;
	
	double alan=3.14*yaricap*yaricap;
	
	// cemberin cevresi :25.7
	// dairenin alani   :26.31
	
	System.out.println("cemberin cevresi : "  +  cevre);

	System.out.println("cemberin alani : "  +  cevre);

	
	
	}

	
	

}
