import java.util.Scanner;


public class Odev1ATM {
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
         
    int bakiye = 8500;
     
    System.out.println("Bakiyeniz = " + bakiye);
    System.out.println("\nİSLEMLER\n");
    System.out.println("1. Para Çekme");
    System.out.println("2. Para Yatirma");
    System.out.println("3. Bakiye Ogrenme");
    System.out.println("4. Cikis");
     
    System.out.print("\nİsleminizi Seciniz: ");
    int islem = scan.nextInt();
     
    switch(islem) {
    case 1:
        System.out.println("Bakiyeniz = " + bakiye);
        System.out.print("Çekmek istediğiniz tutari giriniz: ");
        int tutar = scan.nextInt();
        if(tutar > bakiye) {
            System.out.print("Yetersiz bakiye. Tekrar giriniz: ");
            tutar = scan.nextInt();
        }
        bakiye -= tutar;
        System.out.println("Yeni bakiyeniz = " + bakiye);
        break;
    case 2:
        System.out.println("Bakiyeniz = " + bakiye);
        System.out.print("Yatirmak istediğiniz tutari giriniz: ");
        tutar = scan.nextInt();
        bakiye += tutar;
        System.out.println("Yeni bakiyeniz = " + bakiye);
        break;
    case 3:
        System.out.println("Bakiyeniz = " + bakiye);
        break;
    case 4:
        System.out.println("Cikis gerceklesti.");
    default:
        System.out.println("Yanlis islem. Lütfen Tekrar Deneyiniz.");
    
}
}
    
}
