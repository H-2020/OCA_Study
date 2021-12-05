package questions_26_50;

public class Rectangle26{
    private double length,height,area;

    public void setLength(double len){
        this.length = len;
    }

    public void setHeight(double hei){
        this.height = hei;
    }

    public double getArea(){
        return length * height;
    }

    public static void main(String[] args){
        Rectangle26 rect = new Rectangle26();
        rect.setLength(10.0);
        rect.setHeight(10.0);
        System.out.println(rect.getArea());
    }
}