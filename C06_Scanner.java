package day02_Scanner;

import java.util.Scanner;

public class C06_Scanner {

	public static void main(String[] args) {
		// Scanner isleminde string için 2 method vardir.
		// scan.next () dedigimizde sadece 1 kelime alır
		// eger kullanıcıdan daha fazla kelime gelme ihtimali varsa
		// scan.

		Scanner scan= new Scanner (System.in);
		
		System.out.println("Lutfen isminizi giriniz...");
		
		String isim=scan.next();
		
		System.out.println("Lutfen soyisminizi yaziniz...");
		
		String soyisim=scan.next();
		
		System.out.println("girilen isim : " + isim + "  "   + soyisim );
		
		
		scan.close();
		
		
		
	}

}
