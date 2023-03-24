package Controle;

public class Item {
	
	private String titulo, autor;
	private boolean disponivel;
	
	public Item() {
		super();
		// TODO Auto-generated constructor stub
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

	public boolean getDisponivel() {
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
	
	public void emprestarItem() {
		if (getDisponivel()) {
			System.out.println("disponivel");
			
			
		} else {
			System.out.println("nao disonivel");
		}
		
	}
	
	public void devolverItem() {
		
	}

}
