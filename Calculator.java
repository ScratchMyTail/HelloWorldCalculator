/**
 * Created by christerhansen on 05.09.14.
 */
import java.lang.Math;

public class Calculator {

    private Integer a;
    private Integer b;

    public Calculator(Integer a, Integer b){
        this.a = a;
        this.b = b;
    }

    public static Integer minus(){
        return a - b;
    }

    public Integer pluss() { return a + b; }

    public double sqrtA() { return Math.sqrt(0.1); }
}
