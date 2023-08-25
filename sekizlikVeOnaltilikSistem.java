package projeler3;

import java.util.ArrayList;
import java.util.Collections;

public class sekizlikVeOnaltilikSistem {

	public static void main(String[] args) {

		/*
	  SORU 3 :
		  
		  0 VE 15 ARASINDAKİ SAYILARIN 8'LİK VE 16'LIK SİSTEMDEKİ KARŞILIĞINI YAZAN
		  PROGRAM.
		  
		 */

		int bolum, kalan;

		ArrayList<Integer> tersCevirme = new ArrayList<>();

		System.err.println("8'LIK SAYI SISTEMI : ");

		for (int counter = 0; counter <= 15; counter++) {

			int tempCounter = counter;

			if (counter / 8 == 0) {
				System.out.println(counter);

			} else {

				while (tempCounter != 0) {

					bolum = tempCounter / 8;
					kalan = tempCounter % 8;
					tersCevirme.add(kalan);
					tempCounter = bolum;
				}

				Collections.reverse(tersCevirme);
				for (Integer sayi : tersCevirme) {
					System.out.print(sayi);
				}
				System.out.println();
				tersCevirme.clear();

			}
		}

		System.out.println("\n\n");

		System.err.println("16'LIK SAYI SISTEMI : ");
		
		ArrayList<String> harf = new ArrayList<>();
		

		for (int counter = 0; counter <= 15; counter++) {

			int tempCounter = counter;

			if (counter / 10 == 0) {
				System.out.println(counter);

			} else {

				while (tempCounter != 0) {

					bolum = tempCounter / 16;
					kalan = tempCounter % 16;
					if (kalan < 10) {
						tersCevirme.add(kalan);
					}
					else {
						if (kalan == 10) {
							harf.add("A");
						}
						if (kalan == 11) {
							harf.add("B");
						}
						if (kalan == 12) {
							harf.add("C");
						}
						if (kalan == 13) {
							harf.add("D");
						}
						if (kalan == 14) {
							harf.add("E");
						}
						if (kalan == 15) {
							harf.add("F");
						}
						
					}
					
					tempCounter = bolum;
				}
				
				Collections.reverse(tersCevirme);
				for (Integer sayi : tersCevirme) {
					System.out.print(sayi);
				}
				for (String string : harf) {
					System.out.print(string);
				}
				System.out.println();
				tersCevirme.clear();
				harf.clear();
			}
		}

		
		
	}

}
