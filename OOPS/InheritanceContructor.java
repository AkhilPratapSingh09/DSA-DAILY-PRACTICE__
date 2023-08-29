class Parent{
    public Parent(){
        System.out.println("Parent Contructor");
    }
}

class Child extends Parent{
    public Child(){
        System.out.println("Child Constructor");
    }
}

public class InheritanceContructor {
    public static void main(String[] args) {
        Parent c= new Parent();
        Child a=new Child();
    }
}
 