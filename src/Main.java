import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args){
        hesapMakinesi hm = new hesapMakinesi();

        hesapMakinesi.Topla toplayici = hm.new Topla();
        int toplam = toplayici.topla(5,6);
        System.out.println("Toplam : "+ toplam);

        hesapMakinesi.Cikar cikarici = hm.new Cikar();
        int fark = cikarici.cikar(9,4);
        System.out.println("Fark : "+ fark);

        int carpim = hm.carp(5,6);
        System.out.println("Carpim : "+carpim);

        String bolum = hm.bolmeYap(10,2);
        if(!bolum.equals("")){
            System.out.println("Bolum : "+bolum);
        }

        hesapMakinesi hm2 = new hesapMakinesi(){
            @Override
            public int carp(int i, int j) {
                System.out.println("Anonymous inner class ile carpma fonksiyonu");
                return i*j;
            }
        };
    }
}
