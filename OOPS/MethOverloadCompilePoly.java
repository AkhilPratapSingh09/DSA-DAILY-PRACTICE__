class Test{
    public int max(int a, int b){
        return a>b ? a:b;
    }
    public int max(int a, int b, int c){
        if(a>b && a>c) return a;
        if(b>c) return b;
        return c;
    }
}
public class MethOverloadCompilePoly {
    public static void main(String[] args) {
        Test T= new Test();
        T.max(10,5);
        T.max(10,15,5);

        System.out.println(T.max(10,5));
    }
}
