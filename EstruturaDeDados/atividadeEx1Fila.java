import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class atividadeEx1Fila {

    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<String>();
        Scanner sc = new Scanner(System.in);
        int x;

        do {
            System.out.println("\n(1) Adicionar um novo Cliente na fila: ");
            System.out.println("\n(2) Lista todos os clientes da fila: ");
            System.out.println("\n(3) Retirar uma pessoa da fila: ");
            System.out.println("\n(0) Finalizar o programa: ");
            x = sc.nextInt();
            sc.nextLine(); // Limpa o buffer do Scanner

            switch(x) {
                case 1:
                    System.out.println("\nDigite o nome do cliente: ");
                    String nome = sc.nextLine();
                    fila.add(nome);
                    System.out.println("\nCliente: " + nome + " foi adicionado à fila.");
                    break;

                case 2:
                    if(fila.isEmpty()) {
                        System.out.println("\nA fila está vazia.");
                    } else {
                        System.out.println("\nClientes na fila: " + fila);
                    }
                    break;

                case 3:
                    if(fila.isEmpty()) {
                        System.out.println("\nA fila está vazia!");
                    } else {
                        fila.remove();
                        System.out.println("\nO cliente foi chamado.");
                        System.out.println("\nFila: " + fila);
                    }
                    break;

                case 0:
                    System.out.println("\nO programa foi finalizado.");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        } while(x != 0);

        sc.close();
    }
}
