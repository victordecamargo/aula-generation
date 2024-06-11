





import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
import java.util.Scanner;

public class CollectionSetEx1 {
	
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> numerosInteiros = new HashSet<>();
		
		
		for(int x =0; x<10; x++) {
			System.out.println("\n Digite o valor: ");
		int numeros = sc.nextInt();
		numerosInteiros.add(numeros);
		}
		
		System.out.println();
		
		 Iterator<Integer> iterator = numerosInteiros.iterator();

	        while(iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }
		

	}

}
































