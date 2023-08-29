class Rectangle{
    private double length;  //public
    private double breadth; //public

    public double getLength(){
        return length;
    }
    public double getBreadth(){
        return breadth;
    }

    public void setLength(double l){
        length=l;
    }
    public void setBreadth(double b){
        breadth=b;
    }

    public double area(){
        return length*breadth;
    }
}
public class Datahiding {
    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        r.setLength(10);//r.breadth=10;
        r.setBreadth(5);

        System.out.println(r.area());
    }
}
