import com.sun.management.OperatingSystemMXBean;
import com.sun.tools.corba.se.idl.constExpr.Times;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

/**
 * Created by srajendran on 7/7/15.
 */

public class SystemStat implements Runnable {

    OperatingSystemMXBean osBean;

    SystemStat() {
        osBean = (com.sun.management.OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean();

    }

    void printInfo() {
        long a = osBean.getTotalPhysicalMemorySize() / 1024 / 1024;
        long b = osBean.getFreePhysicalMemorySize() / 1024 / 1024;
        System.out.println(a);
        System.out.println(osBean.getSystemCpuLoad());
        System.out.println(b);
        System.out.println((a - b) / 1024);
        System.out.println(osBean.getFreeSwapSpaceSize() / 1024 / 1024);
    }



    public static double getJVMCpuUtil() {
        ClassLoader classLoader = SystemStat.class.getClassLoader();
        double cputUtil = -1;
        try {
            Class aClass = classLoader.loadClass("com.sun.management.OperatingSystemMXBean");
            java.lang.management.OperatingSystemMXBean osBean = ManagementFactory.getOperatingSystemMXBean();
            if (osBean instanceof com.sun.management.OperatingSystemMXBean) {
                com.sun.management.OperatingSystemMXBean osMxBean = (com.sun.management.OperatingSystemMXBean) osBean;
                cputUtil = osMxBean.getProcessCpuLoad();
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Unable to load com.sun.management: Returning -1 for JVM CPU Util value");
        }
        return cputUtil;
    }

    public static double getSysCpuUtil() {
        ClassLoader classLoader = SystemStat.class.getClassLoader();
        double cputUtil = -1;
        try {
            Class aClass = classLoader.loadClass("com.sun.management.OperatingSystemMXBean");
            java.lang.management.OperatingSystemMXBean osBean = ManagementFactory.getOperatingSystemMXBean();
            if (osBean instanceof com.sun.management.OperatingSystemMXBean) {
                com.sun.management.OperatingSystemMXBean osMxBean = (com.sun.management.OperatingSystemMXBean) osBean;
                cputUtil = osMxBean.getSystemCpuLoad();
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Unable to load com.sun.management: Returning -1 for JVM CPU Util value");
        }
        return cputUtil;
    }

    void threadInfo(){
        final ThreadMXBean bean = ManagementFactory.getThreadMXBean();
        final long[] ids = bean.getAllThreadIds();
        ThreadInfo[] tinfolist = bean.dumpAllThreads(false, false);
        for(ThreadInfo t: tinfolist){
//            System.out.println(t.toString());
        }
        System.out.println("THREaD COUNT: " + bean.getThreadCount());
        for ( long id : ids ) {
            System.out.println(id);
            final long c = bean.getThreadCpuTime( id );
            final long u = bean.getThreadUserTime( id );
            final ThreadInfo m = bean.getThreadInfo(id);
            if ( c == -1 || u == -1 )
                continue;   // Thread died
            System.out.println("CPU:" + c + "  -  USER:"+u +  " - "+m.toString());
        }
    }

    @Override
    public void run() {
        while(true){
            System.out.println("within a thread" + Thread.currentThread().getName());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    public static void main(String[] args) {
        SystemStat a = new SystemStat();
//        System.out.println(getSysCpuUtil());
//        System.out.println(getJVMCpuUtil());
//        System.out.println(getSysCpuUtil());
//        System.out.println(getJVMCpuUtil());
//        a.printInfo();
//        a.threadInfo();
        Thread at1 = new Thread(new SystemStat());
        Thread at2 = new Thread(new SystemStat());
        at1.start();
        at2.start();
        a.threadInfo();


    }
}

