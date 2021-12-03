package day02_Scanner;

import java.util.Scanner;

public class C04_Scanner {

	public static void main(String[] args) {
		// kullanıcıdan deger almak icin 3 adim takip edilir
		// 1. adim scanner objesi oluşturmak
		
		
		
		
		
	Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen üc basamaklı bir sayi giriniz");
		int sayi=scan.nextInt();
	
	        
			int sonuc = 0;
			while (sayi > 0) {
	        
	            sonuc += (sayi % 10);
	            
	            sayi = sayi / 10;
	        }	        
	          
	System.out.println("Verilen tamsayının rakamları toplamı "+sonuc+"'dur.");
	
	scan.close();
	}

	
}
