package QUIZ2;
import java.util.Scanner;
public class MainApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DoubleLinkedList_19 doubleLinkedList_19 = new DoubleLinkedList_19();
        System.out.println("=======QUIZ2 PRAKTIKUM ASD TI-1G=======");
        System.out.println("dibuat oleh : Muhamad Rafi Prabowo");
        System.out.println("NIM : 2141720239");
        System.out.println("Absen : 20d");
        System.out.println("=======================================");
        System.out.println("Sistem antrian Resto Royal Delish");

        while (true){
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. hapus Antrian");
            System.out.println("4. Laporan Pengurutan pesanan by nama");
            System.out.println("5. Hiotung total Pendapatan");
            System.out.println("6. Keluar");
            System.out.print("Pilih : ");
            int no = input.nextInt();
            if(no == 1 ){
                System.out.println("----------------------");
                System.out.println("Masukkan Data Pembeli");
                System.out.println("----------------------");
                System.out.print("Nomor Antrian : ");
                System.out.print(doubleLinkedList_19.size);
                System.out.println("Nama Customer : ");
                String nama = input.nextLine();
                System.out.println("Nomor hp : ");
                String noHp = input.nextLine();
                Pembeli pembeli = new Pembeli(nama,noHp);
                doubleLinkedList_19.tambahAntrian(new Node_19(null,pembeli,null));
            }
        }

    }
}
