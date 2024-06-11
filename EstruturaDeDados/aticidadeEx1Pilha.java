import java.util.Scanner;
import java.util.Stack;



public class aticidadeEx1Pilha {

	public static void main(String[] args) {
		
		Stack<String> pilha = new Stack<String>();
		Scanner sc = new Scanner(System.in);
		int x;
		
		do {
			
			System.out.println("\n(1) Adicione um livro a pilha: ");
			System.out.println("\n(2) Listar todos os livros: ");
			System.out.println("\n(3) Remover livro da pilha: ");
			System.out.println("\n(0) Finalizar o programa: ");
			x = sc.nextInt();
			sc.nextLine();
			
			switch(x) {
				case 1:
					System.out.println("\nDigite o nome do livro que deseja adicionar: ");
					String nome = sc.nextLine();
					pilha.add(nome);
					System.out.println("\n O livro "+nome+" foi adicionado a pilha");
					break;
				case 2: 
					if(pilha.isEmpty()) {
						System.out.println("\nA lista esta vazia ");
					}else {
						System.out.println("Lista de livros: "+pilha);
					}
					break;
				case 3:
					if(pilha.isEmpty()) {
						System.out.println("\nA pilha esta vazia. ");
					}else {
						pilha.pop();
						System.out.println("\nO livro foi retirado. ");
						System.out.println("\nLivros na pilha" + pilha);
						}
					break;
				case 0:
					System.out.println("\nPrograma Finalizado. ");
					break;
				default:
					System.out.println("\nOpção invalida!!! ");
			
			}
			
			
			
			
			
		}while(x != 0 );
		
		sc.close();
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
