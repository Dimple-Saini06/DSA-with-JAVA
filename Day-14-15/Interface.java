public class Interface{
    public static void main(String args[]){
        /*Bear c = new Bear();
        c.eat();
        c.teeth();*/

        /*X x = new X();
        System.out.println(x.schoolName);
        System.out.println(x.percentage(23,24,25));*/

        S1 s = new S1();
        Student s1 = new Student("kushal");
        System.out.println(s.color);

        /*X x = new X();*/

    }
}
/*interface Herbivors{
    void eat();
}

interface Carnivors{
    void eat();
    void teeth();
}

class Bear implements Herbivors,Carnivors{
    public void eat(){
        System.out.println("Eat plants And meats..");
    }
    public void teeth(){
        System.out.println("It have sharp teeth..");
    }
}*/

/*class Student{
    String name;
    int roll;

    static String schoolName = "NSN";
    static int percentage(int phy, int math, int chem){
        return (phy+chem+math)/3;
    }
}

class X extends Student{
    String name = "XYZ";
}*/

class Student {
    String color = "pink";
    Student(){
        System.out.println("S Constr..");
    }

    Student(String name){
        this();
        System.out.println(name);
    } 
}

class S1 extends Student {
    S1(){
        super();
        super.color = "brown";
        System.out.println("S11 Constr..");
    }
}

/*class Student{
    Student(){
        System.out.print("hi");
    }
    final double PI = 3.14;
    final int i = 34;
    final void nme(){
        System.out.print("kushal");
    } 
}

final class X extends Student{
    X(){
        System.out.print("hello");
    }
}*/