package Queue;
public class LinkQueue {
    private LinkList theList;
    //yeni bagli liste olusturulur
    //kuyruk bu bagli liste uzerinde calisir
    public LinkQueue() {
        theList = new LinkList();
    }

    //kuyrukta eleman var mi? bagli liste bossa kuyruk da bostur
    public boolean isEmpty() {
        return theList.isEmpty();
    }

    //bagli listenin sonuna eleman eklenir
    public void insert(long d){
        theList.insertLast(d);
    }

    //bagli listenin basından eleman cikarilir
    //cikarilan elemanin degeri dondurulur
    //cikarilan eleman kuyrugun basindaki (ilk giren) elemandir
    public long remove(){
        return theList.deleteFirst();
    }

    public void displayQueue(){ //kuyruk goruntuleme
        System.out.print("Kuyruk (front --> rear):");
        theList.displayList();
    }
}
