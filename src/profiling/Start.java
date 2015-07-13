package profiling;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

/**
 * Created by srajendran on 7/13/15.
 */
public class Start {

    void threadInfo(){
        final ThreadMXBean bean = ManagementFactory.getThreadMXBean();
        final long[] ids = bean.getAllThreadIds();
        ThreadInfo[] tinfolist = bean.dumpAllThreads(false, false);
//        for(ThreadInfo t: tinfolist){
//            System.out.println(t.toString());
//        }
        System.out.println("THREaD COUNT: " + bean.getThreadCount());
        for ( long id : ids ) {
            final long c = bean.getThreadCpuTime( id );
            final long u = bean.getThreadUserTime( id );
            final ThreadInfo m = bean.getThreadInfo(id);
            if ( c == -1 || u == -1 || !m.toString().contains("sam"))
                continue;   // Thread died
            System.out.print(id + " - ");
            System.out.println("CPU:" + c + "  -  USER:" + u + " - " + m.getThreadName()+ " <-");
        }
    }


    public static void main(String[] args) throws InterruptedException {
        Thread heavy = new Thread(new HeavyThread(1000), "heavy_sam");
        Thread light1 = new Thread(new LightThread(), "light1_sam");
        Thread light2 = new Thread(new LightThread(), "light2_sam");
        heavy.start();
        light1.start();
        light2.start();
        Start a = new Start();
        while (true){
            a.threadInfo();
            Thread.sleep(1000);
        }

    }
}
