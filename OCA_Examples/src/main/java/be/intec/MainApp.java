package be.intec;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Duke");
        String str1 = sb.toString();
        String str2 = str1;
        System.out.println(str1==str2);
        System.out.println(sb);
        System.out.println(str1);
        System.out.println(str2);
    }



//    public static void main(String[] args) {
//        int nums1[] = new int[3];
//        int nums2[] = {1, 2, 3, 4, 5};
//        nums1 = nums2;
//        for (int x : nums1) {
//            System.out.print(x +":");
//        }
//    }
}


//    private char var;
//    public static void main(String[] args) {
//        char var1 = 'a';
//        char var2 = var1;
//        var2 = 'e';
//        MainApp obj1 = new MainApp();
//        MainApp obj2 = obj1;
//        obj1.var = 'o';
//        obj2.var = 'i';
//        System.out.println(var1 + ", " + var2);
//        System.out.print(obj1.var + ", " + obj2.var);
//    }
//
//    }
//
//class Patient {
//    String name;
//
//    public Patient(String name) {
//        this.name = name;
//    }
//}


//        int numbers [];
//        numbers=new int [2];
//        numbers [0]=10;
//        numbers[1]=20;
//
//        numbers=new int[4];
//        numbers[2]=30;
//        numbers[3]=40;
//        for(int x:numbers){
//            System.out.println(" "+x);
//        }


//        String a="Hello World";
//        a=a.trim ();
//        System.out.println(a.indexOf(" "));



//        int[] arr={1,2,3,4};
//        int i=0;
//        do {
//            System.out.println(arr[i] + " ");
//            i++;
//        }while (i< arr.length-1);
//
//    }


//    static double area;
//    int b = 2, h = 3;


//


//    private static int i = 1;
//
//    public static void main(String argv[]) {
//        int i = 2;
//        MainApp s = new MainApp();
//        s.someMethod();
//    }
//
//    public static void someMethod() {
//        System.out.println(i);
//    }


//        int data[] = {2010, 2013, 2014, 2015, 2014};
//        int key = 2014;
//        int count = 0;
//        for (int e : data) {
//            if (e != key) {
//                count++;
//                continue;
//            }
//        }
//        System.out.println((count+"Found"));


//        String opt="true";
//        switch (opt){
//            case "true":
//                System.out.println("True");
//                break;
//            default:
//                System.out.println("*****");
//        }
//        System.out.println("Done");


//        double p, b, h;
//        if (area == 0) {
//            b = 3;
//            h = 4;
//            p = 0.5;
//            area = p * b * h;
//        }
//        System.out.println("Area is "+area);


//        String[] arr={"Hi","How","Are","You"};
//        List<String> arrList=new ArrayList<>(Arrays.asList(arr));
//        if(arrList.removeIf(s -> {
//            System.out.println(s);
//            return s.length()<=2;      })){
//            System.out.println("removed");
//        }


//        int nums1[]={1,2,3};
//        int nums2[]={1,2,3,4,5};
//        nums2=nums1;
//        for(int x:nums2){
//            System.out.println(x+":");
//        }


//        char colorCode='y';
//        int color=5;
//        switch(colorCode){
//            case 'r':
//                color=100;
//                break;
//            case 'b':
//                color=10;
//                break;
//            case 'y':
//                color=1;
//                break;
//        }
//        System.out.println(color);


//        int ans =10;
//        try {
//            int num = 10;
//            int div = 0;
//            ans = num / div;
//        } catch (ArithmeticException ae) {
//            ans = 0;
//        } catch (Exception e) {
//            System.out.println("Invalid calculation");
//        }
//        System.out.println("Answer=" + ans);
//    }


//    int x,y;
//    public MainApp(int x,int y){
//        initialize(x,y);
//    }
//    public void initialize(int x,int y){
//        x=x*x;
//        y=y*y;
//    }
//

//    public static void main(String[] args) {
//        int x=3,y=5;
//        MainApp obj=new MainApp(x,y);
//        System.out.println(x+" "+y);


//        LocalDateTime dt=LocalDateTime.of(2014,7,31,1,1);
//        dt.plusDays(30);
//        dt.plusMonths(1);
//        System.out.println(dt.format(DateTimeFormatter.ISO_DATE));


//        String str="Sweet Sweat";
//        String str2=str.trim().charAt(6)+" "+str.indexOf("Sw",1);
//        System.out.println(str2);
