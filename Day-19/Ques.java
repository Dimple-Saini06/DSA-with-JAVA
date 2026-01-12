import java.util.*;

public class Ques{
    /*public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter real and imginary value of first complex number : ");
        int r1 = sc.nextInt();
        int i1 = sc.nextInt();
        Complex c1 = new Complex(r1,i1);

        System.out.println("enter real and imginary value of second complex number : ");
        int r2 = sc.nextInt();
        int i2 = sc.nextInt();
        Complex c2 = new Complex(r2,i2);

        Complex sum = c1.add(c2);
        Complex diff = c1.subtract(c2);
        Complex mul = c1.multiply(c2);

        System.out.println("output is : ");
        sum.printComplex();
        diff.printComplex();
        mul.printComplex();
    }*/
    public static void Toh(int n, char A, char B, char C){
        if(n==0){
            return;
        }

        Toh(n-1, A,C,B);
        System.out.println(A + " TO " + C);
        Toh(n-1,B,A,C);
    }
    public static void main(String args[]){
        Toh(3,'A','B','C');
    }

}

/*class Complex {
    int real, img;

    Complex(int r, int i){
        this.real = r;
        this.img = i;
    }

    public Complex add(Complex c){
        return new Complex(this.real + c.real, this.img + c.img);
    }

    public Complex subtract(Complex c){
        return new Complex(this.real - c.real, this.img - c.img);
    }

    public Complex multiply(Complex c){
        return new Complex((this.real * c.real) - (this.img * c.img), (this.real * c.img) + (this.img * c.real));
    }

    public void printComplex(){
        if(img >= 0){
            System.out.println(real + "+" + img + "i");
        }else{
            System.out.println(real + "+" + (-img) + "i");
        }
    }
}*/

