package com.desafio.entidade;

public class Livro {
	private Integer numero;
    private String titulo;
    private String autor;
    private int ano;
    private Boolean status;
    private Vizinho emprestado;
    
    public Livro(Integer numero, String titulo, String autor, int ano, Boolean status, Vizinho vizinho) {
		super();
		this.numero = numero;
		this.titulo = titulo;
		this.autor = autor;
		this.ano = ano;
		this.status = status;
		this.emprestado = vizinho;
	}
    
    public Livro() {}
        
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	public Vizinho getEmprestado() {
		return emprestado;
	}
	public void setEmprestado(Vizinho emprestado) {
		this.emprestado = emprestado;
	}
	
	
}

	
	