package questions_51_75;

import java.util.ArrayList;
import java.util.List;

class Patient{
    String name;
    public Patient(String name){
        this.name = name;
    }
}

public class Test60 {
    public static void main(String[] args) {
        List ps = new ArrayList();
        Patient p2 = new Patient("Mike");
        ps.add(p2);
        int f = ps.indexOf(p2);


        //int f= ps.indexOf(Patient("Mike")); //indexof icinde object olmasi gerekiyor


//        int f= ps.indexOf( new Patient ("mike"));
//        System.out.println(f); //sonuc -1 olur

//        Patient p=new Patient("Mike");
//        ps.add(p);
//        int f=ps.indexOf(p);
//        System.out.println(f);
        if (f >= 0){
            System.out.println("Mike Found");
        }
    }
}