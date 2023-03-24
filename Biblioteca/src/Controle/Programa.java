package Controle;

public class Programa {

	public static void main(String[] args) {
		
		
		
		Usuario u1 = new Usuario();
		u1.setNome("João");
		u1.setEmail("joao@gmail.com");
		u1.setEndereco("Av. Floriano Peixoto, 1400");
		
		
		Usuario u2 = new Usuario();
		u2.setNome("Maria");
		u2.setEmail("maria@hotmail.com");
		u2.setEndereco("Av. Afonso Pena, 400");
		
		Usuario u3 = new Usuario();
		u3.setNome("Rafael");
		u3.setEmail("rafael@hotmail.com");
		u3.setEndereco("Av. Cesário Alvim, 1960");
		
				
		Livro l1 = new Livro();
		l1.setTitulo("Mulheres que correm com lobos");
		l1.setAutor("Clarissa Pinkola Estés");
		l1.setAnoPublicacao(2018);
		l1.setDisponivel(true);
		
		Livro l2 = new Livro();
		l2.setTitulo("É assim que acaba");
		l2.setAutor("Collen Hoover");
		l2.setAnoPublicacao(2018);
		l2.setDisponivel(true);  
		
		Livro l3 = new Livro();
		l3.setTitulo("Como tigres na neve");
		l3.setAutor("Juhea Kim");
		l3.setAnoPublicacao(2022);
		l3.setDisponivel(true); 
		
		Livro l4 = new Livro();
		l4.setTitulo("Órfãos de Amsterdã");
		l4.setAutor("Elle Van Rijn");
		l4.setAnoPublicacao(2023);
		l4.setDisponivel(true); 
		
		Livro l5 = new Livro();
		l5.setTitulo("O jardim das borboletas");
		l5.setAutor("Dot Hutchison");
		l5.setAnoPublicacao(2022);
		l5.setDisponivel(true);     
		
		Revista r1 = new Revista();
		r1.setTitulo("Veja");
		r1.setNumEdicao(1975);
		r1.setDisponivel(true);	
		
		Revista r2 = new Revista();
		r2.setTitulo("Contigo");
		r2.setNumEdicao(2145);
		r2.setDisponivel(true);
		
		Revista r3 = new Revista();
		r3.setTitulo("Quatro rodas");
		r3.setNumEdicao(800);
		r3.setDisponivel(true);	
		
		Revista r4 = new Revista();
		r4.setTitulo("Isto é");
		r4.setNumEdicao(1352);
		r4.setDisponivel(true);
		
		Revista r5 = new Revista();
		r5.setTitulo("Super interessante");
		r5.setNumEdicao(956);
		r5.setDisponivel(true);		
		
		Dvd d1 = new Dvd();
		d1.setTitulo("Titanic");
		d1.setDuracao(180);
		d1.setDisponivel(true);
		
		Dvd d2 = new Dvd();
		d2.setTitulo("O Desconhecido");
		d2.setDuracao(125);
		d2.setDisponivel(true);
		
		Dvd d3 = new Dvd();
		d3.setTitulo("Megan");
		d3.setDuracao(132);
		d3.setDisponivel(true);
		
		Dvd d4 = new Dvd();
		d4.setTitulo("O pior vizinho do mundo");
		d4.setDuracao(110);
		d4.setDisponivel(true);
		
		Dvd d5 = new Dvd();
		d5.setTitulo("A proposta");
		d5.setDuracao(142);
		d5.setDisponivel(true);
		
	
	u1.emprestar(l1.getTitulo());
	u1.emprestar(r1.getTitulo());
	u1.emprestar(d1.getTitulo());
	System.out.println("Item de "+u1.getNome()+": "+u1.getItens());
	
	u2.emprestar(l2.getTitulo());
	u2.emprestar(r2.getTitulo());
	u2.emprestar(d2.getTitulo());
	System.out.println("Item de "+u2.getNome()+": "+u2.getItens());
	
	u3.emprestar(l3.getTitulo());
	u3.emprestar(r3.getTitulo());
	u3.emprestar(d3.getTitulo());
	System.out.println("Item de "+u3.getNome()+": "+u3.getItens());
	
	
	u1.devolver(r1.getTitulo());
	u1.devolver(d1.getTitulo());
	System.out.println("Item de "+u1.getNome()+": "+u1.getItens());
	
	u2.devolver(l2.getTitulo());
	u2.devolver(d2.getTitulo());
	System.out.println("Item de "+u2.getNome()+": "+u2.getItens());
	
	u3.devolver(l3.getTitulo());
	u3.devolver(r3.getTitulo());
	System.out.println("Item de "+u3.getNome()+": "+u3.getItens());

	}

}
