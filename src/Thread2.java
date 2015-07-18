import java.util.ArrayList;
import java.util.List;

/**
 * Created by srajendran on 6/24/15.
 */
public class Thread2 implements Runnable  {

    public List<Integer> primesUpTo(final int target) {
        final boolean[] nonPrime = new boolean[target + 1];

        for (int i = 2; i <= Math.sqrt(target); ++i) {
            if (!nonPrime[i]) {
                for (int j = i * 2; j <= target; j += i) {
                    nonPrime[j] = true;
                }
            }
        }

        final List<Integer> primes = new ArrayList<>();

        for (int i = 2; i <= target; ++i) {
            if (!nonPrime[i]) primes.add(i);
        }

        return primes;
    }
    @Override
    public void run() {
        while (true){
            List<Integer> lia = new ArrayList<>(primesUpTo(500));
            System.out.println("THREAD2 DONE");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
