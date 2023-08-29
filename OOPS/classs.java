class Circle{
        public double radius;
        public double area(){
            return Math.PI*radius*radius;
        }
    }

public class classs {
 
    public static void main(String[] args) {
        Circle c=new Circle();
        c.radius=7;

        System.out.println(c.area());
    }
}
   