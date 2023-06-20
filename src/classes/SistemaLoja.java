package classes;

import java.util.ArrayList;
import java.util.List;


public class SistemaLoja {
 
        List<Produto> listaProdutos = new ArrayList<>();
        List<Cliente> listaClientes = new ArrayList<>();
      
        public SistemaLoja(){
        	
        }

		public List<Produto> getListaProdutos() {
			return listaProdutos;
		}

		public void setListaProdutos(List<Produto> listaProdutos) {
			this.listaProdutos = listaProdutos;
		}

		public List<Cliente> getListaClientes() {
			return listaClientes;
		}

		public void setListaClientes(List<Cliente> listaClientes) {
			this.listaClientes = listaClientes;
		}
  
        
} 
        
        
        
        
        /*
        
        
        do {
            System.out.println("Escolha a opção:");
            System.out.println("3 - Realizar compra");
            System.out.println("2 - Cadastrar cliente");
            System.out.println("1 - Cadastrar produto");
            System.out.println("0 - SAIR");

            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Nome do produto:");
                    String nomeProduto = sc.next();
                    System.out.println("Preço:");
                    double precoProduto = sc.nextDouble();
                    System.out.println("Quantidade:");
                    int quantidadeProduto = sc.nextInt();
                    Produto produto = new Produto(nomeProduto, precoProduto, quantidadeProduto);
                    listaProdutos.add(produto);
                    System.out.println("Produto cadastrado");
                    break;

                case 2:
                    System.out.println("Nome do cliente:");
                    String nomeCliente = sc.next();
                    System.out.println("Email:");
                    String emailCliente = sc.next();
                    Cliente cliente = new Cliente(nomeCliente, emailCliente);
                    listaClientes.add(cliente);
                    System.out.println("Cliente cadastrado");
                    break;

                case 3:
                    System.out.println("Nome do cliente:");
                    String nomeClienteCompra = sc.next();
                    Cliente clienteEncontrado = null;

                    for (Cliente clienteAtual : listaClientes) {
                        if (clienteAtual.getNome().equalsIgnoreCase(nomeClienteCompra)) {
                            clienteEncontrado = clienteAtual;
                            break;
                        }
                    }

                    if (clienteEncontrado != null) {
                        System.out.println("Nome do produto:");
                        String nomeProdutoCompra = sc.next();
                        Produto produtoEncontrado = null;

                        for (Produto produtoAtual : listaProdutos) {
                            if (produtoAtual.getNome().equalsIgnoreCase(nomeProdutoCompra)) {
                                produtoEncontrado = produtoAtual;
                                break;
                            }
                        }

                        if (produtoEncontrado != null) {
                            clienteEncontrado.adicionarProduto(produtoEncontrado);
                            System.out.println("Produto adicionado ao carrinho do cliente.");
                        } else {
                            System.out.println("Produto não encontrado.");
                        }
                    } else {
                        System.out.println("Cliente não encontrado.");
                    }
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        } while (op != 0);

        sc.close();
    }
}
*/