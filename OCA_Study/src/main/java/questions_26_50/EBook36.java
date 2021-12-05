package questions_26_50;

interface Readable{
    public void readBook();
    public void setBookMark();
}

abstract class Book implements Readable{
    public void readBook(){}
}

public class EBook36 extends Book{
    public void readBook(){}
    public void setBookMark(){}

    public static void main(String[] args) {
        Book book1=new EBook36();
        book1.readBook();
    }
}