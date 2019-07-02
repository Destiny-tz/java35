package xc7_2;

public class SOS implements Runnable{
    private  final Deng deng;
    public SOS(Deng deng ){
        this.deng=deng;
    }

    @Override
    public void run() {
        while (true){
            try {
                deng.SOS();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
