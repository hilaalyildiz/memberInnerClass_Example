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
    }
}