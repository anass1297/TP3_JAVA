import java.util.Scanner;
public class Exercice1 {

 public static void main(String[] args) {
	       
	        int n;
	        double somme = 0.0;

	        
	        Scanner scanner = new Scanner(System.in);

	       
	        System.out.print("Entrez la valeur de n : ");
	        n = scanner.nextInt();

	        for (int i = 1; i <= n; i++) {
	            somme += 1.0 / i;  

	        System.out.println("La somme des " + n + " premiers termes de la série harmonique est : " + somme);
	        
	        scanner.close();
	    }
	
 }
	
	
	
	
	
	
	
	
	
	
	
}
