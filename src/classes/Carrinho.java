package classes;


import java.util.List;

public class Carrinho {


	public double precoTotal(List<Produto> listaProdutos) {
	    double total = 0.0;
	    
	    
	    for (int i = 0; i < listaProdutos.size(); i++) {
	        total += listaProdutos.get(i).getPreco();
	    }
	    
	    return total;
	}
	
	public void mostrarItens(List<Produto> listaProdutos) {
		

		 for (int i = 0; i < listaProdutos.size(); i++) {
			 System.out.println(listaProdutos.get(i).getPreco() + listaProdutos.get(i).getQuantidade() );
		 }
	}

}
