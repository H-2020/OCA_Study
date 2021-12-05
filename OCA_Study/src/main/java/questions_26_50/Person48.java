package questions_26_50;

public class Person48 {
    String name;
    int age=45;

    public Person48(String name){
       // this(); bos constructor yoksa boyle cagiramayiz
        setName(name);
    }

//    public Person48() {
//    }

    public Person48(String name, int age) {
        //this(name);
        setName(name);
        //Person( name);
        setAge(age);
    }
    public String show(){
        return name+" "+age;
    }

    public static void main(String[] args) {
        Person48 p1=new Person48("Jesse");
        Person48 p2=new Person48("Walter",58);
        System.out.println(p1.show());
        System.out.println(p2.show());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
