package Controle;



import java.util.ArrayList;

public class Usuario extends Item{
	
	private String nome, email, endereco;
	ArrayList<String> itens = new ArrayList<>();
	
	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public ArrayList<String> getItens() {
		return itens;
	}

	public void setItens(ArrayList<String> itens) {
		this.itens = itens;
	}

	public void setItens(String string) {
		// TODO Auto-generated method stub
		
	}
	
	
		public void emprestar(String titulo) {
			itens.add(titulo);	
									
		}
	
		public void devolver(String titulo) {
			itens.remove(titulo);
			
		}
	

	




}
