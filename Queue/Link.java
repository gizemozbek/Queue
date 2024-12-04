package Queue;

public class Link {
    public long data; //dugumde saklanacak veri elemani
    public Link next; //bir sonraki dugumu temsil eder

    //Link nesnesi olusturuyoruz
    //long d degeri,, data degiskenine atanir
    public Link(long d) {
        data = d;
    }

    //data degerini ekrana yazdirir
    public void displayLink(){
        System.out.print(data + " ");
    }
}
