package questions_1_25;

interface Downloadable{
    public void download();
}

interface Readable extends Downloadable{
    public void readBook();
}

abstract class Book implements Readable{
    public void readBook(){
        System.out.println("Read Book");
    }
}

public class Ebook25 extends Book{
    public void readBook(){
        System.out.println("Read E-Book");
    }
    @Override
    public void download() {

    }

    public static void main(String[] args) {
        Book book1=new Ebook25();
        book1.readBook();
    }

}
