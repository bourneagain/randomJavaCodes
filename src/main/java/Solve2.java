import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.DecompositionSolver;
import org.apache.commons.math3.linear.LUDecomposition;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.SingularValueDecomposition;

import java.util.Collections;
import java.util.HashMap;
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
        RealMatrix coefficients = new Array2DRowRealMatrix(coEfficientMatrix, false);
        DecompositionSolver solver = new SingularValueDecomposition(coefficients).getSolver();
        RealVector constants = new ArrayRealVector(constValues, false);
        RealVector solution = solver.solve(constants);
        return solution.toArray();
    }

    public static double[] solveLinearEquation(double[][] coEffiecientValueMatrix, int taskCount){
        for (double[] values : coEffiecientValueMatrix) {

        }
    }

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
        Solve2 a = new Solve2();
        double[][] test =  [[1, 1, 0, 1, 0.017069701280227598, 1.0],
                            [1, 1, 0, 1, 0.017069701280227598, 1.0],
                            [1, 1, 0, 1, 0.01846590909090909, 1.0],
                            [1, 0, 1, 1, 0.4759206798866855, 1.0],
                            [0, 1, 1, 0, 0.4708392603129445, 1.0],
                            [1, 1, 0, 1, 0.015691868758915834, 1.0],
                            [1, 1, 0, 1, 0.018571428571428572, 1.0],
        [1, 1, 0, 1, 0.018465909090909092, 1.0], [1, 0, 1, 1, 0.49572649572649574, 1.0],
        [0, 1, 1, 0, 0.4537695590327169, 1.0]]
        a.solve();
    }
}
