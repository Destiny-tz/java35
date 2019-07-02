package xc7_2;

public class red implements Runnable {
    private  final Deng deng;

    public red(Deng deng){
        this.deng=deng;

    }

    @Override
    public void run() {
        while (true) {
            try {
                deng.red();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}
