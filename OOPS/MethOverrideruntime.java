class Parent{
    public void display(){
        System.out.println("Parent");
    }
}
class Child extends Parent{
    public void display(){
        System.out.println("Child");
    }
}
public class MethOverrideruntime {
    public static void main(String[] args) {
        Parent p= new Parent();
        p.display();

        Child c= new Child();
        c.display();

        Parent pc= new Child();
        pc.display();

    }
}
