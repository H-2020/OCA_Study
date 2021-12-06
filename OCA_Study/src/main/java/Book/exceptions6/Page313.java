package Book.exceptions6;

import java.io.FileReader;
import java.io.IOException;

public class Page313 {


    public String exceptions() {
        String result = "";
        String v = null;
        try {
            try {
                result += "before";
                //System.out.println(result);
                v.length();
                //result += "after";
                System.out.println(result);
            } catch (NullPointerException e) {
                result += "catch";
                //System.out.println(result);
                throw new RuntimeException();
            } finally {
                result += "finally";
               // System.out.println(result);
                throw new Exception();
            }
        } catch (Exception e) {
            result += "done";
            System.out.println(result);
        }
        return result;
    }
    public void print(){
        System.out.println();
    }

    public static void main(String[] args) {
        Page313 page313=new Page313();
        page313.exceptions();
    }
}

