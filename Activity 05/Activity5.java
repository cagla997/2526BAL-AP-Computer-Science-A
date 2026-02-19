package kantin;
import java.util.Scanner;
import java.util.ArrayList;

public class Activity5 {
	public static void main(String[] args) {
		
		Scanner oku = new Scanner(System.in);
		
		int URUN_SAYISI = 5;
		int GUN_SAYISI = 5;
		
		String[] urunisim = new String[URUN_SAYISI];
		double[] urunfiyat = new double[URUN_SAYISI];
		int[] urunmiktar = new int[URUN_SAYISI];
		
		double toplam = 0;
		double total = 0;
		
		System.out.println("Enter " + URUN_SAYISI + " product names");
		for (int i= 0; i< URUN_SAYISI; i++) {
			System.out.print((i+1) + ". Product Name:");
			urunisim[i] = oku.nextLine();
		}
		
		System.out.println("\nEnter the unit prices of the products");
		for (int i= 0; i< URUN_SAYISI; i++) {
			System.out.print(urunisim[i] + " price:");
			urunfiyat[i] = oku.nextDouble();
		}
		
		System.out.println("\nEnter the starting stock of the products");
		for (int i= 0; i< URUN_SAYISI; i++) {
			System.out.print(urunisim[i] + " stock quantity:");
			urunmiktar[i] = oku.nextInt();
		}
		
		
		for (int gun = 1; gun <= GUN_SAYISI; gun++) {
			int[] gunluksatis = new int[URUN_SAYISI];
            ArrayList<String> satilanlar = new ArrayList<>();

            System.out.println("\nDay " + gun + " Sales Entry");

            while (true) {
                System.out.print("Product name (to write 'finish'): ");
                String urun = oku.nextLine();

                if (urun.equals("finish")) {
                    break;
                }
                ArrayList<String> liste = new ArrayList<>();
                int index = -1;
                for (int i = 0; i < urunisim.length; i++) {
                    if (urunisim[i].equals(urun)) {
                        index = i;
                        break;
                    }
                }

                if (index == -1) {
                    System.out.println("!!! Invalid product name!");
                    continue;
                }
	             System.out.print("Quantity sold: ");
	             int miktar = oku.nextInt();
	             oku.nextLine();
	             if (miktar <= 0) {
	                    System.out.println("!!! Invalid quantity!");
	                    //continue;
	                }
	             else if (miktar > urunmiktar[index]) {
	                    System.out.println("!!! Insufficient stock!");
	                    //continue;
	                }
	             else {
	            	 toplam += miktar * urunfiyat[index];
	            	 urunmiktar[index] -= miktar;
		             gunluksatis[index] += miktar;
	             }
	             
	             
	             if (!satilanlar.contains(urunisim[index])) {
	                    satilanlar.add(urunisim[index]);
	                }

	                System.out.println(">>> Total Revenue: " + toplam + " TL");
             }
            System.out.println("\n<<<Day " + gun + " Sales Summary>>>");

            boolean satis = false;
            for (int i = 0; i < URUN_SAYISI; i++) {
                if (gunluksatis[i] > 0) {
                    System.out.println(urunisim[i] + ": " + gunluksatis[i] + " sold");
                    satis = true;
                }
            }

            if (!satis) {
                System.out.println("No sales made!");
            }
            
            System.out.println("\nEnd of Day Stock Report");
            for (int i = 0; i < URUN_SAYISI; i++) {
                System.out.print(urunisim[i] + ": ");
                for (int j = 0; j < urunmiktar[i]; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            
            
            

	        System.out.println("\n>>>Total Revenue");
	        System.out.println(toplam + " TL");
	        
	        System.out.println("\nMessage:");
            System.out.println("Have a good night");
            total += toplam;
            toplam = 0;
   
	             }
		
  	System.out.println("\nEND OF DAY 5 CANTEEN STATUS");
    System.out.println("STOCK");

    for (int i = 0; i < URUN_SAYISI; i++) {
        System.out.print(urunisim[i] + ": ");
        for (int j = 0; j < urunmiktar[i]; j++) {
            System.out.print("*");
        }
        System.out.println();
        
    }
    System.out.println("TOTAL REVENUE");
    System.out.println(total + " TL");
    
	}
}
