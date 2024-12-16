
public class Renawan {

    public static void main(String[] args) {
        boolean gwsukaJihyo = true;
        boolean gwgksukaJisoo = false;

        boolean keduanyaBenar = gwsukaJihyo && gwgksukaJisoo;
        boolean salahsatukeduanyaBenar = gwsukaJihyo || gwgksukaJisoo;
        boolean gwgksukamereka = !gwsukaJihyo;
        
        System.out.println();
        System.out.println("Jujur gw suka sama si Jihyo: " + gwsukaJihyo);
        System.out.println();
        System.out.println("Gw gk suka si Jisoo,karena dia terlalu manja: " + gwgksukaJisoo);
        System.out.println();
        System.out.println("Kayaknya mereka berdua bukan tipe gw deh: " + keduanyaBenar);
        System.out.println();
        System.out.println("Mau siapapun jodoh gw,asalkan antara mereka berdua,gw mah ikhlas aja hehe: " + salahsatukeduanyaBenar);
        System.out.println();
        System.out.println("Masa iya mereka berdua mau sama gw: " + gwgksukamereka);
        System.out.println();

    }
}
