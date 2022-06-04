
package QUIZ2;
import org.w3c.dom.Node;

import java.util.Scanner;
public  class DoubleLinkedList_19 {
    public  static Scanner input;
    Node_19 head ;
    Pesanan pesanan;
    Pembeli pembeli;
    int size;

    DoubleLinkedList_19(){
        head = null;
        pembeli = null;
        this.size = 0;
        pesanan = null;


    }
    public  void tambahAntrian(Node_19 data){
        if (isEmpty()) {
            head = data;
            head.prev = null;
            head.next = null;
        }else {
            Node_19 current = head;
            while (current!=null){
                current = current.next;
            }
            current.prev.next = data;
            data.prev = current;
        }
        size++;
    }
public void cetakAntrian(){
        if(!isEmpty()){
            System.out.println("+++++++++++++++++++++");
            System.out.println("Daftar Antrian Resto Royal Delish");
            System.out.println("+++++++++++++++++++++");
            Node_19 current = head;
            while (current!=null){
                int no = 1;
                pembeli = current.pembeli;
                System.out.printf("|No\t\tNama Customer \t\t\t|no Hp\t\t|\n");
                System.out.printf("|%s\t\t%s\t\t\t|%s\t\t|\n",1,pembeli.nama,pembeli.noHp);
                no++;
                current = current.next;
            }
            System.out.println("total antrian : "+size);
        }else {
            System.out.println("Antrian masih kosong");
        }
}
public void hapusAntrianbyNoAntrian(int nomer){
        Node_19 current = head;
        if(current ==head){
            head = null;
        }else {
            while (current != null) {
                if (current.pesanan.kodePesanan == nomer) {
                    pesanan = current.pesanan;
                    pembeli = current.pembeli;
                    System.out.println(pembeli.nama + "telah Memesan Menu");
                    System.out.println("------------------------------");
                    System.out.println("Transaksi input pesanan");
                    System.out.println("------------------------------");
                    System.out.println("Nomot Pesanan : " + pesanan.kodePesanan);
                    System.out.println("Pesanan : " + pesanan.namaPesanan);
                    System.out.println("Harga : " + pesanan.harga);
                    System.out.println("+++++++++++++++++++++++++");
                    System.out.println("Daftar Pesanan Masuk Royal Delish");
                    System.out.println("+++++++++++++++++++++++++");
                    System.out.println("");
                    current.prev.next = current.next;
                    current = null;
                    break;
                }
                current = current.next;
            }

        }
}
public void laporanPesananByNama(){
    System.out.println("+++++++++++++++++++++++++");
    System.out.println("Daftar Antrian Masuk Royal Delish");
    System.out.println("+++++++++++++++++++++++++");
    Node_19 current = head;
    while (current!=null){
        pesanan = current.pesanan;
        pembeli = current.pembeli;
        String nama = current.pembeli.nama;
        for (Node_19 node = current.next;node!=null;node = node.next){

        }
    }

}
public void hitungTotalPendapatan(){
    System.out.println("+++++++++++++++++++++++++");
    System.out.println("Total Pendapatan");
    System.out.println("+++++++++++++++++++++++++");
    Node_19 current = head;
    int total = 0;
    while (current!=null){
        total += current.pesanan.harga;
        current = current.next;
    }
    System.out.println("Pendapatan Hari ini : "+total);

}
    boolean isEmpty(){
        return  head == null;
    }







}