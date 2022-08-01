public class hesapMakinesi {
    int sayi=0;

    public String bolmeYap(int sayi1, int sayi2){
        class Bolme {
            public String bolme(int i, int j) {
                if(j==0){
                    System.out.println("Bolen sifir olamaz");
                    return "";
                }else {
                    int sonuc = i/j;
                    return String.valueOf(sonuc);
                }
            }
        }

        Bolme b = new Bolme();
        String sonuc = b.bolme(sayi1,sayi2);
        return sonuc;
    }

    public int carp(int i,int j){
        Carpma carpma = new Carpma();
        int carpim = carpma.carpma(i,j);
        return carpim;
    }
    public class Topla{
        public int topla(int i, int j){
            return i+j;
        }
    }

    class Cikar {
        public int cikar(int i, int j) {
            return i - j;
        }
    }

    private class Carpma {
        public int carpma(int i, int j) {
            return i*j;
        }
    }

    /*
    static {
        class Bolme {
            public String bolme(int i, int j) {
                if(j==0){
                    System.out.println("Bolen sifir olamaz");
                    return "";
                }else {
                    int sonuc = i/j;
                    return String.valueOf(sonuc);
                }
            }
        }
    }*/
}
