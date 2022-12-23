import java.util.Random;

/**
 * Odev2-SayiTahmin
 */
public class Odev2SayiTahmin {

    public static void main(String[] args) {
        int sayac=0;
        while(true){
        sayac++;
        Random rastgele = new Random();
        int rastgeleSayi= rastgele.nextInt(500);
        System.out.println(rastgeleSayi);
        if(rastgeleSayi>0 && rastgeleSayi<50)
        {
            System.out.println(sayac + ".Denemede değer bulundu");
            break;
        }


        }
        
        


        
    }

    
}