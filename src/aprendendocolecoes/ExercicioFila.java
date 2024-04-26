package aprendendocolecoes;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExercicioFila {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		Queue<String> filaBanco = new LinkedList<String>();
	
        int opcao = 9;
        
        while (opcao != 0) {
        	System.out.println("MENU");

        	System.out.println("*** 1 - Adicionar Cliente na Fila ***");
        	System.out.println("*** 2 - Listar todos os Clientes ***");
        	System.out.println("*** 3 - Retirar Cliente da fila ***");
        	System.out.println("*** 0 - Sair ***");
        	
        	System.out.print("Selecione uma opção: ");
        	opcao = read.nextInt();
        	System.out.println();
        	
        	switch (opcao) {
        	
        	case 1: 
        		System.out.println("Opção: ADICIONAR CLIENTE NA FILA");
        		System.out.print("Digite o nome: ");
        		filaBanco.add(read.next());
        			
        		System.out.println("Fila: ");
        		Iterator<String> iOpcao1 = filaBanco.iterator();
    				while(iOpcao1.hasNext()) {
    				System.out.println(iOpcao1.next());
    			}
        			
        		System.out.println("Cliente Adicionado!\n");
        		break;
        		
        			
        	case 2: 
        		System.out.println("Opção: LISTA DE TODOS OS CLIENTES");
        		if(filaBanco.size() > 0) {
        			Iterator<String> iOpcao2 = filaBanco.iterator();
        			while(iOpcao2.hasNext()) {
        				System.out.println(iOpcao2.next());	
        			}
        				
        		} else {
        			System.out.println("Fila vazia!");
        		}
        			
        		System.out.println();
        		break;
        			
        			
        	case 3:
        		System.out.println("Opção: CHAMAR CLIENTE");
        		if(filaBanco.size() > 0) {
        			filaBanco.poll();
        				
        			Iterator<String> iOpcao3 = filaBanco.iterator();
        			while(iOpcao3.hasNext()) {
        				System.out.println(iOpcao3.next());
        				}
        				
        			System.out.println("Cliente chamado!");
        				
        		} else {
        			System.out.println("Fila vazia!");
        		}
        			
        		System.out.println();
        		break;
     	
        	}
        	
        }
        
        System.out.println("Programa finalizado!");
		
		read.close();

	}

}
