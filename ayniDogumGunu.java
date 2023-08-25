package projeler3;

import java.util.Scanner;

public class ayniDogumGunu {

	public static void main(String[] args) {
		
		/*
		  
		   SORU 48:
		   
		   AYNI ODADA BULUNAN KİŞİLERİN DOĞUM GUNUNUN AYNI GÜN OLMA
		   OLASILIĞINI HESAPLAYAN PROGRAM.
		   
		   BUNUN İCİN BİR FORMÜL VAR. O FORMÜLÜ KULLANDIK.
		  
		 */
		
		double kisiSayisi, sonuc=1, formul , olasik;
		
		Scanner input = new Scanner(System.in);
		System.out.print("kisi sayisini giriniz : ");
		kisiSayisi = input.nextDouble();
		
		
		for (double counter = 365; counter > 366 - (kisiSayisi+1); counter--) {
			
			formul =(double)counter / 366 ;
			System.out.println(counter +"/ 366");
			sonuc = sonuc * formul ;			
			
		}
		olasik = 1-sonuc;
		System.out.printf("%.8f",olasik);
		
		
		
	}

}
