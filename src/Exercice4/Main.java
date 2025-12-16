package Exercice4;

public class Main {
    public static void main(String[] args) {

        double[][] a = {
            {1, 2},
            {3, 4}
        };

        double[][] b = {
            {5, 6},
            {7, 8}
        };

        System.out.println("Tableau a :");
        UtilTableaux.affiche(a);

        System.out.println("Regulier ? " + UtilTableaux.regulier(a));

        System.out.println("Somme des lignes :");
        double[] s = UtilTableaux.sommeLignes(a);
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }

        System.out.println("Somme de a + b :");
        double[][] r = UtilTableaux.somme(a, b);
        if (r != null) UtilTableaux.affiche(r);
        else System.out.println("Impossible de sommer");
    }
}
