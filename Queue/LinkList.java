package Queue;
public class LinkList {

    private Link head; //ilk dugum
    private Link tail; //son dugum

    public LinkList() { //yeni bagli liste
        head = null; //baslangicta liste bos
        tail = null;
    }

    //head null ise liste bostur, true doner
    public boolean isEmpty() {
        return head == null;
    }

    //
    public void insertLast(long d) {
        Link newLink = new Link(d); //yeni dugum (newLink)
        //liste bossa newLink hem head hem taildir
        if (isEmpty()) {
            head = newLink;
        }
        //bos degilse tail'in nexti yeni dugumu isaret eder
        else {
            tail.next = newLink;
        }
        tail = newLink;
    }

    //Liste basindan eleman silme
    public long deleteFirst() {
        long temp = head.data;
        //listede bir dugum varsa liste tamamen bosalir
        if (head.next==null){
            tail = null;
        }
        //listede birden fazla dugum varsa
        head=head.next;
        return temp;//cikarilan dugumun verisi dondurulur
    }

    public void displayList(){
        Link current = head;//gecici degisken ile listeyi bastan dolasir
        while(current!=null){//current null olmadigi surece calisir
            current.displayLink();//su anki dugumu yazdirir
            current = current.next;//su anki dugumden bir sonrakine gecer
        }
    }
}
