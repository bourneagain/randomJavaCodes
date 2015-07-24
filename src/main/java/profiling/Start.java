package profiling;

import com.sun.management.OperatingSystemMXBean;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

/**
 * Created by srajendran on 7/13/15.
 */
public class Start {

    void threadInfo(){
        final ThreadMXBean bean = ManagementFactory.getThreadMXBean();
        final com.sun.management.ThreadMXBean sunbean = (com.sun.management.ThreadMXBean) bean;
        double cputUtil1 = -1;
        double cputUtil2 = -1;
        java.lang.management.OperatingSystemMXBean osBean = ManagementFactory.getOperatingSystemMXBean();
        if (osBean instanceof com.sun.management.OperatingSystemMXBean) {
            com.sun.management.OperatingSystemMXBean osMxBean = (com.sun.management.OperatingSystemMXBean) osBean;
            cputUtil1 = osMxBean.getSystemCpuLoad();
            cputUtil2 = osMxBean.getProcessCpuLoad();
        }


        final long[] ids = bean.getAllThreadIds();
        ThreadInfo[] tinfolist = bean.dumpAllThreads(false, false);
        System.out.println("THREaD COUNT: " + bean.getThreadCount());
        for ( long id : ids ) {
            final long c = bean.getThreadCpuTime( id );
            final long u = bean.getThreadUserTime( id );

            final ThreadInfo m = bean.getThreadInfo(id);
            if ( c == -1 || u == -1 || !m.toString().contains("sam"))
                continue;   // Thread died
            final long mem = sunbean.getThreadAllocatedBytes(id);
            System.out.print(id + " - ");
            System.out.println("CPU:" + c + " MEM: " + mem + "  -  USER:" + u + " - " + m.getThreadName()+ " <- " + cputUtil1 + " : " + cputUtil2);
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
