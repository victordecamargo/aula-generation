
import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;





public class CollectionListEx1 {

	public static void main(String[] args) {
		
		ArrayList<String> suasCores = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com as 5 cores: ");
		for(int x =0; x<5; x++) {
			String cores = sc.next();
			suasCores.add(cores); // Adiciona a cor lida ao ArrayList
		}
			System.out.println("\n Suas cores são "+ suasCores);
			
			Collections.sort(suasCores);

	        System.out.println("\n Cores Ordenadas: ");
	        System.out.println(suasCores);
	}

}





































