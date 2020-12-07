package dailycoding;

/*Given n numbers, find the greatest common denominator between them.

For example, given the numbers [42, 56, 14], return 14.
*/
public class GCD {

    /**TODO:
     * Need to implement for array elements
     */
    private double getGCD(double n1, double n2) {
        // Always set to positive
        n1 = (n1 > 0) ? n1 : -n1;
        n2 = (n2 > 0) ? n2 : -n2;
        while (n1 != n2) {
            if (n1 > n2)
                n1 -= n2;
            else
                n2 -= n1;
        }
        System.out.println("G.C.D = " + n1);
        return n1;

    }

    public static void main(String args[]) {
        GCD obj = new GCD();
        System.out.println(" " + obj.getGCD(27, 9));
    }
}