package QUIZ2;
public class Node_19 {
   public  Node_19 prev;
    public Pesanan pesanan;
    public Pembeli pembeli;
    public Node_19 next;

    public Node_19(Node_19 prev,Pembeli pembeli,Node_19 next){
        this.prev = prev;
        this.pembeli = pembeli;
        this.next = next;
    }

}