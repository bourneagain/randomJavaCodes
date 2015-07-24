import java.util.Random;

/**
 * Created by srajendran on 6/5/15.
 */
public class Thread1 implements Runnable  {


    public void testFact(int j){
        for(int i = 1; i < j; i++){
            long a = calculatefactorial(i);
        }
    }
    public long calculatefactorial(int i){
        int p = 1;
        if ( i == 1 ){
            return 1;
        } else {
            return i * calculatefactorial(i - 1);
        }
    }



    @Override
    public void run() {
        Random r = new Random();

        while (true) {
            long a = calculatefactorial(500);
            System.out.println("THREAD1 DONE");
            try {

                int t = r.nextInt(10000);
                while ( t < 5000 ) {
                    System.out.println(t);
                    System.out.println("continue");
                    t = r.nextInt(10000);
                };
                Thread.sleep(t);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
