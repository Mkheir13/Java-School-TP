//réalisé par MEDERREG KHEIR-EDDINE et BENJAMIN BORELLO

import java.math.BigInteger;
public class Exo3 {

    public static void main(String[] args) {
        System.out.println("Factorial");
        System.out.print("Entrer un nombre positif (0 pour terminer):");
        int number = Utils.CheckInt();
        System.out.println("Factorial de " + number + " est " + Factorial(number));
        System.out.println("Cnp");
        System.out.print("Entrer un premier nombre positif (0 pour terminer):");
        int n = Utils.CheckInt();
        System.out.print("Entrer un deuxieme nombre positif (0 pour terminer):");
        int p = Utils.CheckInt();
        System.out.println("Cnp de " + n + " et " + p + " est " + Cnp(n, p));
        System.out.println("Cnp(50,5) * Cnp(11.,2)= " + Cnp(50, 5).multiply(Cnp(11, 2)));
        if (Utils.Restart() == 1) {
            main(args);
        } else {
            Menu.main(args);
        }
    }
    public static BigInteger Factorial(int n) {
        if (n == 0) return BigInteger.ONE;
        return BigInteger.valueOf(n).multiply(Factorial(n - 1));
    }

    public static BigInteger Cnp(int n, int p) {
        if (p == 0) return BigInteger.ONE;
        return BigInteger.valueOf(n).multiply(Cnp(n - 1, p - 1)).divide(BigInteger.valueOf(p));
    }

}
