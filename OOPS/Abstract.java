abstract class Chubb{
    abstract void printInfo();
}
class Employee extends Chubb{
    void printInfo(){
        String name= "Akhil";
        int age= 21;
        float salary= 8.6F;

        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
    }
}
public class Abstract {
    public static void main(String[] args) {
        Chubb c= new Employee();
        c.printInfo();
    }
}
