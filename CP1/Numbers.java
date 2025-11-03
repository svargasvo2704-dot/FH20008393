// https://en.wikipedia.org/wiki/Metallic_mean
// Copilot

public class Numbers {

    private static final int N = 25;
    private static final String[] metals = {
        "Platinum", "Golden", "Silver", "Bronze", "Copper",
        "Nickel", "Aluminum", "Iron", "Tin", "Lead"
    };

    public static void main(String[] args) {
        for (int z = 0; z < metals.length; z++) {
            System.out.println("[" + z + "] " + metals[z]);
            System.out.printf(" ↳ formula(%d)   ≈ %.10f%n", z, formula(z));
            System.out.printf(" ↳ recursive(%d) ≈ %.10f%n", z, recursive(z));
            System.out.printf(" ↳ iterative(%d) ≈ %.10f%n%n", z, iterative(z));
        }
    }

    public static double formula(double z) {
        return (z + Math.sqrt(4 + Math.pow(z, 2))) / 2;
    }

    public static double recursive(double z) {
        double f1 = f(z, N);
        double f2 = f(z, N - 1);
        return f1 / f2;
    }

    // Improvement: implementación recursiva f(z, n)
    private static double f(double z, int n) {
        if (n == 0 || n == 1)
            return 1;
        return z * f(z, n - 1) + f(z, n - 2);
    }

    // Update: implementación iterativa
    private static double iterative(double z) {
        double a = 1, b = 1, c;
        for (int i = 2; i <= N; i++) {
            c = z * b + a;
            a = b;
            b = c;
        }
        return b / a;
    }
}

