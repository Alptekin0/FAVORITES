package projeler;

public class SifreGucuBelirliyiciClass {

	String sifre;
	String[] buyukHarfler;
	String[] kucukHarfler;
	String[] sayilar;
	String[] karakterler;
	
	
	
	public void kontrol(String sifre) {
		Boolean buyukHarf = false, kucukHarf = false, sayi = false, karakter = false;
		for (int counter = sifre.length() - 1; counter >= 0; counter--) {
			for (int counter2 = 0; counter2 < buyukHarfler.length; counter2++) {

				if (sifre.substring(counter, counter + 1).equals(buyukHarfler[counter2])) {
					buyukHarf = true;
				}
				if (sifre.substring(counter, counter + 1).equals(kucukHarfler[counter2])) {
					kucukHarf = true;
				}
				if (counter2 < sayilar.length && sifre.substring(counter, counter + 1).equals(sayilar[counter2])) {
					sayi = true;
				}
				if (counter2 < karakterler.length
						&& sifre.substring(counter, counter + 1).equals(karakterler[counter2])) {
					karakter = true;
				}
			}
		}

		if (buyukHarf == true && kucukHarf == true && sayi == true && karakter == true) {
			System.err.println("SIFRE COK GUCLU");
		}

		if (buyukHarf == true && kucukHarf == true && sayi == true && karakter == false) {
			System.err.println("SIFRE GUCLU");
		}
		if (buyukHarf == true && kucukHarf == true && sayi == false && karakter == true) {
			System.err.println("SIFRE GUCLU");
		}
		if (buyukHarf == true && kucukHarf == false && sayi == true && karakter == true) {
			System.err.println("SIFRE GUCLU");
		}
		if (buyukHarf == false && kucukHarf == true && sayi == true && karakter == true) {
			System.err.println("SIFRE GUCLU");
		}

		if (buyukHarf == true && kucukHarf == true && sayi == false && karakter == false) {
			System.err.println("SIFRE ZAYIF");
		}
		if (buyukHarf == false && kucukHarf == false && sayi == true && karakter == true) {
			System.err.println("SIFRE ZAYIF");
		}
		if (buyukHarf == false && kucukHarf == true && sayi == false && karakter == true) {
			System.err.println("SIFRE ZAYIF");
		}
		if (buyukHarf == false && kucukHarf == true && sayi == true && karakter == false) {
			System.err.println("SIFRE ZAYIF");
		}

		if (buyukHarf == true && kucukHarf == false && sayi == false && karakter == false) {
			System.err.println("SIFRE COK ZAYIF");
		}
		if (buyukHarf == false && kucukHarf == true && sayi == false && karakter == false) {
			System.err.println("SIFRE COK ZAYIF");
		}
		if (buyukHarf == false && kucukHarf == false && sayi == true && karakter == false) {
			System.err.println("SIFRE COK ZAYIF");
		}
		if (buyukHarf == true && kucukHarf == false && sayi == false && karakter == true) {
			System.err.println("SIFRE COK ZAYIF");
		}

	}

}
