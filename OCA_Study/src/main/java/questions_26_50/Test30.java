package questions_26_50;

public class Test30 {

    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student();
        Student s3=new Student();
        s1=s3;
        s3=s2;
        s2=null;//C. After line 11, one object is eligible for garbage collection.
    }
}
class Student{
    String name;
    int age;
}