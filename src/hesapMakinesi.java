public class hesapMakinesi {
    int sayi=0;

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
}
