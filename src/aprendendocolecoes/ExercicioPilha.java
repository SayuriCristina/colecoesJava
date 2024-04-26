package aprendendocolecoes;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class ExercicioPilha {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		Stack<String> pilhaLivros = new Stack <String>();
		
		int opcao = 9;
        
        while (opcao != 0) {
        	System.out.println("MENU");

        	System.out.println("*** 1 - Adicionar Livro na Pilha ***");
        	System.out.println("*** 2 - Listar todos os Livros ***");
        	System.out.println("*** 3 - Retirar Livros da Pilha ***");
        	System.out.println("*** 0 - Sair ***");
        	
        	System.out.print("Selecione uma opção: ");
        	opcao = read.nextInt();
        	read.nextLine();
        	
        	switch (opcao) {
        	case 1: 
        		System.out.println("\nOpção: ADICIONAR NOVO LIVRO");
        		System.out.print("Digite o nome do livro: ");
        		String livro = read.nextLine();
        		pilhaLivros.push(livro);
        		
        		System.out.println("Pilha: ");
        		Iterator<String> iOpcao1  = pilhaLivros.iterator();
        		while (iOpcao1.hasNext()) {
        			System.out.println(iOpcao1.next());	
        		}
        		System.out.println("Livro adicionado!\n");

        		break;
        	
        	case 2:
        		System.out.println("\nOpção: LISTAR TODOS OS LIVROS");
        		
        		if (pilhaLivros.size() > 0) {
        			Iterator<String> iOpcao2  = pilhaLivros.iterator();
            		while (iOpcao2.hasNext()) {
            			System.out.println(iOpcao2.next());	
            		}
            		System.out.println();
            		
        		} else {
        			System.out.println("Pilha vazia\n");
        		}
        		
        		break;
        	
        	case 3:
        		System.out.println("\nOpção: RETIRAR LIVRO DA PILHA");
        		if(pilhaLivros.size() > 0) {
        			pilhaLivros.pop();
        			
        			System.out.println("Pilha: ");
            		Iterator<String> iOpcao3  = pilhaLivros.iterator();
            		while (iOpcao3.hasNext()) {
            			System.out.println(iOpcao3.next());	
            		}
        			System.out.println("Um Livro foi retirado da pilha!\n");
        			
        		} else {
        			System.out.println("Pilha vazia\n");
        		}
        		
        		break;
        		
        	}
        	
        	
        }
		
        System.out.println("\nPrograma finalizado!");
        
        read.close();
	}

}
