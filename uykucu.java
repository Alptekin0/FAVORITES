package projeler3;

public class uykucu {

	public static void main(String[] args) {

		/*
		     
		     SORU 43 : 
		     
		      BİR ÖĞRETMEN UYKUCU ÖĞRENCİSİNE 26/65 KESİRİNİ SADELEŞTİRMESİ İSTER. ÖĞRENCİ 26 6'SI İLE 65'İN 6'SINI SADELEŞTİRİR.
		      VE CEVABI 2/5 BUUR.
		      
		      MATEMATİKTE BÖYLE BİR KURAL YOKTUR FAKAT BUNA UYAN BAZI SAYILAR VARDIR.
		      PAYIN BİRLER BASAMAĞI İLE PAYDANIN ONLAR BASAMAĞI SADELEŞTİRİLDİĞİNDE GERÇEK SONUÇ İLE AYNI ÇIKIYORSA
		      BUNA UYKUCU YÖNTEMİ (YÖNTEMİN İSMİNİ BEN KOYDUM :)) ) DENİR.
		      
		      BU UYGULAMADA 2 BASAMAKLI UYKUCU YÖNTEMİNE UYAN SAYILARI BULDUK.
		      
		 */
		
		
		double gercekDeger, onlarBasamagıPay, birlerBasamagıPayda, uykucuYontemi;

		for (int pay = 10; pay < 100; pay++) {
			for (int payda = (pay % 10) * 10 + 1; payda < ((pay % 10) * 10) + 10; payda++) {
				
				int tempPay = pay;
				
				gercekDeger =(double) pay / payda;
				onlarBasamagıPay = tempPay / 10;
				birlerBasamagıPayda = payda % 10;
				uykucuYontemi = onlarBasamagıPay / birlerBasamagıPayda ;
				
				if (gercekDeger == uykucuYontemi) {
					System.out.println(pay+"/"+payda);
				} 
				
				
			}
		}
		

	}

}
