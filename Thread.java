class Mythread implements Runnable{
    int a;
    String name;
    Thread t;
    Mythread(int a,String name)
    {
        this.a=a;
        this.name=name;
        t=new Thread(this,name);
        t.start();
    }
    public void run(){
        for(int i=0;i<3;i++){
        try{

            System.out.println(this.name);
            Thread.sleep(a);
        }catch(Exception e){
            System.out.println(e);
        }
    }
        
    }
}


public class Threadcse {
    public static void main(String args[]){
    Mythread a=new Mythread(10," Bmsce");
    Mythread b = new Mythread(2, " cse");
    try {
        a.t.join();
        b.t.join();
    } catch (Exception e) {
        System.out.println(e);
    }

}
}
