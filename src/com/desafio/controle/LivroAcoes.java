package com.desafio.controle;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.desafio.entidade.Vizinho;

import com.desafio.entidade.Livro;


public class LivroAcoes  {
	
	
	List<Livro> listLivro = new ArrayList<Livro>();
	
	public LivroAcoes() {
		this.setArrayLivros();
	}
	
	public void listaLivro(){
		String emprestado = "";
		String nome = "";
		System.out.println("-------- ACERVO BIBLIOTECARIO -------");
		for (Livro livro : this.listLivro ) {
			if(!livro.getStatus()) {
				emprestado = "Indisponiv�l";
			}
			else {
				emprestado = "Dispon�vel";
			}
			
		    if (livro.getEmprestado().getNome() == "") {
		    	nome = "";
		    }
		    else {
		    	nome = livro.getEmprestado().getNome();
		    }
			System.out.printf
			(" \n C�DIGO - %03d, \n"
					+ " T�TULO - %s, \n"
					+ " AUTOR - %s, \n"
					+ " ANO - %d, \n"
					+ " STATUS - %s, \n"
					+ " EMPRESTADO PARA - %s"
					+ " \n------------------------------------------ \n",
					livro.getNumero(), 
					livro.getTitulo(), 
					livro.getAutor(), 
					livro.getAno(), 
					emprestado, 
					nome
			);
		}
	}
	
	
    public List<Livro> criaLivros(){
    	ArrayList<Livro> livro = new ArrayList<Livro>();
    	livro.add(new Livro(001, "Como fazer sentido e bater o martelo", "Alexandro Aolchique", 2017, true, new Vizinho("")));
    	livro.add(new Livro(002, "C�digo Limpo", "Tio Bob", 2001, true, new Vizinho("")));
    	livro.add(new Livro(003, "Basquete 101", "Hort�ncia Marcari", 2010, true, new Vizinho("")));
    	
    	return livro;
	}
    
    private void setArrayLivros() {
    	this.listLivro = this.criaLivros();
    }
    
    public void doarLivro() {
    	Scanner in = new Scanner(System.in);

    	Livro nLivro = new Livro();
    	System.out.println(" Digite o Codigo do livro: \n");
    	nLivro.setNumero(in.nextInt());
    	System.out.println(" Digite o titulo do livro: \n");
    	nLivro.setTitulo(in.next());
    	System.out.println(" Digite o nome do autor: \n");
    	nLivro.setAutor(in.next());
    	System.out.println("Digite o ano de publica��o: \n");
    	nLivro.setAno(in.nextInt());
    	nLivro.setStatus(true);
    	nLivro.setEmprestado(null);
    	this.listLivro.add(nLivro);
    }
    
    public void retirar() {
    	
    	Vizinho vizinho = new Vizinho();
    	Scanner in = new Scanner(System.in);
    	int cod;
    	System.out.println("\n Registre seu nome:");
    	vizinho.setNome(in.next());

    	System.out.println(" Digite o c�digo do livro que deseja retirar: ");
    	cod = in.nextInt();
    	
    	for (Livro livro : this.listLivro ) {
    		
    		if (livro.getNumero() == cod) {
    			if(livro.getStatus() == true) {
    				livro.setStatus(false);
            		livro.setEmprestado(vizinho);
    			}
    			else {
    				System.out.printf("N�o � possivel alugar esse livro! Emprestado para %s \n" , livro.getEmprestado().getNome());
    			}
    		}
    	}
    
    }
    
    public void devolver() {
    	Scanner in = new Scanner(System.in);
        	int cod;

        	System.out.println(" Digite o c�digo do livro que deseja devolver: ");
        	cod = in.nextInt();
        	for (Livro livro : this.listLivro ) {
        		if (livro.getNumero() == cod) {
        			livro.setStatus(true);
        			livro.setEmprestado(null);
        		}
        	}
        
        }
}


