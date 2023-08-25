package projeler;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class KelimeKarsilastirma {
	
	public static void main(String[] args) throws FileNotFoundException {
		
	// GİRİLEN İKİ METİNİN CUMLELERİNİ KARSİLASTİRİP AYNI OLAN CUMLELERIN ORANINI VEREN UYGULAMA
		
		File metin1 = new File("C:\\Users\\MedBim\\Desktop\\metin.txt");
		File metin2 = new File("C:\\Users\\MedBim\\Desktop\\metin2.txt");
		
		Scanner input1 = new Scanner(metin1);
		Scanner input2 = new Scanner(metin2);
		
		ArrayList<String> cumle = new ArrayList<>();
		ArrayList<String> cumle2 = new ArrayList<>();
		
		// System.out.println("metin 1 : ");
		
		int KopyaSayacı = 0, metin1Uzunluk = 0, metin2Uzunluk = 0;
		int KopyaOrani = 0;
		int Metin2yiTekSayma = 0 ;
		
		while (input1.hasNext()) {
			
			String string = input1.next().toLowerCase();
			int StringUzunlugu = string.length();
			cumle.add(string);
			if (string.substring(StringUzunlugu - 1).equals(".")) {
				
				metin1Uzunluk++;
				// System.out.println(cumle);
				while (input2.hasNext()) {
					
					String string2 = input2.next().toLowerCase();
					int stringUzunlugu2 = string2.length();
					cumle2.add(string2);
					if (string2.substring(stringUzunlugu2 - 1).equals(".")) {
						
						if (Metin2yiTekSayma<1) {
							metin2Uzunluk++;
						}
						
						 System.out.println(cumle+" ---> 1.METIN");
						 System.out.println(cumle2+" ---> 2.METIN");
						
						if (cumle.equals(cumle2)) {
							 System.out.println("**AYNI OLDU**");
							cumle2.clear();
							KopyaSayacı++;
						}
						 System.out.println();
						cumle2.clear();
					}
				}
				Metin2yiTekSayma++;
				cumle.clear();
				input2 = new Scanner(metin2);
			}
		}
		
		//System.out.println(metin2Uzunluk);
		
		
		if (metin1Uzunluk <= metin2Uzunluk) {
			KopyaOrani = (KopyaSayacı * 100) / metin1Uzunluk;
			
		} else if (metin1Uzunluk > metin2Uzunluk) {
			KopyaOrani = (KopyaSayacı * 100) / metin2Uzunluk;
		}
		
		//System.out.println(KopyaSayacı);
		System.out.println("KOPYA ORANI =%" + KopyaOrani);
		
	}
}
