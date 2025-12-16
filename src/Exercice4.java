
import java.util.Scanner;

public class Exercice4 {
	
 public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);

   System.out.print("Combien de valeurs : ");
	 int n = sc.nextInt();
     int[] carres = new int[n];
     int nombreImpair = 1;

 for (int i = 0; i < n; i++) {
	  carres[i] = nombreImpair * nombreImpair;
	  nombreImpair += 2; 
	        }

      nombreImpair = 1; 
for (int i = 0; i < n; i++) {
     System.out.println(nombreImpair + " a pour carre " + carres[i]);
	nombreImpair += 2;
	        }
  sc.close();
	    }
	}


	
	
	
	

