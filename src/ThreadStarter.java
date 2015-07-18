import com.sun.management.OperatingSystemMXBean;

import java.lang.management.ManagementFactory;

/**
 * Created by srajendran on 6/24/15.
 */
public class ThreadStarter  {

    long lastSystemTime;
    long lastProcessCpuTime;
    int availableProcessors;
    OperatingSystemMXBean ox;
    public ThreadStarter(){
        this.ox = (OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean();
        availableProcessors = ManagementFactory.getOperatingSystemMXBean().getAvailableProcessors();
    }


    void baselineCounters(){
        lastSystemTime = System.nanoTime()-5000;
        lastProcessCpuTime = 0;
    }
    public double getCpuUsage(){
        if (lastSystemTime == 0) {
            baselineCounters();
            return 0.0;
        }
        double cpuUsage=0.0;
        long systemTime=System.nanoTime();
        long processCpuTime=0;
        try {
            if (ManagementFactory.getOperatingSystemMXBean() instanceof OperatingSystemMXBean) {
                processCpuTime=((com.sun.management.OperatingSystemMXBean)ManagementFactory.getOperatingSystemMXBean()).getProcessCpuTime();
            }
            cpuUsage=(double)(processCpuTime - lastProcessCpuTime) / (systemTime - lastSystemTime);
            lastSystemTime=systemTime;
            lastProcessCpuTime=processCpuTime;
        }
        catch (  ClassCastException e) {
        }
        return (cpuUsage / availableProcessors) * 100.0;
    }
    public void printdetails(){
        OperatingSystemMXBean osBean= (OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean();
        System.out.println("Bean: " + osBean);
        System.out.println("OS Name: " + osBean.getName());
        System.out.println("OS Version: " + osBean.getVersion());
        System.out.println("Architecture: " + osBean.getArch());
        System.out.println("Processors: " + osBean.getAvailableProcessors());
        System.out.println("System Load Average: " + osBean.getSystemLoadAverage());
    }


    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(new Thread1());
        Thread t2 = new Thread(new Thread2());
        t1.start();
        t2.start();
//        Thread.sleep(5000);
        int count = 0;
        ThreadStarter ts = new ThreadStarter();
        while (true){
            System.out.println(ts.getCpuUsage());
            Thread.sleep(1000);
        }


    }

}
