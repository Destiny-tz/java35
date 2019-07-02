package xc7_2;

public class reddy implements Runnable {
    private  final  Deng deng;
    public  reddy(Deng deng ){
        this.deng=deng;
    }

    @Override
    public void run() {
        while (true){
            try {
                deng.reddy();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
