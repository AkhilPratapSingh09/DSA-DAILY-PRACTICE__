public class MultiThreading extends  Thread { //implements Runnable
    public void run(){
        int i=1;
        while(true){
            System.out.println(i+"Hello");
            i++;

        }
    }
    public static void main(String[] args) {
        MultiThreading t=new MultiThreading();
        // Thread th= new Thread(t);
        t.start();//th.start
        int i=1;

        while(true){
            System.out.println(i+"world");
            i++;
        }
    }
}
