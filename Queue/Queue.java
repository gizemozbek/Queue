package Queue;

public class Queue {
    private int maxSize;//kuyrukta ne kadar eleman tutulabilecegini belirler.
    private long[]queueArray;//kuyruktaki elemanlari tutan dizi

    //kuyrugun basındaki (ilk eklenen)elemanin dizideki indisini tutar-front
    //ilk eklenen elemani bulmak ve cikartma islemleri icin tanimliyoruz
    private int front;
    //kuyrugun sonundaki (en son eklenen )elemanin indisi-rear
    //yeni elemanlarin nereye eklenecegini takip etmek icin tanimliyoruz
    private int rear;
    private int elemanSayisi;//kuyruktaki toplam eleman sayisini tutar

    public Queue(int s){
        maxSize = s;
        queueArray = new long[maxSize]; //Kuyrugun elemanlarini tutacak diziyi oluşturur.
        //baslangicta kuyruk bos oldugundan
        front=0; //ilk kuyruk başı (front) 0'dır.
        rear=-1; //Kuyruk bosken rear degeri -1'dir. Kuyruga hic eleman eklenmemis
        elemanSayisi=0;
    }

    public void insert(long d) {
        //rear kuyrugun sonundaysa rear sifirlanir

        if(rear==maxSize -1){
            rear=-1;
        }
        queueArray[++rear]=d; //yeni eleman, rear artirilarak eklenir
        elemanSayisi++; //eleman sayisi artirilir
        //dairesel yapidan dolayi dizinin sonunda yer kalmadiginda bastan eklemeye devam ediyoruz
    }
    public long remove() //kuyruktan eleman cikartma
    {
        //kuyrugun onundeki eleman alinir
        //cikartilan eleman temp'e atilir
        //sonraki elemana gecilir
        long temp = queueArray[front++];//front'un isaret ettigi eleman temp'e atanir
        if (front == maxSize) {
            front = 0; //front kuyrugun sonuna ulasirsa sifirlanir
        }
        elemanSayisi--; //eleman sayisi azaltilir
        return temp; //cikartilan eleman dondurulur
    }
        //peekFront() kuyrugun basındaki elemani cikarmadan görmek icin kullanilir
        public long peekFront(){
        return queueArray[front];
        }

        //kuyruk bos mu degil mi?
        //kuyruktaki toplam eleman sayisini kontrol eder. Eger elemanSayisi==0 ise kuyruk bostur
        //bos bir kuyruga eleman cikartma islemi yapmayi onlemek icin kullanilir
        public boolean isEmpty(){
        return elemanSayisi==0;
        }

        //kuyruk dolu mu?
        //kuyruk doluysa yeni bir eleman eklenmemesini belirlemek icin kullanilir
        public boolean isFull(){
        return elemanSayisi==maxSize;
        }

        //kuyruktaki mevcut eleman sayisini dondurur
        //kuyruk boyutunu ogrenmek icin kullanilir
        public int size(){
        return elemanSayisi;
        }
    }


