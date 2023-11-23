package AvSomativa;

public class Principal {
	public static void main(String[] args) {

		Livro livro1 = new Livro("Eu, Robô", "Isaac Asimov", 200);
		
		System.out.println(livro1.getNome());
		System.out.println(livro1.getAutor());
		System.out.println(livro1.getPaginas());

	}
}