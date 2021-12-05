package questions_1_25;

import java.io.IOException;

public class Test14 {
    public static void main(String[] args) throws Exception{

        X xobj=new X();
        xobj.printFileContent();
    }
}
class X{
    public void printFileContent() throws Exception{
        throw new IOException();
    }
}
