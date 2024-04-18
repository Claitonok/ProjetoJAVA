import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramaPrincipal {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner leitor = new Scanner(System.in);
		
		List<SistemaBank> bank = new ArrayList<>();
		
		int opcao;

		do {
			System.out.println("\n*********************");
			System.out.println("  SISTEMA PROFIT BANK  ");
			System.out.println("*********************");
			System.out.println();
			System.out.println("1 - Criação da conta corrente");
			System.out.println("2 - Mostrar Contas / Correntistas");
			System.out.println("3 - Mostrar dados conta corrente");
			System.out.println("4 - Alterar dados da conta corrente");
			System.out.println("5 - Excluir conta corrente");
			System.out.println("6 - Efetuar Depósito");
			System.out.println("7 - Efetuar Pagamento");
			System.out.println("8 - Transferência entre contas");
			System.out.println("9 - Finalizar o Sistema");
			System.out.print("Digite a opção desejada: ");
			opcao = leitor.nextInt();

			switch (opcao){
			case 1:
				System.out.println("*********************");
				System.out.println(" CRIAÇÃO DA CONTA CORRENTE ");
				System.out.println("*********************");
				System.out.println();
				
				System.out.print("NOME COMPLETO: ");
				String nome = leitor.next();
				
				System.out.print("DIGITE UMA SEQUENCIA DE NUMERO PARA A SUA CONTA DE SETE DIGITOS: ");
				String numeroConta = leitor.next();
				
				System.out.print("QUANTO DESEJA DEPOSITAR: ");
				double saldoConta = leitor.nextDouble();
				
				SistemaBank produto = new SistemaBank(nome,numeroConta,saldoConta);
				bank.add(produto);
				System.out.println("*** Conta Cadastrada com Sucesso!!! ***\n");
				
				break;
			case 2:
				System.out.println("\n*****************************");
				System.out.println(" MOSTRAR CONTAS / CORRENTISTA ");
				System.out.println("*****************************");
				
				for(SistemaBank prod:bank) {
					System.out.println("NOME COMPLETO DO CLIENTE: " + prod.getNome());
					System.out.println("NUMERO DA CONTA: " + prod.getNumeroConta());
					System.out.println("SALDO ANTERIOR Cc: " + prod.getSaldoConta());
					System.out.println("NOVO SALDO ATUAL Cc: " + prod.Valor());
					System.out.println("--------------------------\n");
				}
				break;
			case 3:
				System.out.println("*****************************");
				System.out.println(" MOSTRAR DADOS DA CONTA CORRENTE ");
				System.out.println("*****************************");
				System.out.println();
				System.out.print("DIGITE O NUMERO DA CONTA:  ");
				String modeloMostrar = leitor.next();
				
				for(SistemaBank prod:bank){
					
					if(modeloMostrar.equals(prod.getNumeroConta())){
					    System.out.println("NOME CLIENTE: " + prod.getNome());
						System.out.println("NUMERO CONTA: " + prod.getNumeroConta());
						System.out.println("SALDO ANTERIOR Cc: " + prod.getSaldoConta());
						System.out.println("NOVO SALDO ATUAL Cc: " + prod.Valor());
						
					}else{	
						System.out.println("\n*** CONTA NÃO ENCONTRADA ***\n");
						}
					break;
				}
				break;
			case 4:
				System.out.println("*****************************");
				System.out.println(" ALTERAR DADOS CONTA CORRENTE ");
				System.out.println("*****************************");
				System.out.println();
				System.out.print("DIGITE O NUMERO DA SUA CONTA: ");
				String modeloAAlterar = leitor.next();
				
				for(SistemaBank prod:bank) {
					if(modeloAAlterar.equals(prod.getNumeroConta())) {
						System.out.println("\n1º ALTERAR NUMERO DA CONTA");
						System.out.println("2º ALTERAR NOME TITULAR");
						System.out.println("3º ALTERAR O LIMITE");
						System.out.print("\nDIGITE QUAL DADO SERA ALTERADO: ");
						int dado = leitor.nextInt();
						switch(dado) {
						  case 1:
							  System.out.print("DIGITE SEU NOVO NUMERO DA CONTA: ");
							  prod.setNumeroConta(leitor.next());
						    break;
						  case 2:
							  System.out.print("DIGITE SEU NOVO NOME: ");
							  prod.setNome(leitor.next());				
						    break;
						  case 3:							   
							  System.out.print("DIGITE SEU NOVO LIMITE: ");
							  prod.setCTotal(leitor.nextDouble());
							    break;
						  default:
							  System.out.println("\nDADOS NÃO FORÃO ALTERADOS OPÇÃO INVALIDA\n");
						}					
						break;
					}else{	
						System.out.println("\n*** CONTA NÃO ENCONTRADA ***\n");
						}
					break;
				}
				break;
			case 5:
				System.out.println("*****************************");
				System.out.println(" EXCLUIR CONTA CORRENTE ");
				System.out.println("*****************************");
				System.out.println();
				System.out.print("DIGITE O NUMERO DA SUA CONTA Cc: ");
				String modeloExcluir = leitor.next();
				
				for(SistemaBank prod:bank) {
					if(modeloExcluir.equals(prod.getNumeroConta())) {
			
						bank.remove(prod);
						System.out.println("*** Conta excluída com Sucesso! ***\n");				
					}else{	
						System.out.println("\n*** CONTA NÃO ENCONTRADA ***\n");
						}
					break;
				}
				break;
			case 6:
				System.out.println("*****************************"); 
				System.out.println(" EFETUAR DEPOSITO ");
				System.out.println("*****************************");
				System.out.println();
				System.out.print("DIGITE PARA QUAL CONTA IRA FAZER O DEPOSITO:  ");
				String modeloEEfetuar = leitor.next();
				
				for(SistemaBank prod:bank) {
					if(modeloEEfetuar.equals(prod.getNumeroConta())) {
					    System.out.println("DIGITE O VALOR QUE DESEJA DEPOSITAR: ");
						prod.setCTotal(leitor.nextDouble());
						System.out.println("*** DEPOSITO feito com Sucesso! ***");
					
					}else{	
					System.out.println("\n*** CONTA NÃO ENCONTRADA ***\n");
					}
					break;
				}
				break;
			case 7:
				System.out.println("\n*****************************");
				System.out.println(" EFETUAR PAGAMENTO ");
				System.out.println("*****************************");
				System.out.println();
				System.out.print("\nDIGITE O NUMERO DA SUA CONTA Cc: ");
				String modeloPagamento = leitor.next();
				
				for(SistemaBank prod:bank) {
					if(modeloPagamento.equals(prod.getNumeroConta())) {
					    System.out.print("DIGITE O VALOR QUE DESEJA PAGAR: ");
					    prod.setSaldoConta(leitor.nextDouble());
						System.out.println("*** PAGAMENTO EFETUADO COM SUCESSO! ***");
						System.out.println("SALDO EM Cc: " + SistemaBank.getPagamento());	
					}
					break;
				}
				break;
			case 8:
				System.out.println("\n*****************************");
				System.out.println(" EFETUAR TRANSFERENCIA ");
				System.out.println("*****************************");
				System.out.println();
				System.out.print("DIGITE O NUMERO DA SUA CONTA ORIGEM Cc: ");
				String modeloTransferir = leitor.next();
				System.out.println("*******************************************************");
				for(SistemaBank prod:bank) {
					if(modeloTransferir.equals(prod.getNumeroConta())) {
							System.out.println("\n******************************************");
							System.out.println("DIGITE A CONTA DE DESTINO DESEJA TRANSFERIR:  ");
							System.out.println("******************************************");
							String DESTINO = leitor.next();
							if(DESTINO.equals(prod.getNumeroConta())) {
								System.out.println("\nDIGITE O VALOR A TRANSFERIR: ");
								prod.setCTotal(leitor.nextDouble());
								System.out.println("*** TRANSFERENCIA EFETUADO COM SUCESSO! ***\n");
							}else{
								System.out.println("\n*** DIGITE UMA CONTA DE VALUE VALIDA ***\n");
							}
					}
					break;
				}
				break;
			case 9:
				System.out.println("*****************************");
				System.out.println("     FINALIZADO SISTEMA     ");
				System.out.println("*****************************");
				leitor.close();
				break;
			default:
				System.out.println("*****************************");
				System.out.println("        OPÇÃO INVÁLIDA       ");
				System.out.println("*****************************");
				break;
			}

		}while (opcao != 9);
		leitor.close();

	}

}
