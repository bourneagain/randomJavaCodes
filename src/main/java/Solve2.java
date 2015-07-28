import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.DecompositionSolver;
import org.apache.commons.math3.linear.LUDecomposition;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.SingularValueDecomposition;

/**
 * Created by srajendran on 7/27/15.
 */
public class Solve2 {
    void solve(){
        RealMatrix coefficients =
                new Array2DRowRealMatrix(new double[][] {
                        {0,0,1,0,0,1,1,0},
                        {0,1,0,0,0,2,0,0},
                        {1,0,0,0,1,1,0,1},
                        {1,0,0,1,0,1,1,0},
                        {1,0,0,1,0,1,1,0},
                        {1,0,0,0,1,1,0,0},
                        {0,1,0,0,0,2,0,0},
                        {0,0,1,0,0,1,1,0}
                },
                        false);

//        DecompositionSolver solver = new LUDecomposition(coefficients).getSolver();
        DecompositionSolver solver = new SingularValueDecomposition(coefficients).getSolver();
        RealVector constants = new ArrayRealVector(new double[] {0.28104575163398693 ,0.17891373801916932 ,0.24104234527687296 ,0.25 ,0.3413821815154038 ,0.1890091590341382
                ,0.033140016570008285 ,0.29833333333333334 }, false);
        RealVector solution = solver.solve(constants);
        System.out.println(solution);
    }

    public static void main(String[] args) {
        Solve2 a = new Solve2();
        a.solve();
    }
}
