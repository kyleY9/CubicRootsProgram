import java.util.Scanner;

public class ClientRunner {
    public static void main(String[] args) {
        // printing/scanning
        Scanner scan = new Scanner(System.in);
        System.out.println("Hiya! Input a cubic equation and I'll find the sum and product of its roots!");
        System.out.print("Input your equation (ax^3 + bx^2 + cx + d = 0): ");
        String equation = scan.nextLine();

        // parsing out int values
        int a = Integer.parseInt(equation.substring(0, equation.indexOf("x")));
        int b = Integer.parseInt(equation.substring(equation.indexOf(" ") + 3, equation.indexOf("^2") - 1));
        int c = Integer.parseInt(equation.substring(equation.indexOf("^2") + 5, equation.indexOf("x ")));
        int d = Integer.parseInt(equation.substring(equation.indexOf("x ") + 4, equation.length() - 4));

        // object instantiation
        CubicRootSumProduct obj = new CubicRootSumProduct(a, b, c, d);

        // printing results
        System.out.println("a = " + a + "\nb = " + b + "\nc = " + c + "\nd = " + d);
        System.out.println("Sum of Roots (-b/a): " + obj.sumOfRoots());
        System.out.println("Product of Roots (-d/a): " + obj.productOfRoots());
    }
}
