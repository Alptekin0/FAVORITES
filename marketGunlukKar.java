package projeler3;

import java.util.Scanner;

public class marketGunlukKar {

	public static void main(String[] args) {
		
		/*
		SORU 12:
		
		BİR MARKET GÜNLÜK KARINI HESAĞLAMAK İSTİYOR.
		5 TANE ÜRÜN VE BUNLARIN ÜRÜN KODLARI BULUNUYOR.
		BU ÜRÜNLERİN KODU VE SATIŞ MİKTARI KULLANICIDAN ALINIYOR.
		
		EKRANA ÜRÜN ADI, SATILAN MİKTAR, ÖDENEN KDV, CİRO VE KAR DEĞERLERİ YAZILIYOR.
		  */
		
		int urunKodu = 0, satisFiyati, alisfiyati, Kdv, adet, satisMiktari;
		Scanner input = new Scanner(System.in);
		
		int yag=0, sut=0, kola=0, deterjan=0, parfum=0;
		
		int ciro, toplamKar, gelisFiyatları;
		
		
		System.err.println("URUN KODU VE SATIS MIKTARINA -1 DEGERINI GIRDIGINIZ ZAMAN PROGRAM SONLANACAKTIR.\n\n");
		
		
		while (urunKodu != -1) {
			
			
			System.out.print("URUN KODUNU GIRINIZ : ");
			urunKodu = input.nextInt();
			System.out.print("SATIS MIKTARINI GIRINIZ : ");
			satisMiktari = input.nextInt();
			
			switch (urunKodu) {
			case 123:
				yag = satisMiktari;
				break;
			case 145:
				sut = satisMiktari;
			    break;
					
			case 168:
				kola = satisMiktari;				
				break;
					
			case 136:
				deterjan = satisMiktari;
				break;
					
			case 751:
				parfum = satisMiktari;
				break;
					
			default:
				break;
			}			
			
		}
		
		System.err.println("\n\n----------------------------GUN SONU RAPORU----------------------------");
		
		System.out.println("URUN : YAG \t\tSATIS ADEDI : "+yag);
		System.out.println("URUN : SUT \t\tSATIS ADEDI : "+sut);
		System.out.println("URUN : KOLA  \t\tSATIS ADEDI : "+kola);
		System.out.println("URUN : DETERJAN \tSATIS ADEDI : "+deterjan);
		System.out.println("URUN : PARFUM \t\tSATIS ADEDI : "+parfum);
		
		
		ciro = yag * 32 + sut * 6 + kola * 5 + deterjan * 60 + parfum * 110 ;
		gelisFiyatları = yag * 24 + sut * 4 + kola * 3 + deterjan * 45 + parfum * 80 ;
		Kdv = (ciro * 8) / 100;
		toplamKar = (ciro - gelisFiyatları - Kdv);
		
		
		System.out.println("\n\nCIRO : "+ciro+" TL");
		System.out.println("ODENEN KDV : "+ Kdv+" TL");
		System.out.println("TOPLAM KAR : "+toplamKar+" TL");
		
		
	}
}
