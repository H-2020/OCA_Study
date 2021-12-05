package questions_51_75;

public class Employee73 {
    public int salary;

    public static void main(String[] args) {
        Employee73 employee73=new Employee73();
        Manager manager=new Manager();
        Director director=new Director();
        employee73.salary=50_000;
        //employee73.budget=80_000;
        director.salary=10_00000;
        director.budget=20;
        director.stockOptions=500_000;
        manager.salary=50;
        manager.budget=120;
    }
}
class Manager extends Employee73{
    public  int budget;
}
class Director extends Manager{
    public int stockOptions;
}