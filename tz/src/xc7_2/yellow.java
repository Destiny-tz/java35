package xc7_2;

public class yellow implements  Runnable {
     private  final  Deng deng;
     public  yellow(Deng deng){
         this.deng=deng;
     }
    @Override
    public void run() {
        try {
            deng.yellow();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
