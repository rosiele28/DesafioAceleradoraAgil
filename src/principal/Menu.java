package principal;

import java.util.Scanner;
import com.desafio.controle.LivroAcoes;

public class Menu {
	
	public Menu() {

	}
	
	
	public String retornaMenu() {
		 String opcoes =

			      "Biblioteca: XXX"+
			      "\nLocalização: YYY"+
			      "\n\n***Opções*** "+
			      "\n1. Doar Livro"+
			      "\n2. Retirar um livro"+
			      "\n3. Devolver um livro"+
			      "\n4. Finalizar"+
			      "\n\nSelecione a opção: ";

			    return opcoes;
	}
	
	public void run () {
		System.out.println(this.retornaMenu());
		int opcao = 0;
		Scanner in = new Scanner(System.in);
		opcao = in.nextInt();
	    
	    LivroAcoes livro = new LivroAcoes();
	    
    
	    while(opcao != 4) {
	    	switch(opcao) {
	        case 1:
	        	livro.doarLivro();
	        	livro.listaLivro();
        		System.out.println(this.retornaMenu());
        		opcao = in.nextInt();
	           break;    
	        case 2:
	        	livro.listaLivro();
	        	livro.retirar();
	        	livro.listaLivro();
	        	System.out.println(this.retornaMenu());
        		opcao = in.nextInt();
	           break;
	        case 3:
	        	livro.listaLivro();
	        	livro.devolver();
	        	livro.listaLivro();
	        	System.out.println(this.retornaMenu());
        		opcao = in.nextInt();
	        	break;
            }	
        }
	    if (opcao == 4) {
	    	System.out.println("Menu encerrado!");
	    } 
	 }
	    
}

