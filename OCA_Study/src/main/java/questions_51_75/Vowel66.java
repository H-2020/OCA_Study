package questions_51_75;

public class Vowel66 {
    private char var;

    public static void main(String[] args) {
        char var1 = 'a';
        char var2 = var1;
        var2 = 'e';
        Vowel66 obj1 = new Vowel66();
        Vowel66 obj2 = obj1;
        obj1.var = 'i';
        obj2.var = 'o';
        System.out.println(var1 + ", " + var2);
        System.out.print(obj1.var + "," + obj2.var);
    }
}