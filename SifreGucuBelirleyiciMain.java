package projeler;

import java.util.Scanner;

public class SifreGucuBelirleyiciMain {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String[] BuyukHarfler = { "A", "B", "C", "Ç", "D", "E", "F", "G", "Ğ", "H", "I", "İ", "J", "K", "L", "M", "N",
				"O", "Ö", "P", "R", "S", "Ş", "T", "U", "Ü", "V", "Y", "Z", "Q", "W", "X" };

		String[] kucukHarfler = new String[BuyukHarfler.length];

		for (int counter = 0; counter < BuyukHarfler.length; counter++) {
			kucukHarfler[counter] = BuyukHarfler[counter].toLowerCase();
		}
		String[] Sayilar = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "0" };

		String[] Karakterler = { "#", ">", "<", "£", "$", "½", "&", "{", "[", "]", ",", "}", ",", ".", "é", "!", "/",
				"(", "%", ")", "=", "?", "_", "*", "@", "€", "ß", "æ" };

		System.out.print("LUTFEN SIFRENIZI GIRINIZ : ");
		String SIFRE = input.next();

		SifreGucuBelirliyiciClass kontrol = new SifreGucuBelirliyiciClass();
		kontrol.sifre = SIFRE;
		kontrol.buyukHarfler = BuyukHarfler;
		kontrol.karakterler = Karakterler;
		kontrol.sayilar = Sayilar;
		kontrol.kucukHarfler = kucukHarfler;
		kontrol.kontrol(SIFRE);

	}

}
