package aprendendocolecoes;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class ExercicioSet {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		Set<Integer> numeros = new HashSet<Integer>();
		
		for (int i = 1 ; i < 11 ; i++) {
			System.out.printf("Digite o %do número inteiro e não repetido: ", i);
			numeros.add(read.nextInt());
		}
		
		Iterator<Integer> iNumeros = numeros.iterator();
		
		System.out.println("\nDados do Set: ");
		while(iNumeros.hasNext()) {
			System.out.println(iNumeros.next());
		}
		
		read.close();

	}

}
