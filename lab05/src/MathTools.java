import java.util.DoubleSummaryStatistics;

/**
 * CS180 - Lab 05 - MathTools
 *
 * making loops
 *
 * @author Jiacheng Yuan, yuan105@purdue.edu
 */
public class MathTools {

    public static double absoluteValue(double n) {
        if(n < 0)
            return -n;
        else
            return n;
    }

    public static double power(double base, int exponent) {
        double result = 1;
        if(exponent == 0)
            return 1;
        else if(exponent < 0)
            return power(1/base,-exponent);
        else
            for(int i = exponent; i > 0; i-- ){
                result *= base;
            }
            return result;
    }

    public static double nthRoot(double value, int root) {
        double guess;
        double tol = 0.000000001;
        double deltaX;
        double nguess;
        if(value <= 0 || root == 0)
            return 0;
        else
            if(root > 0) {
                guess = value;
                do {
                    nguess = (1 / (double)root) * ((root - 1) * guess + value / power(guess, root - 1));
                    deltaX = absoluteValue(nguess - guess);
                    guess = nguess;
                } while (deltaX > tol);
            }
            else {
                guess = 1 / value;
                do {
                    nguess = (1 / (double)root) * ((root - 1) * guess + value / power(guess, root - 1));
                    deltaX = absoluteValue(nguess - guess);
                    guess = nguess;
                } while (deltaX > tol);
            }
        return guess;
    }

    public static String scientificNotation(double n) {
        String coff;
        String num;
        int exp = 0;
        if(absoluteValue(n) < 1){
            while (absoluteValue(n)< 1){
                n *= 10;
                exp--;
            }
        }
        else if(absoluteValue(n) >= 10) {
            while (absoluteValue(n) >= 10) {
                n /= 10;
                exp++;
            }
        }
        n = ((int)(n * 1000000)) / 1000000.0;
        coff = Double.toString(n);
        num = coff + " x 10 ^ " + Integer.toString(exp);
        return num;

    }
    public static void main(String[] args) {
        MathTools m = new MathTools();
        double n = m.nthRoot(8,3);
        System.out.println("answer is " + n);
        String h = new String("Hello");
        boolean x = (h=="Hello");
        System.out.println(x);
    }

}
