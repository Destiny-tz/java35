package xc7_2;

public class client {
    public static void main(String[] args) {
        Deng deng=new Deng();
        Thread thread1 = new Thread(new red(deng));//红灯
        Thread thread2 = new Thread(new yellow(deng));//黄灯
        Thread thread3 = new Thread(new reddy(deng));//绿灯
        Thread thread4 = new Thread(new SOS(deng));//sos灯

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();



    }
}
