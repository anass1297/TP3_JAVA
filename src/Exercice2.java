import java.util.Scanner;
public class Exercice2 {

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);  
System.out.print("Entrez le nombre de lignes : ");
int n = scanner.nextInt();
  
  for (int i = 1; i <= n; i++) {
    int nbEtoiles = 2 * i - 1;
     
    for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
    } 
    
 for (int j = 1; j <= nbEtoiles; j++) {
   System.out.print("*");
            }
    System.out.println(); 
    }

        scanner.close();
    }
}
