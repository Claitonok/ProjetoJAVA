package Principal;

//import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;




public class MenuPrincipal {

	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		EstoqueInsere esq = new EstoqueInsere();
		
		//EstoqueInsere estoqueinsere = new EstoqueInsere();
		
		List<Estoque> estoque = EstoqueInsere.MTodos();
		
		//List<Estoque> produtos = new ArrayList<>();
		
		
		int opcao;
		do {
			System.out.println("\n*********************");
			System.out.println("     MENU PRINCIPAL  ");
			System.out.println("*********************");
			System.out.println();
			System.out.println("1 - CADASTRAR PRODUTO");
			System.out.println("2 - MOSTRAR TODOS OS PRODUTOS");
			System.out.println("3 - EXCLUIR PRODUTO");
			System.out.println("4 - SAIR");
			System.out.print("Digite a opção desejada: ");
			opcao = leitor.nextInt();
			
			switch(opcao) {
				case 1:
					System.out.println("\n*********************");
					System.out.println(" CADASTRANDO PRODUTO ");
					System.out.println("*********************\n");
					
					System.out.print("PRODUTO: ");
					String nome = leitor.next();
					
					System.out.print("PRECO:  ");
					double preco = leitor.nextDouble();
					
					
					//Cria o objeto e insere as informações dentro dele
					Estoque prod = new Estoque(nome,preco);
					
					
					//Adiciona o objeto dentro do vetor (simulando o banco de dados)
					//produtos.add(prod);
					esq.cadastra(prod);
					
					System.out.println("*** Produto Cadastrado com Sucesso!!! ***\n");
					
					
					break;
				case 2:
					System.out.println("\n*****************************");
					System.out.println(" MOSTRANDO TODOS OS PRODUTOS ");
					System.out.println("*****************************");
					
					for(Estoque produto : estoque) {
					    System.out.println("--------------------------");
					    System.out.println("Codigo : " + produto.getCodigo());
						System.out.println("Produto : " + produto.getProduto());
						System.out.println("Preço : " + produto.getPreco());
						System.out.println("--------------------------\n");
					}
					break;
				case 3:
					System.out.println("\n*****************************");
					System.out.println("       EXCLUINDO PRODUTO     ");
					System.out.println("*****************************");
					System.out.println();
					System.out.print("Digite o nome do produto: ");
					String pesquisarProduto = leitor.next();
					
					for(Estoque produto:estoque) {
						
						if(pesquisarProduto.equals(produto.getProduto())) {
							esq.excluir(produto.getProduto());
							System.out.println("*** Produto Excluído com Sucesso! ***\n");
							break;
						}
						
					}
					break;
				case 4:
					System.out.println("Sistema Finalizado!");
					break;
				default:
					System.out.println("Opção Inválida!!!");
			}
			
		} while (opcao != 4);

		leitor.close();
	}
}


