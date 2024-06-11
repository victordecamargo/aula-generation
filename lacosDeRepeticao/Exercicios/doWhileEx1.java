package Exercicios;

import java.util.Scanner;

public class doWhileEx1 {

public static void main(String[] args) {
		
		
		int numeroPositivo = 0 ,numeros;
		
		Scanner leia = new Scanner(System.in);
		
	
		
		do {
			
			System.out.println("\nDigite seu numero: " + "\nPara encerrar o programa Digite 0");
			numeros = leia.nextInt();
			if (numeros > 0) {
			numeroPositivo += numeros;
			}
			
			
			}while(numeros != 0);
		
		System.out.println("A soma dos numeros positivos é: " + numeroPositivo);
		
		

	}

}
