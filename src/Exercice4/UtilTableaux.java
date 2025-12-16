package Exercice4;

public class UtilTableaux {

 static void affiche(double[][] t) {
	   for (int i = 0; i < t.length; i++) {
	   for (int j = 0; j < t[i].length; j++) {
	       System.out.print(t[i][j] + " ");
	            }
	        System.out.println();
	        }
	    }

 static boolean regulier(double[][] t) {
	     for (int i = 1; i < t.length; i++) {
	      if (t[i].length != t[0].length) return false;
	        }
	       return true;
	    }

 static double[] sommeLignes(double[][] t) {
	     double[] s = new double[t.length];
	       for (int i = 0; i < t.length; i++) {
	        for (int j = 0; j < t[i].length; j++) {
	          s[i] += t[i][j];
	            }
	        }
	     return s;
	    }
 static double[][] somme(double[][] t1, double[][] t2) {
	      if (!regulier(t1) || !regulier(t2)) return null;
	      if (t1.length != t2.length || t1[0].length != t2[0].length) return null;

	      double[][] r = new double[t1.length][t1[0].length];
	      for (int i = 0; i < t1.length; i++) {
	       for (int j = 0; j < t1[i].length; j++) {
	           r[i][j] = t1[i][j] + t2[i][j];
	            }
	        }
	  return r;
	    }
	}


