package OOP;/* Write a program that consists of three classes, A, B, and C, such that B extends
A and that C extends B. Each class should define an instance variable named “x”
(that is, each has its own variable named x). Describe a way for a method in C
to access and set A’s version of x to a given value, without changing B or C’s
version.*/

class A{
    int x=10;
}
class B extends A{
    int x=20;
}
class C extends B{
    int x=30;
    void setBVersionOfX(int x){
        super.x = x;
    }
    void display(){
        System.out.println("A version: "+((A)this).x);
        System.out.println("B version: " + super.x);
        System.out.println("C version: "+ x);
    }
}
public class InheritanceQuestion {
    public static void main(String[] args) {
    C c = new C();
    c.setBVersionOfX(50);
    c.display();

    }
}
