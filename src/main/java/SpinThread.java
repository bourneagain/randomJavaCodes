/**
 * Created by srajendran on 7/29/15.
 */
public class SpinThread {

    static int activePeriod, sleepPeriod;
    SpinThread(int aPeriod, int sPeriod){
        activePeriod = aPeriod;
        sleepPeriod = sPeriod;
    }

    static void keepBusy(int milliseconds){
        long sleepTime = milliseconds*1000000L; // convert to nanoseconds
        long startTime = System.nanoTime();
        System.out.println("RUN TIME"  + milliseconds);
        while ((System.nanoTime() - startTime) < sleepTime) {}
    }


    public static void main(String[] args) {
        int a = 0;
        int s = 0;
        if (args.length > 0) {
            try {
                a = Integer.parseInt(args[0]);
                s = Integer.parseInt(args[1]);
            } catch (NumberFormatException e) {
                System.err.println("Argument must be an integer.");
                System.exit(1);
            }
        } else {
            System.err.println("Argument in milliseconds activePeriod, sleepPeriod");
            System.exit(1);
        }
        SpinThread t = new SpinThread(a, s);
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                while (true){
                    System.out.println("keeping system busy for "+SpinThread.activePeriod+ "second");
                    keepBusy(SpinThread.activePeriod);
                    System.out.println("Done ");
                    System.out.println("--------------------------------");

                    try {
                        System.out.println("Sleeping for "+ SpinThread.sleepPeriod + "s ... ");
                        Thread.sleep(SpinThread.sleepPeriod);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        t1.start();
    }

}
