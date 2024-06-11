package Exercicios;

import java.util.Scanner;

public class forEx1 {
	
public static void main(String[] args) {
		
		int primeiroInt,segundoInt;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com o valor do primeiro intervalo: ");
		primeiroInt = leia.nextInt();
		
		System.out.println("\nEntre com o valor do segundo intervalo: ");
		segundoInt = leia.nextInt();
		
		
		if (primeiroInt > segundoInt) {                                                                              
				System.out.println("Intervalo inválido, o primeiro número deve ser menor ou igual ao segundo número");
				
		} else {
			System.out.println("Os numeros do intervalo entre: " + primeiroInt + " e " + segundoInt  );
			
			for (int x = primeiroInt; x<= segundoInt; x++) {
				if(x % 3 == 0 && x % 5 == 0) {
					
					System.out.println( x + " é multiplos de 3 e 5  ");
					
				}
				
				
				
				
				
				
			}
			
			
			
			
		}
		
	

	}























}

