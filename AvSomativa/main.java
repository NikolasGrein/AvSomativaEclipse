package AvSomativa;

public class main {
	
	public static void main(String[] args) {

		Pedido pedido = new Pedido (12, "Chocolate", 3);
		
		System.out.println(pedido.getId());
		System.out.println(pedido.getProduto());
		System.out.println(pedido.getQuantidade());

	}
}
