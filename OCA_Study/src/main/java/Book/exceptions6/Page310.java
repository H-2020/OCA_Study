package Book.exceptions6;

public class Page310 {


    class AnimalsOutForAWalk extends RuntimeException {
    }

    class ExhibitClosed extends RuntimeException {
    }

    class ExhibitClosedForLunch extends ExhibitClosed {
    }

    public void visitPorcupine() {
        try {
            seeAnimal();
        } catch (AnimalsOutForAWalk e) {// first catch block
            System.out.print("try back later");
        } catch (ExhibitClosed e) {// second catch block
            System.out.print("not today");
        }
    }

    public void seeAnimal() {
    }

    public static void main(String[] args) {
         Page310 page310=new Page310();
         page310.visitPorcupine();
    }


}
