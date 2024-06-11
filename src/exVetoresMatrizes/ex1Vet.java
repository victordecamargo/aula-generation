package exVetoresMatrizes;

import java.util.Scanner;
public class ex1Vet 

{

	public static void main(String[] args) {
		
		
		int numbVetor [] = {1,6,3,2,5,4,10,7,8,9};
		int numbEntrada;
		boolean encontrado = false;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nEntre com o número que deseja encontrar no vetor: ");
		numbEntrada = sc.nextInt();
		
		 
		
		for(int x=0;x < numbVetor.length;x++) {
			
			if(numbEntrada == numbVetor[x]) {
				System.out.println("\nO número: "  + (numbEntrada) + "\nEsta localizando na posição: " + (x));
				encontrado = true;
				break;
				
			}
			
			
		}
		if (!encontrado) {
			System.out.println("O número" + numbEntrada + "não foi encontrado.");
		}
		


	}

}
 