package visao;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

import classes.Cliente;
import classes.Produto;
import classes.SistemaLoja;
import javax.swing.JList;
import javax.swing.JComboBox;

public class Janela {

	private JFrame frame;
	

	private JTextField textNome;
	private JTextField textEmail;
	private JTextField textNomeP;
	private JTextField textPreco;
	private JTextField textQuantidade;
	private ButtonGroup grupo= new ButtonGroup();
	private SistemaLoja sistema;
	private Produto produto;
	private Cliente cliente;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janela window = new Janela();
					window.frame.setVisible(true);
					
					
					} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Janela() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		
		produto= new Produto();
		cliente= new Cliente();
		sistema = new SistemaLoja();
		
		
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(tabbedPane);
		
		JPanel panelCliente = new JPanel();
		tabbedPane.addTab("Cliente", null, panelCliente, null);
		panelCliente.setLayout(null);
		
		JLabel lblCadastroClientes = new JLabel("CADASTRO DE CLIENTES");
		lblCadastroClientes.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCadastroClientes.setBounds(96, 36, 223, 25);
		panelCliente.add(lblCadastroClientes);
		
		JLabel lblEmailCliente = new JLabel("EMAIL:");
		lblEmailCliente.setBounds(25, 168, 46, 14);
		panelCliente.add(lblEmailCliente);
		
		JButton btnCadastrar = new JButton("CADASTRAR");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				cliente.cadastrarCliente(textNome.getText(), textEmail.getText());
				sistema.getListaClientes().add(cliente);
				JOptionPane.showMessageDialog(null,"cliente"+cliente.getNome()+" CADASTRADO",null, 0);
				

			}
		});
		btnCadastrar.setBounds(146, 193, 123, 23);
		panelCliente.add(btnCadastrar);
		
		
		
		JLabel lblNomeCliente = new JLabel("NOME:");
		lblNomeCliente.setBounds(25, 125, 46, 14);
		panelCliente.add(lblNomeCliente);
		
		textNome = new JTextField();
		textNome.setBounds(69, 122, 281, 20);
		panelCliente.add(textNome);
		textNome.setColumns(10);
		
		textEmail = new JTextField();
		textEmail.setColumns(10);
		textEmail.setBounds(69, 165, 281, 20);
		panelCliente.add(textEmail);
		
		JPanel panelProduto = new JPanel();
		tabbedPane.addTab("Produto", null, panelProduto, null);
		panelProduto.setLayout(null);
		
		JLabel lblCadastroProduto = new JLabel("CADASTRO DE PRODUTOS");
		lblCadastroProduto.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCadastroProduto.setBounds(77, 30, 271, 25);
		panelProduto.add(lblCadastroProduto);
		
		JLabel lblNome = new JLabel("PRODUTO:");
		lblNome.setBounds(10, 107, 87, 14);
		panelProduto.add(lblNome);
		
		JLabel lblPreco = new JLabel("PREÇO:");
		lblPreco.setBounds(10, 143, 46, 14);
		panelProduto.add(lblPreco);
		
		JLabel lblQuantidade = new JLabel("QUANTIDADE:");
		lblQuantidade.setBounds(10, 182, 112, 14);
		panelProduto.add(lblQuantidade);
		
		textNomeP = new JTextField();
		textNomeP.setBounds(78, 104, 243, 20);
		panelProduto.add(textNomeP);
		textNomeP.setColumns(10);
		
		textPreco = new JTextField();
		textPreco.setColumns(10);
		textPreco.setBounds(78, 140, 243, 20);
		panelProduto.add(textPreco);
		
		textQuantidade = new JTextField();
		textQuantidade.setColumns(10);
		textQuantidade.setBounds(88, 179, 60, 20);
		panelProduto.add(textQuantidade);
		
		JButton btnCadastrarProduto = new JButton("CADASTRAR");
		btnCadastrarProduto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*
				
				produto.cadastrarProduto(textNomeP.getText(),Double.parseDouble(textPreco.getText()), Integer.parseInt(textQuantidade.getText()));
				sistema.getListaProdutos().add(produto);
				JOptionPane.showMessageDialog(null,"PRODUTO CADASTRADO",null, 0);
				*/
			}
		});
		btnCadastrarProduto.setBounds(213, 178, 135, 23);
		panelProduto.add(btnCadastrarProduto);
		
		JPanel panelConsulta = new JPanel();
		tabbedPane.addTab("Consulta", null, panelConsulta, null);
		panelConsulta.setLayout(null);
		
		JLabel lblConsulta = new JLabel("CONSULTA");
		lblConsulta.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblConsulta.setBounds(160, 11, 111, 56);
		panelConsulta.add(lblConsulta);
		
		JRadioButton rdbtnCliente = new JRadioButton("CLIENTE");
		rdbtnCliente.setBounds(45, 54, 109, 23);
		panelConsulta.add(rdbtnCliente);
		
		JRadioButton rdbtnProduto = new JRadioButton("PRODUTO");
		rdbtnProduto.setBounds(286, 54, 109, 23);
		panelConsulta.add(rdbtnProduto);
		
		grupo.add(rdbtnProduto);
		grupo.add(rdbtnCliente);
		
		JPanel panelCompra = new JPanel();
		tabbedPane.addTab("Compra", null, panelCompra, null);
		panelCompra.setLayout(null);
		
		JLabel lblNomeCliente2 = new JLabel("CLIENTE");
		lblNomeCliente2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNomeCliente2.setBounds(22, 38, 74, 29);
		panelCompra.add(lblNomeCliente2);
		
		

		
		JComboBox comboBoxClientes = new JComboBox();
		comboBoxClientes.setBounds(84, 43, 238, 22);
		panelCompra.add(comboBoxClientes);
		
		 List<Cliente> listaClientes = sistema.getListaClientes();
	        for (Cliente cliente : listaClientes) {
	            comboBoxClientes.addItem(cliente.getNome());
	        }
		
		
		JLabel lblProdutoP = new JLabel("PRODUTO");
		lblProdutoP.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblProdutoP.setBounds(10, 95, 74, 29);
		panelCompra.add(lblProdutoP);
		
		JComboBox comboBoxProdutos = new JComboBox();
		comboBoxProdutos.setBounds(84, 100, 238, 22);
		panelCompra.add(comboBoxProdutos);
		
		JLabel lblQuantidadeP = new JLabel("QUANTIDADE");
		lblQuantidadeP.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblQuantidadeP.setBounds(10, 155, 97, 29);
		panelCompra.add(lblQuantidadeP);
		
		
	}
}
