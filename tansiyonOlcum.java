package projeler3;

import java.util.Scanner;

public class tansiyonOlcum {

	public static void main(String[] args) {
		
		/*   
		  SORU 38 : 
		     
		     GİRLEN KUCUK VE BUYUK TANSIYONLARI ALIP 0 GİRİLENE KADAR DEVAM EDİYOR.
		     TANSİYON DEGERLERİNİ DUSUK YUKSEK VE ORTA DİYE YAZDIRIP EN SONDA KAC TANE DUSUK ORTA VE YUKSEK CIKTIGINI
		     GÖSTERİYOR.
		*/
		
		
		
		Scanner scan = new Scanner(System.in);
		
		int buyukTansiyon ;
		int kucukTansiyon ;
		int BD=0, BN=0, BY=0 ,KD=0, KN=0, KY=0; 
		
		
		System.out.println("TANSIYON OLCUM PROGRAMINA HOSGELDINIZ \n(DURDURMAK ICIN HERHANGI BIR DEGERE SIFIR GIRINIZ)");
		System.out.println("---------------------------------------------------------------------------------------------------\n");
		
		do {
			
			System.out.print("\n\nTansiyon degerlerini giriniz (Buyuk ve Kucuk): ");
			buyukTansiyon = scan.nextInt();
			kucukTansiyon = scan.nextInt();
			
			if (buyukTansiyon >= 140) {
				System.out.print("Buyuk yuksek");
				BY++;
			}
			else if (buyukTansiyon<140 && buyukTansiyon >120) {
				System.out.print("Buyuk normal");
				BN++;
			}
			else if (buyukTansiyon<=120 && buyukTansiyon >0) {
				System.out.print("Buyuk dusuk");
				BD++;
			}
			else if(buyukTansiyon<0) {
				System.out.print("Hatali deger girdiniz  ");
			}
			
			if (kucukTansiyon >= 90) {
				System.out.print("   Kucuk yuksek");
				KY++;
			}
			else if (kucukTansiyon<90 && kucukTansiyon >70) {
				System.out.print("   Kucuk normal");
				KN++;
			}
			else if (kucukTansiyon<=70 && kucukTansiyon >0) {
				System.out.print("   Kucuk dusuk");
				KD++;
			}
			else if(kucukTansiyon<0) {
				System.out.print("Hatali deger girdiniz");
			}
			
			
			
			
		} while (buyukTansiyon !=0 && kucukTansiyon !=0);
		
		System.out.println("\n---------------------------------------------------------------------------------------------------");

		
		
		System.out.println("PROGRAM SONA ERDI.");
		
		System.out.printf("BUYUK (NORMAL = %d , YUKSEK = %d , DUSUK = %d  ADET)",BN,BY,BD);
		System.out.printf("\nKUCUK (NORMAL = %d , YUKSEK = %d , DUSUK = %d  ADET)",KN,KY,KD);
		System.out.print("  TANSIYON DEGERLERI GIRILMISTIR.");

		
		
		
	}

}
