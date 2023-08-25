package projeler;

import java.util.Random;
import java.util.Scanner;

public class MayinTarlasi {

	public static void main(String[] args) {
		
		
		/*
		 
		 MAYIN TARLASI OYUNUNU JAVA İLE YAPMA.
		 
		 KOD KISIMLARINDA İLGİLİ KODUN NE YAPTIĞINA DAİR AÇIKLAMALAR BULUNMAKTADIR
		 
		  
		  */
		
		
		Scanner input = new Scanner(System.in);

		int satir = 0, sutun = 0;

		do {
			System.out.println("kaca kaclik alanda oynamak istersiniz ? (satir ve sutun sayisi ayni olsun lutfen)\n");
			System.out.print("satir : ");
			satir = input.nextInt();
			System.out.print("sutun : ");
			sutun = input.nextInt();
			
		} while (satir != sutun);// MAYIN TARLASI BOYUTUNU ALMA BOLUMU
		
		int[][] array = new int[satir + 2][sutun + 2]; // MAYINLI ARRAY
		
		int[][] GosterilenArray = new int[satir + 2][sutun + 2]; // OYUN ICINDE GOSTERILEN MAYINSIZ ARRAY
		
		Random random = new Random();
		
		for (int counter3 = 0; counter3 < satir * sutun / 4; counter3++) {
			
			int x = random.nextInt(array.length - 2) + 1;
			int y = random.nextInt(array.length - 2) + 1;
			if (array[x][y] == 1) {
				counter3--;
			} else {
				array[x][y] = 1;
			} // MAYINI RASTGELE KORDINATLARA YERLESTIRME BOLUMU
				// System.out.println(x + " " + y); //MAYININ KORDINATLARI
			
		} // MAYİN EKLEME BOLUMU
		
		  /* for (int counter = 1; counter < array.length - 1; counter++) {
		  
		  for (int counter2 = 1; counter2 < array.length - 1; counter2++) {
		  
		  System.out.print(array[counter][counter2] + " ");
		  } 
		  System.out.println();} // KONTROL ETME DURUMU GEREKTIGINDE MAYIN TARLASINI GOSTEREN BOLUM*/
		
		System.out.println();
		
		int KazanmaSayaci = 0;
		int kordinatx = array.length - 1, kordinaty = array.length - 1;
		
		try {
			
			while (array[kordinatx][kordinaty] != 1) {
				
				for (int counter = 1; counter < array.length - 1; counter++) {
					System.out.print("\t\t\t\t");
					for (int counter2 = 1; counter2 < array.length - 1; counter2++) {
						
						System.out.print(GosterilenArray[counter][counter2] + "    ");
					}
					System.out.println("\n");
				} // OYUN ICINDEKI MAYIN HARITASINI GOSTERME BOLUMU
				
				System.out.println();
				
				System.out.print("x kordinatini giriniz : ");
				kordinatx = input.nextInt();
				System.out.print("y kordinatini giriniz : ");
				kordinaty = input.nextInt();
				
				kordinatx += 1;
				kordinaty += 1;// KORDINAT ALMA BOLUMU
				int sayac=1;
				while (GosterilenArray[kordinatx][kordinaty] != 0) {
					sayac++;
					System.out.println("AYNI KORDINATI "+ sayac +" KEZ GIRDINIZ TEKRAR DENEYIN : ");
					System.out.print("x kordinatini giriniz : ");
					kordinatx = input.nextInt();
					System.out.print("y kordinatini giriniz : ");
					kordinaty = input.nextInt();
					kordinatx += 1;
					kordinaty += 1;
				} // KORDINAT ALMA BOLUMU
				
				if (array[kordinatx][kordinaty] == 1) {
					System.out.println("\n\nGIRDIGINIZ KORDINATTA MAYIN VAR ELENDINIZ UZGUNUMM :( \n\n");
					
				} // ELENME DURUMU
				
			
				if (array[kordinatx][kordinaty] != 1) {
					KazanmaSayaci++;
					if (KazanmaSayaci == (satir*sutun) - (satir * sutun / 4) ) {
						System.out.println("TEBRIKLERR KAZANDINIZZZ. HICBIR MAYINA BASMADAN OYUNU TAMAMLADINIZ. ");
						break;
					}
				}
				
				if (array[kordinatx][kordinaty] == 0) {
					
					if (array[kordinatx + 1][kordinaty] == 1) {
						GosterilenArray[kordinatx][kordinaty] += 1;
					}
					if (array[kordinatx - 1][kordinaty] == 1) {
						GosterilenArray[kordinatx][kordinaty] += 1;
					}
					if (array[kordinatx][kordinaty + 1] == 1) {
						GosterilenArray[kordinatx][kordinaty] += 1;
					}
					if (array[kordinatx][kordinaty - 1] == 1) {
						GosterilenArray[kordinatx][kordinaty] += 1;
					}
					if (array[kordinatx + 1][kordinaty + 1] == 1) {
						GosterilenArray[kordinatx][kordinaty] += 1;
					}
					if (array[kordinatx - 1][kordinaty + 1] == 1) {
						GosterilenArray[kordinatx][kordinaty] += 1;
					}
					if (array[kordinatx - 1][kordinaty - 1] == 1) {
						GosterilenArray[kordinatx][kordinaty] += 1;
					}
					if (array[kordinatx + 1][kordinaty - 1] == 1) {
						GosterilenArray[kordinatx][kordinaty] += 1;
					}
					
				} // KONTROL BOLUMU
			
			
			if (array[kordinatx][kordinaty] == 0) {
				
				GosterilenArray[kordinatx][kordinaty]=-1;
				
				System.out.println("\n\nTEBRIKLER GIRDIGINIZ KORDINATTA MAYIN YOK YENI KORDINATLARI GIRINIZ\n\n");// DEVAM ETME DURUMU

			}
			
			
			
			}
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("\n\nGIREBILECEGINIZ SAYILARIN DISINA CIKTINIZ LUTFEN 0 (0 DAHIL) ILE "
					+ (array.length - 2) + " ARASINDA SAYI GIRINIZ \n\n");
			
		} // KULLANCIDAN KORDINATLARI ALMA VE KONTROL BOLUMU
		
		for (int counter = 1; counter < array.length - 1; counter++) {
			System.out.print("\t\t\t\t");
			for (int counter2 = 1; counter2 < array.length - 1; counter2++) {
				
				System.out.print(array[counter][counter2] + "  ");
			}
			System.out.println("\n");
		} // OYUN SONU MAYIN TARLASINI GOSTERME BOLUMU
		
		
		
		
	}

}
