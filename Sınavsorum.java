package sınavsorum;
public class Sınavsorum {
    
    class Ortalama{
        private int s1;
        private int s2;
        private int s3;
        private int s4;
        public double ortalama;
    Ortalama(){
    }
    public Ortalama(int a, int b,int c, int d){
       s1 = a;
       s2 = b;
       s3 = c;
       s4 = d;
        }
    public double HesaplaAritmetikOrt(int s1, int s2, int s3, int s4){
        int toplam = s1+s2+s3+s4;
        ortalama = toplam / 4;
        return ortalama;
        }
    public double HesaplaAritmetikOrt(int s1, int s2){
    int toplam = s1+s2;
    ortalama = toplam / 2;
    return ortalama;
    }
    private double HesaplaHarmonikOrt(int s1, int s2, int s3, int s4){
       double harmoniko = 4 / (1/s1 + 1/s2 + 1/s3 + 1/s4);
       return harmoniko;
    }
    private double HesaplaGeometrikOrt(int s1, int s2, int s3, int s4){
        double geometrikort = (s1*s2*s3*s4)^(1/4);
        return geometrikort;
    }
    class StandartSapma extends Ortalama {
        public int ortalama;
        public int toplam;
        public boolean stoplamcift;
        public boolean stoplamtek;
        public double HesaplaStandartSap(int s1, int s2, int s3, int s4 ){
            double stans = (((s1-ortalama)^2+(s2-ortalama)^2+(s3-ortalama)^2+(s4-ortalama)^2)^1/2)/3;
            return stans;
            }
        public boolean ToplamCiftKontrol(int s1, int s2, int s3, int s4 ){
            toplam = s1+s2+s3+s4;
            if(toplam/2 == 1){
                return false;
            }
            if(toplam/2 == 0){
                return true;
            }
            return stoplamcift;
        }
        }
    }
    public static void main(String[] args) {
        }
 
}