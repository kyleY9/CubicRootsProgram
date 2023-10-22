public class CubicRootSumProduct {
    // instance variables
    private int aValue;
    private int bValue;
    private int cValue;
    private int dValue;

    // constructor
    public CubicRootSumProduct(int a, int b, int c, int d) {
        aValue = a;
        bValue = b;
        cValue = c;
        dValue = d;
    }

    // methods

    // sum of cubic roots formula: -b/a
    public String sumOfRoots() {
        if (Math.floor((double) bValue / aValue) - (double) bValue / aValue == 0) {
            return "" + (-1 * bValue/aValue);
        } else {
            if (-1.0 * bValue / aValue > 0) {
                return Math.abs(bValue) + "/" + Math.abs(aValue);
            } else {
                return "-" + Math.abs(bValue) + "/" + Math.abs(aValue);
            }
        }
    }

    // product of cubic roots formula: -d/a
    public String productOfRoots() {
        if (Math.floor((double) dValue / aValue) - (double) dValue / aValue == 0) {
            return "" + (-1 * dValue/aValue);
        } else {
            if (-1.0 * dValue / aValue > 0) {
                return Math.abs(dValue) + "/" + Math.abs(aValue);
            } else {
                return "-" + Math.abs(dValue) + "/" + Math.abs(aValue);
            }
        }
    }
}
