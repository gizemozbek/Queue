package Queue;

public class QueueApp {
    public static void main(String[] args) {

        Queue theQueue = new Queue(5); //kuyruk kapasitesi 5'tir

        theQueue.insert(10);//kuyruga eleman ekleme
        theQueue.insert(20);
        theQueue.insert(30);
        theQueue.insert(40);

        theQueue.remove(); //eleman cikartma
        theQueue.remove();

        theQueue.insert(50); //kuyruga eleman ekleme
        theQueue.insert(60);

        while (!theQueue.isEmpty()) { //kuyrukta eleman var mi?
            long n = theQueue.remove();//kuyruk doluysa eleman cikarilir
            System.out.print(n+ " "); //cikarilan eleman n'e atanir ve ekrana yazdirilir
        }
        System.out.println("");
    }
}
