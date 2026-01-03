public class OOPS{
    public static void main(String args[]){
        /*Pen p1 = new Pen();
        System.out.println(p1.getColor());
        p1.setColor("blue");
        System.out.println(p1.getColor());
        System.out.println(p1.getPrice());
        p1.setPrice(5);
        System.out.println(p1.getPrice());*/

        Student s1 = new Student("kushal");
    }
}

/*class Pen{
    String color = "red";
    int tip = 5;
    private int price = 6;

    //SETTERS
    void setColor(String newColor){
        color = newColor;
    }

    void setPrice(int newPrice){
        price = newPrice;
    }

    //GETTERS
    String getColor(){
        return this.color;
    }

    int getPrice(){
        return this.price;
    }
}*/

class Student {
    String name = "dimple";
    Student(){
        System.out.println("Constructor's Called...");
    }

    Student(String name){
        this.name = name;
        System.out.println(name);
    }
}