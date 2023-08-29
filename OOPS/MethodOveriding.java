class Parent{
    public void display(){
        System.out.println("Parent");
    }
}
class Child extends Parent{
    @Override
    public void display(){
        System.out.println("Child");//overridden method
    }
}
public class MethodOveriding {
    public static void main(String[] args) {
        Parent p=new Parent();
        p.display();
        Child c=new Child();
        c.display();

        Parent pc= new Child();
        pc.display();

    }
}
