package QUIZ2;
public class Pesanan {
    public int kodePesanan;
    public String namaPesanan;
    public int harga;

   public Pesanan(int kodePesanan,String namaPesanan, int harga){
        this.kodePesanan = kodePesanan;
        this.namaPesanan = namaPesanan;
        this.harga = harga;
    }

    //test

//    public static void main(String[] args) {
//        Pesanan pesa = new Pesanan(1,"soto",1000);
//        System.out.println(pesa.kodePesanan);
//        System.out.println(pesa.namaPesanan);
//        System.out.println(pesa.harga);
//    }
}