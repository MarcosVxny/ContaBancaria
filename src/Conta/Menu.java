package Conta;

import java.util.Scanner;


import contamodel.Conta;
import contamodel.ContaCorrente;
import contamodel.ContaPoupanca;
import contautil.Cores;
public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int opcao, numero, agencia, tipo, aniversario, numeroDestino;
		String titular;
		float valor, saldo, limite;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
        //Teste da Classe Conta
		
		Conta c1 = new Conta(1, 123, 3, "Marcos Vinicius", 10000.0f );
		c1.visualizar();
		c1.sacar(12000.0f);
		c1.visualizar();
		c1.depositar(5000.0f);
		c1.visualizar();
        
		//Teste da Classe Conta Corrente
		ContaCorrente cc1 = new ContaCorrente(2, 212, 1, "Marcos Vinicius", 15000.0f);
		cc1.visualizar();
		cc1.sacar(12000.0f);
		cc1.visualizar();
		cc1.depositar(5000.0f);
		cc1.visualizar();
		
		//Teste da Classe Conta Poupança
		ContaPoupanca cp1 = new ContaPoupanca(3, 212, 1, "Marcos Vinicius", 100000.0f);
		cp1.visualizar();
		cp1.sacar(1000.0f);
		cp1.visualizar();
		cp1.depositar(5000.0f);
		cp1.visualizar();

		
		Scanner leia = new Scanner(System.in);        
        
        int opcao1;
				
		while(true) {

			System.out.println(Cores.TEXT_PURPLE + Cores.ANSI_WHITE_BACKGROUND
					         + "*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                BANCO DO BRAZIL COM Z                ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Criar Conta                          ");
			System.out.println("            2 - Listar todas as Contas               ");
			System.out.println("            3 - Buscar Conta por Numero              ");
			System.out.println("            4 - Atualizar Dados da Conta             ");
			System.out.println("            5 - Apagar Conta                         ");
			System.out.println("            6 - Sacar                                ");
			System.out.println("            7 - Depositar                            ");
			System.out.println("            8 - Transferir valores entre Contas      ");
			System.out.println("            9 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     " + Cores.TEXT_RESET);
			
			opcao1 = leia.nextInt();
				
			if (opcao1 == 9) {
				System.out.println(Cores.TEXT_WHITE_BOLD + "\nBanco do Brazil com Z - O seu Futuro começa aqui!");
				leia.close();
				System.exit(0);
			}
				
			switch (opcao1) {
				case 1:
					System.out.println(Cores.TEXT_WHITE + "Criar Conta\n");
					System.out.println("Digite o Numero da Agência: ");
				     
					agencia = leia.nextInt();
				     
				     
					System.out.println("Digite o Nome do Titular: ");
					leia.skip("\\R?");
					
				     titular = leia.nextLine();
                    break;
				
				case 2:
					System.out.println(Cores.TEXT_WHITE + "Listar todas as Contas\n\n");
					aniversario = leia.nextInt();
					
                    break;
				
				case 3:
					System.out.println(Cores.TEXT_WHITE + "Consultar dados da Conta - por número\n");
					System.out.print("Digite o número da conta: ");
					numero = leia.nextInt();
                    break;
				
				case 4:
					System.out.println(Cores.TEXT_WHITE + "Atualizar dados da Conta\n\n");
					System.out.println("Digite o número da conta: ");
					numero = leia.nextInt();
                    break;
				
				case 5:
					System.out.println(Cores.TEXT_WHITE + "Apagar a Conta\n\n");
					System.out.println("Digite o número da conta: ");
					numero = leia.nextInt();
                    break;
                    
				case 6:
					System.out.println(Cores.TEXT_WHITE + "Saque\n\n");
					System.out.println("Digite o Numero da conta: ");
					numero = leia.nextInt();
					
					do {
						System.out.println("Digite o Valor do Saque (R$): ");
						valor = leia.nextFloat();
					
					} while (valor <= 0);
                    break;
		
				case 7:
					System.out.println(Cores.TEXT_WHITE + "Depósito\n\n");
					System.out.println("Digite o Numero da conta: ");
					numero = leia.nextInt();
					
					do {
						System.out.println("Digite o Valor do Depósito (R$): ");
						valor = leia.nextFloat();
					} while (valor <= 0);
					
					
					break;
                    
				case 8:
					System.out.println(Cores.TEXT_WHITE + "Transferência entre Contas\n\n");
					System.out.println("Digite o Numero da Conta de Origem: ");
					numero = leia.nextInt();
					System.out.println("Digite o Numero da Conta de Destino: ");
					numeroDestino = leia.nextInt();
					
					
					
					break;
                    
				default:
					System.out.println(Cores.TEXT_RED_BOLD + "\nOpção Inválida!\n" + Cores.TEXT_RESET);
                    break;
			}
		}	
    }

}
