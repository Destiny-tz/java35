package xc7_2;

public class Deng {


    private int state = 1;//1.红灯 2.黄等 3.绿灯 4.SOS灯


    public synchronized void red() throws InterruptedException {
        while (state != 1) {
            wait();
        }
        for (int i = 1; i <= 5; i++) {
            System.out.println("红灯--第" + i + "下");

            Thread.sleep(2000);
        }
        //线程改变为其他的
        state = 2;
        notifyAll();//唤醒其他的线程
    }

    public synchronized void reddy()throws InterruptedException {
        while (state !=3) {
            wait();
        }
        for (int i =1; i<=3;i++){
            System.out.println("绿灯--第" + i + "下");
            Thread.sleep(2000);
        }
        //改变线程
        state=4;
        notifyAll();
    }

    public synchronized  void yellow()throws InterruptedException {
        while (state!=2){
            wait();
        }
        for (int i=1;i<=3;i++){
            System.out.println("黄灯--第" + i + "下");
            Thread.sleep(2000);
        }
        state=3;
        notifyAll();
    }

    public synchronized void SOS()throws  InterruptedException {
        while (state!=4){
            wait();
        }
        for (int i=1;i<=8;i++){
            System.out.println("SOS--第" + i + "下");
            Thread.sleep(2000);
        }
        state=1;
        notifyAll();
    }
}
