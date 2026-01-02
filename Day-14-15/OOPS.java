public class OOPS{
    public static void main(String args[]){
        Pen p1 = new Pen();
        System.out.println(p1.color);
        p1.color = "blue";
        System.out.println(p1.color);
    }
}

class Pen{
    String color = "red";
    int tip = 5;

    void setColor(String newColor){
        color = newColor;
    }
}