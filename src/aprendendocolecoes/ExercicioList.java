package aprendendocolecoes;

import java.util.ArrayList;
import java.util.Scanner;

public class ExercicioList {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		ArrayList<String> cores = new ArrayList<String>();
		for (int i = 1 ; i < 6 ; i++) {
			System.out.printf("Digite a %da cor: ", i);
			cores.add(read.nextLine());
		}
		
		
		System.out.println("\nLista de cores: ");
		for (String cor: cores) {
			System.out.println(cor);
		}
		
		
		System.out.println("\nCores ordenadas: ");
		cores.sort(null);
		for (String cor: cores) {
			System.out.println(cor);
		}
		
		read.close();
	}

}
