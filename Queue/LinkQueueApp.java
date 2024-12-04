package Queue;

public class LinkQueueApp {
    public static void main(String[] args) {
        //LinkQueue sınıfının nesnesi theQueue olusturuluyor
        LinkQueue theQueue = new LinkQueue();

        theQueue.insert(20);//kuyruk sonuna eleman eklenir
        theQueue.insert(40);

        theQueue.displayQueue();//kuyruktaki mevcut elemanlar yazdirilir

        theQueue.insert(60);
        theQueue.insert(80);

        theQueue.displayQueue();

        theQueue.remove();//kuyrugun basindaki elemanlar cikarilir
        theQueue.remove();//(ilk eklenen ilk cikar prensibi)

        theQueue.displayQueue();
    }
}
