
import com.sun.tools.javac.util.ArrayUtils;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.DecompositionSolver;
import org.apache.commons.math3.linear.LUDecomposition;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.SingularValueDecomposition;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.DoubleSummaryStatistics;
import java.util.HashMap;
import java.util.Objects;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * Created by srajendran on 7/27/15.
 */
public class Solve2 {
    public Solve2() {

    }


    public static double[] solveLinearEquation(double[][] coEfficientMatrix, double[] constValues){
        System.out.println("HERE");
        RealMatrix coefficients = new Array2DRowRealMatrix(coEfficientMatrix, false);
        DecompositionSolver solver = new SingularValueDecomposition(coefficients).getSolver();
        RealVector constants = new ArrayRealVector(constValues, false);
        RealVector solution = solver.solve(constants);
        return solution.toArray();
    }

    public static void testme(){
        HashMap<ArrayList<Object>, ArrayList<Object>> test = new HashMap<>();


        /*
08119658-a284-42fa-81a4-08358a08a91a	6700	1	1	1	0	1	0.256499133	1
08119658-a284-42fa-81a4-08358a08a91a	6701	1	1	1	0	1	0.249134948	1
08119658-a284-42fa-81a4-08358a08a91a	6702	1	1	1	0	0	0.119791667	1
08119658-a284-42fa-81a4-08358a08a91a	6703	1	1	0	1	0	0.214904679	1
08119658-a284-42fa-81a4-08358a08a91a	6704	1	0	1	1	0	0.201388889	1

6897b645-667f-40ca-9cfc-5fa0d749e9cc	6700	1	1	1	0	1	0.251299827	1
6897b645-667f-40ca-9cfc-5fa0d749e9cc	6701	1	1	1	0	1	0.191709845	1
6897b645-667f-40ca-9cfc-5fa0d749e9cc	6702	1	1	1	0	0	0.117647059	1
6897b645-667f-40ca-9cfc-5fa0d749e9cc	6703	1	1	0	1	0	0.246977547	1
6897b645-667f-40ca-9cfc-5fa0d749e9cc	6704	1	0	1	1	0	0.201039861	1
         */

        ArrayList<Object> entry1 = new ArrayList<>();
        ArrayList<Object> entry2 = new ArrayList<>();
        ArrayList<Object> entry3 = new ArrayList<>();
        ArrayList<Object> entry4 = new ArrayList<>();
        ArrayList<Object> entry5 = new ArrayList<>();

        ArrayList<Object> entry6 = new ArrayList<>();
        ArrayList<Object> entry7 = new ArrayList<>();
        ArrayList<Object> entry8 = new ArrayList<>();
        ArrayList<Object> entry9 = new ArrayList<>();
        ArrayList<Object> entry10 = new ArrayList<>();


        entry1.add("08119658");
        entry1.add(6700);
        entry2.add("08119658");
        entry2.add(6701);
        entry3.add("08119658");
        entry3.add(6702);
        entry4.add("08119658");
        entry4.add(6703);
        entry5.add("08119658");
        entry5.add(6704);


        entry6.add("6897b645");
        entry6.add(6700);
        entry7.add("6897b645");
        entry7.add(6701);
        entry8.add("6897b645");
        entry8.add(6702);
        entry9.add("6897b645");
        entry9.add(6703);
        entry10.add("6897b645");
        entry10.add(6704);


        ArrayList<Object> t1 = new ArrayList<>();
        HashMap<String, Integer> t1h = new HashMap<>();
        t1h.put("__acker",1);
        t1h.put("exclaim1",1);
        t1h.put("exclaim2",1);
        t1h.put("exclaim3",0);
        t1h.put("spout",1);
        t1.add(t1h);
        t1.add(0.256);
        t1.add(1.0);


        ArrayList<Object> t2 = new ArrayList<>();
        HashMap<String, Integer> t2h = new HashMap<>();
        t2h.put("__acker",1);
        t2h.put("exclaim1",1);
        t2h.put("exclaim2",1);
        t2h.put("exclaim3",0);
        t2h.put("spout",1);
        t2.add(t2h);
        t2.add(0.2491);
        t2.add(1.0);


        ArrayList<Object> t3 = new ArrayList<>();
        HashMap<String, Integer> t3h = new HashMap<>();
        t3h.put("__acker",1);
        t3h.put("exclaim1",1);
        t3h.put("exclaim2",1);
        t3h.put("exclaim3",0);
        t3h.put("spout",0);
        t3.add(t3h);
        t3.add(0.119);
        t3.add(1.0);


        ArrayList<Object> t4 = new ArrayList<>();
        HashMap<String, Integer> t4h = new HashMap<>();
        t4h.put("__acker",1);
        t4h.put("exclaim1",1);
        t4h.put("exclaim2",0);
        t4h.put("exclaim3",1);
        t4h.put("spout",0);
        t4.add(t4h);
        t4.add(0.214);
        t4.add(1.0);


        ArrayList<Object> t5 = new ArrayList<>();
        HashMap<String, Integer> t5h = new HashMap<>();
        t5h.put("__acker",1);
        t5h.put("exclaim1",0);
        t5h.put("exclaim2",1);
        t5h.put("exclaim3",1);
        t5h.put("spout",0);
        t5.add(t5h);
        t5.add(0.201);
        t5.add(1.0);

        ArrayList<Object> t11 = new ArrayList<>();
        HashMap<String, Integer> t11h = new HashMap<>();
        t11h.put("__acker",1);
        t11h.put("exclaim1",1);
        t11h.put("exclaim2",1);
        t11h.put("exclaim3",0);
        t11h.put("spout",1);
        t11.add(t11h);
        t11.add(0.2512);
        t11.add(1.0);


        ArrayList<Object> t22 = new ArrayList<>();
        HashMap<String, Integer> t22h = new HashMap<>();
        t22h.put("__acker",1);
        t22h.put("exclaim1",1);
        t22h.put("exclaim2",1);
        t22h.put("exclaim3",0);
        t22h.put("spout",1);
        t22.add(t22h);
        t22.add(0.1917);
        t22.add(1.0);


        ArrayList<Object> t33 = new ArrayList<>();
        HashMap<String, Integer> t33h = new HashMap<>();
        t33h.put("__acker",1);
        t33h.put("exclaim1",1);
        t33h.put("exclaim2",1);
        t33h.put("exclaim3",0);
        t33h.put("spout",0);
        t33.add(t33h);
        t33.add(0.117);
        t33.add(1.0);

        ArrayList<Object> t44 = new ArrayList<>();
        HashMap<String, Integer> t44h = new HashMap<>();
        t44h.put("__acker",1);
        t44h.put("exclaim1",1);
        t44h.put("exclaim2",0);
        t44h.put("exclaim3",1);
        t44h.put("spout",0);
        t44.add(t44h);
        t44.add(0.24697);
        t44.add(1.0);

        ArrayList<Object> t55 = new ArrayList<>();
        HashMap<String, Integer> t55h = new HashMap<>();
        t55h.put("__acker",1);
        t55h.put("exclaim1",0);
        t55h.put("exclaim2",1);
        t55h.put("exclaim3",1);
        t55h.put("spout",0);
        t55.add(t55h);
        t55.add(0.201);
        t55.add(1.0);

        test.put(entry1, t1);
        test.put(entry2, t2);
        test.put(entry3, t3);
        test.put(entry4, t4);
        test.put(entry5, t5);

        test.put(entry6, t11);
        test.put(entry7, t22);
        test.put(entry8, t33);
        test.put(entry9, t44);
        test.put(entry10, t55);
        System.out.println(Arrays.toString(solveLinearEquation(test, 4)));
    }


    public static double[] solveLinearEquation(HashMap<ArrayList<Object>, ArrayList<Object>> collatedDetails, int taskCount){
        ArrayList<Object> workerSlot;
        String node;
        HashMap<String, Integer> tasksPerComponents;
        ArrayList<Object> values;

        HashMap<ArrayList<Object>, Double[]> coefficientMatrix = new HashMap<>();
//        double[][] coEfficientMatrix = new double[collatedDetails.size()][];

        HashMap<ArrayList<Object>, Double> valueMatrix = new HashMap<>();
        double workerSlotCpu;
        double supervisorCpu;
        double cf ;


        HashMap<String, Double> nodesJVMSum = new HashMap<>();
        HashMap<String, Double> nodeCPU = new HashMap<>();
        HashMap<String, Integer> nodeTasksCount = new HashMap<>();
        HashMap<ArrayList<Object>, Integer> JVMSumTasks = new HashMap<>();
        HashMap<ArrayList<Object>, Double> correctionFactor = new HashMap<>();


        for (HashMap.Entry<ArrayList<Object>, ArrayList<Object>> input : collatedDetails.entrySet()) {
            workerSlot = input.getKey();
            node = (String) workerSlot.get(0);
            values = input.getValue();


            // map values to respective variables
            tasksPerComponents = (HashMap<String, Integer>) values.get(0);
            workerSlotCpu = (double) values.get(1);
            supervisorCpu = (double) values.get(2);



            Double[] workerSlotcoEfficients = new Double[taskCount];

            int componentIndex = 0;
            int totalTasksOnSlot = 0;


            // gathering component-number of task relation
            for (HashMap.Entry<String, Integer> tasksPerComponent : tasksPerComponents.entrySet()) {
                if (tasksPerComponent.getKey().equals("__acker")) continue;
                workerSlotcoEfficients[componentIndex] = (double) tasksPerComponent.getValue();
                totalTasksOnSlot += workerSlotcoEfficients[componentIndex];
                componentIndex++;
            }

            // collect JVM info
            if (!nodesJVMSum.containsKey(node)) {
                nodesJVMSum.put(node, 0.0);
            }
            nodesJVMSum.put(node,nodesJVMSum.get(node) + workerSlotCpu);


            if (!JVMSumTasks.containsKey(workerSlot)){
                JVMSumTasks.put(workerSlot, 0);
            }

            JVMSumTasks.put(workerSlot, JVMSumTasks.get(workerSlot) + totalTasksOnSlot);

            // collect Supervisor node info
            if (!nodeCPU.containsKey(node)){
                nodeCPU.put(node, supervisorCpu);
            }

            // collect tasks count on the node
            if (!nodeTasksCount.containsKey(node)) {
                nodeTasksCount.put(node, 0);
            }

            nodeTasksCount.put(node, nodeTasksCount.get(node) + totalTasksOnSlot);

            // setting the coefficient matrix
//            coEfficientMatrix[equationNumber] = workerSlotcoEfficients;
            coefficientMatrix.put(workerSlot, workerSlotcoEfficients);

        }

        //calculating correction factor
        double[][] taskMatrix = new double[coefficientMatrix.size()][];
        double[] rowMatix = new double[coefficientMatrix.size()];



        for (HashMap.Entry<ArrayList<Object>, ArrayList<Object>> input : collatedDetails.entrySet()) {
            workerSlot = input.getKey();
            workerSlotCpu =  (double) input.getValue().get(1);
            node = (String) workerSlot.get(0);

            cf = JVMSumTasks.get(workerSlot) * ( (nodeCPU.get(node) - nodesJVMSum.get(node) ) / nodeTasksCount.get(node));
            valueMatrix.put(workerSlot, cf + workerSlotCpu);
//            valueMatrix workerSlotCpu + cf;
         }


        int equationNumber = 0;

        for (HashMap.Entry<ArrayList<Object>, ArrayList<Object>> input : collatedDetails.entrySet()) {
            workerSlot = input.getKey();
            taskMatrix[equationNumber] = org.apache.commons.lang.ArrayUtils.toPrimitive(coefficientMatrix.get(workerSlot));
            rowMatix[equationNumber] = valueMatrix.get(workerSlot);
            equationNumber++;
        }

        System.out.println("test");
//
//        for (HashMap.Entry<ArrayList<Object>, Double[]> amap : coefficientMatrix.entrySet()){
//            taskMatrix[equationNumber] = org.apache.commons.lang.ArrayUtils.toPrimitive(amap.getValue());
//            equationNumber++;
//        }
//        for (HashMap.Entry<ArrayList<Object>, Double> amap : valueMatrix.entrySet()){
//            rowMatix[equationNumber] = org.apache.commons.lang.ArrayUtils.toPrimitive(amap.getValue());
//            equationNumber++;
//        }

//        return (new double[2]);
        return solveLinearEquation(taskMatrix, rowMatix);

    }
//    int sumTasks()
//    public static void solveLinearEquation(HashMap<String, ArrayList<Object>> coEffiecientValueMatrix, int taskCount){
//
//        //(Sum of tasks in that JVM) *  ((Node CPU % - (sum of JVM% of workers in that Node) )) / Total number of tasks scheduled on the node.) )
//
//
//        double[] solution  = {1,2,3};
//        int coEffiecientValueMatrixSize = coEffiecientValueMatrix.size();
//        int[][] coefficientMatrix = new int[coEffiecientValueMatrixSize][];
//        double[] JVMMatrix = new double[coEffiecientValueMatrixSize];
//        double[] SUMatrix  = new double[coEffiecientValueMatrixSize];
//        double[] correctionFactor = new double[coEffiecientValueMatrixSize];
//        int sumTasksPerJVM = 0;
//        int taskCounter = 0;
//
//
//        HashMap<String, Integer> componentHashMap = new HashMap<>();
//        int equationNumber = 0;
//        for (HashMap.Entry<String, ArrayList<Object>> entry : coEffiecientValueMatrix.entrySet()){
//            int[] tasksPerComponent = new int[taskCount];
//            componentHashMap = (HashMap<String, Integer>) entry.getValue().get(0);
//            JVMMatrix[equationNumber] = (double) entry.getValue().get(1);
//            SUMatrix[equationNumber] = (double) entry.getValue().get(2);
//
//            for ( String component : componentHashMap.keySet()) {
//                if (component.contains("__acker")) continue;
//                tasksPerComponent[taskCounter] = componentHashMap.get(component);
//                sumTasksPerJVM += tasksPerComponent[taskCounter];
//                taskCounter++;
//            }
//
//            coefficientMatrix[equationNumber] = tasksPerComponent;
//
//            sumTasksPerJVM =
//            // update / reset counters
//            taskCounter = 0;
//            sumTasksPerJVM = 0;
//            equationNumber++;
//        }
//
//
//        if (false) {
//            for (int i = 0; i < coefficientMatrix.length; i++) {
//                for (int j = 0; j < coefficientMatrix[i].length; j++) {
//                    System.out.print(coefficientMatrix[i][j] + " ");
//                }
//                System.out.println();
//            }
//        }
//
//
//
////        System.out.println(Arrays.toString(coefficientMatrix));
////        int tasks = (int) taskCount;
////
////        ArrayList<ArrayList<Double>> matrix = new ArrayList<ArrayList<Double>>();
////        matrix = (ArrayList<ArrayList<Double>>) coEffiecientValueMatrix;
////
////        double[][] coefficientMatrix = new double[matrix.size()][];
////
////        ArrayList<String> nodes = new ArrayList<>();
////
////        int equationNumber = 0;
////        for (ArrayList<Double> equations : matrix){
////                coefficientMatrix[equationNumber] = ArrayUtils.toPrimitive(equations.subList(1, tasks).toArray(new Double[tasks]));
////                JVMMatrix[equationNumber] = equations.get(tasks+1);
////                SUMatrix[equationNumber] = equations.get(tasks+2);
////
////                equationNumber++;
////        }
////
////        for (int i=0; i<equationNumber; i++) {
////            correctionFactor[i] = ( SUMatrix[equationNumber] - ) /
////        }
//
//
//
//    }



    void solve(){
        RealMatrix coefficients =
                new Array2DRowRealMatrix(new double[][] {
                        {1,0,0,1,0},
                        {1,0,0,0,1},
                        {0,1,0,0,1},
                        {0,1,0,0,1},
                        {0,0,1,0,1},
                        {1,0,0,1,0},
                        {1,0,0,0,1},
                        {0,1,0,0,1},
                        {0,1,0,0,1},
                        {0,0,1,0,1}
                        },
        false);

//        DecompositionSolver solver = new LUDecomposition(coefficients).getSolver();
        DecompositionSolver solver = new SingularValueDecomposition(coefficients).getSolver();
        RealVector constants = new ArrayRealVector(new double[]
                {
                        0.236641851308259,
                        0.171461748392307,
                        0.188938598197497,
                        0.145732760399168,
                        0.25722504170277,
                        0.245319182302969,
                        0.179225846832998,
                        0.170298445248816,
                        0.154253890206749,
                        0.250902635408469
                }, false);
        RealVector solution = solver.solve(constants);
//        for(int i = 1; i<=coefficients.getRow(0).length; i++){
//            System.out.print(i+ " ");
//        }
//        System.out.println("");

        HashMap<Double, Double> res = new HashMap<Double, Double>();
        Double i= new Double(1.0);
        for(Double d: solution.toArray()){
                    res.put(d,i);
            i++;
        }

        SortedMap sortedMap = new TreeMap(java.util.Collections.reverseOrder());
        SortedSet<Double> keys = new TreeSet<Double>(res.keySet());
        for (Double key : keys) {
            System.out.println(key + " : " + res.get(key));
        }
    }

    public static void main(String[] args) {
        Solve2.testme();
//        Solve2 a = new Solve2();
//        Solve2.testme();
//        double[][] test =  [[1, 1, 0, 1, 0.017069701280227598, 1.0],
//                            [1, 1, 0, 1, 0.017069701280227598, 1.0],
//                            [1, 1, 0, 1, 0.01846590909090909, 1.0],
//                            [1, 0, 1, 1, 0.4759206798866855, 1.0],
//                            [0, 1, 1, 0, 0.4708392603129445, 1.0],
//                            [1, 1, 0, 1, 0.015691868758915834, 1.0],
//                            [1, 1, 0, 1, 0.018571428571428572, 1.0],
//        [1, 1, 0, 1, 0.018465909090909092, 1.0], [1, 0, 1, 1, 0.49572649572649574, 1.0],
//        [0, 1, 1, 0, 0.4537695590327169, 1.0]]
//        a.solve();
    }
}
